
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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import modelo.D_Pediatria;
import sc.Library;
import sc.TextLimiter;

public class IPediatrica extends javax.swing.JInternalFrame implements Printable{
    
Library lib = new Library();
    
    public IPediatrica() {
        initComponents();
        
        taMotivoConsulta.setDocument(new TextLimiter(200));
        tfNacioEn.setDocument(new TextLimiter(20));
        tfMaternidad.setDocument(new TextLimiter(20));
        tfPartoEn.setDocument(new TextLimiter(20));
        tfMeses.setDocument(new TextLimiter(20));
        tfCausas.setDocument(new TextLimiter(20));
        tfNeonato.setDocument(new TextLimiter(20));
        tfApgar.setDocument(new TextLimiter(20));
        
        tfEmbarazo.setDocument(new TextLimiter(20));
        tfParto.setDocument(new TextLimiter(20));
        tfCausaCesarea.setDocument(new TextLimiter(30));
        tfTallaAlNacer.setDocument(new TextLimiter(20));
        tfCirCef.setDocument(new TextLimiter(20));
        taPatalogicos.setDocument(new TextLimiter(400));
        
        tfPeso.setDocument(new TextLimiter(40));
        tfTalla.setDocument(new TextLimiter(40));
        tfTemp.setDocument(new TextLimiter(40));
        tfPerim.setDocument(new TextLimiter(40));
        tfCabeza.setDocument(new TextLimiter(40));
        tfOjos.setDocument(new TextLimiter(40));
        tfOi2.setDocument(new TextLimiter(40));
        tfBok.setDocument(new TextLimiter(40));
        tfNariz.setDocument(new TextLimiter(40));
        tfCuello.setDocument(new TextLimiter(40));
        
        tfTorax.setDocument(new TextLimiter(40));
        tfCoraz.setDocument(new TextLimiter(40));
        tfPulmon.setDocument(new TextLimiter(40));
        tfAbdom.setDocument(new TextLimiter(40));
        tfFaring.setDocument(new TextLimiter(40));
        tfGenit.setDocument(new TextLimiter(40));
        tfExtremid.setDocument(new TextLimiter(40));
        tfPiel.setDocument(new TextLimiter(40));
        tfAdenop.setDocument(new TextLimiter(40));
        tfRefSup.setDocument(new TextLimiter(40));
        tfRefProf.setDocument(new TextLimiter(40));
        tfPost.setDocument(new TextLimiter(40));
        tfDesar.setDocument(new TextLimiter(40));
        tfNutr.setDocument(new TextLimiter(40));
        
        taExamLab.setDocument(new TextLimiter(500));
        taObservaciones.setDocument(new TextLimiter(500));
        
        ((JSpinner.DefaultEditor) spNAbortos.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spNGesta.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spPesoAlNacer.getEditor()).getTextField().setEditable(false);
        
        lbFecha.setText(lib.getFechaActual());
        
        tabbed.setEnabledAt(1, false);
        tabbed.setEnabledAt(2, false);
        tabbed.setEnabledAt(3, false);
        tabbed.setEnabledAt(4, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabbed = new javax.swing.JTabbedPane();
        pnPag1 = new javax.swing.JPanel();
        pnComandos1 = new javax.swing.JPanel();
        btPrint1 = new javax.swing.JButton();
        btGuardar1 = new javax.swing.JButton();
        btCerrar1 = new javax.swing.JButton();
        pnContent1 = new javax.swing.JPanel();
        pnDatosGrales = new javax.swing.JPanel();
        lbCodeEv = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbNombreCompleto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbFecNac = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbLugarNac = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbDomicilio = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbNameMad = new javax.swing.JLabel();
        lbNamePad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbF1Consulta = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        btDataGral = new javax.swing.JButton();
        pnMotivo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMotivoConsulta = new javax.swing.JTextArea();
        pnAntecObstetricos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tfNacioEn = new javax.swing.JTextField();
        tfMaternidad = new javax.swing.JTextField();
        tfPartoEn = new javax.swing.JTextField();
        tfCausas = new javax.swing.JTextField();
        spNGesta = new javax.swing.JSpinner();
        spNAbortos = new javax.swing.JSpinner();
        spPesoAlNacer = new javax.swing.JSpinner();
        tfNeonato = new javax.swing.JTextField();
        tfMeses = new javax.swing.JTextField();
        tfParto = new javax.swing.JTextField();
        tfTallaAlNacer = new javax.swing.JTextField();
        tfApgar = new javax.swing.JTextField();
        tfEmbarazo = new javax.swing.JTextField();
        tfCirCef = new javax.swing.JTextField();
        tfCausaCesarea = new javax.swing.JTextField();
        pnBanner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnPag2 = new javax.swing.JPanel();
        btEsqBasVacun = new javax.swing.JButton();
        pnComandos2 = new javax.swing.JPanel();
        btPrint2 = new javax.swing.JButton();
        btGuardar2 = new javax.swing.JButton();
        btCerrar2 = new javax.swing.JButton();
        pnContent2 = new javax.swing.JPanel();
        pnAntecFamHered = new javax.swing.JPanel();
        lbSecAntecFam = new javax.swing.JLabel();
        pnMadre = new javax.swing.JPanel();
        lbNameMom = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lbPesoM = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lbEdadM = new javax.swing.JLabel();
        lbSaludM = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lbNumPartos = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lbEscolaridadM = new javax.swing.JLabel();
        lbTallaM = new javax.swing.JLabel();
        pnPadre = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lbPesoP = new javax.swing.JLabel();
        lbTallaP = new javax.swing.JLabel();
        lbEdadP = new javax.swing.JLabel();
        lbNamePap = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lbSaludP = new javax.swing.JLabel();
        lbEscolaridadP = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pnAntecFam = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lbContacTB = new javax.swing.JLabel();
        lbDiabetes = new javax.swing.JLabel();
        lbOtrosAntec = new javax.swing.JLabel();
        lbHnos = new javax.swing.JLabel();
        lbTuberculosis = new javax.swing.JLabel();
        lbAlegria = new javax.swing.JLabel();
        lbConvulsiones = new javax.swing.JLabel();
        btEditPadres = new javax.swing.JButton();
        pnPatologicos = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taPatalogicos = new javax.swing.JTextArea();
        pnPag3 = new javax.swing.JPanel();
        pnComandos3 = new javax.swing.JPanel();
        btGuardar3 = new javax.swing.JButton();
        btCerrar3 = new javax.swing.JButton();
        btPrint3 = new javax.swing.JButton();
        pnContent3 = new javax.swing.JPanel();
        pnEnfermedades = new javax.swing.JPanel();
        lbSecEnferm = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        btEnfermedades = new javax.swing.JButton();
        lbTosfer = new javax.swing.JLabel();
        lbSaramp = new javax.swing.JLabel();
        lbRube = new javax.swing.JLabel();
        lbPaper = new javax.swing.JLabel();
        lbVaric = new javax.swing.JLabel();
        lbEscarlat = new javax.swing.JLabel();
        lbDifteria = new javax.swing.JLabel();
        lbOperac = new javax.swing.JLabel();
        lbAmebiasis = new javax.swing.JLabel();
        lbApendic = new javax.swing.JLabel();
        lbFiebReum = new javax.swing.JLabel();
        lbOtit = new javax.swing.JLabel();
        lbIRS = new javax.swing.JLabel();
        lbAmigdal = new javax.swing.JLabel();
        lbConvuls = new javax.swing.JLabel();
        lbConstipac = new javax.swing.JLabel();
        lbDiarrea = new javax.swing.JLabel();
        pnHistAliment = new javax.swing.JPanel();
        lbSecHistAlim = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        btHistAlim = new javax.swing.JButton();
        lbPech = new javax.swing.JLabel();
        lbAblac = new javax.swing.JLabel();
        lbVitam = new javax.swing.JLabel();
        lbDiet = new javax.swing.JLabel();
        lbVomi = new javax.swing.JLabel();
        lbAlerg = new javax.swing.JLabel();
        lbOtro = new javax.swing.JLabel();
        lbEvolDes = new javax.swing.JLabel();
        lbSento = new javax.swing.JLabel();
        lbCamino = new javax.swing.JLabel();
        lbFrasesCort = new javax.swing.JLabel();
        lbEsfint = new javax.swing.JLabel();
        lbPadec = new javax.swing.JLabel();
        lbDurac = new javax.swing.JLabel();
        lbAlimB = new javax.swing.JLabel();
        lbLevanto = new javax.swing.JLabel();
        lbPrimerPal = new javax.swing.JLabel();
        lbPrimerDient = new javax.swing.JLabel();
        lbRecto = new javax.swing.JLabel();
        pnPag4 = new javax.swing.JPanel();
        pnComandos4 = new javax.swing.JPanel();
        btCerrar4 = new javax.swing.JButton();
        btGuardar4 = new javax.swing.JButton();
        btPrint4 = new javax.swing.JButton();
        pnExamFis = new javax.swing.JPanel();
        lbExamenFis = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        lbEdad = new javax.swing.JLabel();
        tfTalla = new javax.swing.JTextField();
        tfTemp = new javax.swing.JTextField();
        tfPerim = new javax.swing.JTextField();
        tfCabeza = new javax.swing.JTextField();
        tfOjos = new javax.swing.JTextField();
        tfFaring = new javax.swing.JTextField();
        tfOi2 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        tfBok = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        tfAbdom = new javax.swing.JTextField();
        tfGenit = new javax.swing.JTextField();
        tfExtremid = new javax.swing.JTextField();
        tfPiel = new javax.swing.JTextField();
        tfAdenop = new javax.swing.JTextField();
        tfRefSup = new javax.swing.JTextField();
        tfRefProf = new javax.swing.JTextField();
        tfPost = new javax.swing.JTextField();
        tfDesar = new javax.swing.JTextField();
        tfNutr = new javax.swing.JTextField();
        tfNariz = new javax.swing.JTextField();
        tfPulmon = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        tfCoraz = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        tfTorax = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        tfCuello = new javax.swing.JTextField();
        pnPag5 = new javax.swing.JPanel();
        pnExamsObserv = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        taExamLab = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        taObservaciones = new javax.swing.JTextArea();
        jLabel110 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnComandos5 = new javax.swing.JPanel();
        btPrint5 = new javax.swing.JButton();
        btGuardar5 = new javax.swing.JButton();
        btCerrar5 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Historia Clínica Pediátrica");
        setPreferredSize(new java.awt.Dimension(800, 660));
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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(700, 700));

        tabbed.setPreferredSize(new java.awt.Dimension(700, 600));

        pnPag1.setBackground(new java.awt.Color(255, 255, 255));

        pnComandos1.setBackground(new java.awt.Color(255, 255, 255));

        btPrint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrint1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnComandos1Layout = new javax.swing.GroupLayout(pnComandos1);
        pnComandos1.setLayout(pnComandos1Layout);
        pnComandos1Layout.setHorizontalGroup(
            pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos1Layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(btPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        pnComandos1Layout.setVerticalGroup(
            pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComandos1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPrint1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pnContent1.setBackground(new java.awt.Color(255, 255, 255));
        pnContent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnDatosGrales.setBackground(new java.awt.Color(255, 255, 255));
        pnDatosGrales.setMaximumSize(new java.awt.Dimension(800, 32767));
        pnDatosGrales.setPreferredSize(new java.awt.Dimension(600, 147));
        pnDatosGrales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCodeEv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCodigo.png"))); // NOI18N
        lbCodeEv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCodeEvMouseClicked(evt);
            }
        });
        pnDatosGrales.add(lbCodeEv, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 1, -1, -1));

        jLabel4.setText("Fecha de la primera consulta:");
        pnDatosGrales.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 1, -1, -1));

        jLabel5.setText("Nombre:");
        pnDatosGrales.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 25, -1, -1));

        lbNombreCompleto.setText("     ");
        pnDatosGrales.add(lbNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 25, -1, -1));

        jLabel6.setText("Fecha de nacimiento:");
        pnDatosGrales.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 45, -1, -1));

        lbFecNac.setText("     ");
        pnDatosGrales.add(lbFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 45, -1, -1));

        jLabel7.setText("Lugar de nacimiento:");
        pnDatosGrales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 45, -1, -1));

        lbLugarNac.setText("     ");
        pnDatosGrales.add(lbLugarNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 45, -1, -1));

        jLabel8.setText("Sexo:");
        pnDatosGrales.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 45, -1, -1));

        lbSexo.setText("     ");
        pnDatosGrales.add(lbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 45, -1, -1));

        jLabel9.setText("Domicilio:");
        pnDatosGrales.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 65, -1, -1));

        lbDomicilio.setText("     ");
        pnDatosGrales.add(lbDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 65, -1, -1));

        jLabel10.setText("Nombre de la madre:");
        pnDatosGrales.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 90, -1, -1));

        lbNameMad.setText("     ");
        pnDatosGrales.add(lbNameMad, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 90, -1, -1));

        lbNamePad.setText("     ");
        pnDatosGrales.add(lbNamePad, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 115, -1, -1));

        jLabel11.setText("Nombre del padre:");
        pnDatosGrales.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 115, -1, -1));

        lbF1Consulta.setText("             ");
        pnDatosGrales.add(lbF1Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 1, -1, -1));

        lbCode.setText("    ");
        pnDatosGrales.add(lbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 1, -1, -1));

        btDataGral.setText("...");
        btDataGral.setEnabled(false);
        btDataGral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDataGralActionPerformed(evt);
            }
        });
        pnDatosGrales.add(btDataGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, -1));

        pnContent1.add(pnDatosGrales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, -1));

        pnMotivo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Motivo de la consulta:");

        taMotivoConsulta.setColumns(20);
        taMotivoConsulta.setRows(5);
        jScrollPane2.setViewportView(taMotivoConsulta);

        javax.swing.GroupLayout pnMotivoLayout = new javax.swing.GroupLayout(pnMotivo);
        pnMotivo.setLayout(pnMotivoLayout);
        pnMotivoLayout.setHorizontalGroup(
            pnMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMotivoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pnMotivoLayout.setVerticalGroup(
            pnMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnContent1.add(pnMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 750, -1));

        pnAntecObstetricos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("ANTECEDENTES OBSTÉTRICOS Y GESTACIONALES");

        jLabel14.setText("Nació en:");

        jLabel15.setText("No. de Gesta:");

        jLabel16.setText("Causas:");

        jLabel17.setText("Maternidad:");

        jLabel18.setText("No. de Abortos:");

        jLabel19.setText("Meses:");

        jLabel20.setText("Parto en:");

        jLabel21.setText("Apgar:");

        jLabel22.setText("Neonato:");

        jLabel23.setText("Peso al nacer:");

        jLabel24.setText("Embarazo:");

        jLabel25.setText("Parto:");

        jLabel26.setText("Causa de la cesárea:");

        jLabel27.setText("Talla al nacer:");

        jLabel28.setText("Cir - Cef:");

        spNGesta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        spNAbortos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        spPesoAlNacer.setModel(new javax.swing.SpinnerNumberModel(0, 0, 70, 1));

        javax.swing.GroupLayout pnAntecObstetricosLayout = new javax.swing.GroupLayout(pnAntecObstetricos);
        pnAntecObstetricos.setLayout(pnAntecObstetricosLayout);
        pnAntecObstetricosLayout.setHorizontalGroup(
            pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel13))
                    .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(tfNacioEn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel17)
                        .addGap(4, 4, 4)
                        .addComponent(tfMaternidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel20)
                        .addGap(4, 4, 4)
                        .addComponent(tfPartoEn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAntecObstetricosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15)
                        .addGap(4, 4, 4)
                        .addComponent(spNGesta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel18)
                        .addGap(4, 4, 4)
                        .addComponent(spNAbortos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16)
                        .addGap(4, 4, 4)
                        .addComponent(tfCausas, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23)
                        .addGap(4, 4, 4)
                        .addComponent(spPesoAlNacer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel22)
                        .addGap(4, 4, 4)
                        .addComponent(tfNeonato, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel21)
                        .addGap(4, 4, 4)
                        .addComponent(tfApgar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel24)
                        .addGap(4, 4, 4)
                        .addComponent(tfEmbarazo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(4, 4, 4)
                                .addComponent(tfTallaAlNacer, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel28)
                                .addGap(4, 4, 4)
                                .addComponent(tfCirCef, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(4, 4, 4)
                                .addComponent(tfParto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel26)
                                .addGap(11, 11, 11)
                                .addComponent(tfCausaCesarea, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42))
        );
        pnAntecObstetricosLayout.setVerticalGroup(
            pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCausaCesarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNacioEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMaternidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPartoEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel20))))
                        .addGap(6, 6, 6)
                        .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spNGesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spNAbortos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))))
                        .addGap(6, 6, 6)
                        .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCausas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spPesoAlNacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel23))))
                        .addGap(6, 6, 6)
                        .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNeonato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfApgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEmbarazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel24))))
                        .addGap(10, 10, 10)
                        .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfParto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTallaAlNacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCirCef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnAntecObstetricosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnAntecObstetricosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnContent1.add(pnAntecObstetricos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 750, -1));

        pnBanner.setBackground(new java.awt.Color(255, 255, 255));
        pnBanner.setMaximumSize(new java.awt.Dimension(800, 32767));
        pnBanner.setPreferredSize(new java.awt.Dimension(310, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HISTORIA CLÍNICA PEDIÁTRICA");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("DATOS GENERALES");

        javax.swing.GroupLayout pnBannerLayout = new javax.swing.GroupLayout(pnBanner);
        pnBanner.setLayout(pnBannerLayout);
        pnBannerLayout.setHorizontalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        pnBannerLayout.setVerticalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnContent1.add(pnBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        javax.swing.GroupLayout pnPag1Layout = new javax.swing.GroupLayout(pnPag1);
        pnPag1.setLayout(pnPag1Layout);
        pnPag1Layout.setHorizontalGroup(
            pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnContent1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnComandos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnPag1Layout.setVerticalGroup(
            pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag1Layout.createSequentialGroup()
                .addComponent(pnContent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 1", pnPag1);

        pnPag2.setBackground(new java.awt.Color(255, 255, 255));

        btEsqBasVacun.setText("Abrir el Esquema Básico de Vacunación");
        btEsqBasVacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEsqBasVacunActionPerformed(evt);
            }
        });

        pnComandos2.setBackground(new java.awt.Color(255, 255, 255));

        btPrint2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrint2ActionPerformed(evt);
            }
        });

        btGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar2ActionPerformed(evt);
            }
        });

        btCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos2Layout = new javax.swing.GroupLayout(pnComandos2);
        pnComandos2.setLayout(pnComandos2Layout);
        pnComandos2Layout.setHorizontalGroup(
            pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos2Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(btPrint2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        pnComandos2Layout.setVerticalGroup(
            pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComandos2Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addGroup(pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPrint2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGuardar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCerrar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pnContent2.setBackground(new java.awt.Color(255, 255, 255));
        pnContent2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnAntecFamHered.setBackground(new java.awt.Color(255, 255, 255));

        lbSecAntecFam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSecAntecFam.setText("ANTECEDENTES FAMILIARES Y HEREDITARIOS");

        pnMadre.setBackground(new java.awt.Color(255, 255, 255));
        pnMadre.setPreferredSize(new java.awt.Dimension(350, 200));
        pnMadre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNameMom.setText("      ");
        pnMadre.add(lbNameMom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel44.setText("Peso:");
        pnMadre.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lbPesoM.setText("0");
        pnMadre.add(lbPesoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel48.setText("Talla:");
        pnMadre.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel50.setText("Edad:");
        pnMadre.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lbEdadM.setText("0");
        pnMadre.add(lbEdadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        pnMadre.add(lbSaludM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel38.setText("Salud:");
        pnMadre.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel46.setText("Número de partos:");
        pnMadre.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lbNumPartos.setText("0");
        pnMadre.add(lbNumPartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel52.setText("Escolaridad:");
        pnMadre.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));
        pnMadre.add(lbEscolaridadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        pnMadre.add(lbTallaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        pnPadre.setBackground(new java.awt.Color(255, 255, 255));
        pnPadre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setText("Peso:");
        pnPadre.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel49.setText("Talla:");
        pnPadre.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel51.setText("Edad:");
        pnPadre.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lbPesoP.setText("0");
        pnPadre.add(lbPesoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 20, 80, -1));
        pnPadre.add(lbTallaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 220, 10));

        lbEdadP.setText("0");
        pnPadre.add(lbEdadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 60, -1, -1));

        lbNamePap.setText("      ");
        pnPadre.add(lbNamePap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel29.setText("Salud:");
        pnPadre.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel53.setText("Escolaridad:");
        pnPadre.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
        pnPadre.add(lbSaludP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 10));
        pnPadre.add(lbEscolaridadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 250, 14));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Padre");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Madre");

        pnAntecFam.setBackground(new java.awt.Color(255, 255, 255));
        pnAntecFam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setText("Contacto T.B:");
        pnAntecFam.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel33.setText("Hermanos:");
        pnAntecFam.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel34.setText("Alegria:");
        pnAntecFam.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jLabel35.setText("Diabetes:");
        pnAntecFam.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel37.setText("Tuberculosis:");
        pnAntecFam.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel39.setText("Convulsiones:");
        pnAntecFam.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel40.setText("Otros:");
        pnAntecFam.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));
        pnAntecFam.add(lbContacTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 0, -1, -1));
        pnAntecFam.add(lbDiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 20, -1, -1));
        pnAntecFam.add(lbOtrosAntec, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 40, -1, -1));
        pnAntecFam.add(lbHnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, -1, -1));
        pnAntecFam.add(lbTuberculosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 20, -1, -1));
        pnAntecFam.add(lbAlegria, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 0, -1, -1));
        pnAntecFam.add(lbConvulsiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 20, -1, -1));

        btEditPadres.setText("...");
        btEditPadres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditPadresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAntecFamHeredLayout = new javax.swing.GroupLayout(pnAntecFamHered);
        pnAntecFamHered.setLayout(pnAntecFamHeredLayout);
        pnAntecFamHeredLayout.setHorizontalGroup(
            pnAntecFamHeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAntecFamHeredLayout.createSequentialGroup()
                .addGroup(pnAntecFamHeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnAntecFamHeredLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnAntecFam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnAntecFamHeredLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnAntecFamHeredLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel31)
                        .addGap(304, 304, 304)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditPadres, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnAntecFamHeredLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(lbSecAntecFam)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        pnAntecFamHeredLayout.setVerticalGroup(
            pnAntecFamHeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAntecFamHeredLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSecAntecFam)
                .addGap(4, 4, 4)
                .addGroup(pnAntecFamHeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnAntecFamHeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31)
                        .addComponent(jLabel30))
                    .addComponent(btEditPadres))
                .addGap(6, 6, 6)
                .addGroup(pnAntecFamHeredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnMadre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(pnPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnAntecFam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnContent2.add(pnAntecFamHered, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnPatologicos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("PATOLÓGICOS:");

        taPatalogicos.setColumns(20);
        taPatalogicos.setRows(5);
        jScrollPane3.setViewportView(taPatalogicos);

        javax.swing.GroupLayout pnPatologicosLayout = new javax.swing.GroupLayout(pnPatologicos);
        pnPatologicos.setLayout(pnPatologicosLayout);
        pnPatologicosLayout.setHorizontalGroup(
            pnPatologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPatologicosLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(pnPatologicosLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel42)
                .addContainerGap())
        );
        pnPatologicosLayout.setVerticalGroup(
            pnPatologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPatologicosLayout.createSequentialGroup()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pnContent2.add(pnPatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 724, -1));

        javax.swing.GroupLayout pnPag2Layout = new javax.swing.GroupLayout(pnPag2);
        pnPag2.setLayout(pnPag2Layout);
        pnPag2Layout.setHorizontalGroup(
            pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(btEsqBasVacun)
                .addContainerGap())
            .addGroup(pnPag2Layout.createSequentialGroup()
                .addGroup(pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnContent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        pnPag2Layout.setVerticalGroup(
            pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag2Layout.createSequentialGroup()
                .addComponent(pnContent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEsqBasVacun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 2", pnPag2);

        pnPag3.setBackground(new java.awt.Color(255, 255, 255));

        pnComandos3.setBackground(new java.awt.Color(255, 255, 255));
        pnComandos3.setPreferredSize(new java.awt.Dimension(850, 102));

        btGuardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar3ActionPerformed(evt);
            }
        });

        btCerrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar3ActionPerformed(evt);
            }
        });

        btPrint3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrint3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos3Layout = new javax.swing.GroupLayout(pnComandos3);
        pnComandos3.setLayout(pnComandos3Layout);
        pnComandos3Layout.setHorizontalGroup(
            pnComandos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos3Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(btPrint3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btGuardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btCerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        pnComandos3Layout.setVerticalGroup(
            pnComandos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btPrint3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btCerrar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btGuardar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnContent3.setBackground(new java.awt.Color(255, 255, 255));
        pnContent3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnEnfermedades.setBackground(new java.awt.Color(255, 255, 255));
        pnEnfermedades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSecEnferm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSecEnferm.setText("ENFERMEDADES");
        pnEnfermedades.add(lbSecEnferm, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 12, -1, -1));

        jLabel43.setText("Tos Ferina:");
        pnEnfermedades.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 33, -1, -1));

        jLabel45.setText("Sarampión:");
        pnEnfermedades.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 53, -1, -1));

        jLabel55.setText("Rubéola:");
        pnEnfermedades.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 73, -1, -1));

        jLabel56.setText("Papera:");
        pnEnfermedades.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 93, -1, -1));

        jLabel57.setText("Difteria:");
        pnEnfermedades.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 153, -1, -1));

        jLabel58.setText("Varicela:");
        pnEnfermedades.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 113, -1, -1));

        jLabel60.setText("Escarlatina:");
        pnEnfermedades.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 133, -1, -1));

        jLabel61.setText("Operaciones:");
        pnEnfermedades.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 173, -1, -1));

        jLabel62.setText("Amebiasis:");
        pnEnfermedades.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 193, -1, -1));

        jLabel63.setText("Apendicitis:");
        pnEnfermedades.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel64.setText("Fiebre Reumática:");
        pnEnfermedades.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel65.setText("Otitis:");
        pnEnfermedades.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jLabel66.setText("I.R.S:");
        pnEnfermedades.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel54.setText("Amigdalitis:");
        pnEnfermedades.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel68.setText("Convulsiones:");
        pnEnfermedades.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel59.setText("Constipación:");
        pnEnfermedades.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel69.setText("Diarrea:");
        pnEnfermedades.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        btEnfermedades.setText("...");
        btEnfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnfermedadesActionPerformed(evt);
            }
        });
        pnEnfermedades.add(btEnfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 1, 31, -1));
        pnEnfermedades.add(lbTosfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 33, -1, -1));
        pnEnfermedades.add(lbSaramp, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 53, -1, -1));
        pnEnfermedades.add(lbRube, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 73, -1, -1));
        pnEnfermedades.add(lbPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 93, -1, -1));
        pnEnfermedades.add(lbVaric, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 113, -1, -1));
        pnEnfermedades.add(lbEscarlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 133, -1, -1));
        pnEnfermedades.add(lbDifteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 153, -1, -1));
        pnEnfermedades.add(lbOperac, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 173, -1, -1));
        pnEnfermedades.add(lbAmebiasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 193, -1, -1));
        pnEnfermedades.add(lbApendic, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));
        pnEnfermedades.add(lbFiebReum, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));
        pnEnfermedades.add(lbOtit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));
        pnEnfermedades.add(lbIRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));
        pnEnfermedades.add(lbAmigdal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));
        pnEnfermedades.add(lbConvuls, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));
        pnEnfermedades.add(lbConstipac, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));
        pnEnfermedades.add(lbDiarrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        pnContent3.add(pnEnfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        pnHistAliment.setBackground(new java.awt.Color(255, 255, 255));
        pnHistAliment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSecHistAlim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSecHistAlim.setText("HISTORIA DE LA ALIMENTACIÓN");
        pnHistAliment.add(lbSecHistAlim, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 15, -1, -1));

        jLabel67.setText("Pecho:");
        pnHistAliment.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 41, -1, -1));

        jLabel71.setText("Ablactación:");
        pnHistAliment.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 61, -1, -1));

        jLabel72.setText("Vitaminas:");
        pnHistAliment.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 81, -1, -1));

        jLabel73.setText("Dieta actual:");
        pnHistAliment.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 101, -1, -1));

        jLabel74.setText("Vómitos:");
        pnHistAliment.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 121, -1, -1));

        jLabel75.setText("Alergias:");
        pnHistAliment.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 141, -1, -1));

        jLabel76.setText("Otros:");
        pnHistAliment.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 161, -1, -1));

        jLabel77.setText("Evolución y desarrollo:");
        pnHistAliment.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 181, -1, -1));

        jLabel78.setText("¿Se sentó?:");
        pnHistAliment.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 201, -1, -1));

        jLabel79.setText("¿Caminó?:");
        pnHistAliment.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 221, -1, -1));

        jLabel80.setText("Frases cortas:");
        pnHistAliment.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 241, -1, -1));

        jLabel81.setText("Control de esfínteres: Vejiga:");
        pnHistAliment.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 261, -1, -1));

        jLabel82.setText("Padecimiento actual:");
        pnHistAliment.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 281, -1, -1));

        jLabel83.setText("Duración:");
        pnHistAliment.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel84.setText("Alimentos blandos:");
        pnHistAliment.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel85.setText("¿Se levantó?:");
        pnHistAliment.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel86.setText("Primeras palabras:");
        pnHistAliment.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel87.setText("Primer diente:");
        pnHistAliment.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel88.setText("Recto:");
        pnHistAliment.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        btHistAlim.setText("...");
        btHistAlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHistAlimActionPerformed(evt);
            }
        });
        pnHistAliment.add(btHistAlim, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 1, 31, -1));
        pnHistAliment.add(lbPech, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 41, -1, -1));
        pnHistAliment.add(lbAblac, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 61, -1, -1));
        pnHistAliment.add(lbVitam, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 81, -1, -1));
        pnHistAliment.add(lbDiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 101, -1, -1));
        pnHistAliment.add(lbVomi, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 121, -1, -1));
        pnHistAliment.add(lbAlerg, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 141, -1, -1));
        pnHistAliment.add(lbOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 161, -1, -1));
        pnHistAliment.add(lbEvolDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 181, -1, -1));
        pnHistAliment.add(lbSento, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 201, -1, -1));
        pnHistAliment.add(lbCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 221, -1, -1));
        pnHistAliment.add(lbFrasesCort, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 241, -1, -1));
        pnHistAliment.add(lbEsfint, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 261, -1, -1));
        pnHistAliment.add(lbPadec, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 281, -1, -1));
        pnHistAliment.add(lbDurac, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));
        pnHistAliment.add(lbAlimB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));
        pnHistAliment.add(lbLevanto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));
        pnHistAliment.add(lbPrimerPal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));
        pnHistAliment.add(lbPrimerDient, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));
        pnHistAliment.add(lbRecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        pnContent3.add(pnHistAliment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 299));

        javax.swing.GroupLayout pnPag3Layout = new javax.swing.GroupLayout(pnPag3);
        pnPag3.setLayout(pnPag3Layout);
        pnPag3Layout.setHorizontalGroup(
            pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag3Layout.createSequentialGroup()
                .addGroup(pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnContent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnComandos3, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnPag3Layout.setVerticalGroup(
            pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag3Layout.createSequentialGroup()
                .addComponent(pnContent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 3", pnPag3);

        pnPag4.setBackground(new java.awt.Color(255, 255, 255));

        pnComandos4.setBackground(new java.awt.Color(255, 255, 255));

        btCerrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar4ActionPerformed(evt);
            }
        });

        btGuardar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar4ActionPerformed(evt);
            }
        });

        btPrint4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrint4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos4Layout = new javax.swing.GroupLayout(pnComandos4);
        pnComandos4.setLayout(pnComandos4Layout);
        pnComandos4Layout.setHorizontalGroup(
            pnComandos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos4Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(btPrint4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btGuardar4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btCerrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        pnComandos4Layout.setVerticalGroup(
            pnComandos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComandos4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnComandos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPrint4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGuardar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCerrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnExamFis.setBackground(new java.awt.Color(255, 255, 255));
        pnExamFis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbExamenFis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbExamenFis.setText("EXAMEN FÍSICO Y/O EVALUACIÓN MÉDICA");
        pnExamFis.add(lbExamenFis, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 0, -1, -1));

        jLabel113.setText("Cabeza:");
        pnExamFis.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 103, -1, -1));

        jLabel114.setText("Ojos:");
        pnExamFis.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 126, -1, -1));

        jLabel117.setText("Faringe:");
        pnExamFis.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 327, -1, -1));

        jLabel118.setText("Fecha:");
        pnExamFis.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel119.setText("Edad:");
        pnExamFis.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel120.setText("Peso:");
        pnExamFis.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel121.setText("Talla:");
        pnExamFis.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 30, -1, -1));

        jLabel122.setText("Temperatura Cº:");
        pnExamFis.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 30, -1, -1));

        jLabel123.setText("Perímetro Cefálico:");
        pnExamFis.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 30, -1, -1));
        pnExamFis.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel94.setText("Nariz:");
        pnExamFis.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 197, -1, -1));

        jLabel99.setText("Abdomen:");
        pnExamFis.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 103, -1, -1));

        jLabel100.setText("Órganos genitales:");
        pnExamFis.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 126, -1, -1));

        jLabel101.setText("Extremidades:");
        pnExamFis.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 149, -1, -1));

        jLabel102.setText("Piel:");
        pnExamFis.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 171, -1, -1));

        jLabel108.setText("Adenopatías:");
        pnExamFis.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 197, -1, -1));

        jLabel103.setText("Reflejos superficiales:");
        pnExamFis.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 223, -1, -1));

        jLabel104.setText("Reflejos profundos:");
        pnExamFis.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 249, -1, -1));

        jLabel105.setText("Postura:");
        pnExamFis.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 275, -1, -1));

        jLabel106.setText("Desarrollo:");
        pnExamFis.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 301, -1, -1));

        jLabel107.setText("Nutrición:");
        pnExamFis.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 327, -1, -1));
        pnExamFis.add(tfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 90, -1));
        pnExamFis.add(lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));
        pnExamFis.add(tfTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 50, 81, -1));
        pnExamFis.add(tfTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 107, -1));
        pnExamFis.add(tfPerim, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 50, 119, -1));
        pnExamFis.add(tfCabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 100, 262, -1));
        pnExamFis.add(tfOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 123, 276, -1));
        pnExamFis.add(tfFaring, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 194, 261, -1));
        pnExamFis.add(tfOi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 146, 271, -1));

        jLabel115.setText("Oidos:");
        pnExamFis.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 149, -1, -1));
        pnExamFis.add(tfBok, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 168, 275, -1));

        jLabel116.setText("Boca:");
        pnExamFis.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 171, -1, -1));
        pnExamFis.add(tfAbdom, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 100, 264, -1));
        pnExamFis.add(tfGenit, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 123, 222, -1));
        pnExamFis.add(tfExtremid, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 146, 244, -1));
        pnExamFis.add(tfPiel, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 168, 293, -1));
        pnExamFis.add(tfAdenop, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 194, 249, -1));
        pnExamFis.add(tfRefSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 208, -1));
        pnExamFis.add(tfRefProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 246, 218, -1));
        pnExamFis.add(tfPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 272, 272, -1));
        pnExamFis.add(tfDesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 298, 261, -1));
        pnExamFis.add(tfNutr, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 324, 267, -1));
        pnExamFis.add(tfNariz, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 324, 260, -1));
        pnExamFis.add(tfPulmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 298, 252, -1));

        jLabel98.setText("Pulmones:");
        pnExamFis.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 301, -1, -1));
        pnExamFis.add(tfCoraz, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 272, 257, -1));

        jLabel97.setText("Corazón:");
        pnExamFis.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 275, -1, -1));
        pnExamFis.add(tfTorax, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 246, 269, -1));

        jLabel96.setText("Tórax:");
        pnExamFis.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 249, -1, -1));

        jLabel95.setText("Cuello:");
        pnExamFis.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 223, -1, -1));
        pnExamFis.add(tfCuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 220, 268, -1));

        javax.swing.GroupLayout pnPag4Layout = new javax.swing.GroupLayout(pnPag4);
        pnPag4.setLayout(pnPag4Layout);
        pnPag4Layout.setHorizontalGroup(
            pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag4Layout.createSequentialGroup()
                .addGroup(pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnExamFis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnPag4Layout.setVerticalGroup(
            pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag4Layout.createSequentialGroup()
                .addComponent(pnExamFis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 249, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 4", pnPag4);

        pnPag5.setBackground(new java.awt.Color(255, 255, 255));

        pnExamsObserv.setBackground(new java.awt.Color(255, 255, 255));

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel109.setText("EXÁMENES  DE LABORATORIO Y GABINETE");

        taExamLab.setColumns(20);
        taExamLab.setRows(5);
        jScrollPane6.setViewportView(taExamLab);

        taObservaciones.setColumns(20);
        taObservaciones.setRows(5);
        jScrollPane7.setViewportView(taObservaciones);

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel110.setText("OBSERVACIONES Y RECOMENDACIONES");

        jLabel3.setText("Firma y sello del médico tratante: _________________________________");

        javax.swing.GroupLayout pnExamsObservLayout = new javax.swing.GroupLayout(pnExamsObserv);
        pnExamsObserv.setLayout(pnExamsObservLayout);
        pnExamsObservLayout.setHorizontalGroup(
            pnExamsObservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExamsObservLayout.createSequentialGroup()
                .addGroup(pnExamsObservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnExamsObservLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnExamsObservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(pnExamsObservLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel109))
                    .addGroup(pnExamsObservLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel110)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnExamsObservLayout.setVerticalGroup(
            pnExamsObservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExamsObservLayout.createSequentialGroup()
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        pnComandos5.setBackground(new java.awt.Color(255, 255, 255));

        btPrint5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrint5ActionPerformed(evt);
            }
        });

        btGuardar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar5ActionPerformed(evt);
            }
        });

        btCerrar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos5Layout = new javax.swing.GroupLayout(pnComandos5);
        pnComandos5.setLayout(pnComandos5Layout);
        pnComandos5Layout.setHorizontalGroup(
            pnComandos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos5Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(btPrint5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btGuardar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btCerrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        pnComandos5Layout.setVerticalGroup(
            pnComandos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComandos5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnComandos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPrint5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGuardar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCerrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnPag5Layout = new javax.swing.GroupLayout(pnPag5);
        pnPag5.setLayout(pnPag5Layout);
        pnPag5Layout.setHorizontalGroup(
            pnPag5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag5Layout.createSequentialGroup()
                .addGroup(pnPag5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnExamsObserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnComandos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        pnPag5Layout.setVerticalGroup(
            pnPag5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag5Layout.createSequentialGroup()
                .addComponent(pnExamsObserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 222, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 5", pnPag5);

        jScrollPane1.setViewportView(tabbed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btEditPadresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditPadresActionPerformed
        DAntecFam antcFam = new DAntecFam(JOptionPane.getFrameForComponent(this), true);
        antcFam.setLocationRelativeTo(null);
        
        DAntecFam.lbMama.setText(lbNameMom.getText());
        DAntecFam.spMPeso.setValue(Integer.parseInt(lbPesoM.getText()));
        DAntecFam.tfMTalla.setText(lbTallaM.getText());
        DAntecFam.spMEdad.setValue(Integer.parseInt(lbEdadM.getText()));
        DAntecFam.tfMSalud.setText(lbSaludM.getText());
        DAntecFam.spMPartos.setValue(Integer.parseInt(lbNumPartos.getText()));
        DAntecFam.tfMEscolaridad.setText(lbEscolaridadM.getText());
        
        DAntecFam.lbPapa.setText(lbNamePap.getText());
        DAntecFam.spPPeso.setValue(Integer.parseInt(lbPesoP.getText()));
        DAntecFam.tfPTalla.setText(lbTallaP.getText());
        DAntecFam.spPEdad.setValue(Integer.parseInt(lbEdadP.getText()));
        DAntecFam.tfPSalud.setText(lbSaludP.getText());
        DAntecFam.tfPEscolaridad.setText(lbEscolaridadP.getText());
        
        DAntecFam.tfContactTB.setText(lbContacTB.getText());
        DAntecFam.tfHermanos.setText(lbHnos.getText());
        DAntecFam.tfAlegria.setText(lbAlegria.getText());
        DAntecFam.tfDiabetes.setText(lbDiabetes.getText());
        DAntecFam.tfTuberculosis.setText(lbTuberculosis.getText());
        DAntecFam.tfConvulsiones.setText(lbConvulsiones.getText());
        DAntecFam.tfOtros.setText(lbOtrosAntec.getText());
        
        antcFam.setVisible(true);
    }//GEN-LAST:event_btEditPadresActionPerformed

    private void btGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar3ActionPerformed
        D_Pediatria hcp = new D_Pediatria();
        
        if (hcp.saveEnfermedades()) {
            if (hcp.saveHistoriaAlimentacion()) {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        }
    }//GEN-LAST:event_btGuardar3ActionPerformed

    private void btCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar3ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar3ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.pedt = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void lbCodeEvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCodeEvMouseClicked
        DListadoAlumnos list = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        list.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Historia Clínica Pediátrica");
        list.setVisible(true);
    }//GEN-LAST:event_lbCodeEvMouseClicked

    private String panelPrint = "";
    private void btPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint1ActionPerformed
        panelPrint = "pnContent1";
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
    }//GEN-LAST:event_btPrint1ActionPerformed

    private void btCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar1ActionPerformed

    private void btDataGralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDataGralActionPerformed
        DDataGralesPediatria dgp = new DDataGralesPediatria(JOptionPane.getFrameForComponent(this), true);
        dgp.setLocationRelativeTo(null);
        ((JTextField)DDataGralesPediatria.datecF1Cons.getDateEditor().getUiComponent()).setText(lbF1Consulta.getText());
        DDataGralesPediatria.tfMama.setText(lbNameMad.getText());
        DDataGralesPediatria.tfPapa.setText(lbNamePad.getText());
        dgp.setVisible(true);
    }//GEN-LAST:event_btDataGralActionPerformed

    private void btGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar1ActionPerformed
        D_Pediatria hcp = new D_Pediatria();
        if (hcp.savePediatria()) {
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
            tabbed.setEnabledAt(1, true);
            tabbed.setEnabledAt(2, true);
            tabbed.setEnabledAt(3, true);
            tabbed.setEnabledAt(4, true);
        }
    }//GEN-LAST:event_btGuardar1ActionPerformed

    private void btEsqBasVacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEsqBasVacunActionPerformed
        DVacunacion vac = new DVacunacion(JOptionPane.getFrameForComponent(this), true);
        vac.setLocationRelativeTo(null);
        DVacunacion.lbName.setText(lbNombreCompleto.getText());
        vac.setVisible(true);
    }//GEN-LAST:event_btEsqBasVacunActionPerformed

    private void btPrint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint2ActionPerformed
        panelPrint = "pnContent2";
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
    }//GEN-LAST:event_btPrint2ActionPerformed

    private void btGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar2ActionPerformed
        D_Pediatria hcp = new D_Pediatria();
        if (hcp.saveAntecPadre()) {
            if (hcp.saveAntecMadre()) {
                if (hcp.saveAntecFam()) {
                    JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
                }
            }
        }
    }//GEN-LAST:event_btGuardar2ActionPerformed

    private void btCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar2ActionPerformed

    private void btEnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnfermedadesActionPerformed
        DEnfermedades denf = new DEnfermedades(JOptionPane.getFrameForComponent(this), true);
        denf.setLocationRelativeTo(null);
        
        DEnfermedades.tfTosFerina.setText(lbTosfer.getText());
        DEnfermedades.tfSaram.setText(lbSaramp.getText());
        DEnfermedades.tfRubeol.setText(lbRube.getText());
        DEnfermedades.tfPaper.setText(lbPaper.getText());
        DEnfermedades.tfVaric.setText(lbVaric.getText());
        DEnfermedades.tfEscarlat.setText(lbEscarlat.getText());
        DEnfermedades.tfDifter.setText(lbDifteria.getText());
        DEnfermedades.tfOperac.setText(lbOperac.getText());
        DEnfermedades.tfAmebias.setText(lbAmebiasis.getText());
        DEnfermedades.tfApendic.setText(lbApendic.getText());
        DEnfermedades.tfFiebReum.setText(lbFiebReum.getText());
        DEnfermedades.tfOtitis.setText(lbOtit.getText());
        DEnfermedades.tfIRS.setText(lbIRS.getText());
        DEnfermedades.tfAmigdal.setText(lbAmigdal.getText());
        DEnfermedades.tfConvuls.setText(lbConvuls.getText());
        DEnfermedades.tfConstipac.setText(lbConstipac.getText());
        DEnfermedades.tfDiarrea.setText(lbDiarrea.getText());
        
        denf.setVisible(true);
    }//GEN-LAST:event_btEnfermedadesActionPerformed

    private void btHistAlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHistAlimActionPerformed
        DHistAlim dhistalim = new DHistAlim(JOptionPane.getFrameForComponent(this), true);
        dhistalim.setLocationRelativeTo(null);
        
        DHistAlim.tfPech.setText(lbPech.getText());
        DHistAlim.tfAblac.setText(lbAblac.getText());
        DHistAlim.tfVitam.setText(lbVitam.getText());
        DHistAlim.tfDieta.setText(lbDiet.getText());
        DHistAlim.tfVomi.setText(lbVomi.getText());
        DHistAlim.tfAlerg.setText(lbAlerg.getText());
        DHistAlim.tfOtro.setText(lbOtro.getText());
        DHistAlim.tfEvol.setText(lbEvolDes.getText());
        DHistAlim.tfSento.setText(lbSento.getText());
        DHistAlim.tfCamino.setText(lbCamino.getText());
        DHistAlim.tfFrases.setText(lbFrasesCort.getText());
        DHistAlim.tfEsfinter.setText(lbEsfint.getText());
        DHistAlim.tfPadec.setText(lbPadec.getText());
        DHistAlim.tfDurac.setText(lbDurac.getText());
        DHistAlim.tfAlimB.setText(lbAlimB.getText());
        DHistAlim.tfLevanto.setText(lbLevanto.getText());
        DHistAlim.tfPrimPal.setText(lbPrimerPal.getText());
        DHistAlim.tfPrimDient.setText(lbPrimerDient.getText());
        DHistAlim.tfRecto.setText(lbRecto.getText());
        
        dhistalim.setVisible(true);
    }//GEN-LAST:event_btHistAlimActionPerformed

    private void btPrint3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint3ActionPerformed
        panelPrint = "pnContent3";
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
    }//GEN-LAST:event_btPrint3ActionPerformed

    private void btCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar4ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar4ActionPerformed

    private void btGuardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar4ActionPerformed
        D_Pediatria hcp = new D_Pediatria();
        if (hcp.saveExamenFisico()) {
            JOptionPane.showMessageDialog(null, "Datos guardados satisfactoriamente.");
        }
    }//GEN-LAST:event_btGuardar4ActionPerformed

    private void btPrint4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint4ActionPerformed
        panelPrint = "pnContent4";
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
    }//GEN-LAST:event_btPrint4ActionPerformed

    private void btPrint5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint5ActionPerformed
        panelPrint = "pnContent5";
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
    }//GEN-LAST:event_btPrint5ActionPerformed

    private void btGuardar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar5ActionPerformed
        D_Pediatria dhcp = new D_Pediatria();
        dhcp.updatePediatria();
        JOptionPane.showMessageDialog(null, "Datos guardados satisfactoriamente.");
    }//GEN-LAST:event_btGuardar5ActionPerformed

    private void btCerrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar5ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar5ActionPerformed
    
    public static void consultarTodo(int codigo){
        D_Pediatria hcp = new D_Pediatria();

        hcp.consultaPag1(codigo);
        hcp.consultaPag2(codigo);
        hcp.consultaPag3(codigo);
        hcp.consultaPag4(codigo);
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0)
          return NO_SUCH_PAGE;

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        g2d.scale(0.65, 0.80);

        if (panelPrint.equals("pnContent1")) {
            pnContent1.printAll(graphics);
        }
        if (panelPrint.equals("pnContent2")) {
            pnContent2.printAll(graphics);
        }
        if (panelPrint.equals("pnContent3")) {
            pnContent3.printAll(graphics);
        }
        if (panelPrint.equals("pnContent4")) {
            pnExamFis.printAll(graphics);
        }
        if (panelPrint.equals("pnContent5")) {
            pnExamsObserv.printAll(graphics);
        }

        return PAGE_EXISTS;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrar1;
    private javax.swing.JButton btCerrar2;
    private javax.swing.JButton btCerrar3;
    private javax.swing.JButton btCerrar4;
    private javax.swing.JButton btCerrar5;
    public static javax.swing.JButton btDataGral;
    private javax.swing.JButton btEditPadres;
    private javax.swing.JButton btEnfermedades;
    private javax.swing.JButton btEsqBasVacun;
    public static javax.swing.JButton btGuardar1;
    public static javax.swing.JButton btGuardar2;
    private javax.swing.JButton btGuardar3;
    private javax.swing.JButton btGuardar4;
    private javax.swing.JButton btGuardar5;
    private javax.swing.JButton btHistAlim;
    private javax.swing.JButton btPrint1;
    private javax.swing.JButton btPrint2;
    private javax.swing.JButton btPrint3;
    private javax.swing.JButton btPrint4;
    private javax.swing.JButton btPrint5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public static javax.swing.JLabel lbAblac;
    public static javax.swing.JLabel lbAlegria;
    public static javax.swing.JLabel lbAlerg;
    public static javax.swing.JLabel lbAlimB;
    public static javax.swing.JLabel lbAmebiasis;
    public static javax.swing.JLabel lbAmigdal;
    public static javax.swing.JLabel lbApendic;
    public static javax.swing.JLabel lbCamino;
    public static javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbCodeEv;
    public static javax.swing.JLabel lbConstipac;
    public static javax.swing.JLabel lbContacTB;
    public static javax.swing.JLabel lbConvuls;
    public static javax.swing.JLabel lbConvulsiones;
    public static javax.swing.JLabel lbDiabetes;
    public static javax.swing.JLabel lbDiarrea;
    public static javax.swing.JLabel lbDiet;
    public static javax.swing.JLabel lbDifteria;
    public static javax.swing.JLabel lbDomicilio;
    public static javax.swing.JLabel lbDurac;
    public static javax.swing.JLabel lbEdad;
    public static javax.swing.JLabel lbEdadM;
    public static javax.swing.JLabel lbEdadP;
    public static javax.swing.JLabel lbEscarlat;
    public static javax.swing.JLabel lbEscolaridadM;
    public static javax.swing.JLabel lbEscolaridadP;
    public static javax.swing.JLabel lbEsfint;
    public static javax.swing.JLabel lbEvolDes;
    private javax.swing.JLabel lbExamenFis;
    public static javax.swing.JLabel lbF1Consulta;
    public static javax.swing.JLabel lbFecNac;
    public static javax.swing.JLabel lbFecha;
    public static javax.swing.JLabel lbFiebReum;
    public static javax.swing.JLabel lbFrasesCort;
    public static javax.swing.JLabel lbHnos;
    public static javax.swing.JLabel lbIRS;
    public static javax.swing.JLabel lbLevanto;
    public static javax.swing.JLabel lbLugarNac;
    public static javax.swing.JLabel lbNameMad;
    public static javax.swing.JLabel lbNameMom;
    public static javax.swing.JLabel lbNamePad;
    public static javax.swing.JLabel lbNamePap;
    public static javax.swing.JLabel lbNombreCompleto;
    public static javax.swing.JLabel lbNumPartos;
    public static javax.swing.JLabel lbOperac;
    public static javax.swing.JLabel lbOtit;
    public static javax.swing.JLabel lbOtro;
    public static javax.swing.JLabel lbOtrosAntec;
    public static javax.swing.JLabel lbPadec;
    public static javax.swing.JLabel lbPaper;
    public static javax.swing.JLabel lbPech;
    public static javax.swing.JLabel lbPesoM;
    public static javax.swing.JLabel lbPesoP;
    public static javax.swing.JLabel lbPrimerDient;
    public static javax.swing.JLabel lbPrimerPal;
    public static javax.swing.JLabel lbRecto;
    public static javax.swing.JLabel lbRube;
    public static javax.swing.JLabel lbSaludM;
    public static javax.swing.JLabel lbSaludP;
    public static javax.swing.JLabel lbSaramp;
    private javax.swing.JLabel lbSecAntecFam;
    private javax.swing.JLabel lbSecEnferm;
    private javax.swing.JLabel lbSecHistAlim;
    public static javax.swing.JLabel lbSento;
    public static javax.swing.JLabel lbSexo;
    public static javax.swing.JLabel lbTallaM;
    public static javax.swing.JLabel lbTallaP;
    public static javax.swing.JLabel lbTosfer;
    public static javax.swing.JLabel lbTuberculosis;
    public static javax.swing.JLabel lbVaric;
    public static javax.swing.JLabel lbVitam;
    public static javax.swing.JLabel lbVomi;
    private javax.swing.JPanel pnAntecFam;
    private javax.swing.JPanel pnAntecFamHered;
    private javax.swing.JPanel pnAntecObstetricos;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnComandos1;
    private javax.swing.JPanel pnComandos2;
    private javax.swing.JPanel pnComandos3;
    private javax.swing.JPanel pnComandos4;
    private javax.swing.JPanel pnComandos5;
    private javax.swing.JPanel pnContent1;
    private javax.swing.JPanel pnContent2;
    private javax.swing.JPanel pnContent3;
    private javax.swing.JPanel pnDatosGrales;
    private javax.swing.JPanel pnEnfermedades;
    private javax.swing.JPanel pnExamFis;
    private javax.swing.JPanel pnExamsObserv;
    private javax.swing.JPanel pnHistAliment;
    private javax.swing.JPanel pnMadre;
    private javax.swing.JPanel pnMotivo;
    private javax.swing.JPanel pnPadre;
    private javax.swing.JPanel pnPag1;
    private javax.swing.JPanel pnPag2;
    private javax.swing.JPanel pnPag3;
    private javax.swing.JPanel pnPag4;
    private javax.swing.JPanel pnPag5;
    private javax.swing.JPanel pnPatologicos;
    public static javax.swing.JSpinner spNAbortos;
    public static javax.swing.JSpinner spNGesta;
    public static javax.swing.JSpinner spPesoAlNacer;
    public static javax.swing.JTextArea taExamLab;
    public static javax.swing.JTextArea taMotivoConsulta;
    public static javax.swing.JTextArea taObservaciones;
    public static javax.swing.JTextArea taPatalogicos;
    public static javax.swing.JTabbedPane tabbed;
    public static javax.swing.JTextField tfAbdom;
    public static javax.swing.JTextField tfAdenop;
    public static javax.swing.JTextField tfApgar;
    public static javax.swing.JTextField tfBok;
    public static javax.swing.JTextField tfCabeza;
    public static javax.swing.JTextField tfCausaCesarea;
    public static javax.swing.JTextField tfCausas;
    public static javax.swing.JTextField tfCirCef;
    public static javax.swing.JTextField tfCoraz;
    public static javax.swing.JTextField tfCuello;
    public static javax.swing.JTextField tfDesar;
    public static javax.swing.JTextField tfEmbarazo;
    public static javax.swing.JTextField tfExtremid;
    public static javax.swing.JTextField tfFaring;
    public static javax.swing.JTextField tfGenit;
    public static javax.swing.JTextField tfMaternidad;
    public static javax.swing.JTextField tfMeses;
    public static javax.swing.JTextField tfNacioEn;
    public static javax.swing.JTextField tfNariz;
    public static javax.swing.JTextField tfNeonato;
    public static javax.swing.JTextField tfNutr;
    public static javax.swing.JTextField tfOi2;
    public static javax.swing.JTextField tfOjos;
    public static javax.swing.JTextField tfParto;
    public static javax.swing.JTextField tfPartoEn;
    public static javax.swing.JTextField tfPerim;
    public static javax.swing.JTextField tfPeso;
    public static javax.swing.JTextField tfPiel;
    public static javax.swing.JTextField tfPost;
    public static javax.swing.JTextField tfPulmon;
    public static javax.swing.JTextField tfRefProf;
    public static javax.swing.JTextField tfRefSup;
    public static javax.swing.JTextField tfTalla;
    public static javax.swing.JTextField tfTallaAlNacer;
    public static javax.swing.JTextField tfTemp;
    public static javax.swing.JTextField tfTorax;
    // End of variables declaration//GEN-END:variables
}