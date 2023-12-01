
package model;


public class Product {
    private String productId;
    private String category;
     private String productName;
    private String purchaseprice;
    private String quantity;
    
    public Product(String productId,String category,String purchaseprice,String quantity,String productName){
        this.productId=productId;
        this.category=category;
        this.productName=productName;
        this.purchaseprice=purchaseprice;
        this.quantity=quantity;
        
    }
    
    
      public String getProductId(){
        return productId;
    }
   
    
    public String getCategory(){
        return category;
    }
   
  
    
     public String getpurchaseprice(){
        return purchaseprice;
    }
    public void setpurchaseprice(String purchaseprice){
        this.purchaseprice=purchaseprice;
    }
    
     public String getproductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    
     public String getQuantity(){
        return quantity;
    }
    public void setQuantity(String quantity){
        this.quantity=quantity;
    }
    
    
    
    
    
    
}
