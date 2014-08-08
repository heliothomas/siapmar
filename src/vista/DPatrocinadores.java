
package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.D_Patrocinador;

public class DPatrocinadores extends javax.swing.JDialog {

    public DPatrocinadores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btSave.setEnabled(false);
        getContentPane().setBackground(Color.white);
        D_Patrocinador dpatro = new D_Patrocinador();
        
        dpatro.getPatro();
        
        lbCodPatr.setText(dpatro.getMaxPatro());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tfPatrocinador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btClose = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        lbCodPatr = new javax.swing.JLabel();
        cbUpdate = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patrocinadores");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Crear y modificar Patrocinadores");

        tfPatrocinador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPatrocinadorKeyReleased(evt);
            }
        });

        jLabel3.setText("Patrocinador:");

        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btSave.setEnabled(false);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        lbCodPatr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cbUpdate.setBackground(new java.awt.Color(255, 255, 255));
        cbUpdate.setText("O Actualice uno");
        cbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("El Código Generado por el Sistema para este Patrocinador es:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPatrocinador, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCodPatr, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbUpdate)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btClose)))
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCodPatr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPatrocinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSave, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btClose, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPatrocinadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPatrocinadorKeyReleased
        if (tfPatrocinador.getText().length() > 4) {
            btSave.setEnabled(true);
        } else {
            btSave.setEnabled(false);
        }
    }//GEN-LAST:event_tfPatrocinadorKeyReleased

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btCloseActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed

        if (!tfPatrocinador.getText().trim().equals("")) {
            String code = lbCodPatr.getText();
            String name = tfPatrocinador.getText();

            D_Patrocinador dpat = new D_Patrocinador();
            
            if (dpat.savePatrocinador(code, name)) {
                JOptionPane.showMessageDialog(null, "Patrocinador guardado exitosamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe de escribir el nombre del patrocinador");
        }

    }//GEN-LAST:event_btSaveActionPerformed

    private void cbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUpdateActionPerformed
        //putUpdate();
        D_Patrocinador dpatr = new D_Patrocinador();
        
        if (cbUpdate.isSelected()) {
            DCbxPatrocinador cbxP = new DCbxPatrocinador(JOptionPane.getFrameForComponent(this), true);
            cbxP.setLocationRelativeTo(null);
            cbxP.setVisible(true);
        } else {
            lbCodPatr.setText(dpatr.getMaxPatro());
            tfPatrocinador.setText("");
            btSave.setEnabled(false);
        }
    }//GEN-LAST:event_cbUpdateActionPerformed
/*
    private void putUpdate(){
        D_Patrocinador dpatr = new D_Patrocinador();

        if (dpatr.contarPatrocinador() != 0) {
            Patro patro = (Patro) cbxCodPatr.getSelectedItem();
            String id = patro.getID();

            if (cbUpdate.isSelected()) {
                transferFocus();
                lbCodPatr.setText(id);
                tfPatrocinador.setText(cbxCodPatr.getSelectedItem().toString());
            } else {
                lbCodPatr.setText(dpatr.getMaxPatro());
                tfPatrocinador.setText("");
            }
        }
    }
    */
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DPatrocinadores dialog = new DPatrocinadores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClose;
    private javax.swing.JButton btSave;
    public static javax.swing.JCheckBox cbUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel lbCodPatr;
    public static javax.swing.JTextField tfPatrocinador;
    // End of variables declaration//GEN-END:variables
}
