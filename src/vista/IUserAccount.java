
package vista;

import java.sql.*;
import javax.swing.JOptionPane;
import modelo.D_UserAcc;
import sc.Conexion;
import sc.TextLimiter;

public class IUserAccount extends javax.swing.JInternalFrame {

Connection conx;
Statement stm;
ResultSet rs;
PreparedStatement ps;
String letras = "[a-zA-Z]*";

    public IUserAccount() {
        initComponents();
        lbNU.setVisible(false);
        
        tfUN.setDocument(new TextLimiter(18));
        pfPass.setDocument(new TextLimiter(18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxCargo = new javax.swing.JComboBox();
        cbActivar = new javax.swing.JCheckBox();
        tfUN = new javax.swing.JTextField();
        pfPass = new javax.swing.JPasswordField();
        btGuardar = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        pnFrente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbNU = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPassw = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btViewPass = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Administración de Cuentas de Usuario");
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

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Docente", "Director", "Secretario" }));

        cbActivar.setBackground(new java.awt.Color(255, 255, 255));
        cbActivar.setSelected(true);
        cbActivar.setText("*Poner activo / inactivo");

        tfUN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUNKeyReleased(evt);
            }
        });

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

        pnFrente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/access.png"))); // NOI18N
        jLabel3.setText("CUENTAS DE USUARIO");

        lbNU.setText("               ");

        javax.swing.GroupLayout pnFrenteLayout = new javax.swing.GroupLayout(pnFrente);
        pnFrente.setLayout(pnFrenteLayout);
        pnFrenteLayout.setHorizontalGroup(
            pnFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFrenteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbNU)
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFrenteLayout.setVerticalGroup(
            pnFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFrenteLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbNU)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFrenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        jLabel2.setText("*Nombre de usuario");

        lbPassw.setText("*Contraseña");

        jLabel4.setText("Cargo");

        btViewPass.setText("ver contraseña");
        btViewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewPassActionPerformed(evt);
            }
        });

        jLabel1.setText("<··········· Presione Enter para buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(cbActivar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfUN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lbPassw)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(btViewPass))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(pnFrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnFrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassw)
                    .addComponent(btViewPass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(cbActivar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGuardar)
                    .addComponent(btCerrar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        String cargo = cbxCargo.getSelectedItem().toString();

        int estado = 1;
        if (cbActivar.isSelected()) {
            estado = 1;
        } else {
            estado = 0;
        }
        
        D_UserAcc user = new D_UserAcc();

        if (user.saveUserAcc(tfUN.getText(), pfPass.getText(), cargo, estado)) {
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btViewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewPassActionPerformed
        JOptionPane.showMessageDialog(null, "Su contraseña es: "+pfPass.getText());
    }//GEN-LAST:event_btViewPassActionPerformed

    private void tfUNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUNKeyReleased
        Character d = new Character(evt.getKeyChar());

        if (!tfUN.getText().equals("") && d == 10){
            try {
                conx = Conexion.getSQLConnection();
String sqlQuery = "select c_uname,c_passw,s_cargo,v_estado from Login where c_uname='" + tfUN.getText() + "'";

                if (!"".equals(tfUN.getText())) {
                    if (conx != null) {
                        stm = conx.createStatement();
                        rs = stm.executeQuery(sqlQuery);

                        if (rs.next()) {
                            lbNU.setText(rs.getString(1));
                            pfPass.setText(rs.getString(2));
                            cbxCargo.setSelectedItem(rs.getString(3));

                            if (rs.getInt(4)==1) {
                                cbActivar.setSelected(true);
                            } else {
                                cbActivar.setSelected(false);
                            }
                            btGuardar.setEnabled(true);
                        }else{
                            lbNU.setText("");
                            pfPass.setText("");
                            cbxCargo.setSelectedIndex(0);
                            cbActivar.setSelected(false);
                            btGuardar.setEnabled(false);
                        }

                        rs.close();
                        conx.close();

                    } else {
                        System.out.println("Ha ocurrido un error inesperado");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No existe esta cuenta de usuario.");
            }
        }
    }//GEN-LAST:event_tfUNKeyReleased

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.ua = null;
    }//GEN-LAST:event_formInternalFrameClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btViewPass;
    public javax.swing.JCheckBox cbActivar;
    public javax.swing.JComboBox cbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbNU;
    private javax.swing.JLabel lbPassw;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JPanel pnFrente;
    private javax.swing.JTextField tfUN;
    // End of variables declaration//GEN-END:variables
}