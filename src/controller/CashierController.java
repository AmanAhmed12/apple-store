package controller;

import database.Database;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Order;
import view.SearchProductDetails;
import view.SearchStockDetails;
import view.ViewProductDetails;

public class CashierController extends ProductController {

    public void viewAllProduct() {
        ViewProductDetails view = new ViewProductDetails(true);
        try {
            view.setTable();
        } catch (SQLException ex) {
            Logger.getLogger(CashierController.class.getName()).log(Level.SEVERE, null, ex);
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

    public void deactivateAccount(String username) throws SQLException {
        Database d1 = new Database();
        d1.useraccountDeactivate(username);

    }

    public void placeOrder(String name, String address, String mobile, String productName, int quantity, String prevName, String prevAddress, String prevMobile,String category) throws SQLException {
        Order o1=new Order(name,address, mobile, productName, quantity, prevName, prevAddress,prevMobile,category);
        Database d1 = new Database();
       d1.placeOrder(o1);
    }

}
