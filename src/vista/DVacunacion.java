
package vista;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.D_Pediatria;

public class DVacunacion extends javax.swing.JDialog {

D_Pediatria dvac = new D_Pediatria();
    
    public DVacunacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        /*JPanelConFondo pcf = new JPanelConFondo();
        pcf.setSize(540, 480);
        pcf.setLocation(10, 30);
        pcf.setImagen("/imgsys/FechaVacunacion.png");
        pnEsqBasvac.add(pcf);*/
        
        dvac.consultaVacunacion(Integer.parseInt(IPediatrica.lbCode.getText()));
        
        ((JTextField)datec1.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec2.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec3.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec4.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec5.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec6.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec7.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec8.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec9.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec10.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec11.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec12.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec13.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec14.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec15.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec16.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datec17.getDateEditor().getUiComponent()).setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnEsqBasvac = new javax.swing.JPanel();
        btX = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        lbEsqBasVac = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datec15 = new com.toedter.calendar.JDateChooser();
        datec10 = new com.toedter.calendar.JDateChooser();
        datec6 = new com.toedter.calendar.JDateChooser();
        datec17 = new com.toedter.calendar.JDateChooser();
        datec16 = new com.toedter.calendar.JDateChooser();
        datec1 = new com.toedter.calendar.JDateChooser();
        datec3 = new com.toedter.calendar.JDateChooser();
        datec7 = new com.toedter.calendar.JDateChooser();
        datec4 = new com.toedter.calendar.JDateChooser();
        datec2 = new com.toedter.calendar.JDateChooser();
        datec14 = new com.toedter.calendar.JDateChooser();
        datec8 = new com.toedter.calendar.JDateChooser();
        datec5 = new com.toedter.calendar.JDateChooser();
        datec11 = new com.toedter.calendar.JDateChooser();
        datec13 = new com.toedter.calendar.JDateChooser();
        datec12 = new com.toedter.calendar.JDateChooser();
        datec9 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Esquema Básico de Vacunación");
        setLocationByPlatform(true);
        setModal(true);
        setPreferredSize(new java.awt.Dimension(580, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnEsqBasvac.setBackground(new java.awt.Color(255, 255, 255));
        pnEsqBasvac.setPreferredSize(new java.awt.Dimension(600, 500));
        pnEsqBasvac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btX.setText("Cerrar");
        btX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXActionPerformed(evt);
            }
        });
        pnEsqBasvac.add(btX, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 579, -1, -1));

        btSave.setText("Guardar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        pnEsqBasvac.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 579, -1, -1));

        lbEsqBasVac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEsqBasVac.setText("ESQUEMA BÁSICO DE VACUNACIÓN");
        pnEsqBasvac.add(lbEsqBasVac, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 11, -1, -1));

        jLabel1.setText("Nombre del alumno:");
        pnEsqBasvac.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 541, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/FechaVacunacion.PNG"))); // NOI18N
        pnEsqBasvac.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 430, -1));

        datec15.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 441, -1, -1));

        datec10.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        datec6.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 201, -1, -1));

        datec17.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 491, -1, -1));

        datec16.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, -1, -1));

        datec1.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 51, -1, -1));

        datec3.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 91, -1, -1));

        datec7.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 231, -1, -1));

        datec4.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 131, -1, -1));

        datec2.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 71, -1, -1));

        datec14.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 421, -1, -1));

        datec8.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 261, -1, -1));

        datec5.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 161, -1, -1));

        datec11.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        datec13.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 401, -1, -1));

        datec12.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 371, -1, -1));

        datec9.setDateFormatString("dd/MM/yyyy");
        pnEsqBasvac.add(datec9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("FECHA");
        pnEsqBasvac.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 30, -1, 20));

        lbName.setText("                                       ");
        pnEsqBasvac.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 561, -1, -1));

        getContentPane().add(pnEsqBasvac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        dispose();
    }//GEN-LAST:event_btXActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        D_Pediatria dvacun = new D_Pediatria();
        if (dvacun.saveVacunacion()) {
            JOptionPane.showMessageDialog(null, "Datos guardados satisfactoriamente.");
        }
    }//GEN-LAST:event_btSaveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DVacunacion dialog = new DVacunacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btSave;
    private javax.swing.JButton btX;
    public static com.toedter.calendar.JDateChooser datec1;
    public static com.toedter.calendar.JDateChooser datec10;
    public static com.toedter.calendar.JDateChooser datec11;
    public static com.toedter.calendar.JDateChooser datec12;
    public static com.toedter.calendar.JDateChooser datec13;
    public static com.toedter.calendar.JDateChooser datec14;
    public static com.toedter.calendar.JDateChooser datec15;
    public static com.toedter.calendar.JDateChooser datec16;
    public static com.toedter.calendar.JDateChooser datec17;
    public static com.toedter.calendar.JDateChooser datec2;
    public static com.toedter.calendar.JDateChooser datec3;
    public static com.toedter.calendar.JDateChooser datec4;
    public static com.toedter.calendar.JDateChooser datec5;
    public static com.toedter.calendar.JDateChooser datec6;
    public static com.toedter.calendar.JDateChooser datec7;
    public static com.toedter.calendar.JDateChooser datec8;
    public static com.toedter.calendar.JDateChooser datec9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbEsqBasVac;
    public static javax.swing.JLabel lbName;
    private javax.swing.JPanel pnEsqBasvac;
    // End of variables declaration//GEN-END:variables
}