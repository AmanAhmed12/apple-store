
package model;


public class ManagerModel implements AccountModel {
    private String username;
    private String password;
     private String mail;
     private String accountType;
      private String userId;
    
     
     public ManagerModel(String username,String password,String accountType,String mail,String userId){
         
         this.username=username;
         this.password=password;
         this.mail=mail;
         this.accountType=accountType;
         this.userId=userId;
     }
     
     public String getUsername(){
         return username;
    }
    
    public void setUserName(String username){
        this.username=username;
    }
     public String getUserId(){
         return userId;
    }
    
    public void setUserId(String userId){
        this.userId=userId;
    }
    
    public String getPassword(){
         return password;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getMail(){
         return mail;
    }
    
    public void setMail(String mail){
        this.mail=mail;
    }
    
     public String getAccounType(){
         return accountType;
    }
    
    public void setAccountType(String AccountType){
        this.accountType=accountType;
    }
    
    public void display(){
        System.out.println("Managers Account details");
        System.out.println("Username:"+username+"\n"+"Mail:"+mail+"\n"+"AccountType:"+accountType);
    }
    
    
}
