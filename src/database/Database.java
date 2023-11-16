
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Product;
import view.Cashier;
import view.Invoice;
import view.Login;
import view.Manager;
import view.PlaceOrder;
import view.addProduct;



public class Database {
    static int yesCount=1;
    
    public void viewAllProduct(JTable tblIphone ){
         try {
          Connection conn = null;
        Statement stmt = null;
         ResultSet rs = null;

           Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/my_db","root","");
            stmt = conn.createStatement();

            String showTableQuery = "SELECT * FROM users";
             rs=stmt.executeQuery(showTableQuery);
            ((DefaultTableModel) tblIphone.getModel()).setRowCount(0);
             while(rs.next()){
                 String username=rs.getString("username");
                  String password=rs.getString("pwd");
                  String tbData[]={username,password};
                  DefaultTableModel tblModel=(DefaultTableModel) tblIphone.getModel();
                  tblModel.addRow(tbData);
             }
             conn.close();

    } catch (SQLException e) {
        System.out.println("SQL Exception: " + e.getMessage());
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        System.out.println("Class not found exception: " + e.getMessage());
        e.printStackTrace();
    }
 }
    
    
    
public void addproduct(Product product){
    System.out.println(product.getCategory());
    System.out.println(product.getProductName());
    System.out.println(product.getQuantity());
    System.out.println(product.getpurchaseprice());
    System.out.println("product added successfully");
}

public void accountCreation(String username,String password,String accountType,String mail){
    System.out.println(username);
     System.out.println(password);
      System.out.println(accountType);
       System.out.println(mail);
       System.out.println("account created successfully");
}

public void searchStockDetails(JTable tblStockDetail){
    System.out.println(tblStockDetail);
    System.out.println("stock details");
}


public void searchProductDetails(JTable product,String val,String selectItem){
    System.out.println(product);
    System.out.println(val);
    System.out.println(selectItem);
    System.out.println("product details");
}


public void updateAccountDetails(String oldMail,String newMail,String username,String password,String accountType){
    System.out.println(oldMail);
     System.out.println(newMail);
      System.out.println(username);
       System.out.println(password);
        System.out.println(accountType);
    
    System.out.println("account updated successfuly");
}


public void updateProduct(String productId,String options,String newValue){
    System.out.println(productId);
    System.out.println(options);
    System.out.println(newValue);
    System.out.println("product updated successfully");
}


public void placeOrder(String name,String address,String mobile,String category,String productName,int quantity,String prevName,String prevAddress,String prevMobile){
    
    
     Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/my_db", "root", "");

            String createRecord1 = "INSERT INTO order_details (category, product_Name, quantity, price, amount) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(createRecord1);

            
            int price = 10;
            int amount = price * quantity;

            pstmt.setString(1, category);
            pstmt.setString(2, productName);
            pstmt.setInt(3, quantity);
            pstmt.setInt(4, price);
            pstmt.setInt(5, amount);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Order placed successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
           

       int choicemore = JOptionPane.showConfirmDialog(null, "Do you want to place more orders?", "Confirmation", JOptionPane.YES_NO_OPTION);
           
         Invoice receipt = new Invoice();
        
       if (choicemore == JOptionPane.YES_OPTION) {
           
             yesCount++;
            receipt.print(name,address,mobile,yesCount,receipt);
            PlaceOrder p1=new PlaceOrder();
              p1.setName(prevName);
              p1.setAddress(prevAddress);
              p1.setMobile(prevMobile);
             p1.setCategory(0);
             p1.setProductName("");
             p1.setQuantity("");
             p1.setVisible(true);
              receipt.setVisible(false);
            
            
            
           
         }
       else{
          
           receipt.print(name,address,mobile,yesCount,receipt);
            
       }
        } catch (ClassNotFoundException | SQLException ex) {
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


public void removeProduct(String cat,String productName,String qty){
    
    System.out.println(cat);
    System.out.println(productName);
    System.out.println(qty);
      System.out.println("product removed successfully");
}

public void accountDeactivate(String username){
    System.out.println(username);
    System.out.println(" Account deactivated");
}


public void login(String username, String password,Login login) {
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/my_db", "root", "")) {
        if (checkAdminLogin(conn, username, password)) {
            JOptionPane.showMessageDialog(null,"welcome admin"); 
            Manager m1=new Manager();
            login.dispose();
            m1.setVisible(true);
        } else if (checkUserLogin(conn, username, password)) {
             JOptionPane.showMessageDialog(null,"welcome user"); 
            Cashier c1= new Cashier();
            c1.setVisible(true);
        } else {
             JOptionPane.showMessageDialog(null,"Incorrect username or password!!!"); 
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

private boolean checkAdminLogin(Connection conn, String username, String password) throws SQLException {
    String adminQuery = "SELECT username, pwd FROM administrator WHERE username = ? AND pwd = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(adminQuery)) {
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        return rs.next();
    }
}

private boolean checkUserLogin(Connection conn, String username, String password) throws SQLException {
    String userQuery = "SELECT username, pwd FROM users WHERE username = ? AND pwd = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(userQuery)) {
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        return rs.next();
    }
}


public void printInvoice(JTable tblInvoice,String name, String address, String mobile, int yesCount,Invoice receipt){
      
    
     receipt.setName(name);
    receipt.setAddress(address);
    receipt.setMobile(mobile);
    
     Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet resultSet = null;
    ResultSet resultSet1 = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/my_db", "root", "");

        // Execute a SQL query to retrieve all the latest records from the database
        String selectDataQuery = "SELECT Invoice_No, category, product_Name, quantity, price, amount " +
                "FROM order_details " +
                "ORDER BY Invoice_No DESC";
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
    } catch (ClassNotFoundException | SQLException ex) {
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



    
}
