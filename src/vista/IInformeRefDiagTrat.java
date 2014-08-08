
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.D_InformeRef;
import sc.*;

public class IInformeRefDiagTrat extends javax.swing.JInternalFrame implements Printable{

    Library lib = new Library();

    public IInformeRefDiagTrat() {
        initComponents();
        lbFecElaborac.setText(lib.getFechaActual());
        
        ImageIcon img = new ImageIcon(getClass().getResource("/imgsys/LogoCompassion.jpg"));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(265, 115, Image.SCALE_SMOOTH));
        lbImg.setIcon(icono);
        this.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnContenedor = new javax.swing.JPanel();
        btGuardar = new javax.swing.JButton();
        btCerrar4 = new javax.swing.JButton();
        btEEnvio = new javax.swing.JButton();
        pnContent = new javax.swing.JPanel();
        pnDatosGrales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbChildName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbFecNac = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbSex = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbFecElaborac = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbNameMom = new javax.swing.JLabel();
        lbNamePap = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        pnUltimosDatos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbCAsistencia = new javax.swing.JLabel();
        lbFechaEnvio = new javax.swing.JLabel();
        lbHoraEnvio = new javax.swing.JLabel();
        lbAcompanante = new javax.swing.JLabel();
        lbMedico = new javax.swing.JLabel();
        pnDiagnostico = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDiagn = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taMotivo = new javax.swing.JTextArea();
        pnTratamiento = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taResClinico = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taInstrucciones = new javax.swing.JTextArea();
        pnBanner = new javax.swing.JPanel();
        taDiagnostico = new javax.swing.JLabel();
        lbProjectName = new javax.swing.JLabel();
        lbImg = new javax.swing.JLabel();
        pnOtrosSintomas = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfPulso = new javax.swing.JTextField();
        tfTemp = new javax.swing.JTextField();
        tfPresion = new javax.swing.JTextField();
        tfFreqResp = new javax.swing.JTextField();
        btPrint = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Informe de Referencia de Diagnósticos y Tratamiento");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(790, 680));
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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(700, 650));

        pnContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnContenedor.setPreferredSize(new java.awt.Dimension(750, 950));

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar.setEnabled(false);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCerrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar4ActionPerformed(evt);
            }
        });

        btEEnvio.setText("...");
        btEEnvio.setEnabled(false);
        btEEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEEnvioActionPerformed(evt);
            }
        });

        pnContent.setBackground(new java.awt.Color(255, 255, 255));
        pnContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnDatosGrales.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombre del niño:");

        lbChildName.setText("      ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCodigo.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setText("Edad:");

        lbEdad.setText("     ");

        jLabel5.setText("Fecha de nacimiento:");

        lbFecNac.setText("    ");

        jLabel6.setText("Sexo:");

        lbSex.setText("    ");

        jLabel7.setText("Fecha de elaboración:");

        lbFecElaborac.setText("      ");

        jLabel8.setText("Nombre de la madre:");

        lbNameMom.setText("     ");

        lbNamePap.setText("     ");

        jLabel9.setText("Nombre del padre:");

        javax.swing.GroupLayout pnDatosGralesLayout = new javax.swing.GroupLayout(pnDatosGrales);
        pnDatosGrales.setLayout(pnDatosGralesLayout);
        pnDatosGralesLayout.setHorizontalGroup(
            pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatosGralesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatosGralesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(lbChildName))
                    .addGroup(pnDatosGralesLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(lbEdad)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(lbFecNac)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(lbSex))
                    .addGroup(pnDatosGralesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(lbFecElaborac))
                    .addGroup(pnDatosGralesLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(lbNameMom))
                    .addGroup(pnDatosGralesLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(lbNamePap))))
        );
        pnDatosGralesLayout.setVerticalGroup(
            pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatosGralesLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbChildName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCode, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(lbEdad)
                        .addComponent(jLabel5)
                        .addComponent(lbFecNac)
                        .addComponent(jLabel6)
                        .addComponent(lbSex))
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lbFecElaborac))
                .addGap(6, 6, 6)
                .addGroup(pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lbNameMom))
                .addGap(6, 6, 6)
                .addGroup(pnDatosGralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lbNamePap)))
        );

        pnContent.add(pnDatosGrales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 705, -1));

        pnUltimosDatos.setBackground(new java.awt.Color(255, 255, 255));
        pnUltimosDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Fecha de envío:");
        pnUltimosDatos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 1, -1, -1));

        jLabel19.setText("Acompañado por:");
        pnUltimosDatos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jLabel20.setText("Hora de envío:");
        pnUltimosDatos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        jLabel21.setText("Se envía a:");
        pnUltimosDatos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel22.setText("Nombre del médico:");
        pnUltimosDatos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 41, -1, -1));

        jLabel23.setText("Firma y sello del médico tratante: ____________________");
        pnUltimosDatos.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 61, -1, -1));

        lbCAsistencia.setText("               ");
        pnUltimosDatos.add(lbCAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        lbFechaEnvio.setText("               ");
        pnUltimosDatos.add(lbFechaEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 1, -1, -1));

        lbHoraEnvio.setText("               ");
        pnUltimosDatos.add(lbHoraEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 21, -1, -1));

        lbAcompanante.setText("               ");
        pnUltimosDatos.add(lbAcompanante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        lbMedico.setText("               ");
        pnUltimosDatos.add(lbMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 41, -1, -1));

        pnContent.add(pnUltimosDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 700, -1));

        pnDiagnostico.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Diagnóstico y problema:");

        taDiagn.setColumns(20);
        taDiagn.setLineWrap(true);
        taDiagn.setRows(5);
        taDiagn.setWrapStyleWord(true);
        jScrollPane2.setViewportView(taDiagn);

        jLabel11.setText("Motivo de la referencia:");

        taMotivo.setColumns(20);
        taMotivo.setLineWrap(true);
        taMotivo.setRows(5);
        taMotivo.setWrapStyleWord(true);
        jScrollPane3.setViewportView(taMotivo);

        javax.swing.GroupLayout pnDiagnosticoLayout = new javax.swing.GroupLayout(pnDiagnostico);
        pnDiagnostico.setLayout(pnDiagnosticoLayout);
        pnDiagnosticoLayout.setHorizontalGroup(
            pnDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDiagnosticoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnDiagnosticoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDiagnosticoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnDiagnosticoLayout.setVerticalGroup(
            pnDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDiagnosticoLayout.createSequentialGroup()
                .addGroup(pnDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pnContent.add(pnDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 705, -1));

        pnTratamiento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("RESUMEN CLÍNICO Y TRATAMIENTO");

        taResClinico.setColumns(20);
        taResClinico.setLineWrap(true);
        taResClinico.setRows(5);
        taResClinico.setWrapStyleWord(true);
        jScrollPane4.setViewportView(taResClinico);

        jLabel17.setText("Instrucciones para la continuidad de la atención:");

        taInstrucciones.setColumns(20);
        taInstrucciones.setLineWrap(true);
        taInstrucciones.setRows(5);
        taInstrucciones.setWrapStyleWord(true);
        jScrollPane5.setViewportView(taInstrucciones);

        javax.swing.GroupLayout pnTratamientoLayout = new javax.swing.GroupLayout(pnTratamiento);
        pnTratamiento.setLayout(pnTratamientoLayout);
        pnTratamientoLayout.setHorizontalGroup(
            pnTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTratamientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(265, 265, 265))
            .addGroup(pnTratamientoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnTratamientoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnTratamientoLayout.setVerticalGroup(
            pnTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTratamientoLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContent.add(pnTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 705, -1));

        pnBanner.setBackground(new java.awt.Color(255, 255, 255));

        taDiagnostico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        taDiagnostico.setText("Informe de Referencia de Diagnósticos y Tratamiento");

        lbProjectName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbProjectName.setText("NI-126-Marcos 10:14");

        lbImg.setText("           ");

        javax.swing.GroupLayout pnBannerLayout = new javax.swing.GroupLayout(pnBanner);
        pnBanner.setLayout(pnBannerLayout);
        pnBannerLayout.setHorizontalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProjectName)
                    .addComponent(taDiagnostico))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnBannerLayout.setVerticalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addComponent(taDiagnostico)
                        .addGap(18, 18, 18)
                        .addComponent(lbProjectName))
                    .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnContent.add(pnBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 705, 130));

        pnOtrosSintomas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Pulso:");

        jLabel13.setText("Temperatura:");

        jLabel14.setText("Presión arterial:");

        jLabel15.setText("Frecuencia respiratoria:");

        javax.swing.GroupLayout pnOtrosSintomasLayout = new javax.swing.GroupLayout(pnOtrosSintomas);
        pnOtrosSintomas.setLayout(pnOtrosSintomasLayout);
        pnOtrosSintomasLayout.setHorizontalGroup(
            pnOtrosSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOtrosSintomasLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(pnOtrosSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOtrosSintomasLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnOtrosSintomasLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(41, 41, 41)
                        .addComponent(tfPulso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(pnOtrosSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOtrosSintomasLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFreqResp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnOtrosSintomasLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnOtrosSintomasLayout.setVerticalGroup(
            pnOtrosSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOtrosSintomasLayout.createSequentialGroup()
                .addGroup(pnOtrosSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(tfPulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOtrosSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(tfTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFreqResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pnContent.add(pnOtrosSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 705, -1));

        btPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnContenedorLayout = new javax.swing.GroupLayout(pnContenedor);
        pnContenedor.setLayout(pnContenedorLayout);
        pnContenedorLayout.setHorizontalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btEEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btCerrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        pnContenedorLayout.setVerticalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEEnvio)
                .addGap(160, 160, 160))
        );

        jScrollPane1.setViewportView(pnContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEEnvioActionPerformed
        DRemitencia re = new DRemitencia(JOptionPane.getFrameForComponent(this), true);
        re.setLocationRelativeTo(null);
        re.setVisible(true);
    }//GEN-LAST:event_btEEnvioActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        int code = Integer.parseInt(lbCode.getText());
        D_InformeRef inf = new D_InformeRef();
        
        if(inf.saveInformeReferencia(code,lbFecElaborac.getText(),taDiagn.getText(),
taMotivo.getText(),tfPulso.getText(),tfPresion.getText(),tfTemp.getText(),tfFreqResp.getText(),
taResClinico.getText(),taInstrucciones.getText(),lbFechaEnvio.getText(),lbAcompanante.getText(),
lbHoraEnvio.getText(),lbCAsistencia.getText(),lbMedico.getText())){
        
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar4ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar4ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.infRefDiagTrat = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        DListadoAlumnos lalu = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        lalu.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Informe de Referencia de Diagnósticos y Tratamiento");
        lalu.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        try {
           PrinterJob job = PrinterJob.getPrinterJob();
           job.setPrintable(this);
            boolean aceptar_impresion = job.printDialog();
             if(aceptar_impresion)
                job.print();

        } catch (PrinterException ex) {
            Logger.getLogger(IHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPrintActionPerformed

    public static void consultarTodo(int codigo){
        D_InformeRef irdt = new D_InformeRef();
        irdt.consultaDatosGrales(codigo);
        irdt.consultaInforme(codigo);
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0)
          return NO_SUCH_PAGE;

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        g2d.scale(0.65, 0.80);

        pnContent.printAll(graphics);
        
        return PAGE_EXISTS;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrar4;
    public static javax.swing.JButton btEEnvio;
    public static javax.swing.JButton btGuardar;
    private javax.swing.JButton btPrint;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JLabel lbAcompanante;
    public static javax.swing.JLabel lbCAsistencia;
    public static javax.swing.JLabel lbChildName;
    public static javax.swing.JLabel lbCode;
    public static javax.swing.JLabel lbEdad;
    public static javax.swing.JLabel lbFecElaborac;
    public static javax.swing.JLabel lbFecNac;
    public static javax.swing.JLabel lbFechaEnvio;
    public static javax.swing.JLabel lbHoraEnvio;
    private javax.swing.JLabel lbImg;
    public static javax.swing.JLabel lbMedico;
    public static javax.swing.JLabel lbNameMom;
    public static javax.swing.JLabel lbNamePap;
    private javax.swing.JLabel lbProjectName;
    public static javax.swing.JLabel lbSex;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnContenedor;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnDatosGrales;
    private javax.swing.JPanel pnDiagnostico;
    private javax.swing.JPanel pnOtrosSintomas;
    private javax.swing.JPanel pnTratamiento;
    private javax.swing.JPanel pnUltimosDatos;
    public static javax.swing.JTextArea taDiagn;
    private javax.swing.JLabel taDiagnostico;
    public static javax.swing.JTextArea taInstrucciones;
    public static javax.swing.JTextArea taMotivo;
    public static javax.swing.JTextArea taResClinico;
    public static javax.swing.JTextField tfFreqResp;
    public static javax.swing.JTextField tfPresion;
    public static javax.swing.JTextField tfPulso;
    public static javax.swing.JTextField tfTemp;
    // End of variables declaration//GEN-END:variables
}
