package view;

import controller.ManagerController;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.ManagerModel;

public class AccountCreation extends javax.swing.JFrame {

    public AccountCreation() {
        initComponents();
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
        lblLogoText = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblAccHead = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblConfirm = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        lblShow = new javax.swing.JLabel();
        lblIMail = new javax.swing.JLabel();
        lblIPwd = new javax.swing.JLabel();
        lblIUser = new javax.swing.JLabel();
        lblIConfirm = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        cmbAccType = new javax.swing.JComboBox<>();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
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
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailKeyTyped(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUser.setText("Username");

        lblType.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblType.setText("Account Type");

        txtPwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
        lblShow.setText("👁");
        lblShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowMouseClicked(evt);
            }
        });

        lblIMail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIMail.setForeground(new java.awt.Color(255, 0, 51));

        lblIPwd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIPwd.setForeground(new java.awt.Color(255, 0, 51));

        lblIUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIUser.setForeground(new java.awt.Color(255, 0, 51));

        lblIConfirm.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIConfirm.setForeground(new java.awt.Color(255, 0, 51));

        txtConfirm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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

        cmbAccType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbAccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "manager", "cashier" }));

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
                                .addGap(50, 50, 50)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMail)
                                    .addComponent(lblUser)
                                    .addComponent(lblType)
                                    .addComponent(lblPwd)
                                    .addComponent(lblConfirm))
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIMail, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblIUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbAccType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPwd)
                                .addComponent(lblIPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConfirm, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblAccHead)
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIMail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIUser, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPwd))
                            .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(86, Short.MAX_VALUE))))
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
        String accountType = (String) cmbAccType.getSelectedItem();
        String mail = txtMail.getText();

        // Check for empty fields
        if (username.equals("Enter username") || password.equals("") || accountType.equals("Select") || mail.equals("amaanhlimy@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
        } else {
            // Check email format
            if (!isValidEmail(mail)) {
                lblIMail.setText("Invalid Email format");
            } else {
                lblIMail.setText("");
            }

            // Check password length
            if (txtPwd.getText().length() < 8) {
                lblIPwd.setText("Password must have more than 8 characters");
            } else {
                // // Check password format (at least 1 uppercase letter, 1 special character, and 1 digit)
                String passwordPattern = "^(?=.*[A-Z])(?=.*[!@#$%^&*()-+=])(?=.*\\d).+$";

                if (!txtPwd.getText().matches(passwordPattern)) {
                    lblIPwd.setText("Atleast 1 uppercase,special character and a digit");
                } else {
                    lblIPwd.setText("");

                    // Check password confirmation
                    if (!txtPwd.getText().equals(txtConfirm.getText())) {
                        lblIConfirm.setText("Password does not match");
                    } else {
                        lblIConfirm.setText("");
                    }
                }
            }

            // Check username length and digit count
            if (username.length() < 5) {
                lblIUser.setText("Username must be more than 5 characters");
            } else if (getDigits(username) > 3) {
                lblIUser.setText("Username cannot have more than 3 digits");
            } else {
                lblIUser.setText("");
            }

            // If all validations pass, create the account
            if (lblIMail.getText().isEmpty() && lblIConfirm.getText().isEmpty()
                    && lblIPwd.getText().isEmpty() && lblIUser.getText().isEmpty()) {
                m1.createAccount(username, password, accountType, mail);
                this.dispose();
                AccountCreation a1 = new AccountCreation();
                a1.setVisible(true);
            }
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private boolean isValidEmail(String email) {
        // Implement a more comprehensive email validation logic using regular expressions
        return email.endsWith("@gmail.com");
    }
    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed

    }//GEN-LAST:event_txtMailActionPerformed

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        char echo = txtPwd.getEchoChar();
        if (echo == 0) {
            txtPwd.setEchoChar('●'); // Set it to the default bullet character to hide characters
        } else {
            txtPwd.setEchoChar((char) 0); // Set it to 0 to make characters visible
        }
    }//GEN-LAST:event_lblShowMouseClicked

    private void txtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusGained
        if (txtMail.getText().equals("amaanhlimy@gmail.com")) {
            txtMail.setText("");
            txtMail.setForeground(Color.black);

        }
        txtMail.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtMailFocusGained

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
        if (txtMail.getText().equals("")) {
            txtMail.setText("amaanhlimy@gmail.com");
            txtMail.setForeground(new Color(153, 153, 153));

        }
        txtMail.setBorder(new LineBorder(Color.gray, 1));

        String email = txtMail.getText();
        // Check if the last 10 characters of the email are "@gmail.com"
        if (email.length() >= 10 && email.endsWith("@gmail.com")) {
            lblIMail.setText("");

        } else {
            // The email does not end with "@gmail.com"
            lblIMail.setText("Incorrect Email format..");
        }
    }//GEN-LAST:event_txtMailFocusLost

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
        lblShow.setBorder(new LineBorder(Color.blue, 2));

    }//GEN-LAST:event_txtPwdFocusGained

    private void txtPwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusLost
        if (txtPwd.getText().equals("")) {
            txtPwd.setText("##############");
            txtPwd.setForeground(new Color(153, 153, 153));

        }
        txtPwd.setBorder(new LineBorder(Color.gray, 1));
        lblShow.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtPwdFocusLost

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
        btnPrev.setBorder(new LineBorder(Color.blue, 3));
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
        btnPrev.setBorder(new LineBorder(Color.white, 3));
    }//GEN-LAST:event_btnPrevMouseExited

    private void txtMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyTyped

    }//GEN-LAST:event_txtMailKeyTyped

    private void txtPwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwdKeyPressed

        if (txtPwd.getText().length() < 8) {
            lblIPwd.setText("Password must have more than 8 characters");
        } else {
            lblIPwd.setText("");
        }


    }//GEN-LAST:event_txtPwdKeyPressed

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
        if (txtPwd.getText().equals(txtConfirm.getText())) {
            lblIConfirm.setText("Password doesnot match!!!");
        } else {
            lblIConfirm.setText("");
        }

    }//GEN-LAST:event_txtConfirmKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
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

    }//GEN-LAST:event_txtUserKeyPressed

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
    private javax.swing.JComboBox<String> cmbAccType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccHead;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblIConfirm;
    private javax.swing.JLabel lblIMail;
    private javax.swing.JLabel lblIPwd;
    private javax.swing.JLabel lblIUser;
    private javax.swing.JLabel lblLogoText;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
