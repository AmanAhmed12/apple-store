
package view;
import controller.ManagerController;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class UpdateProduct extends javax.swing.JFrame {

    
    public UpdateProduct() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogoImg = new javax.swing.JLabel();
        lblLogoText = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblAddHead = new javax.swing.JLabel();
        lblOption = new javax.swing.JLabel();
        lblUpdateVal = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        txtUpdateVal = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        cmbOption = new javax.swing.JComboBox<>();
        lblProductId = new javax.swing.JLabel();
        lblIId = new javax.swing.JLabel();
        lblIUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblLogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/apllelogo1-unscreen.gif"))); // NOI18N

        lblLogoText.setBackground(new java.awt.Color(0, 0, 0));
        lblLogoText.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        lblLogoText.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoText.setText("APPLE  I-STORE");

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
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLogoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(lblLogoText)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblLogoImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogoText)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblAddHead.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblAddHead.setText("Update Product");

        lblOption.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblOption.setText("Options");

        lblUpdateVal.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUpdateVal.setText("Update Value");

        txtProductId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtProductId.setForeground(new java.awt.Color(153, 153, 153));
        txtProductId.setText("Ixxx");
        txtProductId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductIdFocusLost(evt);
            }
        });
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });
        txtProductId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductIdKeyTyped(evt);
            }
        });

        txtUpdateVal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUpdateVal.setForeground(new java.awt.Color(153, 153, 153));
        txtUpdateVal.setText("Enter update value");
        txtUpdateVal.setPreferredSize(new java.awt.Dimension(6, 33));
        txtUpdateVal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUpdateValFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUpdateValFocusLost(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cmbOption.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Category", "Product Name", "Price", " ", " " }));

        lblProductId.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblProductId.setText("Product ID");

        lblIId.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIId.setForeground(new java.awt.Color(255, 0, 0));

        lblIUp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIUp.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblAddHead))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductId)
                            .addComponent(lblOption)
                            .addComponent(lblUpdateVal)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUpdateVal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblIId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbOption, javax.swing.GroupLayout.Alignment.LEADING, 0, 228, Short.MAX_VALUE)
                                        .addComponent(lblIUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(lblAddHead)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIId, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOption, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOption))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateVal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIUp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
      Manager m1=new Manager();
      m1.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    String updateText = txtUpdateVal.getText();
    Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character
        
   if(txtProductId.getText().equals("")||txtUpdateVal.getText().equals("")||cmbOption.getSelectedItem().equals("Select")){
        
        JOptionPane.showMessageDialog(null,"fields cannot be empty"); 
    }
    else if(!txtProductId.getText().startsWith("I")){
        lblIId.setText("ID must start with I");
        
    }
    else if(!txtProductId.getText().substring(1).matches("\\d+")){
            lblIId.setText("Rest of the values must be digits");
      }
    else if(cmbOption.getSelectedItem().equals("Price")&& pattern.matcher(updateText).find()){
       
            lblIUp.setText("only digits are allowed!!");
  
    }
    else{
    
          lblIUp.setText("");
        ManagerController m1=new  ManagerController ();
        String productId=txtProductId.getText();
        String options=(String) cmbOption.getSelectedItem();
        String newValue=txtUpdateVal.getText();
      
       m1.updateProduct( productId,options,newValue );
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      cmbOption.setSelectedIndex(0);
      txtProductId.setText("");
      txtUpdateVal.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtProductIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductIdFocusGained
       if(txtProductId.getText().equals("Ixxx")){
        txtProductId.setText("");
        txtProductId.setForeground(Color.black);
        
       }
        txtProductId.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtProductIdFocusGained

    private void txtProductIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductIdFocusLost
         if( txtProductId.getText().equals("")){
       txtProductId.setText("Ixxx");
        txtProductId.setForeground(new Color(153,153,153));
        
       }
         txtProductId.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtProductIdFocusLost

    private void txtUpdateValFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUpdateValFocusGained
         if(txtUpdateVal.getText().equals("Enter update value")){
        txtUpdateVal.setText("");
        txtUpdateVal.setForeground(Color.black);
       
       }
          txtUpdateVal.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtUpdateValFocusGained

    private void txtUpdateValFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUpdateValFocusLost
          if(txtUpdateVal.getText().equals("")){
       txtUpdateVal.setText("Enter update value");
       txtUpdateVal.setForeground(new Color(153,153,153));
      
       }
          String updateText = txtUpdateVal.getText();
    Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character
    if(cmbOption.getSelectedItem().equals("Price")){
        if(pattern.matcher(updateText).find()){
            lblIUp.setText("only digits are allowed!!");
        }
        else{
            lblIUp.setText("");
        }
    }
          
            txtUpdateVal.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtUpdateValFocusLost

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
         btnPrev.setBorder(new LineBorder(Color.blue, 3));
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
        btnPrev.setBorder(new LineBorder(Color.white, 3));
    }//GEN-LAST:event_btnPrevMouseExited

    private void txtProductIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductIdKeyTyped
       if(!txtProductId.getText().startsWith("I")){
           lblIId.setText("ID should be like I001");
      }
      else{
          lblIId.setText("");
      }
    }//GEN-LAST:event_txtProductIdKeyTyped

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbOption;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddHead;
    private javax.swing.JLabel lblIId;
    private javax.swing.JLabel lblIUp;
    private javax.swing.JLabel lblLogoImg;
    private javax.swing.JLabel lblLogoText;
    private javax.swing.JLabel lblOption;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblUpdateVal;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtUpdateVal;
    // End of variables declaration//GEN-END:variables
}
