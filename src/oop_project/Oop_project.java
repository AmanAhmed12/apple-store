
package oop_project;

import view.Login;


public class Oop_project {
private static  Login l1;
public Login getLoginDetail(){
    return l1;
}
    
    public static void main(String[] args) {
       l1=new Login();
       l1.setVisible(true);
    }
    
}
