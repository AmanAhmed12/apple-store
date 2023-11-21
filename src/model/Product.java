
package model;


public class Product {
    private String productId;
    private String category;
    private String  productName ;
    private String purchaseprice;
    private String quantity;
    
    public Product(String productId,String category,String  productName,String purchaseprice,String quantity){
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
   
    public String getProductName(){
        return productName;
    }
    public void setProductName(String product){
        this.productName=productName;
    }
    
    
     public String getpurchaseprice(){
        return purchaseprice;
    }
    public void seturchaseprice(String purchaseprice){
        this.purchaseprice=purchaseprice;
    }
    
     public String getQuantity(){
        return quantity;
    }
    public void setQuantity(String quantity){
        this.quantity=quantity;
    }
    
    
    
    
    
    
}
