
package vista;

import java.awt.Color;
import javax.swing.JSpinner;
import sc.TextLimiter;

public class DAntecFam extends javax.swing.JDialog {

    public DAntecFam(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        
        tfPTalla.setDocument(new TextLimiter(30));
        tfPEscolaridad.setDocument(new TextLimiter(50));
        tfPSalud.setDocument(new TextLimiter(30));
        tfMTalla.setDocument(new TextLimiter(30));
        tfMSalud.setDocument(new TextLimiter(30));
        tfMEscolaridad.setDocument(new TextLimiter(50));
        tfContactTB.setDocument(new TextLimiter(30));
        tfHermanos.setDocument(new TextLimiter(30));
        tfAlegria.setDocument(new TextLimiter(30));
        tfDiabetes.setDocument(new TextLimiter(30));
        tfTuberculosis.setDocument(new TextLimiter(30));
        tfConvulsiones.setDocument(new TextLimiter(30));
        tfOtros.setDocument(new TextLimiter(50));
        
        getContentPane().setBackground(Color.white);
        
        ((JSpinner.DefaultEditor) spMEdad.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spMPartos.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spMPeso.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spPEdad.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spPPeso.getEditor()).getTextField().setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnMadre = new javax.swing.JPanel();
        lbMama = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        spMPeso = new javax.swing.JSpinner();
        tfMTalla = new javax.swing.JTextField();
        spMEdad = new javax.swing.JSpinner();
        tfMSalud = new javax.swing.JTextField();
        spMPartos = new javax.swing.JSpinner();
        tfMEscolaridad = new javax.swing.JTextField();
        pnPadre = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lbPapa = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        spPPeso = new javax.swing.JSpinner();
        tfPTalla = new javax.swing.JTextField();
        spPEdad = new javax.swing.JSpinner();
        tfPSalud = new javax.swing.JTextField();
        tfPEscolaridad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tfContactTB = new javax.swing.JTextField();
        tfDiabetes = new javax.swing.JTextField();
        tfHermanos = new javax.swing.JTextField();
        tfTuberculosis = new javax.swing.JTextField();
        tfAlegria = new javax.swing.JTextField();
        tfConvulsiones = new javax.swing.JTextField();
        tfOtros = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos Pediátricos Básicos de la Familia");
        setBackground(new java.awt.Color(102, 0, 0));
        setResizable(false);

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMadre.setBackground(new java.awt.Color(255, 255, 255));
        pnMadre.setPreferredSize(new java.awt.Dimension(350, 200));
        pnMadre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMama.setText("   ");
        pnMadre.add(lbMama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel44.setText("Peso:");
        pnMadre.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 20, -1, -1));

        jLabel48.setText("Talla:");
        pnMadre.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 51, -1, -1));

        jLabel50.setText("Edad:");
        pnMadre.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 82, -1, -1));

        jLabel38.setText("Salud:");
        pnMadre.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, -1, -1));

        jLabel46.setText("Número de partos:");
        pnMadre.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 134, -1, -1));

        jLabel52.setText("Escolaridad:");
        pnMadre.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        spMPeso.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        pnMadre.add(spMPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 17, 41, -1));
        pnMadre.add(tfMTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 48, 66, -1));

        spMEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));
        pnMadre.add(spMEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 79, 38, -1));
        pnMadre.add(tfMSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 108, 131, -1));

        spMPartos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        pnMadre.add(spMPartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 131, 37, -1));
        pnMadre.add(tfMEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 157, 126, -1));

        jPanel1.add(pnMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 330, -1));

        pnPadre.setBackground(new java.awt.Color(255, 255, 255));
        pnPadre.setPreferredSize(new java.awt.Dimension(200, 210));
        pnPadre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setText("Peso:");
        pnPadre.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, -1, -1));

        jLabel49.setText("Talla:");
        pnPadre.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, -1, -1));

        jLabel51.setText("Edad:");
        pnPadre.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 75, -1, -1));

        lbPapa.setText("      ");
        pnPadre.add(lbPapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel29.setText("Salud:");
        pnPadre.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, -1, -1));

        jLabel53.setText("Escolaridad:");
        pnPadre.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, -1, -1));

        spPPeso.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        pnPadre.add(spPPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 39, -1));
        pnPadre.add(tfPTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 46, 61, -1));

        spPEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));
        pnPadre.add(spPEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 72, 37, -1));
        pnPadre.add(tfPSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 103, 148, -1));
        pnPadre.add(tfPEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 143, 126, -1));

        jPanel1.add(pnPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 36, 360, 200));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setText("Contacto T.B:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, -1));

        jLabel33.setText("Hermanos:");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 3, -1, -1));

        jLabel34.setText("Alegria:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 3, -1, -1));

        jLabel35.setText("Diabetes:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, -1, -1));

        jLabel37.setText("Tuberculosis:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 29, -1, -1));

        jLabel39.setText("Convulsiones:");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 29, -1, -1));

        jLabel40.setText("Otros:");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));
        jPanel2.add(tfContactTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 0, 79, -1));
        jPanel2.add(tfDiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 26, 73, -1));
        jPanel2.add(tfHermanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 79, -1));
        jPanel2.add(tfTuberculosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 26, 79, -1));
        jPanel2.add(tfAlegria, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 0, 79, -1));
        jPanel2.add(tfConvulsiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 26, 79, -1));
        jPanel2.add(tfOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 52, 643, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 700, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Madre");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 11, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Padre");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 11, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("Familia");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCerrar)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btOK, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        IPediatrica.lbNameMom.setText(lbMama.getText());
        IPediatrica.lbPesoM.setText(spMPeso.getValue().toString());
        IPediatrica.lbTallaM.setText(tfMTalla.getText());
        IPediatrica.lbEdadM.setText(spMEdad.getValue().toString());
        IPediatrica.lbSaludM.setText(tfMSalud.getText());
        IPediatrica.lbNumPartos.setText(spMPartos.getValue().toString());
        IPediatrica.lbEscolaridadM.setText(tfMEscolaridad.getText());
        
        IPediatrica.lbNamePap.setText(lbPapa.getText());
        IPediatrica.lbPesoP.setText(spPPeso.getValue().toString());
        IPediatrica.lbTallaP.setText(tfPTalla.getText());
        IPediatrica.lbEdadP.setText(spPEdad.getValue().toString());
        IPediatrica.lbSaludP.setText(tfPSalud.getText());
        IPediatrica.lbEscolaridadP.setText(tfPEscolaridad.getText());
        
        IPediatrica.lbContacTB.setText(tfContactTB.getText());
        IPediatrica.lbHnos.setText(tfHermanos.getText());
        IPediatrica.lbAlegria.setText(tfAlegria.getText());
        IPediatrica.lbDiabetes.setText(tfDiabetes.getText());
        IPediatrica.lbTuberculosis.setText(tfTuberculosis.getText());
        IPediatrica.lbConvulsiones.setText(tfConvulsiones.getText());
        IPediatrica.lbOtrosAntec.setText(tfOtros.getText());
        
        dispose();
    }//GEN-LAST:event_btOKActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DAntecFam dialog = new DAntecFam(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btOK;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lbMama;
    public static javax.swing.JLabel lbPapa;
    private javax.swing.JPanel pnMadre;
    private javax.swing.JPanel pnPadre;
    public static javax.swing.JSpinner spMEdad;
    public static javax.swing.JSpinner spMPartos;
    public static javax.swing.JSpinner spMPeso;
    public static javax.swing.JSpinner spPEdad;
    public static javax.swing.JSpinner spPPeso;
    public static javax.swing.JTextField tfAlegria;
    public static javax.swing.JTextField tfContactTB;
    public static javax.swing.JTextField tfConvulsiones;
    public static javax.swing.JTextField tfDiabetes;
    public static javax.swing.JTextField tfHermanos;
    public static javax.swing.JTextField tfMEscolaridad;
    public static javax.swing.JTextField tfMSalud;
    public static javax.swing.JTextField tfMTalla;
    public static javax.swing.JTextField tfOtros;
    public static javax.swing.JTextField tfPEscolaridad;
    public static javax.swing.JTextField tfPSalud;
    public static javax.swing.JTextField tfPTalla;
    public static javax.swing.JTextField tfTuberculosis;
    // End of variables declaration//GEN-END:variables
}
