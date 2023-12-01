package controller;

import database.Database;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.AccountModel;
import model.CashierModel;
import view.SearchProductDetails;
import view.SearchStockDetails;
import view.ViewProductDetails;
import model.ManagerModel;
import model.Product;

public class ManagerController extends ProductController {

    public void createAccount(String username, String password, String accountType, String mail, String userId) throws SQLException {
         Database d1 = new Database();
         AccountModel accountModel;

        if ("manager".equals(accountType)) {
           
            accountModel = (AccountModel) new ManagerModel(username, password, accountType, mail, userId);
        } else {
            accountModel = new CashierModel(username, password, accountType, mail, userId);
           
        }

        d1.accountCreation(accountModel);
        
        
       
       
    }

    public void addProduct(String productId, String categoryName, String price, String quantity,String productName) throws SQLException {

        Product p1 = new Product(productId, categoryName, price, quantity,productName);
        Database d1 = new Database();
        d1.addproduct(p1);

    }

    public void updateProduct(String productId, String options, String newValue) {

        Database d1 = new Database();
        d1.updateProduct(productId, options, newValue);

    }

    public void removeProduct(String cat, String productName, String qty) {
        Database d1 = new Database();
        d1.removeProduct(cat, productName, qty);
    }

    public void viewAllProduct() {
        ViewProductDetails view = new ViewProductDetails(true);
        try {
            view.setTable();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        view.setVisible(true);

    }

    public void SearchStockDetails() {
        SearchStockDetails stock = new SearchStockDetails(true);
        stock.setTable();
        stock.setVisible(true);
    }

    public void SearchProductDetails() {
        SearchProductDetails product = new SearchProductDetails(true);
        product.setVisible(true);
    }

    public void changeAccountDetails(String oldMail, String newMail, String username, String password, String accountType) {
        Database d1 = new Database();
        d1.updateAccountDetails(oldMail, newMail, username, password, accountType);

    }

}
