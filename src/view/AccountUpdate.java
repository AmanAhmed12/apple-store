
package view;

import controller.CashierController;
import controller.ManagerController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;


public class AccountUpdate extends javax.swing.JFrame {
private boolean isManagerLoggedIn; 
  
    public AccountUpdate(boolean isManagerLoggedIn) {
        initComponents();
         this.isManagerLoggedIn = isManagerLoggedIn;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogoHead = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        lblOldMail = new javax.swing.JLabel();
        lblNewMail = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        lblAccType = new javax.swing.JLabel();
        txtOldMail = new javax.swing.JTextField();
        txtNewMail = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDeactivate = new javax.swing.JButton();
        lblActivate = new javax.swing.JLabel();
        cmbAccType = new javax.swing.JComboBox<>();
        txtPwd = new javax.swing.JPasswordField();
        lblShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/apllelogo1-unscreen.gif"))); // NOI18N

        lblLogoHead.setBackground(new java.awt.Color(0, 0, 0));
        lblLogoHead.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        lblLogoHead.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoHead.setText("APPLE  I-STORE");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(lblLogoHead)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(lblLogoHead)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblHead.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblHead.setText("Update Account Details");

        lblOldMail.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblOldMail.setText("Old Mail");

        lblNewMail.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblNewMail.setText("New Mail");

        lblUser.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUser.setText("username");

        lblPwd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblPwd.setText("password");

        lblAccType.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblAccType.setText("Account Type");

        txtOldMail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtOldMail.setForeground(new java.awt.Color(153, 153, 153));
        txtOldMail.setText("Enter old mail");
        txtOldMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOldMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOldMailFocusLost(evt);
            }
        });

        txtNewMail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNewMail.setForeground(new java.awt.Color(153, 153, 153));
        txtNewMail.setText("Enter new mail");
        txtNewMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewMailFocusLost(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setText("Enter username");
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
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

        btnDeactivate.setBackground(new java.awt.Color(0, 0, 0));
        btnDeactivate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnDeactivate.setForeground(new java.awt.Color(255, 255, 255));
        btnDeactivate.setText("Click Here !!!");
        btnDeactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeactivateActionPerformed(evt);
            }
        });

        lblActivate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblActivate.setText("Account Deactivation >>");

        cmbAccType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbAccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Manager", "Cashier" }));

        txtPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPwdFocusLost(evt);
            }
        });

        lblShow.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        lblShow.setText(" 👁");
        lblShow.setAlignmentX(5.0F);
        lblShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblHead))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAccType)
                                    .addComponent(lblPwd))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbAccType, 0, 283, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPwd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblActivate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeactivate))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUser)
                                    .addComponent(lblNewMail)
                                    .addComponent(lblOldMail))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNewMail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOldMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOldMail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNewMail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewMail))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPwd))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAccType)
                    .addComponent(cmbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblActivate)
                    .addComponent(btnDeactivate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
     if (isManagerLoggedIn) {
        ManagerController m1=new ManagerController();
        String oldMail=txtOldMail.getText();
        String newMail=txtNewMail.getText();
        String username=txtUser.getText();
        String password=txtPwd.getText();
         String accountType=(String) cmbAccType.getSelectedItem();
        m1.changeAccountDetails(oldMail,newMail,username,password,accountType);
        
        
    } else {
        CashierController c1=new CashierController();
        String oldMail=txtOldMail.getText();
        String newMail=txtNewMail.getText();
        String username=txtUser.getText();
        String password=txtPwd.getText();
        String accountType=(String) cmbAccType.getSelectedItem();
        c1.changeAccountDetails(oldMail,newMail,username,password,accountType);
    }
    
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateActionPerformed
        int choice= JOptionPane.showConfirmDialog(null, "Are you sure you want to DeActivate your account?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            ManagerController m1=new ManagerController();
            Login l1=new Login();
            String username=l1.getUsername();
            m1.deactivateAccount(username);
        }
    }//GEN-LAST:event_btnDeactivateActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (isManagerLoggedIn) {
            Manager m1=new Manager();
            m1.setVisible(true);
            this.dispose();
        
        
         } else {
           Cashier c1=new Cashier();
           c1.setVisible(true);
           this.dispose();
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      txtOldMail.setText("");
      txtNewMail.setText("");
      txtUser.setText("");
      txtPwd.setText("");
      cmbAccType.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
      char echo = txtPwd.getEchoChar();
    if (echo == 0) {
        txtPwd.setEchoChar('●'); // Set it to the default bullet character to hide characters
    } else {
        txtPwd.setEchoChar((char) 0); // Set it to 0 to make characters visible
    }
    }//GEN-LAST:event_lblShowMouseClicked

    private void txtOldMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOldMailFocusGained
        if(txtOldMail.getText().equals("Enter old mail")){
           txtOldMail.setText("");
           txtOldMail.setForeground(Color.black);
          txtOldMail.setBorder(new LineBorder(Color.blue, 2));
       }
    }//GEN-LAST:event_txtOldMailFocusGained

    private void txtOldMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOldMailFocusLost
     if(txtOldMail.getText().equals("")){
           txtOldMail.setText("Enter old mail");
           txtOldMail.setForeground(new Color(153,153,153));
           txtOldMail.setBorder(new LineBorder(Color.gray, 1));
       }
    }//GEN-LAST:event_txtOldMailFocusLost

    private void txtNewMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewMailFocusGained
    if(txtNewMail.getText().equals("Enter new mail")){
           txtNewMail.setText("");
          txtNewMail.setForeground(Color.black);
          txtNewMail.setBorder(new LineBorder(Color.blue, 2));
       }
    }//GEN-LAST:event_txtNewMailFocusGained

    private void txtNewMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewMailFocusLost
      if( txtNewMail.getText().equals("")){
            txtNewMail.setText("Enter new mail");
            txtNewMail.setForeground(new Color(153,153,153));
            txtNewMail.setBorder(new LineBorder(Color.gray, 1));
       }
    }//GEN-LAST:event_txtNewMailFocusLost

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if(txtUser.getText().equals("Enter username")){
           txtUser.setText("");
           txtUser.setForeground(Color.black);
           txtUser.setBorder(new LineBorder(Color.blue, 2));
       }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
      if(txtUser.getText().equals("")){
           txtUser.setText("Enter username");
           txtUser.setForeground(new Color(153,153,153));
           txtUser.setBorder(new LineBorder(Color.gray, 1));
       }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusGained
         txtPwd.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtPwdFocusGained

    private void txtPwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusLost
       txtPwd.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtPwdFocusLost

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
     btnPrev.setBorder(new LineBorder(Color.blue, 3));
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
       btnPrev.setBorder(new LineBorder(Color.white, 3));
    }//GEN-LAST:event_btnPrevMouseExited

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountUpdate(true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeactivate;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbAccType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccType;
    private javax.swing.JLabel lblActivate;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblLogoHead;
    private javax.swing.JLabel lblNewMail;
    private javax.swing.JLabel lblOldMail;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtNewMail;
    private javax.swing.JTextField txtOldMail;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
