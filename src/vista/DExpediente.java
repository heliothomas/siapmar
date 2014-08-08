
package vista;

import javax.swing.JOptionPane;
import modelo.D_Expediente;

public class DExpediente extends javax.swing.JDialog {

    public DExpediente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        lbCodeGrupo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnContent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbAlumno = new javax.swing.JLabel();
        cbHojaPres = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        lbGrupo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbDocente = new javax.swing.JLabel();
        cbPartNac = new javax.swing.JCheckBox();
        cbFicSocEc = new javax.swing.JCheckBox();
        cbHistNin = new javax.swing.JCheckBox();
        cbNotaAut = new javax.swing.JCheckBox();
        cbActPerf = new javax.swing.JCheckBox();
        cbRegCor = new javax.swing.JCheckBox();
        cbCuadCarta = new javax.swing.JCheckBox();
        cbRegReg = new javax.swing.JCheckBox();
        cbEvalNiv = new javax.swing.JCheckBox();
        cbEvalAnual = new javax.swing.JCheckBox();
        cbHistCliPed = new javax.swing.JCheckBox();
        cbInfoSeg = new javax.swing.JCheckBox();
        cbTarVac = new javax.swing.JCheckBox();
        cbTransProf = new javax.swing.JCheckBox();
        cbFondoMC = new javax.swing.JCheckBox();
        cbTipoPE = new javax.swing.JCheckBox();
        cbBoletin = new javax.swing.JCheckBox();
        cbPartActCompl = new javax.swing.JCheckBox();
        cbRegNecEsp = new javax.swing.JCheckBox();
        cbVisitas = new javax.swing.JCheckBox();
        cbRegPartPad = new javax.swing.JCheckBox();
        cbRegAnec = new javax.swing.JCheckBox();
        cbRegBenef = new javax.swing.JCheckBox();
        btSave = new javax.swing.JButton();
        btX = new javax.swing.JButton();
        lbCodeGrupo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Revisión del Expediente de un Alumno");
        setResizable(false);

        pnContent.setBackground(new java.awt.Color(255, 255, 255));
        pnContent.setPreferredSize(new java.awt.Dimension(700, 532));

        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Revisión del Expediente a un Alumno");

        lbCode.setText("    ");

        jLabel4.setText("Nombre del Alumno:");

        lbAlumno.setText("                                                                               ");

        cbHojaPres.setBackground(new java.awt.Color(255, 255, 255));
        cbHojaPres.setText("Hoja de Presentación");
        cbHojaPres.setActionCommand("Si");

        jLabel6.setText("Del Grupo:");

        lbGrupo.setText("                   ");

        jLabel8.setText("Del Docente:");

        lbDocente.setText("                                                            ");

        cbPartNac.setBackground(new java.awt.Color(255, 255, 255));
        cbPartNac.setText("Partida de Nacimiento / Fotocopia de Cédula del Tutor");
        cbPartNac.setActionCommand("Si");

        cbFicSocEc.setBackground(new java.awt.Color(255, 255, 255));
        cbFicSocEc.setText("Ficha Socioeconómica");
        cbFicSocEc.setActionCommand("Si");

        cbHistNin.setBackground(new java.awt.Color(255, 255, 255));
        cbHistNin.setText("Historia del Niño");
        cbHistNin.setActionCommand("Si");

        cbNotaAut.setBackground(new java.awt.Color(255, 255, 255));
        cbNotaAut.setText("Nota de Autorización del Padre");
        cbNotaAut.setActionCommand("Si");

        cbActPerf.setBackground(new java.awt.Color(255, 255, 255));
        cbActPerf.setText("Actualización de Perfil");
        cbActPerf.setActionCommand("Si");

        cbRegCor.setBackground(new java.awt.Color(255, 255, 255));
        cbRegCor.setText("Registro de Correspondencia");
        cbRegCor.setActionCommand("Si");

        cbCuadCarta.setBackground(new java.awt.Color(255, 255, 255));
        cbCuadCarta.setText("Cuaderno de las Cartas");
        cbCuadCarta.setActionCommand("Si");

        cbRegReg.setBackground(new java.awt.Color(255, 255, 255));
        cbRegReg.setText("Registro de Regalos");
        cbRegReg.setActionCommand("Si");

        cbEvalNiv.setBackground(new java.awt.Color(255, 255, 255));
        cbEvalNiv.setText("Evaluación por Nivel");
        cbEvalNiv.setActionCommand("Si");

        cbEvalAnual.setBackground(new java.awt.Color(255, 255, 255));
        cbEvalAnual.setText("Evaluación Anual");
        cbEvalAnual.setActionCommand("Si");

        cbHistCliPed.setBackground(new java.awt.Color(255, 255, 255));
        cbHistCliPed.setText("Historia Clínica Pediátrica");
        cbHistCliPed.setActionCommand("Si");

        cbInfoSeg.setBackground(new java.awt.Color(255, 255, 255));
        cbInfoSeg.setText("Información de Seguimiento o de Atención Médica Brindada");
        cbInfoSeg.setActionCommand("Si");

        cbTarVac.setBackground(new java.awt.Color(255, 255, 255));
        cbTarVac.setText("Fotocopias de las Tarjetas de Vacunación");
        cbTarVac.setActionCommand("Si");

        cbTransProf.setBackground(new java.awt.Color(255, 255, 255));
        cbTransProf.setText("Transferencias a Profesionales de la Salud");
        cbTransProf.setActionCommand("Si");

        cbFondoMC.setBackground(new java.awt.Color(255, 255, 255));
        cbFondoMC.setText("Fondo Médico Compassion");
        cbFondoMC.setActionCommand("Si");

        cbTipoPE.setBackground(new java.awt.Color(255, 255, 255));
        cbTipoPE.setText("Tipo de Programa Educativo");
        cbTipoPE.setActionCommand("Si");

        cbBoletin.setBackground(new java.awt.Color(255, 255, 255));
        cbBoletin.setText("Boletín");
        cbBoletin.setActionCommand("Si");

        cbPartActCompl.setBackground(new java.awt.Color(255, 255, 255));
        cbPartActCompl.setText("Participación en Actividades Complementarias");
        cbPartActCompl.setActionCommand("Si");

        cbRegNecEsp.setBackground(new java.awt.Color(255, 255, 255));
        cbRegNecEsp.setText("Registro de Necesidades Especiales");
        cbRegNecEsp.setActionCommand("Si");

        cbVisitas.setBackground(new java.awt.Color(255, 255, 255));
        cbVisitas.setText("Visitas");
        cbVisitas.setActionCommand("Si");

        cbRegPartPad.setBackground(new java.awt.Color(255, 255, 255));
        cbRegPartPad.setText("Registro de Participación de los Padres");
        cbRegPartPad.setActionCommand("Si");

        cbRegAnec.setBackground(new java.awt.Color(255, 255, 255));
        cbRegAnec.setText("Registro Anecdótico");
        cbRegAnec.setActionCommand("Si");

        cbRegBenef.setBackground(new java.awt.Color(255, 255, 255));
        cbRegBenef.setText("Registro de Beneficios recibidos por algún CIV");
        cbRegBenef.setActionCommand("Si");

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXActionPerformed(evt);
            }
        });

        lbCodeGrupo.setText("jLabel3");

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btX)
                .addGap(173, 173, 173))
            .addGroup(pnContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbHistCliPed)
                    .addComponent(cbEvalAnual)
                    .addComponent(cbEvalNiv)
                    .addComponent(cbRegReg)
                    .addComponent(cbCuadCarta)
                    .addComponent(cbRegCor)
                    .addComponent(cbActPerf)
                    .addComponent(cbNotaAut)
                    .addComponent(cbHistNin)
                    .addComponent(cbFicSocEc)
                    .addComponent(cbPartNac)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCode))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbGrupo)))
                        .addGap(45, 45, 45)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContentLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbAlumno))
                                    .addGroup(pnContentLayout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbTarVac)
                                            .addGroup(pnContentLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbDocente))
                                            .addComponent(cbTransProf)
                                            .addComponent(cbFondoMC)
                                            .addComponent(cbTipoPE)
                                            .addComponent(cbBoletin)
                                            .addComponent(cbPartActCompl)
                                            .addComponent(cbRegNecEsp)
                                            .addComponent(cbVisitas)
                                            .addComponent(cbRegPartPad)
                                            .addComponent(cbRegAnec)
                                            .addComponent(cbRegBenef)
                                            .addComponent(cbInfoSeg)))))))
                    .addComponent(cbHojaPres)
                    .addComponent(lbCodeGrupo))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbCode)
                    .addComponent(jLabel4)
                    .addComponent(lbAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbGrupo)
                    .addComponent(jLabel8)
                    .addComponent(lbDocente))
                .addGap(18, 18, 18)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHojaPres)
                    .addComponent(cbInfoSeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addComponent(cbPartNac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFicSocEc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbHistNin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbNotaAut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbActPerf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRegCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCuadCarta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRegReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEvalNiv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEvalAnual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbHistCliPed))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addComponent(cbTarVac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTransProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFondoMC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTipoPE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbBoletin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPartActCompl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRegNecEsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbVisitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRegPartPad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRegAnec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRegBenef)))
                .addGap(18, 18, 18)
                .addComponent(lbCodeGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(btX))
                .addGap(43, 43, 43))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        dispose();
    }//GEN-LAST:event_btXActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        D_Expediente ex = new D_Expediente();
        
        if (ex.completarExpAlu(lbCodeGrupo.getText(), Integer.parseInt(lbCode.getText()))) {
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
            IRevExp.Listar();
        }
        dispose();
    }//GEN-LAST:event_btSaveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DExpediente dialog = new DExpediente(new javax.swing.JFrame(), true);
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
    public static javax.swing.JCheckBox cbActPerf;
    public static javax.swing.JCheckBox cbBoletin;
    public static javax.swing.JCheckBox cbCuadCarta;
    public static javax.swing.JCheckBox cbEvalAnual;
    public static javax.swing.JCheckBox cbEvalNiv;
    public static javax.swing.JCheckBox cbFicSocEc;
    public static javax.swing.JCheckBox cbFondoMC;
    public static javax.swing.JCheckBox cbHistCliPed;
    public static javax.swing.JCheckBox cbHistNin;
    public static javax.swing.JCheckBox cbHojaPres;
    public static javax.swing.JCheckBox cbInfoSeg;
    public static javax.swing.JCheckBox cbNotaAut;
    public static javax.swing.JCheckBox cbPartActCompl;
    public static javax.swing.JCheckBox cbPartNac;
    public static javax.swing.JCheckBox cbRegAnec;
    public static javax.swing.JCheckBox cbRegBenef;
    public static javax.swing.JCheckBox cbRegCor;
    public static javax.swing.JCheckBox cbRegNecEsp;
    public static javax.swing.JCheckBox cbRegPartPad;
    public static javax.swing.JCheckBox cbRegReg;
    public static javax.swing.JCheckBox cbTarVac;
    public static javax.swing.JCheckBox cbTipoPE;
    public static javax.swing.JCheckBox cbTransProf;
    public static javax.swing.JCheckBox cbVisitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel lbAlumno;
    public static javax.swing.JLabel lbCode;
    public static javax.swing.JLabel lbCodeGrupo;
    public static javax.swing.JLabel lbDocente;
    public static javax.swing.JLabel lbGrupo;
    private javax.swing.JPanel pnContent;
    // End of variables declaration//GEN-END:variables
}
