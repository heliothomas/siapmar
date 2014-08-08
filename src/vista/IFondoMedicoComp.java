
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.D_FondoMedico;
import sc.*;

public class IFondoMedicoComp extends javax.swing.JInternalFrame implements Printable{

    Library lib = new Library();
    
    public IFondoMedicoComp() {
        initComponents();
        lbFecElaborac.setText(lib.getFechaActual());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        pnContenedor = new javax.swing.JPanel();
        pnComandos = new javax.swing.JPanel();
        btGuardar1 = new javax.swing.JButton();
        btCerrar1 = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        pnContentMain = new javax.swing.JPanel();
        pnContent = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDesc = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taTrat = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbContFam = new javax.swing.JLabel();
        lbQtyComps = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbMontoAutorizado = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbFechaDesembolso = new javax.swing.JLabel();
        lbMMA = new javax.swing.JLabel();
        lbCasoEstudiado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbFirmaFacilitador = new javax.swing.JLabel();
        lbSegOpinion = new javax.swing.JLabel();
        lbOpino = new javax.swing.JLabel();
        lbCostoEstimado = new javax.swing.JLabel();
        lbFrecuencia = new javax.swing.JLabel();
        pnHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbNameProject = new javax.swing.JLabel();
        lbNameNino = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbFecElaborac = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        btEdit = new javax.swing.JButton();
        btLeer = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Fondo Médico de Compassion");
        setPreferredSize(new java.awt.Dimension(725, 680));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(720, 500));

        pnContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnContenedor.setPreferredSize(new java.awt.Dimension(670, 630));

        pnComandos.setBackground(new java.awt.Color(255, 255, 255));

        btGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar1.setEnabled(false);
        btGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar1ActionPerformed(evt);
            }
        });

        btCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar1ActionPerformed(evt);
            }
        });

        btPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandosLayout = new javax.swing.GroupLayout(pnComandos);
        pnComandos.setLayout(pnComandosLayout);
        pnComandosLayout.setHorizontalGroup(
            pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComandosLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnComandosLayout.setVerticalGroup(
            pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnComandosLayout.createSequentialGroup()
                        .addComponent(btCerrar1)
                        .addContainerGap())
                    .addGroup(pnComandosLayout.createSequentialGroup()
                        .addGroup(pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnContentMain.setBackground(new java.awt.Color(255, 255, 255));
        pnContentMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnContent.setBackground(new java.awt.Color(255, 255, 255));
        pnContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Descripción e historia de la necesidad:");
        pnContent.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 1, -1, -1));

        taDesc.setColumns(20);
        taDesc.setLineWrap(true);
        taDesc.setRows(5);
        jScrollPane1.setViewportView(taDesc);

        pnContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 22, 658, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tratamiento sugerido:");
        pnContent.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 132, -1, -1));

        taTrat.setColumns(20);
        taTrat.setLineWrap(true);
        taTrat.setRows(5);
        jScrollPane3.setViewportView(taTrat);

        pnContent.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 153, 658, -1));

        jLabel14.setText("Obtuvo una segunda opinión médica:");
        pnContent.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 267, -1, -1));

        jLabel15.setText("De quién:");
        pnContent.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 267, -1, -1));

        jLabel16.setText("Costo estimado del tratamiento. C$ ");
        pnContent.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 287, -1, -1));

        jLabel18.setText("Contribución familiar u otra fuente (10% del costo total):  C$");
        pnContent.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 307, -1, -1));

        jLabel19.setText("Cantidad solicitada a Compassion (90% del costo total):   C$ ");
        pnContent.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 346, -1, -1));

        jLabel17.setText("Frecuencia del tratamiento:");
        pnContent.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 307, -1, -1));

        lbContFam.setText("      ");
        pnContent.add(lbContFam, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 326, -1, -1));

        lbQtyComps.setText("      ");
        pnContent.add(lbQtyComps, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 366, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), null));

        jLabel13.setText("Uso de la Oficina");

        jLabel20.setText("Necesita aprobación de MMA:");

        jLabel21.setText("Es un caso estudiado:");

        jLabel22.setText("Monto autorizado: C$");

        lbMontoAutorizado.setText("0");

        jLabel24.setText("Fecha de desembolso:");

        lbFechaDesembolso.setText("    ");

        lbMMA.setText("No");

        lbCasoEstudiado.setText("No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel13)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMMA))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCasoEstudiado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMontoAutorizado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFechaDesembolso)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lbMMA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lbCasoEstudiado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lbMontoAutorizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lbFechaDesembolso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnContent.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 341, -1, -1));

        jLabel11.setText("Firma del Director CE: ___________________");
        pnContent.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 404, -1, -1));

        lbFirmaFacilitador.setText("Firma del Facilitador:   ___________________");
        pnContent.add(lbFirmaFacilitador, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 436, -1, -1));

        lbSegOpinion.setText("No");
        pnContent.add(lbSegOpinion, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 267, -1, -1));

        lbOpino.setText("                                    ");
        pnContent.add(lbOpino, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 170, -1));

        lbCostoEstimado.setText("0");
        pnContent.add(lbCostoEstimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 287, -1, -1));

        lbFrecuencia.setText("                                ");
        pnContent.add(lbFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 307, -1, -1));

        pnContentMain.add(pnContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        pnHead.setBackground(new java.awt.Color(255, 255, 255));
        pnHead.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FONDO MÉDICO DE COMPASSION");
        pnHead.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 13, -1, -1));

        jLabel3.setText("Nombre del CE:");
        pnHead.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 53, -1, -1));

        jLabel4.setText("Nombre del niño:");
        pnHead.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 78, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCodigo.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        pnHead.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 102, -1, -1));

        lbNameProject.setText("NI-126-Marcos 10:14");
        pnHead.add(lbNameProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 53, -1, -1));

        lbNameNino.setText("                ");
        pnHead.add(lbNameNino, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 78, 510, -1));

        jLabel6.setText("Edad: ");
        pnHead.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 106, -1, -1));

        jLabel7.setText("Sexo:");
        pnHead.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 106, -1, -1));

        lbEdad.setText("    ");
        pnHead.add(lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 106, 40, -1));

        lbSexo.setText("    ");
        pnHead.add(lbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 106, 90, -1));

        jLabel2.setText("Fecha:");
        pnHead.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 106, -1, -1));

        lbFecElaborac.setText("           ");
        pnHead.add(lbFecElaborac, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 106, 110, -1));

        lbCode.setText("     ");
        pnHead.add(lbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 106, -1, -1));

        pnContentMain.add(pnHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 669, -1));

        btEdit.setText("...");
        btEdit.setEnabled(false);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btLeer.setText("...");
        btLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLeerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnContenedorLayout = new javax.swing.GroupLayout(pnContenedor);
        pnContenedor.setLayout(pnContenedorLayout);
        pnContenedorLayout.setHorizontalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnContenedorLayout.createSequentialGroup()
                        .addComponent(pnContentMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnContenedorLayout.setVerticalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addComponent(pnContentMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pnComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btLeer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEdit)
                .addGap(246, 246, 246))
        );

        jScrollPane2.setViewportView(pnContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLeerActionPerformed
        DMsgFondoMed mfm = new DMsgFondoMed(JOptionPane.getFrameForComponent(this), true);
        mfm.setLocationRelativeTo(null);
        mfm.setVisible(true);
    }//GEN-LAST:event_btLeerActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        DFondoMedico fm = new DFondoMedico(JOptionPane.getFrameForComponent(this), true);
        fm.setLocationRelativeTo(null);
        fm.setVisible(true);
    }//GEN-LAST:event_btEditActionPerformed

    private void btGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar1ActionPerformed
        int codigo = Integer.parseInt(lbCode.getText());
        D_FondoMedico fmc = new D_FondoMedico();
        
        int segOpi = 0;
        if (lbSegOpinion.getText().equals("Si")) {
            segOpi = 1;
        }
        int mma = 0;
        if (lbMMA.getText().equals("Si")) {
            mma = 1;
        }
        int casoEstud = 0;
        if (lbCasoEstudiado.getText().equals("Si")) {
            casoEstud = 1;
        }
        
        if(fmc.saveFondoMedico(codigo, lbFecElaborac.getText(), taDesc.getText(), taTrat.getText(),
segOpi, lbOpino.getText(), lbCostoEstimado.getText(), lbFrecuencia.getText(),
lbContFam.getText(), lbQtyComps.getText(),mma,casoEstud,lbMontoAutorizado.getText(),lbFechaDesembolso.getText())){
        
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        }
    }//GEN-LAST:event_btGuardar1ActionPerformed

    private void btCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar1ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.fonmed = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        DListadoAlumnos lalu = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        lalu.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Fondo Médico de Compassion");
        lalu.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            boolean aceptar_impresion = job.printDialog();
            if (aceptar_impresion) {
                job.print();
            }

        } catch (PrinterException ex) {
            Logger.getLogger(IHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPrintActionPerformed
    
    public static void consultarTodo(int codigo){
        D_FondoMedico fmc = new D_FondoMedico();
        fmc.consultaPag1(codigo);
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0)
          return NO_SUCH_PAGE;

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        g2d.scale(0.65, 0.80);

        pnContentMain.printAll(graphics);
        
        return PAGE_EXISTS;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrar1;
    public static javax.swing.JButton btEdit;
    public static javax.swing.JButton btGuardar1;
    private javax.swing.JButton btLeer;
    private javax.swing.JButton btPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel lbCasoEstudiado;
    public static javax.swing.JLabel lbCode;
    public static javax.swing.JLabel lbContFam;
    public static javax.swing.JLabel lbCostoEstimado;
    public static javax.swing.JLabel lbEdad;
    public static javax.swing.JLabel lbFecElaborac;
    public static javax.swing.JLabel lbFechaDesembolso;
    private javax.swing.JLabel lbFirmaFacilitador;
    public static javax.swing.JLabel lbFrecuencia;
    public static javax.swing.JLabel lbMMA;
    public static javax.swing.JLabel lbMontoAutorizado;
    public static javax.swing.JLabel lbNameNino;
    private javax.swing.JLabel lbNameProject;
    public static javax.swing.JLabel lbOpino;
    public static javax.swing.JLabel lbQtyComps;
    public static javax.swing.JLabel lbSegOpinion;
    public static javax.swing.JLabel lbSexo;
    private javax.swing.JPanel pnComandos;
    private javax.swing.JPanel pnContenedor;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnContentMain;
    private javax.swing.JPanel pnHead;
    public static javax.swing.JTextArea taDesc;
    public static javax.swing.JTextArea taTrat;
    // End of variables declaration//GEN-END:variables
}