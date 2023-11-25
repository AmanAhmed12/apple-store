
package view;
import controller.ManagerController;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class addProduct extends javax.swing.JFrame {

    
    public addProduct() {
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
        lblCat = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        cmbCategory = new javax.swing.JComboBox<>();
        lblProductId = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        lblIId = new javax.swing.JLabel();
        lblIPrice = new javax.swing.JLabel();
        lblIQty = new javax.swing.JLabel();

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
        btnPrev.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrevMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrevMouseReleased(evt);
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
                    .addComponent(lblLogoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(lblLogoText)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lblLogoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblLogoText)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblAddHead.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblAddHead.setText("Add Product");

        lblCat.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblCat.setText("Category Name");

        lblProduct.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblProduct.setText("Product Name");

        lblPrice.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblPrice.setText("Purchase Price");

        lblQty.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblQty.setText("Quantity");

        txtProduct.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtProduct.setForeground(new java.awt.Color(153, 153, 153));
        txtProduct.setText("Enter product name");
        txtProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductFocusLost(evt);
            }
        });
        txtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductActionPerformed(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(153, 153, 153));
        txtPrice.setText("Enter Amount");
        txtPrice.setPreferredSize(new java.awt.Dimension(6, 33));
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });

        txtQty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtQty.setForeground(new java.awt.Color(153, 153, 153));
        txtQty.setText("Enter a number");
        txtQty.setPreferredSize(new java.awt.Dimension(6, 33));
        txtQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtyFocusLost(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Iphone", "Apple_Watch", "Ipad", "Airpod", "MAC" }));

        lblProductId.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblProductId.setText("Product ID");

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

        lblIId.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIId.setForeground(new java.awt.Color(255, 0, 51));

        lblIPrice.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIPrice.setForeground(new java.awt.Color(255, 0, 51));

        lblIQty.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIQty.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblAddHead))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCat)
                            .addComponent(lblQty)
                            .addComponent(lblProduct)
                            .addComponent(lblProductId)
                            .addComponent(lblPrice)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProductId)
                                    .addComponent(lblIId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(lblIPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblIQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblAddHead)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProductId)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblCat)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProduct)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQty)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIQty, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
      Manager m1=new Manager();
      m1.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String priceText = txtPrice.getText();
        String qtyText = txtQty.getText();
        String idText = txtProductId.getText();
        Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character

        if (txtProductId.getText().equals("Ixxx") || txtProduct.getText().equals("Enter product name") || txtPrice.getText().equals("Enter Amount") || txtQty.getText().equals("Enter a number") || cmbCategory.getSelectedItem().equals("Select")) {

            JOptionPane.showMessageDialog(null, "fields cannot be empty");
        } else if (!txtProductId.getText().startsWith("I")) {
            lblIId.setText("ID must start with I");

        } else if (!txtProductId.getText().substring(1).matches("\\d+")) {
            lblIId.setText("Rest of the values must be digits");
        } else if (pattern.matcher(priceText).find()) {
            lblIPrice.setText("can only contain digits!!!");
        } else if (pattern.matcher(qtyText).find()) {
            lblIQty.setText("can only contain digits!!!");
        } else {
            lblIQty.setText("");
            lblIPrice.setText("");
            lblIId.setText("");
            ManagerController m1 = new ManagerController();
            String productId = txtProductId.getText();
            String cat = (String) cmbCategory.getSelectedItem();
            String product = txtProduct.getText();
            String price = txtPrice.getText();
            String qty = txtQty.getText();
            m1.addProduct(productId, cat, product, price, qty);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      cmbCategory.setSelectedIndex(0);
      txtProduct.setText("");
      txtPrice.setText("");
      txtQty.setText("");
      txtProductId.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

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

    private void txtProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductFocusGained
       if(txtProduct.getText().equals("Enter product name")){
        txtProduct.setText("");
        txtProduct.setForeground(Color.black);
     
       }
          txtProduct.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtProductFocusGained

    private void txtProductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductFocusLost
       if( txtProduct.getText().equals("")){
       txtProduct.setText("Enter product name");
       txtProduct.setForeground(new Color(153,153,153));
       
       }
       txtProduct.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtProductFocusLost

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        if(txtPrice.getText().equals("Enter Amount")){
       txtPrice.setText("");
       txtPrice.setForeground(Color.black);
      
       }
         txtPrice.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        String priceText = txtPrice.getText();
        Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character
        if (txtPrice.getText().equals("")) {
            txtPrice.setText("Enter Amount");
            txtPrice.setForeground(new Color(153, 153, 153));
            lblIPrice.setText("");

        }else if (pattern.matcher(priceText).find()) {
            lblIPrice.setText("can only contain digits!!!");
        } else {
            lblIPrice.setText("");
        }
        txtPrice.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusGained
        if (txtQty.getText().equals("Enter a number")) {
            txtQty.setText("");
            txtQty.setForeground(Color.black);

        }
        txtQty.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtQtyFocusGained

    private void txtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusLost
        String qtyText = txtQty.getText();
        Pattern pattern = Pattern.compile("\\D"); // \D matches any non-digit character
        if (txtQty.getText().equals("")) {
            txtQty.setText("Enter a number");
            txtQty.setForeground(new Color(153, 153, 153));
            lblIQty.setText("");

        } else if (pattern.matcher(qtyText).find()) {
            lblIQty.setText("can only contain digits!!!");
        } else {
            lblIQty.setText("");
        }
        txtQty.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtQtyFocusLost

    private void btnPrevMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMousePressed
       
    }//GEN-LAST:event_btnPrevMousePressed

    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
        btnPrev.setBorder(new LineBorder(Color.blue, 3));
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevMouseReleased

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
                new addProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPrev;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddHead;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblIId;
    private javax.swing.JLabel lblIPrice;
    private javax.swing.JLabel lblIQty;
    private javax.swing.JLabel lblLogoImg;
    private javax.swing.JLabel lblLogoText;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblQty;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
