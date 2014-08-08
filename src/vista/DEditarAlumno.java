package vista;

import java.sql.*;
import javax.swing.*;
import modelo.D_Historia;
import sc.Conexion;
import sc.TextLimiter;

public class DEditarAlumno extends JDialog {

String letras = "[a-zA-ZñÑáéíóúÁÉÍÓÚ ]*";
Connection conx;
Statement stm;
ResultSet rs;
PreparedStatement ps;

    public DEditarAlumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        lbCode.setVisible(false);
        tfNom1.setDocument(new TextLimiter(25));
        tfNom2.setDocument(new TextLimiter(25));
        tfApe1.setDocument(new TextLimiter(25));
        tfApe2.setDocument(new TextLimiter(25));
        tfLugNac.setDocument(new TextLimiter(90));
        taDir.setDocument(new TextLimiter(100));
        
        consultar();
        ((JTextField)datecFecNac.getDateEditor().getUiComponent()).setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tfNom2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        tfLugNac = new javax.swing.JTextField();
        tfNom1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        taDir = new javax.swing.JTextArea();
        btCancelar = new javax.swing.JButton();
        btOK = new javax.swing.JButton();
        datecFecNac = new com.toedter.calendar.JDateChooser();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        tfApe2 = new javax.swing.JTextField();
        tfApe1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editando Datos Generales de la Historia");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tfNom2.setNextFocusableComponent(tfApe1);
        tfNom2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNom2KeyReleased(evt);
            }
        });

        jLabel1.setText("Lugar de Nacimiento:");

        lbCode.setText("                ");

        tfLugNac.setNextFocusableComponent(rbMasculino);
        tfLugNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfLugNacKeyReleased(evt);
            }
        });

        tfNom1.setNextFocusableComponent(tfNom2);
        tfNom1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNom1KeyReleased(evt);
            }
        });

        jLabel2.setText("Dirección:");

        jLabel11.setText("Fecha de Nacimiento:");

        taDir.setColumns(20);
        taDir.setLineWrap(true);
        taDir.setRows(5);
        taDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        taDir.setNextFocusableComponent(btOK);
        taDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                taDirKeyReleased(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btOK.setEnabled(false);
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        datecFecNac.setDateFormatString("dd/MM/yyyy");
        datecFecNac.setNextFocusableComponent(tfLugNac);

        rbMasculino.setBackground(new java.awt.Color(204, 204, 255));
        bgSexo.add(rbMasculino);
        rbMasculino.setSelected(true);
        rbMasculino.setText("Masculino");
        rbMasculino.setActionCommand("Masculino");
        rbMasculino.setNextFocusableComponent(rbFemenino);

        rbFemenino.setBackground(new java.awt.Color(204, 204, 255));
        bgSexo.add(rbFemenino);
        rbFemenino.setText("Femenino");
        rbFemenino.setActionCommand("Femenino");
        rbFemenino.setNextFocusableComponent(taDir);

        tfApe2.setNextFocusableComponent(datecFecNac);

        tfApe1.setNextFocusableComponent(tfApe2);
        tfApe1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfApe1KeyReleased(evt);
            }
        });

        jLabel10.setText("Sexo:");

        jLabel7.setText("Segundo Nombre:");

        jLabel6.setText("Primer Nombre:");

        jLabel9.setText("Segundo Apellido:");

        jLabel8.setText("PrimerApellido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(tfNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(6, 6, 6)
                                .addComponent(rbMasculino)
                                .addGap(2, 2, 2)
                                .addComponent(rbFemenino))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(tfNom2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel1))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfApe1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfApe2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(datecFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(tfLugNac, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addComponent(taDir, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tfApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(datecFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(tfLugNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(taDir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCode))
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        String fullName = tfNom1.getText() + " " + tfNom2.getText() + " " + tfApe1.getText() + " " + tfApe2.getText();
        IHistory.lbName.setText(fullName);
        String fecha = ((JTextField) datecFecNac.getDateEditor().getUiComponent()).getText();
        IHistory.lbFecNac.setText(fecha);
        String sexo = bgSexo.getSelection().getActionCommand();
        IHistory.lbSex.setText(sexo);

        D_Historia alu = new D_Historia();

        if (!lbCode.getText().equals("") && !tfNom1.getText().equals("") && !tfLugNac.getText().equals("") && !fecha.equals("") && !taDir.getText().equals("")) {
            if (alu.saveAlumno(Integer.parseInt(lbCode.getText()), tfNom1.getText(), tfNom2.getText(), tfApe1.getText(), tfApe2.getText(), fecha, tfLugNac.getText(), sexo, taDir.getText())) {
                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
                IHistory.rbNew.setSelected(false);
                IHistory.rbUpd.setSelected(true);
                IHistory.btGuardar1.setEnabled(true);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes de poner todos los datos solicitados.");
        }
    }//GEN-LAST:event_btOKActionPerformed

    private void tfNom1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNom1KeyReleased
        if(!tfNom1.getText().matches(letras)){
            tfNom1.setText("");
        }
        habilitarBt();
    }//GEN-LAST:event_tfNom1KeyReleased

    private void tfApe1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApe1KeyReleased
        if(!tfApe1.getText().matches(letras)){
            tfApe1.setText("");
        }
        habilitarBt();
    }//GEN-LAST:event_tfApe1KeyReleased

    private void tfLugNacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLugNacKeyReleased
        if(!tfLugNac.getText().matches(letras)){
            tfLugNac.setText("");
        }
        habilitarBt();
    }//GEN-LAST:event_tfLugNacKeyReleased

    private void taDirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taDirKeyReleased
        habilitarBt();
    }//GEN-LAST:event_taDirKeyReleased

    private void tfNom2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNom2KeyReleased
        if(!tfNom2.getText().matches(letras)){
            tfNom2.setText("");
        }
    }//GEN-LAST:event_tfNom2KeyReleased

    public void consultar(){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IHistory.lbCode.getText())) {
                if (conx != null) {
                    stm = conx.createStatement();
                    int code = Integer.parseInt(IHistory.lbCode.getText());
                    lbCode.setText(IHistory.lbCode.getText());
                    
                    rs = stm.executeQuery("select s_fname, s_sname, s_fapel, s_sapel, f_nac, s_lugarNac, s_sexo, s_direc from Alumno where c_alumno="+code);
                    
                    if (rs.next()) {
                        tfNom1.setText(rs.getString("s_fname"));
                        tfNom2.setText(rs.getString("s_sname"));
                        tfApe1.setText(rs.getString("s_fapel"));
                        tfApe2.setText(rs.getString("s_sapel"));
                        ((JTextField)datecFecNac.getDateEditor().getUiComponent()).setText(rs.getString(5));
                        tfLugNac.setText(rs.getString("s_lugarNac"));

                        if ("Masculino".equals(rs.getString("s_sexo"))) {
                            rbMasculino.setSelected(true);
                        } else {
                            rbFemenino.setSelected(true);
                        }
                        
                        taDir.setText(rs.getString("s_direc"));
                        lbCode.setText(String.valueOf(code));
                    } else {
                        tfNom1.setText("");
                        tfNom2.setText("");
                        tfApe1.setText("");
                        tfApe2.setText("");
                        ((JTextField)datecFecNac.getDateEditor().getUiComponent()).setText("");
                        tfLugNac.setText("");
                        rbMasculino.setSelected(true);
                        rbFemenino.setSelected(false);
                        taDir.setText("");
                    }
                    
                    rs.close();
                    conx.close();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void habilitarBt(){
        String fecha = ((JTextField)datecFecNac.getDateEditor().getUiComponent()).getText();
        if (!tfNom1.getText().trim().equals("")&&!tfApe1.getText().trim().equals("")
&&!tfLugNac.getText().trim().equals("")&&!taDir.getText().trim().equals("")&&!fecha.trim().equals("")) {
            btOK.setEnabled(true);
        }else{
            btOK.setEnabled(false);
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DEditarAlumno dialog = new DEditarAlumno(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOK;
    private com.toedter.calendar.JDateChooser datecFecNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCode;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    public static javax.swing.JTextArea taDir;
    private javax.swing.JTextField tfApe1;
    private javax.swing.JTextField tfApe2;
    public static javax.swing.JTextField tfLugNac;
    private javax.swing.JTextField tfNom1;
    private javax.swing.JTextField tfNom2;
    // End of variables declaration//GEN-END:variables
}