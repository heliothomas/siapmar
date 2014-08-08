package vista;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JSpinner;
import javax.swing.text.NumberFormatter;
import modelo.D_AspectoSocial;
import sc.TextLimiter;

public class DAspectSocial extends javax.swing.JDialog {

String letras = "[a-zA-ZñÑáéíóúÁÉÍÓÚ ]*";

    public DAspectSocial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        getContentPane().setBackground(Color.white);
        
        ((JSpinner.DefaultEditor) spEdad.getEditor()).getTextField().setEditable(false);
        
        tfName1.setDocument(new TextLimiter(95));
        tfParentesco.setDocument(new TextLimiter(15));
        tfOcupacion.setDocument(new TextLimiter(50));
        tfIngreso.setDocument(new TextLimiter(5));
        
        lbNombre.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btOK = new javax.swing.JButton();
        lbOperacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        tfName1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spEdad = new javax.swing.JSpinner();
        tfOcupacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfParentesco = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        tfIngreso = new javax.swing.JFormattedTextField(new NumberFormatter(NumberFormat.getNumberInstance(Locale.UK)));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editando la sección: Aspecto Social y Económica");
        setResizable(false);

        btOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btOK.setNextFocusableComponent(btCancelar);
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        lbOperacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbOperacion.setText("Editar Aspecto Social");

        jLabel2.setText("Edad:");

        jLabel1.setText("Parentesco:");

        jLabel6.setText("Nombre:");

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        tfName1.setNextFocusableComponent(spEdad);
        tfName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfName1KeyReleased(evt);
            }
        });

        jLabel3.setText("Ocupación:");

        spEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));
        spEdad.setNextFocusableComponent(tfParentesco);

        tfOcupacion.setNextFocusableComponent(tfIngreso);
        tfOcupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOcupacionKeyReleased(evt);
            }
        });

        jLabel4.setText("Ingreso mensual en Córdobas:");

        tfParentesco.setNextFocusableComponent(tfOcupacion);
        tfParentesco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfParentescoKeyReleased(evt);
            }
        });

        lbNombre.setText("jLabel5");

        tfIngreso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####.#"))));
        tfIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfIngresoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfName1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(lbOperacion))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbNombre)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbOperacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        D_AspectoSocial as = new D_AspectoSocial();

        as.setName(tfName1.getText());
        as.setParent(tfParentesco.getText());
        as.setEdad(Integer.parseInt(spEdad.getValue().toString()));
        as.setOcupacion(tfOcupacion.getText());
        as.setSalario(Integer.parseInt(tfIngreso.getText()));

        if (lbOperacion.getText().equals("Nuevo")) {
            as.saveASocial();
        }
        if (lbOperacion.getText().equals("Editando")) {
            as.updASocial();
        }
        IFichaSocioEcon.btEditRow.setEnabled(false);
        IFichaSocioEcon.Listar();
        dispose();
    }//GEN-LAST:event_btOKActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfName1KeyReleased
        if(!tfName1.getText().matches(letras)){
            tfName1.setText("");
        }
   }//GEN-LAST:event_tfName1KeyReleased

    private void tfOcupacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOcupacionKeyReleased
        if(!tfOcupacion.getText().matches(letras)){
            tfOcupacion.setText("");
        }
   }//GEN-LAST:event_tfOcupacionKeyReleased

    private void tfParentescoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfParentescoKeyReleased
        if(!tfParentesco.getText().matches(letras)){
            tfParentesco.setText("");
        }
    }//GEN-LAST:event_tfParentescoKeyReleased

    private void tfIngresoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIngresoKeyReleased
        
    }//GEN-LAST:event_tfIngresoKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DAspectSocial dialog = new DAspectSocial(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel lbNombre;
    public static javax.swing.JLabel lbOperacion;
    public static javax.swing.JSpinner spEdad;
    public static javax.swing.JFormattedTextField tfIngreso;
    public static javax.swing.JTextField tfName1;
    public static javax.swing.JTextField tfOcupacion;
    public static javax.swing.JTextField tfParentesco;
    // End of variables declaration//GEN-END:variables
}