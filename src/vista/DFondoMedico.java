package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DFondoMedico extends javax.swing.JDialog {

    public DFondoMedico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.white);
        
        String opi = IFondoMedicoComp.lbSegOpinion.getText();
        if (opi.equals("No")) {
            rbOpMedNo.setSelected(true);
            rbOpMedSi.setSelected(false);
            cbxOpino.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] {""}));
        }else{
            rbOpMedNo.setSelected(false);
            rbOpMedSi.setSelected(true);
            cbxOpino.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] { "Madre","Padre","Hermano","Hermana","Tío","Tía","Primo","Prima","Abuelo","Abuela",
            "Padrastro","Madrastra","Padre adoptivo","Madre adoptiva","Amigo","Amiga","Trabajador institucional"}
            ));
        }
        
        tfCosto.setText(IFondoMedicoComp.lbCostoEstimado.getText());
        lbContFam.setText(IFondoMedicoComp.lbContFam.getText());
        lbQtyComps.setText(IFondoMedicoComp.lbQtyComps.getText());
        cbxFrecTrat.setSelectedItem(IFondoMedicoComp.lbFrecuencia.getText());
        
        String mma = IFondoMedicoComp.lbMMA.getText();
        if (mma.equals("Si")) {
            rbSiMMA.setSelected(true);
            rbNoMMA.setSelected(false);
        } else {
            rbSiMMA.setSelected(false);
            rbNoMMA.setSelected(true);
        }
        
        String casoEst = IFondoMedicoComp.lbCasoEstudiado.getText();
        if (casoEst.equals("Si")) {
            rbSiEstudiado.setSelected(true);
            rbNoEstudiado.setSelected(false);
        } else {
            rbSiEstudiado.setSelected(false);
            rbNoEstudiado.setSelected(true);
        }
        
        tfMontoAutorizado.setText(IFondoMedicoComp.lbMontoAutorizado.getText());
        ((JTextField)datecDesembolso.getDateEditor().getUiComponent()).setText(IFondoMedicoComp.lbFechaDesembolso.getText());
        
        
        ((JTextField)datecDesembolso.getDateEditor().getUiComponent()).setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOpinionMedica = new javax.swing.ButtonGroup();
        bgMMA = new javax.swing.ButtonGroup();
        bgCaso = new javax.swing.ButtonGroup();
        cbxOpino = new javax.swing.JComboBox();
        btCancelar = new javax.swing.JButton();
        btOK = new javax.swing.JButton();
        rbOpMedSi = new javax.swing.JRadioButton();
        cbxFrecTrat = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rbSiMMA = new javax.swing.JRadioButton();
        rbNoMMA = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        rbNoEstudiado = new javax.swing.JRadioButton();
        rbSiEstudiado = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        datecDesembolso = new com.toedter.calendar.JDateChooser();
        tfMontoAutorizado = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lbContFam = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbQtyComps = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rbOpMedNo = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        tfCosto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editando Detalles del Fondo Médico de Compassion");
        setResizable(false);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        rbOpMedSi.setBackground(new java.awt.Color(255, 255, 255));
        bgOpinionMedica.add(rbOpMedSi);
        rbOpMedSi.setText("Si");
        rbOpMedSi.setActionCommand("Si");
        rbOpMedSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpMedSiActionPerformed(evt);
            }
        });

        cbxFrecTrat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tratamiento único", "Primero de varios", "Es un seguimiento" }));

        jLabel17.setText("Frecuencia del tratamiento:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), null));

        jLabel13.setText("Uso de la Oficina");

        jLabel20.setText("Necesita aprobación de MMA");

        rbSiMMA.setBackground(new java.awt.Color(255, 255, 255));
        bgMMA.add(rbSiMMA);
        rbSiMMA.setSelected(true);
        rbSiMMA.setText("Si");
        rbSiMMA.setActionCommand("Si");

        rbNoMMA.setBackground(new java.awt.Color(255, 255, 255));
        bgMMA.add(rbNoMMA);
        rbNoMMA.setText("No");
        rbNoMMA.setActionCommand("No");

        jLabel21.setText("Es un caso estudiado");

        rbNoEstudiado.setBackground(new java.awt.Color(255, 255, 255));
        bgCaso.add(rbNoEstudiado);
        rbNoEstudiado.setText("No");
        rbNoEstudiado.setActionCommand("No");

        rbSiEstudiado.setBackground(new java.awt.Color(255, 255, 255));
        bgCaso.add(rbSiEstudiado);
        rbSiEstudiado.setSelected(true);
        rbSiEstudiado.setText("Si");
        rbSiEstudiado.setActionCommand("Si");

        jLabel22.setText("Monto autorizado: C$");

        jLabel24.setText("Fecha de desembolso:");

        datecDesembolso.setDateFormatString("dd/MM/yyyy");

        tfMontoAutorizado.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbSiMMA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbNoMMA))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbSiEstudiado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbNoEstudiado)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMontoAutorizado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datecDesembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSiMMA)
                    .addComponent(rbNoMMA))
                .addGap(3, 3, 3)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSiEstudiado)
                    .addComponent(rbNoEstudiado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMontoAutorizado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datecDesembolso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jLabel19.setText("Cantidad solicitada a Compassion (90% del costo total):   C$ ");

        lbContFam.setText("      ");

        jLabel15.setText("De quién:");

        lbQtyComps.setText("      ");

        jLabel16.setText("Costo estimado del tratamiento. C$ ");

        jLabel14.setText("Obtuvo una segunda opinión médica");

        rbOpMedNo.setBackground(new java.awt.Color(255, 255, 255));
        bgOpinionMedica.add(rbOpMedNo);
        rbOpMedNo.setSelected(true);
        rbOpMedNo.setText("No");
        rbOpMedNo.setActionCommand("No");
        rbOpMedNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpMedNoActionPerformed(evt);
            }
        });

        jLabel18.setText("Contribución familiar u otra fuente (10% del costo total):  C$");

        tfCosto.setText(" ");
        tfCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCostoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(8, 8, 8)
                                .addComponent(cbxFrecTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbQtyComps)
                                    .addComponent(lbContFam)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16)
                                .addGap(7, 7, 7)
                                .addComponent(tfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15)
                                .addGap(4, 4, 4)
                                .addComponent(cbxOpino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(rbOpMedNo)
                                .addGap(2, 2, 2)
                                .addComponent(rbOpMedSi)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14))
                    .addComponent(rbOpMedNo)
                    .addComponent(rbOpMedSi))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxOpino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCosto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addComponent(lbContFam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbQtyComps)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxFrecTrat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        String opin = bgOpinionMedica.getSelection().getActionCommand();
        String opinador = "";
        if (opin.equals("Si")) {
            opinador = cbxOpino.getSelectedItem().toString();
        }
        String cost = tfCosto.getText();
        String mont = tfMontoAutorizado.getText();
        String fecha = ((JTextField) datecDesembolso.getDateEditor().getUiComponent()).getText();
        
        if (!cost.trim().equals("") && !mont.trim().equals("") && !fecha.trim().equals("")) {
            IFondoMedicoComp.lbSegOpinion.setText(opin);
            IFondoMedicoComp.lbOpino.setText(opinador);
            IFondoMedicoComp.lbCostoEstimado.setText(cost);
            IFondoMedicoComp.lbContFam.setText(lbContFam.getText());
            IFondoMedicoComp.lbQtyComps.setText(lbQtyComps.getText());
            IFondoMedicoComp.lbFrecuencia.setText(cbxFrecTrat.getSelectedItem().toString());
            IFondoMedicoComp.lbMMA.setText(bgMMA.getSelection().getActionCommand());
            IFondoMedicoComp.lbCasoEstudiado.setText(bgCaso.getSelection().getActionCommand());
            IFondoMedicoComp.lbMontoAutorizado.setText(mont);
            IFondoMedicoComp.lbFechaDesembolso.setText(fecha);
            
            IFondoMedicoComp.btGuardar1.setEnabled(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Debes de ingresar correctamente todos los campos solicitados");
        }
        
    }//GEN-LAST:event_btOKActionPerformed

    private void rbOpMedSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpMedSiActionPerformed
        cbxOpino.setModel(new javax.swing.DefaultComboBoxModel(
                new String[]{"Madre", "Padre", "Hermano", "Hermana", "Tío", "Tía", "Primo", "Prima", "Abuelo", "Abuela",
                    "Padrastro", "Madrastra", "Padre adoptivo", "Madre adoptiva", "Amigo", "Amiga", "Trabajador institucional"}));
        cbxOpino.setEnabled(true);
    }//GEN-LAST:event_rbOpMedSiActionPerformed

    private void rbOpMedNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpMedNoActionPerformed
        cbxOpino.setModel(new javax.swing.DefaultComboBoxModel(
                new String[]{""}));
        cbxOpino.setEnabled(false);
    }//GEN-LAST:event_rbOpMedNoActionPerformed

    private void tfCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCostoKeyReleased
        porcentaje();
    }//GEN-LAST:event_tfCostoKeyReleased

    public void porcentaje(){
        double costo = Double.parseDouble(tfCosto.getText());
        
        lbContFam.setText(String.valueOf((10*costo)/100));
        lbQtyComps.setText(String.valueOf((90*costo)/100));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DFondoMedico dialog = new DFondoMedico(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgCaso;
    private javax.swing.ButtonGroup bgMMA;
    private javax.swing.ButtonGroup bgOpinionMedica;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOK;
    private javax.swing.JComboBox cbxFrecTrat;
    private javax.swing.JComboBox cbxOpino;
    private com.toedter.calendar.JDateChooser datecDesembolso;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbContFam;
    private javax.swing.JLabel lbQtyComps;
    private javax.swing.JRadioButton rbNoEstudiado;
    private javax.swing.JRadioButton rbNoMMA;
    private javax.swing.JRadioButton rbOpMedNo;
    private javax.swing.JRadioButton rbOpMedSi;
    private javax.swing.JRadioButton rbSiEstudiado;
    private javax.swing.JRadioButton rbSiMMA;
    private javax.swing.JTextField tfCosto;
    private javax.swing.JTextField tfMontoAutorizado;
    // End of variables declaration//GEN-END:variables
}