
package vista;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.D_Login;
import sc.Library;
import sc.TextLimiter;

public class IPerfilAdministrativo extends javax.swing.JInternalFrame {

    public IPerfilAdministrativo() {
        initComponents();
        tfName.setDocument(new TextLimiter(20));
        editorpDir.setDocument(new TextLimiter(150));
        tfEmailPrin.setDocument(new TextLimiter(50));
        tfEmailAlt.setDocument(new TextLimiter(50));
        
        ((JTextField)datecFecNac.getDateEditor().getUiComponent()).setEditable(false);
        btGuardar.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnContenedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        datecFecNac = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editorpDir = new javax.swing.JEditorPane();
        jLabel9 = new javax.swing.JLabel();
        ftfCel = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        ftfTel = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        tfEmailAlt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfEmailPrin = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        tfCU = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Perfil Administrativo");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pnContenedor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Fecha de nacimiento:");

        datecFecNac.setDateFormatString("dd/MM/yyyy");

        jLabel3.setText("Nombre completo:");

        tfName.setText(" ");
        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNameKeyReleased(evt);
            }
        });

        jLabel8.setText("Dirección:");

        jScrollPane2.setViewportView(editorpDir);

        jLabel9.setText("Celular:");

        try {
            ftfCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("8###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setText("Teléfono:");

        try {
            ftfTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("2###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Cargo:");

        jLabel12.setText("Email alternativo");

        jLabel13.setText("Email principal");

        jLabel14.setText("Cuenta de Usuario:");

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Edite su Perfil Administrativo");

        lbCargo.setText("              ");

        tfCU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCUKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnContenedorLayout = new javax.swing.GroupLayout(pnContenedor);
        pnContenedor.setLayout(pnContenedorLayout);
        pnContenedorLayout.setHorizontalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContenedorLayout.createSequentialGroup()
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnContenedorLayout.createSequentialGroup()
                                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfName))
                                    .addGroup(pnContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnContenedorLayout.createSequentialGroup()
                                                .addComponent(ftfCel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ftfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jScrollPane2)))
                                    .addGroup(pnContenedorLayout.createSequentialGroup()
                                        .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(pnContenedorLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(44, 44, 44)
                                                .addComponent(tfEmailPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnContenedorLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(31, 31, 31)
                                                .addComponent(tfEmailAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnContenedorLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(4, 4, 4)
                                                .addComponent(datecFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(27, 27, 27))))
                    .addGroup(pnContenedorLayout.createSequentialGroup()
                        .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContenedorLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCU, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnContenedorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCargo))
                            .addGroup(pnContenedorLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnContenedorLayout.setVerticalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addGap(36, 36, 36)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbCargo))
                .addGap(13, 13, 13)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnContenedorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datecFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnContenedorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ftfCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ftfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContenedorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13))
                    .addComponent(tfEmailPrin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContenedorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(tfEmailAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        String name = tfName.getText();
        String fecha = ((JTextField)datecFecNac.getDateEditor().getUiComponent()).getText();
        String dir = editorpDir.getText();
        String cel = ftfCel.getText();
        String tel = ftfTel.getText();
        String email1 = tfEmailPrin.getText();
        String email2 = tfEmailAlt.getText();
        
        D_Login log = new D_Login();

        if (Library.checkEmail(tfEmailPrin.getText()) || tfEmailPrin.getText().equals("")) {
            
            if (Library.checkEmail(tfEmailAlt.getText()) || tfEmailAlt.getText().equals("")) {
                if (log.updateLogin(tfCU.getText(),name, fecha, dir, cel, tel, email1, email2)) {
                    JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Email alternativo escrito incorrectamente.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Email principal escrito incorrectamente..");
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void tfCUKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCUKeyReleased
        Character d = new Character(evt.getKeyChar());

        if (d == 10) {

            D_Login pa = new D_Login();

            pa.consultar(tfCU.getText());
        }
    }//GEN-LAST:event_tfCUKeyReleased

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.perfAdm = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void tfNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyReleased
        if (tfName.getText().length() > 5) {
            btGuardar.setEnabled(true);
        }else{
            btGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_tfNameKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btCerrar;
    public static javax.swing.JButton btGuardar;
    public static com.toedter.calendar.JDateChooser datecFecNac;
    public static javax.swing.JEditorPane editorpDir;
    public static javax.swing.JFormattedTextField ftfCel;
    public static javax.swing.JFormattedTextField ftfTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lbCargo;
    private javax.swing.JPanel pnContenedor;
    public static javax.swing.JTextField tfCU;
    public static javax.swing.JTextField tfEmailAlt;
    public static javax.swing.JTextField tfEmailPrin;
    public static javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
