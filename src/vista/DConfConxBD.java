
package vista;

import javax.swing.JOptionPane;
import sc.Archivo;

public class DConfConxBD extends javax.swing.JDialog {

Archivo arc = new Archivo();

    public DConfConxBD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        String[] p = arc.leer("dbconfig").split(",");
        
        if (p[0].equals("localhost")) {
            cbHost.setSelected(true);
            tfHost.setText(p[0]);
            tfHost.setEnabled(false);
        } else {
            cbHost.setSelected(false);
            tfHost.setText(p[0]);
            tfHost.setEnabled(true);
        }
        
        if (p[1].equals("5432")) {
            cbPort.setSelected(true);
            tfPort.setText(p[1]);
            tfPort.setEnabled(false);
        } else {
            cbPort.setSelected(false);
            tfPort.setText(p[1]);
            tfPort.setEnabled(true);
        }
        
        tfBD.setText(p[2]);
        
        if (p[3].equals("postgres")) {
            cbUser.setSelected(true);
            tfUN.setText(p[3]);
            tfUN.setEnabled(false);
        } else {
            cbUser.setSelected(false);
            tfUN.setText(p[3]);
            tfUN.setEnabled(false);
        }
        
        pfPass.setText(p[4]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnContent = new javax.swing.JPanel();
        cbHost = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        tfHost = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfBD = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbUser = new javax.swing.JCheckBox();
        tfUN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();
        btOK = new javax.swing.JButton();
        btX = new javax.swing.JButton();
        cbPort = new javax.swing.JCheckBox();
        tfPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btMsg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editando Configuración de Conexión a la Base de Datos del SIAPMAR");

        pnContent.setBackground(new java.awt.Color(255, 255, 255));

        cbHost.setBackground(new java.awt.Color(255, 255, 255));
        cbHost.setSelected(true);
        cbHost.setText("¿La base de datos se instalará en esta computadora o en otra computadora de la misma red LAN?");
        cbHost.setToolTipText("Chequee si es en esta computadora. Deschequee si es en otra");
        cbHost.setNextFocusableComponent(tfHost);
        cbHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHostActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre del Host:");

        tfHost.setText("localhost");
        tfHost.setEnabled(false);
        tfHost.setNextFocusableComponent(tfBD);
        tfHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfHostKeyReleased(evt);
            }
        });

        jLabel11.setText("<= Ingrese la dirección IP del Servidor");

        tfBD.setNextFocusableComponent(cbUser);
        tfBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBDKeyReleased(evt);
            }
        });

        jLabel12.setText("Nombre de la Base de Datos:");

        jLabel13.setText("Nombre del Usuario:");

        cbUser.setBackground(new java.awt.Color(255, 255, 255));
        cbUser.setSelected(true);
        cbUser.setText("¿Se quiere conectar con el usuario por defecto (super usuario = root) o con otro usuario configurado en el servidor de PostgreSQL?");
        cbUser.setToolTipText("Chequee si quiere ingresar al sistema con el usuario administrador por defecto. Deschequee si es otro usuario");
        cbUser.setNextFocusableComponent(tfUN);
        cbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUserActionPerformed(evt);
            }
        });

        tfUN.setText("postgres");
        tfUN.setEnabled(false);
        tfUN.setNextFocusableComponent(pfPass);
        tfUN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUNKeyReleased(evt);
            }
        });

        jLabel14.setText("Contraseña del Usuario:");

        pfPass.setNextFocusableComponent(btOK);
        pfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfPassKeyReleased(evt);
            }
        });

        btOK.setText("Aceptar");
        btOK.setEnabled(false);
        btOK.setNextFocusableComponent(btX);
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        btX.setText("Cerrar");
        btX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXActionPerformed(evt);
            }
        });

        cbPort.setBackground(new java.awt.Color(255, 255, 255));
        cbPort.setSelected(true);
        cbPort.setText("Dejar puerto por defecto / Poner otro:");
        cbPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPortActionPerformed(evt);
            }
        });

        tfPort.setText("5432");
        tfPort.setEnabled(false);
        tfPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPortKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Configuración de Conexión a la Base de Datos en PostgreSQL");

        btMsg.setText("Lea primero las instrucciones");
        btMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMsgActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/config.png"))); // NOI18N

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBD, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfHost, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel11))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(cbPort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbHost))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btMsg)
                        .addGap(136, 136, 136)))
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(btOK)
                                .addGap(145, 145, 145)
                                .addComponent(btX)
                                .addGap(76, 76, 76))
                            .addComponent(cbUser)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfUN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addComponent(btMsg)
                        .addGap(45, 45, 45)
                        .addComponent(cbHost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPort)
                            .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOK)
                    .addComponent(btX))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPortKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPortKeyReleased
        habilitarBt();
    }//GEN-LAST:event_tfPortKeyReleased

    private void cbPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPortActionPerformed
        if (cbPort.isSelected()) {
            tfPort.setText("5432");
            tfPort.setEnabled(false);
        } else {
            tfPort.setText("");
            tfPort.setEnabled(true);
            cbPort.transferFocus();
            btOK.setEnabled(false);
        }
    }//GEN-LAST:event_cbPortActionPerformed

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        dispose();
    }//GEN-LAST:event_btXActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed

        if (!tfBD.getText().equals("") && !tfHost.getText().equals("") && !tfUN.getText().equals("") && !pfPass.getText().equals("")) {
            int op = JOptionPane.showConfirmDialog(null, "¿ Está seguro(a) de cambiar la configuración de acceso a la Base de Datos ?", "Tenga precaución en esta decisión", JOptionPane.CANCEL_OPTION);

            if (op == JOptionPane.YES_OPTION) {
                if (arc.crearTxt("dbconfig", tfHost.getText()+","+
                    tfPort.getText()+","+
                    tfBD.getText()+","+
                    tfUN.getText()+","+
                    pfPass.getText())) {
                JOptionPane.showMessageDialog(null, "Configuración guardada exitosamente.");
                dispose();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Hay algún campo vacío.");
        }
    }//GEN-LAST:event_btOKActionPerformed

    private void pfPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPassKeyReleased
        habilitarBt();
    }//GEN-LAST:event_pfPassKeyReleased

    private void tfUNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUNKeyReleased
        habilitarBt();
    }//GEN-LAST:event_tfUNKeyReleased

    private void cbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUserActionPerformed
        if (cbUser.isSelected()) {
            tfUN.setText("postgres");
            tfUN.setEnabled(false);
        }else{
            tfUN.setText("");
            tfUN.setEnabled(true);
            cbUser.transferFocus();
            btOK.setEnabled(false);
        }
    }//GEN-LAST:event_cbUserActionPerformed

    private void tfBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBDKeyReleased
        habilitarBt();
    }//GEN-LAST:event_tfBDKeyReleased

    private void tfHostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHostKeyReleased
        habilitarBt();
    }//GEN-LAST:event_tfHostKeyReleased

    private void cbHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHostActionPerformed
        if (cbHost.isSelected()) {
            tfHost.setText("localhost");
            tfHost.setEnabled(false);
        }else{
            tfHost.setText("");
            tfHost.setEnabled(true);
            cbHost.transferFocus();
            btOK.setEnabled(false);
        }
    }//GEN-LAST:event_cbHostActionPerformed

    private void btMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMsgActionPerformed
        DMsgConexion msg = new DMsgConexion(JOptionPane.getFrameForComponent(this), true);
        msg.setLocationRelativeTo(null);
        msg.setVisible(true);
    }//GEN-LAST:event_btMsgActionPerformed

    
    private void habilitarBt(){
        String pass = pfPass.getText();
        
        if (tfHost.getText().equals("") || tfPort.getText().equals("") || 
            tfBD.getText().equals("") || tfUN.getText().equals("") || pass.equals("")) {
            btOK.setEnabled(false);
        }else {
            btOK.setEnabled(true);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DConfConxBD dialog = new DConfConxBD(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btMsg;
    private javax.swing.JButton btOK;
    private javax.swing.JButton btX;
    private javax.swing.JCheckBox cbHost;
    private javax.swing.JCheckBox cbPort;
    private javax.swing.JCheckBox cbUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JPanel pnContent;
    private javax.swing.JTextField tfBD;
    private javax.swing.JTextField tfHost;
    private javax.swing.JTextField tfPort;
    private javax.swing.JTextField tfUN;
    // End of variables declaration//GEN-END:variables
}
