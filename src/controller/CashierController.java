
package controller;

import database.Database;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import view.SearchProductDetails;
import view.SearchStockDetails;
import view.ViewProductDetails;

public class CashierController extends ProductController {
    
    
    
    
     public void viewAllProduct(){
        ViewProductDetails view=new ViewProductDetails(true);
        view.setTable();
        view.setVisible(true);
      
    }
    
    public void SearchStockDetails(){
    SearchStockDetails stock=new  SearchStockDetails(true);
        stock.setTable();
        stock.setVisible(true);
    }
    
    public void SearchProductDetails(){
         SearchProductDetails product=new  SearchProductDetails(true);
        product.setVisible(true);
    }
    
     public void changeAccountDetails(String oldMail,String newMail,String username,String password,String accountType){
        Database d1=new Database();
        d1.updateAccountDetails(oldMail,newMail,username,password,accountType);
    }
     
      public void deactivateAccount(String username){
           
        
             Database d1=new Database();
            d1.useraccountDeactivate(username);
         
    }
      
      public void placeOrder(String name,String address,String mobile,String category,String productName,int quantity,String prevName,String prevAddress,String prevMobile){
            Database d1=new Database();
   
           d1.placeOrder(name,address,mobile,category,productName,quantity,prevName,prevAddress,prevMobile);
      }
      
    
}
