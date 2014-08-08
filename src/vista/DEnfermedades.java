
package vista;

import sc.TextLimiter;

public class DEnfermedades extends javax.swing.JDialog {

    public DEnfermedades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        tfTosFerina.setDocument(new TextLimiter(50));
        tfSaram.setDocument(new TextLimiter(50));
        tfRubeol.setDocument(new TextLimiter(50));
        tfPaper.setDocument(new TextLimiter(50));
        tfVaric.setDocument(new TextLimiter(50));
        tfEscarlat.setDocument(new TextLimiter(50));
        tfDifter.setDocument(new TextLimiter(50));
        tfOperac.setDocument(new TextLimiter(50));
        tfAmebias.setDocument(new TextLimiter(50));
        tfApendic.setDocument(new TextLimiter(50));
        tfFiebReum.setDocument(new TextLimiter(50));
        tfOtitis.setDocument(new TextLimiter(50));
        tfIRS.setDocument(new TextLimiter(50));
        tfAmigdal.setDocument(new TextLimiter(50));
        tfConvuls.setDocument(new TextLimiter(50));
        tfConstipac.setDocument(new TextLimiter(50));
        tfDiarrea.setDocument(new TextLimiter(50));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnEnfermedades = new javax.swing.JPanel();
        lbSecEnferm = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        tfTosFerina = new javax.swing.JTextField();
        tfSaram = new javax.swing.JTextField();
        tfRubeol = new javax.swing.JTextField();
        tfPaper = new javax.swing.JTextField();
        tfVaric = new javax.swing.JTextField();
        tfEscarlat = new javax.swing.JTextField();
        tfDifter = new javax.swing.JTextField();
        tfOperac = new javax.swing.JTextField();
        tfAmebias = new javax.swing.JTextField();
        tfApendic = new javax.swing.JTextField();
        tfFiebReum = new javax.swing.JTextField();
        tfOtitis = new javax.swing.JTextField();
        tfIRS = new javax.swing.JTextField();
        tfAmigdal = new javax.swing.JTextField();
        tfConvuls = new javax.swing.JTextField();
        tfConstipac = new javax.swing.JTextField();
        tfDiarrea = new javax.swing.JTextField();
        btOK = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editando Enfermedades");

        pnEnfermedades.setBackground(new java.awt.Color(255, 255, 255));
        pnEnfermedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbSecEnferm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSecEnferm.setText("ENFERMEDADES");

        jLabel43.setText("Tos Ferina:");

        jLabel45.setText("Sarampión:");

        jLabel55.setText("Rubéola:");

        jLabel56.setText("Papera:");

        jLabel57.setText("Difteria:");

        jLabel58.setText("Varicela:");

        jLabel60.setText("Escarlatina:");

        jLabel61.setText("Operaciones:");

        jLabel62.setText("Amebiasis:");

        jLabel63.setText("Apendicitis:");

        jLabel64.setText("Fiebre Reumática:");

        jLabel65.setText("Otitis:");

        jLabel66.setText("I.R.S:");

        jLabel54.setText("Amigdalitis:");

        jLabel68.setText("Convulsiones:");

        jLabel59.setText("Constipación:");

        jLabel69.setText("Diarrea:");

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnEnfermedadesLayout = new javax.swing.GroupLayout(pnEnfermedades);
        pnEnfermedades.setLayout(pnEnfermedadesLayout);
        pnEnfermedadesLayout.setHorizontalGroup(
            pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfEscarlat))
                                    .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                            .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel45)
                                                .addComponent(jLabel55))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfRubeol, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfSaram, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                            .addComponent(jLabel58)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfVaric, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(32, 32, 32))
                            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                        .addComponent(jLabel57)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfDifter, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                        .addComponent(jLabel61)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfOperac, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfAmebias, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAmigdal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFiebReum, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                    .addComponent(jLabel66)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfIRS, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                    .addComponent(jLabel65)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfOtitis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfConvuls, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                    .addComponent(jLabel69)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfDiarrea, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                    .addComponent(jLabel59)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfConstipac, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                        .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel43)
                                .addGap(4, 4, 4)
                                .addComponent(tfTosFerina, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfApendic, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(lbSecEnferm)))
                        .addGap(21, 21, 21)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        pnEnfermedadesLayout.setVerticalGroup(
            pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSecEnferm)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tfTosFerina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)))
                    .addGroup(pnEnfermedadesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(tfApendic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(tfSaram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45))
                    .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel64)
                        .addComponent(tfFiebReum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel55)
                    .addComponent(tfRubeol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel65)
                        .addComponent(tfOtitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(tfPaper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(tfIRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58)
                        .addComponent(tfVaric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel54)
                        .addComponent(tfAmigdal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(tfEscarlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(tfConvuls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(tfDifter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfConstipac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(tfDiarrea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(tfOperac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(tfAmebias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        IPediatrica.lbTosfer.setText(tfTosFerina.getText());
        IPediatrica.lbSaramp.setText(tfSaram.getText());
        IPediatrica.lbRube.setText(tfRubeol.getText());
        IPediatrica.lbPaper.setText(tfPaper.getText());
        IPediatrica.lbVaric.setText(tfVaric.getText());
        IPediatrica.lbEscarlat.setText(tfEscarlat.getText());
        IPediatrica.lbDifteria.setText(tfDifter.getText());
        IPediatrica.lbOperac.setText(tfOperac.getText());
        IPediatrica.lbAmebiasis.setText(tfAmebias.getText());
        IPediatrica.lbApendic.setText(tfApendic.getText());
        IPediatrica.lbFiebReum.setText(tfFiebReum.getText());
        IPediatrica.lbOtit.setText(tfOtitis.getText());
        IPediatrica.lbIRS.setText(tfIRS.getText());
        IPediatrica.lbAmigdal.setText(tfAmigdal.getText());
        IPediatrica.lbConvuls.setText(tfConvuls.getText());
        IPediatrica.lbConstipac.setText(tfConstipac.getText());
        IPediatrica.lbDiarrea.setText(tfDiarrea.getText());
        dispose();
    }//GEN-LAST:event_btOKActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DEnfermedades dialog = new DEnfermedades(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel lbSecEnferm;
    private javax.swing.JPanel pnEnfermedades;
    public static javax.swing.JTextField tfAmebias;
    public static javax.swing.JTextField tfAmigdal;
    public static javax.swing.JTextField tfApendic;
    public static javax.swing.JTextField tfConstipac;
    public static javax.swing.JTextField tfConvuls;
    public static javax.swing.JTextField tfDiarrea;
    public static javax.swing.JTextField tfDifter;
    public static javax.swing.JTextField tfEscarlat;
    public static javax.swing.JTextField tfFiebReum;
    public static javax.swing.JTextField tfIRS;
    public static javax.swing.JTextField tfOperac;
    public static javax.swing.JTextField tfOtitis;
    public static javax.swing.JTextField tfPaper;
    public static javax.swing.JTextField tfRubeol;
    public static javax.swing.JTextField tfSaram;
    public static javax.swing.JTextField tfTosFerina;
    public static javax.swing.JTextField tfVaric;
    // End of variables declaration//GEN-END:variables
}
