
package vista;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import modelo.D_Grupo;
import modelo.Grupo;

public class DCbxGrupo extends javax.swing.JDialog {

    public DCbxGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        getContentPane().setBackground(Color.white);
        
        D_Grupo dgru = new D_Grupo();
        dgru.getGrupo();
        DGrupos.lbCodGru.setText(dgru.getCodeGroupAvailable());
        
        //setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    public static DefaultComboBoxModel cbmodel = new DefaultComboBoxModel();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxGrupo = new javax.swing.JComboBox();
        btOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Elija un grupo");

        cbxGrupo.setModel(cbmodel);

        btOK.setText("Aceptar");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btOK)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        D_Grupo dgru = new D_Grupo();

        if (dgru.contarGrupo() != 0) {
            Grupo grup = (Grupo) cbxGrupo.getSelectedItem();
            
            if (DGrupos.cbUpdate.isSelected()) {
                DGrupos.lbCodGru.setText(grup.getCode());
                DGrupos.tfGrupo.setText(cbxGrupo.getSelectedItem().toString());
                DGrupos.cbxDe.setSelectedItem(String.valueOf(grup.getOf()));
                DGrupos.cbxA.setSelectedItem(String.valueOf(grup.getTo()));
                DGrupos.cbxDocente.setSelectedItem(grup.getDocente());
            }
        }
        dispose();
    }//GEN-LAST:event_btOKActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DCbxGrupo dialog = new DCbxGrupo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btOK;
    public static javax.swing.JComboBox cbxGrupo;
    // End of variables declaration//GEN-END:variables
}