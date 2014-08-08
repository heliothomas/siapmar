package vista;

import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class DRemitencia extends javax.swing.JDialog {

    public DRemitencia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        String fEnvio = IInformeRefDiagTrat.lbFechaEnvio.getText();
        
        if (!fEnvio.equals("")) {
            ((JTextField)datecEnvio.getDateEditor().getUiComponent()).setText(fEnvio);
        }
        
        String hora = IInformeRefDiagTrat.lbHoraEnvio.getText();
        if (!hora.equals("")) {
            spHora.setValue(Integer.parseInt(hora.substring(0, 2)));
            spMinuto.setValue(Integer.parseInt(hora.substring(3, 5)));
            cbxTurno.setSelectedItem(hora.substring(6, 8));
            System.out.println("hora:"+hora.substring(0, 2)+" minuto:"+hora.substring(3, 5)+" tipo:"+hora.substring(6, 8));
        }
        
        String acomp = IInformeRefDiagTrat.lbAcompanante.getText();
        if (!acomp.equals("")) {
            cbxAcompanante.setSelectedItem(IInformeRefDiagTrat.lbAcompanante.getText());
        }
        
        String lugarAsistencia = IInformeRefDiagTrat.lbCAsistencia.getText();
        
        if (lugarAsistencia.equals("Centro de Salud") || lugarAsistencia.equals("")) {
            rbCSalud.setSelected(true);
            rbHospital.setSelected(false);
            rbClinica.setSelected(false);
        }
        if (lugarAsistencia.equals("Hospital")) {
            rbCSalud.setSelected(false);
            rbHospital.setSelected(true);
            rbClinica.setSelected(false);
        }
        if (lugarAsistencia.equals("Clínica especializada")) {
            rbCSalud.setSelected(false);
            rbHospital.setSelected(false);
            rbClinica.setSelected(true);
        }

        tfMedico.setText(IInformeRefDiagTrat.lbMedico.getText());
        
        getContentPane().setBackground(Color.white);
        ((JTextField)datecEnvio.getDateEditor().getUiComponent()).setEditable(false);
        ((JSpinner.DefaultEditor) spHora.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spMinuto.getEditor()).getTextField().setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCentroAsistencia = new javax.swing.ButtonGroup();
        rbClinica = new javax.swing.JRadioButton();
        rbHospital = new javax.swing.JRadioButton();
        btOK = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        rbCSalud = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spMinuto = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        spHora = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        tfMedico = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        cbxTurno = new javax.swing.JComboBox();
        datecEnvio = new com.toedter.calendar.JDateChooser();
        cbxAcompanante = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editando los Detalles de Remitencia del Niño");
        setLocationByPlatform(true);
        setResizable(false);

        rbClinica.setBackground(new java.awt.Color(255, 255, 255));
        bgCentroAsistencia.add(rbClinica);
        rbClinica.setText("Clínica especializada");
        rbClinica.setActionCommand("Clínica especializada");

        rbHospital.setBackground(new java.awt.Color(255, 255, 255));
        bgCentroAsistencia.add(rbHospital);
        rbHospital.setText("Hospital");
        rbHospital.setActionCommand("Hospital");

        btOK.setText("OK");
        btOK.setEnabled(false);
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        jLabel19.setText("Acompañado por:");

        rbCSalud.setBackground(new java.awt.Color(255, 255, 255));
        bgCentroAsistencia.add(rbCSalud);
        rbCSalud.setSelected(true);
        rbCSalud.setText("Centro de Salud");
        rbCSalud.setActionCommand("Centro de Salud");

        jLabel21.setText("Se envía a:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(":");

        spMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spMinuto.setEditor(new javax.swing.JSpinner.NumberEditor(spMinuto, ""));

        jLabel20.setText("Hora de envío:");

        spHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spHora.setEditor(new javax.swing.JSpinner.NumberEditor(spHora, ""));

        jLabel18.setText("Fecha de envío:");

        tfMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMedicoKeyReleased(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        cbxTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));

        datecEnvio.setDateFormatString("dd/MM/yyyy");
        datecEnvio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datecEnvioPropertyChange(evt);
            }
        });

        cbxAcompanante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Madre", "Padre", "Hermano", "Hermana", "Tío", "Tía", "Primo", "Prima", "Abuelo", "Abuela", "Padrastro", "Madrastra", "Padre adoptivo", "Madre adoptiva", "Amigo", "Amiga", "Trabajador institucional" }));

        jLabel6.setText("Nombre del médico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel18)
                        .addGap(3, 3, 3)
                        .addComponent(datecEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel20)
                        .addGap(10, 10, 10)
                        .addComponent(spHora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(spMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cbxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel19)
                        .addGap(4, 4, 4)
                        .addComponent(cbxAcompanante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel21)
                        .addGap(16, 16, 16)
                        .addComponent(rbCSalud)
                        .addGap(0, 0, 0)
                        .addComponent(rbHospital)
                        .addGap(0, 0, 0)
                        .addComponent(rbClinica))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18))
                    .addComponent(datecEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(spHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addComponent(spMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(cbxAcompanante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(rbCSalud)
                    .addComponent(rbHospital)
                    .addComponent(rbClinica))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(tfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        String fecha = ((JTextField) datecEnvio.getDateEditor().getUiComponent()).getText();
        String medico = tfMedico.getText();

        if (!fecha.equals("") && !medico.equals("")) {
            IInformeRefDiagTrat.lbFechaEnvio.setText(((JTextField) datecEnvio.getDateEditor().getUiComponent()).getText());
            String hora = "", min = "";
            if (spHora.getValue().toString().length() == 1) {
                hora = "0" + spHora.getValue().toString();
            } else {
                hora = spHora.getValue().toString();
            }

            if (spMinuto.getValue().toString().length() == 1) {
                min = "0" + spMinuto.getValue().toString();
            } else {
                min = spMinuto.getValue().toString();
            }

            IInformeRefDiagTrat.lbHoraEnvio.setText(hora + ":" + min + " " + cbxTurno.getSelectedItem());
            IInformeRefDiagTrat.lbAcompanante.setText(cbxAcompanante.getSelectedItem().toString());
            IInformeRefDiagTrat.lbCAsistencia.setText(bgCentroAsistencia.getSelection().getActionCommand());
            IInformeRefDiagTrat.lbMedico.setText(tfMedico.getText());
            IInformeRefDiagTrat.btGuardar.setEnabled(true);
            dispose();
        }
    }//GEN-LAST:event_btOKActionPerformed

private String val = "", a = "", b = "";
    private void tfMedicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMedicoKeyReleased
        if (tfMedico.getText().length() > 10) {
            a = "1";
        } else {
            a = "0";
        }
        habilitarOK();
    }//GEN-LAST:event_tfMedicoKeyReleased

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void datecEnvioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datecEnvioPropertyChange
        cambiaDateChooser();
    }//GEN-LAST:event_datecEnvioPropertyChange

    private void cambiaDateChooser(){
        String fecha = ((JTextField)datecEnvio.getDateEditor().getUiComponent()).getText();

        if (fecha != null && !fecha.equals("")) {
            b = "1";
        }else{
            b = "0";
        }
        habilitarOK();
    }

    private void habilitarOK(){
        val = a + b;
        
        if (val.equals("11")) {
            btOK.setEnabled(true);
        }else{
            btOK.setEnabled(false);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DRemitencia dialog = new DRemitencia(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgCentroAsistencia;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOK;
    private javax.swing.JComboBox cbxAcompanante;
    private javax.swing.JComboBox cbxTurno;
    private com.toedter.calendar.JDateChooser datecEnvio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rbCSalud;
    private javax.swing.JRadioButton rbClinica;
    private javax.swing.JRadioButton rbHospital;
    private javax.swing.JSpinner spHora;
    private javax.swing.JSpinner spMinuto;
    private javax.swing.JTextField tfMedico;
    // End of variables declaration//GEN-END:variables
}