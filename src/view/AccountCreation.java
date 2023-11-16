package view;

import controller.ManagerController;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import model.ManagerModel;

public class AccountCreation extends javax.swing.JFrame {

    public AccountCreation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogoText = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblAccHead = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblConfirm = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        lblShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/apllelogo1-unscreen.gif"))); // NOI18N
        jLabel1.setText("jLabel1");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblLogoText)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblLogoText)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblAccHead.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblAccHead.setText("Account Creation");

        lblMail.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblMail.setText("Email");

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

        lblPwd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblPwd.setText("Password");

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblConfirm.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblConfirm.setText("Confirm Password");

        txtConfirm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmFocusLost(evt);
            }
        });

        txtMail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtMail.setForeground(new java.awt.Color(153, 153, 153));
        txtMail.setText("amaanhlimy@gmail.com");
        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUser.setText("Username");

        lblType.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblType.setText("Account Type");

        txtType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtType.setForeground(new java.awt.Color(153, 153, 153));
        txtType.setText("Enter Account Type");
        txtType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTypeFocusLost(evt);
            }
        });
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        txtPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPwdFocusLost(evt);
            }
        });

        lblShow.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        lblShow.setText("👁");
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
                        .addGap(88, 88, 88)
                        .addComponent(lblAccHead))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblConfirm))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUser)
                                    .addComponent(lblPwd)
                                    .addComponent(lblMail)
                                    .addComponent(lblType))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblAccHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblType, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblUser))
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPwd)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirm, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        Manager m1 = new Manager();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        ManagerController m1 = new ManagerController();
        String username = txtUser.getText();
        String password = txtConfirm.getText();
        String accountType = txtType.getText();
        String mail = txtMail.getText();
        if(username.equals("") || password.equals("") || accountType.equals("") || mail.equals("")){
             System.out.println("");
        }
        else{
           m1.createAccount(username, password, accountType, mail);
        }

       

        txtUser.setText("");
        txtConfirm.setText("");
        txtType.setText("");
        txtMail.setText("");
        txtPwd.setText("");

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        char echo = txtPwd.getEchoChar();
        if (echo == 0) {
            txtPwd.setEchoChar('●'); // Set it to the default bullet character to hide characters
        } else {
            txtPwd.setEchoChar((char) 0); // Set it to 0 to make characters visible
        }
    }//GEN-LAST:event_lblShowMouseClicked

    private void txtTypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeFocusGained
     if(txtType.getText().equals("Enter Account Type")){
           txtType.setText("");
           txtType.setForeground(Color.black);
            txtType.setBorder(new LineBorder(Color.blue, 2));
       }
    }//GEN-LAST:event_txtTypeFocusGained

    private void txtTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeFocusLost
     if(txtType.getText().equals("")){
           txtType.setText("Enter Account Type");
           txtType.setForeground(new Color(153,153,153));
            txtType.setBorder(new LineBorder(Color.gray, 1));
       }
    }//GEN-LAST:event_txtTypeFocusLost

    private void txtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusGained
       if(txtMail.getText().equals("amaanhlimy@gmail.com")){
           txtMail.setText("");
           txtMail.setForeground(Color.black);
            txtMail.setBorder(new LineBorder(Color.blue, 2));
       }
    }//GEN-LAST:event_txtMailFocusGained

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
        if(txtMail.getText().equals("")){
           txtMail.setText("amaanhlimy@gmail.com");
           txtMail.setForeground(new Color(153,153,153));
            txtMail.setBorder(new LineBorder(Color.gray, 1));
       }
    }//GEN-LAST:event_txtMailFocusLost

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
       
           txtPwd.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
       
    }//GEN-LAST:event_txtPwdFocusGained

    private void txtPwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusLost
        txtPwd.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtPwdFocusLost

    private void txtConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusGained
        txtConfirm.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtConfirmFocusGained

    private void txtConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusLost
        txtConfirm.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtConfirmFocusLost

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
      btnPrev.setBorder(new LineBorder(Color.blue, 3));
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
       btnPrev.setBorder(new LineBorder(Color.white, 3));
    }//GEN-LAST:event_btnPrevMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccHead;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblLogoText;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtConfirm;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
