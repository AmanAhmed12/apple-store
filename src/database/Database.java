package database;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.Product;
import oop_project.Oop_project;
import view.Cashier;
import view.Invoice;
import view.Login;
import view.Manager;
import view.PlaceOrder;
import view.addProduct;

public class Database {

    static int yesCount = 1;

    // Method to establish a database connection
    private Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost/apple_istore";
            String username = "Aman";
            String password = "Ahdheer12";
            connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage(),
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
        }

        return connection;
    }

    public void viewAllProduct(JTable tblProductDetails) {
        try {
            Connection conn = getConnection();
            Statement stmt = null;
            ResultSet rs = null;

            stmt = conn.createStatement();

            String showTableQuery = "SELECT * FROM user";
            rs = stmt.executeQuery(showTableQuery);
            ((DefaultTableModel) tblProductDetails.getModel()).setRowCount(0);
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String tbData[] = {username, password};
                DefaultTableModel tblModel = (DefaultTableModel) tblProductDetails.getModel();
                tblModel.addRow(tbData);
            }
            conn.close();

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

   public void addproduct(Product product) {
    try {
        Connection conn = getConnection();
        PreparedStatement stmt = null;
         PreparedStatement pstmt = null;
        String adminIdQuery = "SELECT admin_id FROM administrator WHERE Status='active'";
        pstmt = conn.prepareStatement(adminIdQuery);
        ResultSet rs = pstmt.executeQuery();

        String pId = product.getProductId();
        String category = product.getCategory();
        String pName = product.getProductName();
        int purchaseQty = Integer.parseInt(product.getQuantity());
        int purchasePrice = Integer.parseInt(product.getpurchaseprice());
        int purchaseTotal = purchasePrice * purchaseQty;
        if(rs.next()){
                // Use the INSERT ... ON DUPLICATE KEY UPDATE statement
       String insertRecord = "INSERT INTO product_details(product_id, category, product_Name, purchase_quantity, purchase_price, purchase_total, admin_id) VALUES (?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE purchase_quantity = purchase_quantity + VALUES(purchase_quantity), purchase_total = purchase_total + VALUES(purchase_total)";

        
        stmt = conn.prepareStatement(insertRecord);
        stmt.setString(1, pId);
        stmt.setString(2, category);
        stmt.setString(3, pName);
        stmt.setInt(4, purchaseQty);
        stmt.setInt(5, purchasePrice);
        stmt.setInt(6, purchaseTotal);
        stmt.setString(7,rs.getString("admin_id"));
        stmt.executeUpdate();
       JOptionPane.showMessageDialog(null, "product added successfully");
        }
        else{
            System.out.println("error");
        }

    
        
        conn.close();
    } catch (SQLException e) {
        System.out.println("SQL Exception: " + e.getMessage());
        e.printStackTrace();
    }
   }


    public void accountCreation(String username, String password, String accountType, String mail, String userId) throws SQLException {
        System.out.println(userId);
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement stmt = null;

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

                    JOptionPane.showMessageDialog(null, username + " Account created successfully...");
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

    public void searchStockDetails(JTable tblStockDetail) {
        System.out.println(tblStockDetail);
        System.out.println("stock details");
    }

    public void searchProductDetails(JTable product, String val, String selectItem) {
        System.out.println(product);
        System.out.println(val);
        System.out.println(selectItem);
        System.out.println("product details");
    }

    public void updateAccountDetails(String oldMail, String newMail, String username, String password, String accountType) {
        System.out.println(oldMail);
        System.out.println(newMail);
        System.out.println(username);
        System.out.println(password);
        System.out.println(accountType);

        System.out.println("account updated successfuly");
    }

    public void updateProduct(String productId, String options, String newValue) {
        System.out.println(productId);
        System.out.println(options);
        System.out.println(newValue);
        System.out.println("product updated successfully");
    }

    public void placeOrder(String name, String address, String mobile, String productId, int quantity, String prevName, String prevAddress, String prevMobile) throws SQLException {
        PreparedStatement pstmt = null;
        Connection conn = getConnection();
        try {

            String createRecord1 = "INSERT INTO order_details (category, product_Name, quantity, price, amount) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(createRecord1);

            int price = 10;
            int amount = price * quantity;

//            pstmt.setString(1, category);
//            pstmt.setString(2, productName);
            pstmt.setInt(3, quantity);
            pstmt.setInt(4, price);
            pstmt.setInt(5, amount);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Order placed successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);

            int choicemore = JOptionPane.showConfirmDialog(null, "Do you want to place more orders?", "Confirmation", JOptionPane.YES_NO_OPTION);

            Invoice receipt = new Invoice();

            if (choicemore == JOptionPane.YES_OPTION) {

                yesCount++;
                receipt.print(name, address, mobile, yesCount, receipt);
                PlaceOrder p1 = new PlaceOrder();
                p1.setName(prevName);
                p1.setAddress(prevAddress);
                p1.setMobile(prevMobile);
              
                p1.setProductId("");
                p1.setQuantity("");
                p1.setVisible(true);
                receipt.setVisible(false);

            } else {

                receipt.print(name, address, mobile, yesCount, receipt);

            }
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

    public void removeProduct(String cat, String productName, String qty) {

        System.out.println(cat);
        System.out.println(productName);
        System.out.println(qty);
        System.out.println("product removed successfully");
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

    public void printInvoice(JTable tblInvoice, String name, String address, String mobile, int yesCount, Invoice receipt) throws SQLException {

        receipt.setName(name);
        receipt.setAddress(address);
        receipt.setMobile(mobile);

        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        ResultSet resultSet1 = null;

        try {

            // Execute a SQL query to retrieve all the latest records from the database
            String selectDataQuery = "SELECT Invoice_No, category, product_Name, quantity, price, amount "
                    + "FROM order_details "
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
                String category = resultSet.getString("category");
                String productName = resultSet.getString("product_Name");
                int quantity = resultSet.getInt("quantity");
                int price = resultSet.getInt("price");
                int amount = resultSet.getInt("amount");

                // Add a new row with the retrieved values
                Object[] rowData = {invoiceNo, category, productName, quantity, price, amount};
                model.addRow(rowData);

                recordCount++;
            }

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

    
    public void logout(){
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
