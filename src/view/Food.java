/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



public class Food extends javax.swing.JFrame {

  
    public Food() {
        initComponents();
    }
    
    
private ArrayList<String> generateUniqueBarcodes(int quantity) {
    ArrayList<String> barcodes = new ArrayList<>();
    String productId = txtPid.getText();
    long timestamp = System.currentTimeMillis();

    for (int i = 0; i < quantity; i++) {
        String barcode = productId + "_" + timestamp + "_" + i;
        barcodes.add(barcode);
    }

    return barcodes;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtCat = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblId.setText("pId");

        lblDesc.setText("Description");

        lblCat.setText("Category");

        lblPrice.setText("price");

        lblQty.setText("quantity");

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblCat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnAdd)))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId)
                    .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesc)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCat)
                    .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQty)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
          String id = txtPid.getText();
    String des = txtDesc.getText();
    String cat = txtCat.getText();
    String price = txtPrice.getText();
    String qty = txtQty.getText();
    Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character
        if(!id.startsWith("i")){
            JOptionPane.showMessageDialog(null, "id must start with i");
        }
        else if(!qty.matches(".*\\d.*")){
            JOptionPane.showMessageDialog(null, "only digits are allowed");
        }
        else{
        
        Connection conn = null;
    PreparedStatement pstmt1 = null;
    PreparedStatement pstmt2 = null;

   

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/food", "Amaan", "amn@123");

        String createRecord1 = "INSERT INTO product (productId, description, category, price, quantity) VALUES (?, ?, ?, ?, ?)";
        pstmt1 = conn.prepareStatement(createRecord1);
        pstmt1.setString(1, id);
        pstmt1.setString(2, des);
        pstmt1.setString(3, cat);
        pstmt1.setString(4, price);
        pstmt1.setString(5, qty);
        pstmt1.executeUpdate();

        ArrayList<String> barcodes = generateUniqueBarcodes(Integer.parseInt(qty));

        String createRecord2 = "INSERT INTO barcode (barcode, productId) VALUES (?, ?)";
        pstmt2 = conn.prepareStatement(createRecord2);
          pstmt2.setString(2, id);
        for (String barcode : barcodes) {
            pstmt2.setString(1, barcode);
           
            pstmt2.executeUpdate();
        }

        JOptionPane.showMessageDialog(null, "Inserted successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);

    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace();
    } finally {
        // close resources
        try {
            if (pstmt1 != null) pstmt1.close();
            if (pstmt2 != null) pstmt2.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
