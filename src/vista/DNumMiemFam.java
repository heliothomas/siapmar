package vista;

import java.awt.Color;
import javax.swing.JSpinner;
import sc.TextLimiter;

public class DNumMiemFam extends javax.swing.JDialog {

String letras = "[a-zA-ZñÑáéíóúÁÉÍÓÚ ]*";

    public DNumMiemFam(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.white);
        spNHijos.setValue(Integer.parseInt(IHistory.lbNHijos.getText()));
        spNHijas.setValue(Integer.parseInt(IHistory.lbNHijas.getText()));
        tfH1Name1.setText(IHistory.lbPHno.getText());
        tfH2Name1.setText(IHistory.lbSHno.getText());
        ((JSpinner.DefaultEditor) spNHijos.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spNHijas.getEditor()).getTextField().setEditable(false);
        
        tfH1Name1.setDocument(new TextLimiter(95));
        tfH2Name1.setDocument(new TextLimiter(95));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();
        tfH1Name1 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        spNHijos = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfH2Name1 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        spNHijas = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editando la sección: Número de Miembros de la Familia");
        setBackground(new java.awt.Color(102, 0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel6.setText("Nombre Completo:");

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        tfH1Name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfH1Name1KeyReleased(evt);
            }
        });

        jLabel96.setText("Hijos:");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel97.setText("Hijas:");

        spNHijos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jLabel2.setText("2- Hermano (a)");

        jLabel1.setText("1- Hermano (a)");

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 102));
        jLabel98.setText("Hermano (os) y/o hermana (as) registrados en Compassion:");

        jLabel10.setText("Nombre Completo:");

        tfH2Name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfH2Name1KeyReleased(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 102));
        jLabel95.setText("Número de miembros de la familia menores de 18 años de edad (Incluyendo a este niño):");

        spNHijas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel95))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel96)
                        .addGap(4, 4, 4)
                        .addComponent(spNHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel97)
                        .addGap(4, 4, 4)
                        .addComponent(spNHijas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel98))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(tfH1Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(tfH2Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel95)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spNHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spNHijas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96)
                            .addComponent(jLabel97))))
                .addGap(18, 18, 18)
                .addComponent(jLabel98)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(tfH1Name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(tfH2Name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        IHistory.lbNHijos.setText(spNHijos.getValue().toString());
        IHistory.lbNHijas.setText(spNHijas.getValue().toString());

        String fullName1 = tfH1Name1.getText();
        String fullName2 = tfH2Name1.getText();

        IHistory.lbPHno.setText(fullName1);
        IHistory.lbSHno.setText(fullName2);

        dispose();
    }//GEN-LAST:event_btOKActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfH1Name1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfH1Name1KeyReleased
        if(!tfH1Name1.getText().matches(letras)){
            tfH1Name1.setText("");
        }
    }//GEN-LAST:event_tfH1Name1KeyReleased

    private void tfH2Name1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfH2Name1KeyReleased
        if(!tfH2Name1.getText().matches(letras)){
            tfH2Name1.setText("");
        }
    }//GEN-LAST:event_tfH2Name1KeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DNumMiemFam dialog = new DNumMiemFam(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JSpinner spNHijas;
    private javax.swing.JSpinner spNHijos;
    private javax.swing.JTextField tfH1Name1;
    private javax.swing.JTextField tfH2Name1;
    // End of variables declaration//GEN-END:variables
}
