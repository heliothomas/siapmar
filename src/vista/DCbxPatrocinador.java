
package vista;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import modelo.D_Patrocinador;
import modelo.Patro;

public class DCbxPatrocinador extends javax.swing.JDialog {

    public DCbxPatrocinador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        getContentPane().setBackground(Color.white);
        
        D_Patrocinador dpat = new D_Patrocinador();
        dpat.getPatro();
        DPatrocinadores.lbCodPatr.setText(dpat.getMaxPatro());
        
        //setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    
    public static DefaultComboBoxModel cbmodel = new DefaultComboBoxModel();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btOK = new javax.swing.JButton();
        cbxCodPatr = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Elija un patrocinador");

        btOK.setText("Aceptar");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        cbxCodPatr.setModel(cbmodel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btOK)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cbxCodPatr, 0, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cbxCodPatr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        D_Patrocinador dpat = new D_Patrocinador();

        if (dpat.contarPatrocinador() != 0) {
            Patro p = (Patro) cbxCodPatr.getSelectedItem();            
            
            if (DPatrocinadores.cbUpdate.isSelected()) {
                DPatrocinadores.lbCodPatr.setText(p.getID());
                DPatrocinadores.tfPatrocinador.setText(cbxCodPatr.getSelectedItem().toString());
            }
        }
        dispose();
    }//GEN-LAST:event_btOKActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DCbxPatrocinador dialog = new DCbxPatrocinador(new javax.swing.JFrame(), true);
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
    public static javax.swing.JComboBox cbxCodPatr;
    // End of variables declaration//GEN-END:variables
}