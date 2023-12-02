package view;

import controller.CashierController;
import controller.ManagerController;
import database.Database;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class AccountUpdate extends javax.swing.JFrame {

    private boolean isManagerLoggedIn;

    public AccountUpdate(boolean isManagerLoggedIn) {
        initComponents();
        this.isManagerLoggedIn = isManagerLoggedIn;

        if (isManagerLoggedIn) {
            lblActivate.setText("Manage User Accounts >>");
        } else {
            lblActivate.setText("Account Deactivation >>");
        }
    }

    public boolean getIsManagerLoggedIn() {
        return isManagerLoggedIn;
    }

    private int getDigits(String str) {
        int digitCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
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
        lblUser = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDeactivate = new javax.swing.JButton();
        lblActivate = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        lblShow = new javax.swing.JLabel();
        lblIUser = new javax.swing.JLabel();
        lblIPwd = new javax.swing.JLabel();
        lblPwd1 = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        lblIConfirm = new javax.swing.JLabel();

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

        lblUser.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUser.setText("New username");

        lblPwd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblPwd.setText("New password");

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
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
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

        txtPwd.setForeground(new java.awt.Color(153, 153, 153));
        txtPwd.setText("##############");
        txtPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPwdFocusLost(evt);
            }
        });
        txtPwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPwdKeyPressed(evt);
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

        lblIUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIUser.setForeground(new java.awt.Color(255, 0, 0));

        lblIPwd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIPwd.setForeground(new java.awt.Color(255, 0, 0));

        lblPwd1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblPwd1.setText("Confirm password");

        txtConfirm.setForeground(new java.awt.Color(153, 153, 153));
        txtConfirm.setText("##############");
        txtConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmFocusLost(evt);
            }
        });
        txtConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmKeyPressed(evt);
            }
        });

        lblIConfirm.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIConfirm.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPwd)
                            .addComponent(lblUser))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIUser, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53))
                                .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblActivate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeactivate))
                            .addComponent(lblPwd1)))
                    .addComponent(lblHead))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIUser, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPwd))
                    .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(lblIPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd1)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblActivate)
                    .addComponent(btnDeactivate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if ( txtUser.getText().equals("Enter username") || txtPwd.getText().equals("") || txtConfirm.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "fields cannot be empty");
        }  else {
            // Check password length

            if (txtPwd.getText().length() < 8) {
                lblIPwd.setText("Password must be more than 8 characters");
            }
            else if(!txtPwd.getText().equals(txtConfirm.getText())){
                JOptionPane.showMessageDialog(null, "Password does not match !!!");
            }
            else{
                  // Check username length and digit count
            if (txtUser.getText().length() < 5) {
                lblIUser.setText("Username must be more than 5 characters");
            } else if (getDigits(txtUser.getText()) > 3) {
                lblIUser.setText("Username cannot have more than 3 digits");
            } else {
                lblIUser.setText("");
            }

            // If all validations pass, create the account
            if (lblIPwd.getText().isEmpty() && lblIUser.getText().isEmpty()) {
                if (isManagerLoggedIn) {
                    ManagerController m1 = new ManagerController();
                  
                    String username = txtUser.getText();
                    String password = txtPwd.getText();
                   
                    try {
                        m1.changeAccountDetails(username, password);
                        this.dispose();
                        Login l1=new Login();
                        l1.setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(AccountUpdate.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    CashierController c1 = new CashierController();
                   
                    String username = txtUser.getText();
                    String password = txtPwd.getText();
                    
                    try {
                        c1.changeAccountDetails(username, password);
                          this.dispose();
                          Login l1=new Login();
                        l1.setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(AccountUpdate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
            }

          
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateActionPerformed
        if (isManagerLoggedIn) {
            this.dispose();
            userAccountDetails u1 = new userAccountDetails();
            u1.setVisible(true);
        } else {
            int choicemore = JOptionPane.showConfirmDialog(null, "Are you sure you want to deactivate your Account?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choicemore == JOptionPane.YES_OPTION) {
                CashierController c1 = new CashierController();
                Login l1 = new Login();
                String user = l1.getUsername();
                try {
                    c1.deactivateAccount(user);
                } catch (SQLException ex) {
                    Logger.getLogger(AccountUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_btnDeactivateActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (isManagerLoggedIn) {
            Manager m1 = new Manager();
            m1.setVisible(true);
            this.dispose();

        } else {
            Cashier c1 = new Cashier();
            c1.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       
        txtUser.setText("");
        txtPwd.setText("");
      
    }//GEN-LAST:event_btnClearActionPerformed

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        char echo = txtPwd.getEchoChar();
        if (echo == 0) {
            txtPwd.setEchoChar('●'); // Set it to the default bullet character to hide characters
        } else {
            txtPwd.setEchoChar((char) 0); // Set it to 0 to make characters visible
        }
    }//GEN-LAST:event_lblShowMouseClicked

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Enter username")) {
            txtUser.setText("");
            txtUser.setForeground(Color.black);

        }
        txtUser.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().equals("")) {
            txtUser.setText("Enter username");
            txtUser.setForeground(new Color(153, 153, 153));

        }
        txtUser.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusGained
        if (txtPwd.getText().equals("##############")) {
            txtPwd.setText("");
            txtPwd.setForeground(Color.black);

        }
        txtPwd.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtPwdFocusGained

    private void txtPwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusLost

        if (txtPwd.getText().equals("")) {
            txtPwd.setText("##############");
            txtPwd.setForeground(new Color(153, 153, 153));

        }
        txtPwd.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtPwdFocusLost

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
        btnPrev.setBorder(new LineBorder(Color.blue, 3));
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
        btnPrev.setBorder(new LineBorder(Color.white, 3));
    }//GEN-LAST:event_btnPrevMouseExited

    private void txtPwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwdKeyPressed
        if (txtPwd.getText().length() < 8) {
            lblIPwd.setText("Password must have more than 8 characters");
        } else {
            lblIPwd.setText("");
        }
    }//GEN-LAST:event_txtPwdKeyPressed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        char pressedKey = evt.getKeyChar();
        String txtUserText = txtUser.getText(); // Get the current text of txtUser

        if (pressedKey != KeyEvent.VK_BACK_SPACE) {
            if (txtUserText.length() < 5) {
                lblIUser.setText("Characters must be more than 5 !!!");
            } else if (getDigits(txtUserText) >= 3) {
                lblIUser.setText("Cannot have more than 3 digits");
            } else {
                lblIUser.setText("");
            }
        } else { // Backspace key is pressed
            if (txtUserText.length() < 5) {
                lblIUser.setText("Characters must be more than 5 !!!");
            } else if (getDigits(txtUserText) > 4) {
                lblIUser.setText("Cannot have more than 3 digits");
            } else {
                lblIUser.setText("");
            }
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusGained
       if (txtConfirm.getText().equals("##############")) {
            txtConfirm.setText("");
            txtConfirm.setForeground(Color.black);

        }
       txtConfirm.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtConfirmFocusGained

    private void txtConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusLost
       if (txtConfirm.getText().equals("")) {
            txtConfirm.setText("##############");
           txtConfirm.setForeground(new Color(153, 153, 153));

        }
        txtConfirm.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtConfirmFocusLost

    private void txtConfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmKeyPressed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblActivate;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblIConfirm;
    private javax.swing.JLabel lblIPwd;
    private javax.swing.JLabel lblIUser;
    private javax.swing.JLabel lblLogoHead;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblPwd1;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
