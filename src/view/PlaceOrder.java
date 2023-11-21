
package view;

import controller.CashierController;
import java.awt.Color;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import model.Order;

public class PlaceOrder extends javax.swing.JFrame {
 
  private String prevName;
private String prevAddress;
private String prevMobile;
     
    public PlaceOrder() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    
    public void setName(String name){
        txtName.setText(name);
    }
    
    public void setAddress(String address){
        txtAddress.setText(address);
    }
    
    public void setMobile(String mobile){
        txtMobile.setText(mobile);
    }
    
    public void setCategory(int index){
        cmbCat.setSelectedIndex(index);
    }
    
    public void setProductName(String name){
        txtProductName.setText(name);
    }
    public void setQuantity(String qty){
        txtQty.setText(qty);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogoText = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        txtProduct = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        cmbCat = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtTel = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        lblIName = new javax.swing.JLabel();
        lblIMobile = new javax.swing.JLabel();
        lblIQty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/apllelogo1-unscreen.gif"))); // NOI18N

        lblLogoText.setBackground(new java.awt.Color(0, 0, 0));
        lblLogoText.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        lblLogoText.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoText.setText("APPLE I-STORE");

        btnPrev.setBackground(new java.awt.Color(0, 0, 0));
        btnPrev.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("Prev");
        btnPrev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevMouseExited(evt);
            }
        });
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblLogoText))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoText)
                .addGap(55, 55, 55))
        );

        txtProduct.setBackground(new java.awt.Color(255, 255, 255));

        lblHead.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblHead.setText("Place Order !!!");

        lblCat.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblCat.setText("Category:");

        lblProduct.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblProduct.setText("Product Name:");

        lblQty.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblQty.setText("Quantity:");

        btnOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Place Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        txtProductName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtProductName.setForeground(new java.awt.Color(153, 153, 153));
        txtProductName.setText("Enter product name");
        txtProductName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductNameFocusLost(evt);
            }
        });

        txtQty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtQty.setForeground(new java.awt.Color(153, 153, 153));
        txtQty.setText("Enter a number");
        txtQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtyFocusLost(evt);
            }
        });

        cmbCat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Iphone", "Apple Watch", "Ipad", "Airpods", "Mac" }));

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblname.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblname.setText("Name:");

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(153, 153, 153));
        txtName.setText("Enter your name");
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblAddress.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(153, 153, 153));
        txtAddress.setText("Enter your address");
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });

        txtTel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtTel.setText("Mobile No:");

        txtMobile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtMobile.setForeground(new java.awt.Color(153, 153, 153));
        txtMobile.setText("0712222222");
        txtMobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMobileFocusLost(evt);
            }
        });

        lblIName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIName.setForeground(new java.awt.Color(255, 0, 0));

        lblIMobile.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIMobile.setForeground(new java.awt.Color(255, 0, 0));

        lblIQty.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIQty.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout txtProductLayout = new javax.swing.GroupLayout(txtProduct);
        txtProduct.setLayout(txtProductLayout);
        txtProductLayout.setHorizontalGroup(
            txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtProductLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(lblHead)
                .addGap(99, 99, 99))
            .addGroup(txtProductLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtProductLayout.createSequentialGroup()
                        .addComponent(btnOrder)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(txtProductLayout.createSequentialGroup()
                        .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtProductLayout.createSequentialGroup()
                                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblname)
                                    .addComponent(lblAddress))
                                .addGap(60, 60, 60)
                                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblIName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(txtName)))
                            .addGroup(txtProductLayout.createSequentialGroup()
                                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQty)
                                    .addComponent(lblProduct)
                                    .addComponent(lblCat)
                                    .addComponent(txtTel))
                                .addGap(18, 18, 18)
                                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIQty, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(txtMobile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbCat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblIMobile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQty)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        txtProductLayout.setVerticalGroup(
            txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtProductLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblHead)
                .addGap(88, 88, 88)
                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCat))
                .addGap(18, 18, 18)
                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduct))
                .addGap(18, 18, 18)
                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQty))
                .addGap(5, 5, 5)
                .addComponent(lblIQty, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(txtProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
    
    String name = txtName.getText();
    String address = txtAddress.getText();
    String productNames=txtProductName.getText();
    String qty=txtQty.getText();
    String mobile = txtMobile.getText();
    Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character
          
       if(name.equals("Enter your name")||address.equals("Enter your address")||mobile.equals("07x xxxxxxx")||productNames.equals("Enter product name")||qty.equals("Enter a number")||cmbCat.getSelectedItem().equals("Select")){
          JOptionPane.showMessageDialog(null,"fields cannot be empty"); 
          
      }
       else if(name.matches(".*\\d.*")){
          
           lblIName.setText("digits are not allowed");
       }
       else if(!mobile.matches(".*\\d.*") ){
            lblIMobile.setText("Only digits are allowed!!!");
       }
       else if(mobile.length()>10 || mobile.length()<10 ){
            lblIMobile.setText("Mobile field must contain only 10 digits");
       }
       else if(!qty.matches(".*\\d.*")){
           lblIQty.setText("Only digits are allowed!!!");
       }
       else{
              lblIQty.setText("");
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you wantto place order?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION){ 
            prevName = name;
             prevAddress = address;
             prevMobile = mobile;
           CashierController  c1=new CashierController();
       
           
           String category=(String) cmbCat.getSelectedItem();
           String productName=txtProductName.getText();
           int quantity=Integer.parseInt(txtQty.getText());
           c1.placeOrder(name,address,mobile,category,productName,quantity,prevName,prevAddress,prevMobile);
           this.dispose();
       
       }
      }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtAddress.setText("");
        txtMobile.setText("");
        cmbCat.setSelectedIndex(0);
        txtProductName.setText("");
        txtQty.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
    this.dispose();
    Cashier c1=new Cashier();
    c1.setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
      if(txtName.getText().equals("Enter your name")){
          txtName.setText("");
           txtName.setForeground(Color.black);
          
       }
      txtName.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
          if( txtName.getText().equals("")){
            txtName.setText("Enter your name");
            txtName.setForeground(new Color(153,153,153));
           
       }
          
          
            String nameText = txtName.getText();
           Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character
          if(!pattern.matcher(nameText).find()){
             lblIName.setText("cannot contain digits!!!");
          }
          else{
                lblIName.setText("");
          }
           txtName.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtNameFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        if(txtAddress.getText().equals("Enter your address")){
          txtAddress.setText("");
           txtAddress.setForeground(Color.black);
         
       }
        txtAddress.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
      if(  txtAddress.getText().equals("")){
             txtAddress.setText("Enter your address");
           txtAddress.setForeground(new Color(153,153,153));
          
       }
        txtAddress.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtAddressFocusLost

    private void txtMobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMobileFocusGained
         if(txtMobile.getText().equals("0712222222")){
          txtMobile.setText("");
           txtMobile.setForeground(Color.black);
        
       }
          txtMobile.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtMobileFocusGained

    private void txtMobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMobileFocusLost
        if(  txtMobile.getText().equals("")){
            txtMobile.setText("0712222222");
           txtMobile.setForeground(new Color(153,153,153));
          
       }
        
          String mobile = txtMobile.getText();
    Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character
    if(pattern.matcher( mobile).find()){
        lblIMobile.setText("Can only contain digits");
        
    }
    else if(mobile.length()>10 || mobile.length()<10 ){
            lblIMobile.setText("Mobile field must contain only 10 digits");
       }
    else{
          lblIMobile.setText("");
    }
         txtMobile.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtMobileFocusLost

    private void txtProductNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusGained
       if(txtProductName.getText().equals("Enter product name")){
          txtProductName.setText("");
          txtProductName.setForeground(Color.black);
        
       }
        txtProductName.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtProductNameFocusGained

    private void txtProductNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusLost
       if( txtProductName.getText().equals("")){
            txtProductName.setText("Enter product name");
          txtProductName.setForeground(new Color(153,153,153));
        
       }
         txtProductName.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtProductNameFocusLost

    private void txtQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusGained
       if(txtQty.getText().equals("Enter a number")){
          txtQty.setText("");
         txtQty.setForeground(Color.black);
         
       }
       txtQty.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtQtyFocusGained

    private void txtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusLost
        if( txtQty.getText().equals("")){
           txtQty.setText("Enter a number");
         txtQty.setForeground(new Color(153,153,153));
        
       }
       
        String qty=txtQty.getText();
        if(!qty.matches(".*\\d.*")){
           lblIQty.setText("Only digits are allowed!!!");
       }
        else{
             lblIQty.setText("");
        }
         txtQty.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtQtyFocusLost

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
         btnPrev.setBorder(new LineBorder(Color.blue, 3));
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
       btnPrev.setBorder(new LineBorder(Color.white, 3));
    }//GEN-LAST:event_btnPrevMouseExited

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPrev;
    private javax.swing.JComboBox<String> cmbCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblIMobile;
    private javax.swing.JLabel lblIName;
    private javax.swing.JLabel lblIQty;
    private javax.swing.JLabel lblLogoText;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblname;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JPanel txtProduct;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel txtTel;
    // End of variables declaration//GEN-END:variables
}
