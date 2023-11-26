package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class PanelAction extends javax.swing.JPanel {

    public PanelAction() {
        initComponents();
    }

    public void initEvent(TableActionEvent event, int row) {
        btnActivate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.Activate(row);
            }
        });

        btnDeactivate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.Deactivate(row);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionButton1 = new view.ActionButton();
        actionButton2 = new view.ActionButton();
        actionButton3 = new view.ActionButton();
        actionButton4 = new view.ActionButton();
        actionButton5 = new view.ActionButton();
        actionButton6 = new view.ActionButton();
        btnActivate = new view.ActionButton();
        btnDeactivate = new view.ActionButton();

        btnActivate.setBackground(new java.awt.Color(0, 0, 0));
        btnActivate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnActivate.setForeground(new java.awt.Color(0, 204, 0));
        btnActivate.setText("Activate");
        btnActivate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnActivate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActivateMouseEntered(evt);
            }
        });
        btnActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivateActionPerformed(evt);
            }
        });

        btnDeactivate.setBackground(new java.awt.Color(0, 0, 0));
        btnDeactivate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnDeactivate.setForeground(new java.awt.Color(255, 0, 51));
        btnDeactivate.setText("Deactivate");
        btnDeactivate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDeactivate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeactivateMouseEntered(evt);
            }
        });
        btnDeactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeactivateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActivate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeactivate, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActivate, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnDeactivate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateActionPerformed

    }//GEN-LAST:event_btnActivateActionPerformed

    private void btnActivateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivateMouseEntered
        // btnActivate.setBorder(new LineBorder(Color.green, 2));
    }//GEN-LAST:event_btnActivateMouseEntered

    private void btnDeactivateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeactivateMouseEntered
        //  btnDeactivate.setBorder(new LineBorder(Color.red, 2));
    }//GEN-LAST:event_btnDeactivateMouseEntered

    private void btnDeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateActionPerformed

    }//GEN-LAST:event_btnDeactivateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.ActionButton actionButton1;
    private view.ActionButton actionButton2;
    private view.ActionButton actionButton3;
    private view.ActionButton actionButton4;
    private view.ActionButton actionButton5;
    private view.ActionButton actionButton6;
    private view.ActionButton btnActivate;
    private view.ActionButton btnDeactivate;
    // End of variables declaration//GEN-END:variables
}
