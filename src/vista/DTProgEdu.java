package vista;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.D_ProgEdu;

public class DTProgEdu extends javax.swing.JDialog {

    public DTProgEdu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.white);
        lbOp.setVisible(false);
        D_ProgEdu dpe = new D_ProgEdu();
        dpe.getProgEducativo();
        ((JTextField)datecFecRev.getDateEditor().getUiComponent()).setEditable(false);
    }
    
    public static DefaultComboBoxModel modelProgEdu = new DefaultComboBoxModel();
    
    public void enlistarAnios(){
        if (cbxProgEdu.getSelectedIndex()==0) {
            cbxAnio.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3" }));
        }
        if (cbxProgEdu.getSelectedIndex()==1 || cbxProgEdu.getSelectedIndex()==2) {
            cbxAnio.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6" }));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btOK = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbOp = new javax.swing.JLabel();
        cbxProgEdu = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        datecFecRev = new com.toedter.calendar.JDateChooser();
        cbxAnio = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbOp.setText("LOL");

        cbxProgEdu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pre-escolar", "Primaria", "Secundaria" }));
        cbxProgEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProgEduActionPerformed(evt);
            }
        });

        jLabel6.setText("Programa educativo");

        jLabel4.setText("Año en que se encuentra");

        jLabel5.setText("Fecha de revisión");

        datecFecRev.setDateFormatString("dd/MM/yyyy");

        cbxAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datecFecRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxProgEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxProgEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datecFecRev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbOp)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        D_ProgEdu pre = new D_ProgEdu();

        int cAlu = Integer.parseInt(ITipoProgEdu.lbCode.getText());
        String pe = cbxProgEdu.getSelectedItem().toString();
        String an = cbxAnio.getSelectedItem().toString();
        String fe = ((JTextField)datecFecRev.getDateEditor().getUiComponent()).getText();
        
        if (!fe.trim().equals("")) {
            pre.setProgedu(pe);
            pre.setAnio(an);
            pre.setFecha(fe);
            
            if (lbOp.getText().equals("Nuevo")) {
                pre.saveProgEdu(cAlu);
            }
            if (lbOp.getText().equals("Editando")) {
                pre.updProgEdu(pre.getCodeProgEdu(cAlu), D_ProgEdu.getCodeTPE(pe), fe);
            }
            ITipoProgEdu.Listar(cAlu);
        }else{
            JOptionPane.showMessageDialog(null, "No se guardará nada, porque faltan algunos datos");
        }
        ITipoProgEdu.btEditRow.setEnabled(false);
        dispose();
    }//GEN-LAST:event_btOKActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbxProgEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProgEduActionPerformed
        enlistarAnios();
    }//GEN-LAST:event_cbxProgEduActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DTProgEdu dialog = new DTProgEdu(new javax.swing.JFrame(), true);
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
    public static javax.swing.JComboBox cbxAnio;
    public static javax.swing.JComboBox cbxProgEdu;
    public static com.toedter.calendar.JDateChooser datecFecRev;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel lbOp;
    // End of variables declaration//GEN-END:variables
}
