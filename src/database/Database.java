package database;

import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.AccountModel;
import model.ManagerModel;
import model.Order;
import model.Product;
import oop_project.Oop_project;
import view.Cashier;
import view.Invoice;
import view.Login;
import view.Manager;
import view.PlaceOrder;
import view.addProduct;

public class Database {

    Map<String, Double> productPrices = new HashMap<>();

    static int yesCount = 1;

    public Database() {
        productPrices.put("Iphone", 12000.0); // Replace 1000.0 with the actual price for Iphone
        productPrices.put("Apple_Watch", 5000.0); // Replace 200.0 with the actual price for Apple_Watch
        productPrices.put("Airpod", 3000.0);
        productPrices.put("Ipad", 6000.0);
        productPrices.put("MAC", 2500.0);
    }

    // Method to establish a database connection
    private Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost/apple_istore";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage(),
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
        }

        return connection;
    }

    public void viewAllProduct(JTable tblProductDetails) throws SQLException {
        Connection conn = getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement stmt1 = null;

        try {
            stmt = conn.createStatement();

            String showTableQuery = "SELECT product_id, category,product_name, purchase_price FROM product_details";
            rs = stmt.executeQuery(showTableQuery);

            String showTableQuery2 = "SELECT product_id FROM product_details WHERE category=?";
            stmt1 = conn.prepareStatement(showTableQuery2);

            ((DefaultTableModel) tblProductDetails.getModel()).setRowCount(0);

            while (rs.next()) {
                String productId = rs.getString("product_id");
                String productname = rs.getString("product_name");
                String cat = rs.getString("category");
                stmt1.setString(1, cat);

                // Get purchase price from the database
                double purchasePrice = rs.getDouble("purchase_price");

                // Get sales price from the map using the category
                double salesPrice = productPrices.getOrDefault(cat, 0.0);

                // Perform any necessary calculations using purchasePrice and salesPrice
                String tbData[] = {productId, cat, productname, String.valueOf(purchasePrice), String.valueOf(salesPrice)};
                DefaultTableModel tblModel = (DefaultTableModel) tblProductDetails.getModel();
                tblModel.addRow(tbData);
            }
            conn.close();

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void addproduct(Product product) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement stmt = null;
        PreparedStatement pstmt = null;

        try {
            String adminIdQuery = "SELECT admin_id FROM administrator WHERE Status='active'";
            pstmt = conn.prepareStatement(adminIdQuery);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Use the INSERT ... ON DUPLICATE KEY UPDATE statement
                String insertRecord = "INSERT INTO product_details(product_id, category,product_name, purchase_quantity, purchase_price, purchase_total,remaining_quantity,admin_id) VALUES (?, ?, ?, ?, ?, ?,?,?) ON DUPLICATE KEY UPDATE purchase_quantity = purchase_quantity + VALUES(purchase_quantity),remaining_quantity = remaining_quantity + VALUES(purchase_quantity), purchase_total = purchase_total + VALUES(purchase_total)";

                stmt = conn.prepareStatement(insertRecord);
                stmt.setString(1, product.getProductId());
                stmt.setString(2, product.getCategory());
                stmt.setString(3, product.getproductName());
                stmt.setInt(4, Integer.parseInt(product.getQuantity()));
                stmt.setInt(5, Integer.parseInt(product.getpurchaseprice()));
                stmt.setInt(6, Integer.parseInt(product.getpurchaseprice()) * Integer.parseInt(product.getQuantity()));
                stmt.setInt(7, Integer.parseInt(product.getQuantity()));
                stmt.setString(8, rs.getString("admin_id"));

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product added successfully");
            } else {
                // Handle the case where no active administrators are found
                System.out.println("No active administrators found");
                // You might want to throw an exception, log an error, or handle it in some way
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources in the finally block
            if (stmt != null) {
                stmt.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void accountCreation(AccountModel model1) throws SQLException {

        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement stmt = null;
        String username = model1.getUsername();
        String password = model1.getPassword();
        String mail = model1.getMail();
        String accountType = model1.getAccounType();
        String userId = model1.getUserId();

        try {
            if (accountType.equals("cashier")) {
                String adminIdQuery = "SELECT admin_id FROM administrator WHERE Status='active'";
                pstmt = conn.prepareStatement(adminIdQuery);
                ResultSet rs = pstmt.executeQuery();

                // Check if there is an active administrator
                if (rs.next()) {
                    String insertRecord = "INSERT INTO user(user_id, username, password, email, account_type,admin_id) VALUES (?, ?, ?, ?, ?,?)";
                    stmt = conn.prepareStatement(insertRecord);
                    stmt.setString(1, userId);
                    stmt.setString(2, username);
                    stmt.setString(3, password);
                    stmt.setString(4, mail);
                    stmt.setString(5, accountType);
                    stmt.setString(6, rs.getString("admin_id"));
                    stmt.executeUpdate();

                    String updateRecord = "UPDATE user SET Status = 'active' WHERE user_id = ?";
                    pstmt = conn.prepareStatement(updateRecord);
                    pstmt.setString(1, userId);
                    pstmt.executeUpdate();

                } else {
                    // Handle the case when no active administrator found.
                    JOptionPane.showMessageDialog(null, "No active administrator found.");
                }
            } else {
                String insertRecord = "INSERT INTO administrator(admin_id, username, password, email, account_type) VALUES (?, ?, ?, ?, ?)";
                stmt = conn.prepareStatement(insertRecord);
                stmt.setString(1, userId);
                stmt.setString(2, username);
                stmt.setString(3, password);
                stmt.setString(4, mail);
                stmt.setString(5, accountType);
                stmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, username + " Account created successfully...");
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error in database operations", ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error closing database resources", ex);
            }
        }

    }

    public void searchStockDetails(JTable tblStockDetail) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        DefaultTableModel model = (DefaultTableModel) tblStockDetail.getModel();
        model.setRowCount(0); // Clear existing rows in the table

        try {
            String stock = "SELECT category,product_name,purchase_price,purchase_total,purchase_quantity,remaining_quantity FROM product_details";
            pstmt = conn.prepareStatement(stock);
            rs = pstmt.executeQuery();

            while (rs.next()) {

                // Retrieve values from the result set
                String category = rs.getString("category");
                String pname = rs.getString("product_name");
                String purchaseQuantity = rs.getString("purchase_quantity");
                int purchasePrice = rs.getInt("purchase_price");
                double purchaseTotal = rs.getDouble("purchase_total");
                int remainingQty = rs.getInt("remaining_quantity");

                // Add a new row to the table model
                model.addRow(new Object[]{category, pname, purchaseQuantity, purchasePrice, purchaseTotal, remainingQty});
            }

        } finally {
            // Close resources in the finally block
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void searchProductDetails(JTable product, String val, String selectItem) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        DefaultTableModel model = (DefaultTableModel) product.getModel();
        model.setRowCount(0); // Clear existing rows in the table

        boolean resultsFound = false;

        try {
            if (selectItem.equals("Category")) {
                String query = "SELECT product_id, category, product_name, purchase_quantity, purchase_price, purchase_total FROM product_details WHERE category=?";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1, val);
            } else if (selectItem.equals("product name")) {
                String query = "SELECT product_id, category, product_name, purchase_quantity, purchase_price, purchase_total FROM product_details WHERE product_name=?";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1, val);
            } else {
                String query = "SELECT product_id, category, product_name, purchase_quantity, purchase_price, purchase_total FROM product_details WHERE purchase_price=?";
                pstmt = conn.prepareStatement(query);
                try {
                    pstmt.setDouble(1, Double.parseDouble(val));
                } catch (NumberFormatException e) {
                    // Handle the exception, for example, print an error message
                    JOptionPane.showMessageDialog(null, "No results found for the search criteria.");
                    return; // Exit the method if there's an error
                }
            }

            rs = pstmt.executeQuery();

            while (rs.next()) {
                resultsFound = true;
                // Retrieve values from the result set
                String productId = rs.getString("product_id");
                String category = rs.getString("category");
                String pname = rs.getString("product_name");
                int purchaseQuantity = rs.getInt("purchase_quantity");
                double purchasePrice = rs.getDouble("purchase_price");
                double purchaseTotal = rs.getDouble("purchase_total");

                // Add a new row to the table model
                model.addRow(new Object[]{productId, category, pname, purchaseQuantity, purchasePrice, purchaseTotal});
            }

            if (!resultsFound) {
                // Display a message if no results are found
                JOptionPane.showMessageDialog(null, "No results found for the search criteria.");
            }
        } finally {
            // Close resources in the finally block
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void updateAccountDetails(String username, String password) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement stmt = null;
        Login l1 = new Login();
        String user = l1.getUsername();

        try {
            String accountTypeDb = "SELECT username FROM administrator WHERE username=?";
            pstmt = conn.prepareStatement(accountTypeDb);
            pstmt.setString(1, user);
            ResultSet rs = pstmt.executeQuery();

            // Check if there is an active administrator
            if (rs.next()) {
                String updateAccount = "UPDATE administrator SET username=?, password=? WHERE username=?";
                stmt = conn.prepareStatement(updateAccount);
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setString(3, user);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, user + " " + "Account Details changed !!!");

            } else {
                String updateAccount = "UPDATE user SET username=?, password=? WHERE username=?";
                stmt = conn.prepareStatement(updateAccount);
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setString(3, user);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, user + " " + "Account Details changed !!!");
            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error in database operations", ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error closing database resources", ex);
            }
        }
    }

    public void updateProduct(String productId, String options, String newValue) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement stmt = null;
        PreparedStatement mstmt = null;

        Login l1 = new Login();
        String user = l1.getUsername();

        try {
            String pid = "SELECT product_id FROM product_details WHERE product_id=?";
            pstmt = conn.prepareStatement(pid);
            pstmt.setString(1, productId);
            ResultSet rs = pstmt.executeQuery();

            // Check if there is an active administrator
            if (rs.next()) {
                switch (options) {
                    case "category":
                        String updateCat = "UPDATE product_details SET category=? WHERE product_id=?";
                        stmt = conn.prepareStatement(updateCat);
                        stmt.setString(1, newValue);
                        stmt.setString(2, productId);
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "product category updated successfully !!!");
                        break;
                    case "product name":
                        String updatePname = "UPDATE product_details SET product_name=? WHERE product_id=?";
                        stmt = conn.prepareStatement(updatePname);
                        stmt.setString(1, newValue);
                        stmt.setString(2, productId);
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "product name updated successfully !!!");
                        break;
                    case "price":
                        String updatePrice = "UPDATE product_details SET purchase_price=? WHERE product_id=?";
                        stmt = conn.prepareStatement(updatePrice);
                        stmt.setString(1, newValue);
                        stmt.setString(2, productId);
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "product price updated successfully !!!");

                        String selectQty = "SELECT purchase_quantity FROM product_details WHERE product_id=?";
                        PreparedStatement pstmtSelect = conn.prepareStatement(selectQty);
                        pstmtSelect.setString(1, productId);
                        ResultSet rs1 = pstmtSelect.executeQuery();
                        int qty = 0;
                        if (rs1.next()) {
                            qty = rs1.getInt("purchase_quantity");
                        }
                        int newTot = qty * Integer.parseInt(newValue);
                        String insertRecord = "UPDATE  product_details SET purchase_total=? where product_id=?";
                        mstmt = conn.prepareStatement(insertRecord);
                        mstmt.setInt(1, newTot);
                        mstmt.setString(2, productId);
                        mstmt.executeUpdate();

                        if (pstmtSelect != null) {
                            pstmtSelect.close();
                        }
                        break;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error in database operations", ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (mstmt != null) {
                    mstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error closing database resources", ex);
            }
        }
    }

    public void placeOrder(Order o1) throws SQLException {
        PreparedStatement pstmtSales = null;
        PreparedStatement pstmtOrder = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmtuser = null;
        PreparedStatement pstmtcat = null;
        ResultSet rs = null;
        ResultSet rs1 = null;

        Connection conn = getConnection();
        String name = o1.getName();
        String address = o1.getAddress();
        String mobile = o1.getMobile();
        String productname = o1.getProductName();
        int squantity = o1.getQty();
        String prevName = o1.getPrevName();
        String prevAddress = o1.getPrevAddress();
        String prevMobile = o1.getPrevMobile();

        Login l1 = new Login();
        String usernames = l1.getUsername();  // Assuming you have a method to get the user ID.
        // Insert into sales_detail table
        String userid = "SELECT user_id FROM user where username=?";
        pstmtuser = conn.prepareStatement(userid);
        pstmtuser.setString(1, usernames);
        rs = pstmtuser.executeQuery();
        String userId = "";
        if (rs.next()) {
            userId = rs.getString("user_id");

        }

        try {
            String selectQty1 = "SELECT remaining_quantity FROM product_details WHERE category = ? AND product_name = ?";
            pstmt = conn.prepareStatement(selectQty1);
            pstmt.setString(1, o1.getCat());
            pstmt.setString(2, productname);
            rs = pstmt.executeQuery();
            int remQty1 = 0;
            if (rs.next()) {
                remQty1 = rs.getInt("remaining_quantity");
            }

            if (remQty1 <= 0 || squantity > remQty1) {
                JOptionPane.showMessageDialog(null, "only" + remQty1 + "is avaialable");
                PlaceOrder p1 = new PlaceOrder();
                p1.setVisible(true);
            } else {

                // Product does not exist, insert a new record
                // Insert into sales_detail table
                int iphoneprice = 1000;
                int applewatch = 2000;
                int ipad = 3000;
                int mac = 4000;
                int airpod = 5000;

                // Corrected table name in the second query
                String totQtySale = "SELECT sales_quantity FROM sales_detail WHERE category=? AND product_name=?";
                pstmt = conn.prepareStatement(totQtySale);
                pstmt.setString(1, o1.getCat()); // Use 1 as the parameter index and set the category value
                pstmt.setString(2, productname);
                rs1 = pstmt.executeQuery();

                String salesQuery = "INSERT INTO sales_detail (category,product_name, sales_quantity, sales_price, sales_total,user_id) VALUES (?, ?, ?, ?, ?,?)";
                pstmtSales = conn.prepareStatement(salesQuery);
                pstmtSales.setString(1, o1.getCat());
                pstmtSales.setString(2, productname);

                switch (o1.getCat()) {
                    case "Iphone":
                        int price1 = o1.getQty() * iphoneprice;
                        pstmtSales.setInt(3, o1.getQty());
                        pstmtSales.setInt(4, iphoneprice);
                        pstmtSales.setInt(5, price1);// Replace with actual price
                        pstmtSales.setString(6, userId);
                        pstmtSales.executeUpdate();

                        break;

                    case "Apple_Watch":
                        int price2 = o1.getQty() * applewatch;
                        pstmtSales.setInt(3, o1.getQty());
                        pstmtSales.setInt(4, applewatch);
                        pstmtSales.setInt(5, price2);// Replace with actual price
                        pstmtSales.setString(6, userId);
                        pstmtSales.executeUpdate();
                        break;

                    case "Ipad":
                        int price3 = o1.getQty() * ipad;
                        pstmtSales.setInt(3, o1.getQty());
                        pstmtSales.setInt(4, ipad);
                        pstmtSales.setInt(5, o1.getQty() * ipad);// Replace with actual price
                        pstmtSales.setString(6, userId);
                        pstmtSales.executeUpdate();

                        break;

                    case "Airpod":
                        pstmtSales.setInt(4, airpod);
                        pstmtSales.setInt(3, o1.getQty());
                        pstmtSales.setInt(5, o1.getQty() * airpod);// Replace with actual price
                        pstmtSales.setString(6, userId);
                        pstmtSales.executeUpdate();
                        break;

                    case "MAC":
                        pstmtSales.setInt(4, mac);
                        pstmtSales.setInt(3, o1.getQty());
                        pstmtSales.setInt(5, o1.getQty() * mac);// Replace with actual price
                        pstmtSales.setString(6, userId);
                        pstmtSales.executeUpdate();
                        break;
                }

                int choicemore = JOptionPane.showConfirmDialog(null, "Do you want to place more orders?", "Confirmation", JOptionPane.YES_NO_OPTION);

                Invoice receipt = new Invoice();

                if (choicemore == JOptionPane.YES_OPTION) {
                    // Print receipt and reset order form
                    yesCount++;
                    receipt.print(name, address, mobile, yesCount, receipt, productname, o1.getQty());
                    PlaceOrder p1 = new PlaceOrder();
                    p1.setName(prevName);
                    p1.setAddress(prevAddress);
                    p1.setMobile(prevMobile);

                    p1.setProductId("");
                    p1.setQuantity("");
                    p1.setVisible(true);
                    receipt.setVisible(false);

                    String selectQty = "SELECT remaining_quantity WHERE category = ? AND product_name = ?";
                    pstmt = conn.prepareStatement(selectQty);
                    pstmt.setString(1, o1.getCat());
                    pstmt.setString(2, productname);
                    rs = pstmt.executeQuery();
                    int remQty = 0;
                    if (rs.next()) {
                        remQty = rs.getInt("remaining_quantity");
                    }

                    int newPurchaseQuantityValue = remQty - squantity;
                    String updateQty = "UPDATE product_details SET remaining_quantity = ? WHERE category = ? AND product_name = ?";
                    pstmt = conn.prepareStatement(updateQty);
                    pstmt.setInt(1, newPurchaseQuantityValue); // Assuming you have a new value for purchase_quantity
                    pstmt.setString(2, o1.getCat());
                    pstmt.setString(3, productname);
                    int rowsAffected = pstmt.executeUpdate();

                } else {
                    // Print final receipt
                    receipt.print(name, address, mobile, yesCount, receipt, productname, o1.getQty());
                    String selectQty = "SELECT remaining_quantity FROM product_details WHERE category = ? AND product_name = ?";
                    pstmt = conn.prepareStatement(selectQty);
                    pstmt.setString(1, o1.getCat());
                    pstmt.setString(2, productname);
                    rs = pstmt.executeQuery();
                    int remQty = 0;
                    if (rs.next()) {
                        remQty = rs.getInt("remaining_quantity");
                    }

                    int newPurchaseQuantityValue = remQty - squantity;
                    String updateQty = "UPDATE product_details SET remaining_quantity= ? WHERE category = ? AND product_name = ?";
                    pstmt = conn.prepareStatement(updateQty);
                    pstmt.setInt(1, newPurchaseQuantityValue); // Assuming you have a new value for purchase_quantity
                    pstmt.setString(2, o1.getCat());
                    pstmt.setString(3, productname);
                    int rowsAffected = pstmt.executeUpdate();
                }

                // ... (your existing code for showing confirmation dialogs and updating UI)
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error in database operations", ex);
        } finally {
            try {
                if (pstmtSales != null) {
                    pstmtSales.close();
                }
                if (pstmtOrder != null) {
                    pstmtOrder.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error closing database resources", ex);
            }
        }
    }

    public void removeProduct(String cat, String productName, String qty) throws SQLException {

        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ResultSet rs1 = null;

        String currentQty = "SELECT purchase_quantity,remaining_quantity FROM product_details WHERE category=? AND product_name=?";
        stmt = conn.prepareStatement(currentQty);
        stmt.setString(1, cat); // Use 1 as the parameter index and set the category value
        stmt.setString(2, productName);
        rs1 = stmt.executeQuery();

        int rQty = 0;
        if (rs1.next()) {

            rQty = rs1.getInt("remaining_quantity");

        }

        if (rQty <= 0 || Integer.parseInt(qty) > rQty) {
            JOptionPane.showMessageDialog(null, "Cannot remove");
        } else {

            int remainingRQty = rQty - Integer.parseInt(qty);
            String updateProduct = "UPDATE product_details SET remaining_quantity = ? WHERE category = ? AND product_name = ?";
            try {
                pstmt = conn.prepareStatement(updateProduct);
                pstmt.setInt(1, remainingRQty);  // Assuming remainingQty is the new value for remaining_quantity
                // Assuming purchaseQty is the new value for purchase_quantity
                pstmt.setString(2, cat);
                pstmt.setString(3, productName);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Product Successfully Removed");
                } else {
                    System.out.println("No rows updated. product not found");
                }
            } catch (SQLException e) {
                e.printStackTrace();  // Handle the exception appropriately in your application
            } finally {
                // Close resources (ResultSet, PreparedStatement, Connection) in the reverse order of their creation.
            }
        }

    }

    public void useraccountDeactivate(String username) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        try {

            String updateRecord = "UPDATE users SET Status = 'deactive' WHERE username = ?";
            pstmt = conn.prepareStatement(updateRecord);

            pstmt.setString(1, username);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, username + " Account Deactivated successfully...");
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error in database operations", ex);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error closing database resources", ex);
            }
        }
    }

    public void login(String username, String password, Login login, JTextField txtUser, JPasswordField txtPwd) {
        try (Connection conn = getConnection()) {
            PreparedStatement pstmt = null;
            String userLoginResult = checkUserLogin(conn, username, password);

            if (checkAdminLogin(conn, username, password)) {

                JOptionPane.showMessageDialog(null, "Welcome admin");
                Oop_project o1 = new Oop_project();
                if (o1.getLoginDetail() != null) {
                    o1.getLoginDetail().dispose();
                }
                String updateRecord = "UPDATE administrator SET Status = 'active' WHERE username =?";
                pstmt = conn.prepareStatement(updateRecord);
                pstmt.setString(1, username);
                pstmt.executeUpdate();

                login.dispose();
                Manager m1 = new Manager();

                m1.setVisible(true);
            } else if ("active".equals(userLoginResult) && userLoginResult != null) {

                JOptionPane.showMessageDialog(null, "Welcome user");
                Oop_project o1 = new Oop_project();
                if (o1.getLoginDetail() != null) {
                    o1.getLoginDetail().dispose();
                }

                login.dispose();
                Cashier c1 = new Cashier();
                c1.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password!!!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean checkAdminLogin(Connection conn, String username, String password) throws SQLException {
        String adminQuery = "SELECT username, password FROM administrator WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(adminQuery)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        }
    }

    private String checkUserLogin(Connection conn, String username, String password) throws SQLException {
        String userQuery = "SELECT username, password, Status FROM user WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(userQuery)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    // Assuming "Status" is a String column. Adjust the type accordingly.
                    String status = rs.getString("Status");
                    return status;
                } else {
                    // User not found
                    return null;
                }
            }
        }
    }

    public void printInvoice(JTable tblInvoice, String name, String address, String mobile, int yesCount, Invoice receipt, String id, int qty) throws SQLException {

        receipt.setName(name);
        receipt.setAddress(address);
        receipt.setMobile(mobile);

        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        ResultSet rs = null;
        ResultSet resultSet1 = null;

        try {

            // Execute a SQL query to retrieve all the latest records from the database
            String selectDataQuery = "SELECT category,Invoice_No, product_name,sales_quantity, sales_price, sales_total "
                    + "FROM sales_detail "
                    + "ORDER BY Invoice_No DESC";
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(selectDataQuery);

            DefaultTableModel model = (DefaultTableModel) tblInvoice.getModel();

            // Clear the existing data in the table (if any)
            model.setRowCount(0);

            // Iterate through the result set and add the data to the table
            int recordCount = 0;
            while (resultSet.next() && recordCount < yesCount) {
                int invoiceNo = resultSet.getInt("Invoice_No");
                String cat = resultSet.getString("category");
                String productName = resultSet.getString("product_name");
                int quantity = resultSet.getInt("sales_quantity");
                int price = resultSet.getInt("sales_price");
                int amount = resultSet.getInt("sales_total");

                // Add a new row with the retrieved values
                Object[] rowData = {invoiceNo, cat, productName, quantity, price, amount};
                model.addRow(rowData);

                recordCount++;

            }
            recordCount = 0;
            yesCount = 0;
            int columnToTotal = 5; // Assuming the "amount" column is at index 5
            double total = 0.0;

            for (int row = 0; row < model.getRowCount(); row++) {
                Object cellValue = model.getValueAt(row, columnToTotal);

                if (cellValue instanceof Number) {
                    total += ((Number) cellValue).doubleValue();
                } else if (cellValue instanceof String) {
                    try {
                        total += Double.parseDouble((String) cellValue);
                    } catch (NumberFormatException e) {
                        // Handle the case where the cell value is not a valid double
                    }
                }
            }

            receipt.setTotal(Double.toString(total));

            receipt.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error in database operations", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error closing database resources", ex);
            }
        }
    }

    public void manageActivate(JTable tblUserDetails, int row) throws SQLException {
        String user = (String) tblUserDetails.getValueAt(row, 0); // First column
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        try {

            String updateRecord = "UPDATE user SET Status = 'active' WHERE username = ?";
            pstmt = conn.prepareStatement(updateRecord);

            pstmt.setString(1, user);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, user + " Account Activated successfully...");
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error in database operations", ex);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error closing database resources", ex);
            }
        }
    }

    public void manageDeactivate(JTable tblUserDetails, int row) throws SQLException {
        String user = (String) tblUserDetails.getValueAt(row, 0); // First column
        System.out.println(user);
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        try {

            String updateRecord = "UPDATE user SET Status = 'deactive' WHERE username = ?";
            pstmt = conn.prepareStatement(updateRecord);

            pstmt.setString(1, user);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, user + " Account Deactivated successfully...");
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error in database operations", ex);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, "Error closing database resources", ex);
            }
        }
    }

    public void loadUserAccountDetails(JTable tblUserDetails) {

        try {
            // Connect to the database
            Connection connection = getConnection();

            // Query to select all rows from the "users" table
            String query = "SELECT username,password FROM user";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Get the metadata (column names) from the result set
            int columnCount = resultSet.getMetaData().getColumnCount();
            DefaultTableModel model = (DefaultTableModel) tblUserDetails.getModel();

            // Clear existing data in the table
            model.setRowCount(0);

            // Iterate through the result set and add rows to the table
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception according to your application's requirements
        }
    }

    public void logout() {
        try (Connection conn = getConnection()) {
            PreparedStatement pstmt = null;
            String updateRecord = "UPDATE administrator SET Status = 'deactive' WHERE Status=?";
            pstmt = conn.prepareStatement(updateRecord);
            pstmt.setString(1, "active");
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
