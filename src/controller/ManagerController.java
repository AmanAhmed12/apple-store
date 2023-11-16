
package controller;
import database.Database;
import javax.swing.JTable;
import model.CashierModel;
import view.SearchProductDetails;
import view.SearchStockDetails;
import view.ViewProductDetails;
import model.ManagerModel;
import model.Product;

public class ManagerController extends ProductController {
 
    
    
    
    public void createAccount(String username,String password,String accountType,String mail){
        Database d1=new Database();
        d1.accountCreation(username,password,accountType,mail);
    }
    
    public void addProduct(String productId,String categoryName,String productName,String price,String quantity){
       
        Product p1=new Product(productId,categoryName, productName, price, quantity);
        Database d1=new Database();
        d1.addproduct(p1);
        
    }
    
    
    
     public void updateProduct(String productId,String options,String newValue ){
       
      Database d1=new Database();
        d1.updateProduct(productId,options,newValue);
       
    }
    
     public void removeProduct( String cat,String productName,String qty){
       Database d1=new Database();
        d1.removeProduct(cat, productName, qty);
       
      
    }
    
    public void viewAllProduct(){
        ViewProductDetails view=new ViewProductDetails(true);
        view.setTable();
        view.setVisible(true);
      
    }
    
    public void SearchStockDetails(){
        SearchStockDetails stock=new  SearchStockDetails(true);
        JTable tableName=stock.getTable();
        Database d1=new Database();
        d1.searchStockDetails(tableName);
        stock.setVisible(true);
    }
    
    public void SearchProductDetails(){
      SearchProductDetails stock=new  SearchProductDetails(true);
        JTable tableName=stock.getTable();
        Database d1=new Database();
        d1.searchProductDetails(tableName);
        stock.setVisible(true);
    }
    
    public void changeAccountDetails(String oldMail,String newMail,String username,String password,String accountType){
        Database d1=new Database();
        d1.updateAccountDetails(oldMail,newMail,username,password,accountType);
        
    }
    
     public void deactivateAccount(String username){
       Database d1=new Database();
        d1.accountDeactivate(username);
         
    }
     
     
}
