package vista;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.D_Grupo;

public class DGrupos extends javax.swing.JDialog { 
    
    public DGrupos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        getContentPane().setBackground(Color.white);
        
        D_Grupo dgru = new D_Grupo();
        DGrupos.lbCodGru.setText(dgru.getCodeGroupAvailable());
    }
    
    public static DefaultComboBoxModel cbModelDoc = new DefaultComboBoxModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfGrupo = new javax.swing.JTextField();
        cbxDe = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btClose = new javax.swing.JButton();
        cbUpdate = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxA = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxDocente = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lbCodGru = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grupos / Niveles");
        setResizable(false);

        tfGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfGrupoKeyReleased(evt);
            }
        });

        cbxDe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));
        cbxDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeActionPerformed(evt);
            }
        });

        jLabel3.setText("Intérvalo de Edad:    De");

        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        cbUpdate.setBackground(new java.awt.Color(255, 255, 255));
        cbUpdate.setText("O Actualice uno");
        cbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Crear y modificar Grupos");

        jLabel2.setText("Nombre del Grupo:");

        cbxA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));
        cbxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAActionPerformed(evt);
            }
        });

        jLabel4.setText("a");

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btSave.setEnabled(false);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        jLabel5.setText("años de edad");

        jLabel7.setText("Docente:");

        cbxDocente.setModel(cbModelDoc);

        jLabel6.setText("El Código Generado por el Sistema para este Patrocinador es:");

        lbCodGru.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(lbCodGru, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbUpdate))
                            .addGap(122, 122, 122)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxDocente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(cbxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(cbxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUpdate)
                    .addComponent(lbCodGru, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(cbxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSave, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btClose, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void tfGrupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGrupoKeyReleased
        if (tfGrupo.getText().length() > 4) {
            btSave.setEnabled(true);
        } else {
            btSave.setEnabled(false);
        }
    }//GEN-LAST:event_tfGrupoKeyReleased

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btCloseActionPerformed

    private void cbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUpdateActionPerformed
        D_Grupo dgru = new D_Grupo();
        
        if (cbUpdate.isSelected()) {
            DCbxGrupo cbxG = new DCbxGrupo(JOptionPane.getFrameForComponent(this), true);
            cbxG.setLocationRelativeTo(null);
            cbxG.setVisible(true);
        }else{
            lbCodGru.setText(dgru.getCodeGroupAvailable());
            tfGrupo.setText("");
            btSave.setEnabled(false);
        }
    }//GEN-LAST:event_cbUpdateActionPerformed
    
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed

        String code = lbCodGru.getText();
        String name = tfGrupo.getText();
        int de = Integer.parseInt(cbxDe.getSelectedItem().toString());
        int a = Integer.parseInt(cbxA.getSelectedItem().toString());
        String docente = cbxDocente.getSelectedItem().toString();

        D_Grupo dgru = new D_Grupo();

        if (dgru.saveGrupo(code, name, de, a, docente)) {
            JOptionPane.showMessageDialog(null, "Grupo guardado exitosamente");
        }

    }//GEN-LAST:event_btSaveActionPerformed

    private void cbxDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDeActionPerformed
        validarCombos();
    }//GEN-LAST:event_cbxDeActionPerformed

    private void cbxAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAActionPerformed
        validarCombos();
    }//GEN-LAST:event_cbxAActionPerformed

    private void validarCombos(){
        int de = Integer.parseInt(cbxDe.getSelectedItem().toString());
        int a = Integer.parseInt(cbxA.getSelectedItem().toString());
        
        if (de > a) {
            cbxDe.setSelectedIndex(0);
        }
        if (a < de) {
            cbxA.setSelectedIndex(14);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DGrupos dialog = new DGrupos(new javax.swing.JFrame(), true);
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
    public static javax.swing.JComboBox cbxA;
    public static javax.swing.JComboBox cbxDe;
    public static javax.swing.JComboBox cbxDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel lbCodGru;
    public static javax.swing.JTextField tfGrupo;
    // End of variables declaration//GEN-END:variables
}