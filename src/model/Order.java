package model;

public class Order {

    private String name;
    private String address;
    private String mobile;
    private String productname;
    private int quantity;
    private String prevName;
    private String prevAddress;
    private String prevMobile;
        private String cat;
    
    
    public Order(String name,String address,String mobile,String productname,int quantity,String prevName,String prevAddress,String prevMobile,String cat){
        this.name=name;
        this.address=address;
        this.mobile=mobile;
        this.productname =productname;
        this.quantity=quantity;
        this.prevName=prevName;
        this.prevAddress=prevAddress;
        this.prevMobile=prevMobile;
        this.cat=cat;
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat= cat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProductName() {
        return productname;
    }

    public int getQty() {
        return quantity;
    }

    public String getPrevName() {
        return prevName;
    }

    public String getPrevAddress() {
        return prevAddress;
    }

    public String getPrevMobile() {
        return prevMobile;
    }
}
