package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.D_AspectoSocial;
import modelo.D_FichaSocioEc;
import modelo.D_Login;
import sc.Conexion;
import sc.Library;
import sc.TextLimiter;

public class IFichaSocioEcon extends javax.swing.JInternalFrame implements Printable{

String letras = "[a-zA-ZñÑáéíóúÁÉÍÓÚ ]*";
Library lib = new Library();
    
Connection conx = Conexion.getSQLConnection();
PreparedStatement ps;
Statement st;
ResultSet rs;

    public IFichaSocioEcon() {
        initComponents();
        lbLugarFecha.setText("Managua, "+lib.getFechaActual());
        lbCode.requestFocus();
        lbEncuestador.setText(D_Login.getNameCU());
        
        ImageIcon img = new ImageIcon(getClass().getResource("/imgsys/LogoCompassion.jpg"));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(265, 115, Image.SCALE_SMOOTH));
        lbImg.setIcon(icono);
        this.repaint();
        
        ((JSpinner.DefaultEditor) spDormitorios.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spCuadras.getEditor()).getTextField().setEditable(false);
        
        tfHnoOtroComp.setDocument(new TextLimiter(50));
        tfNameIgl.setDocument(new TextLimiter(70));
        tfOtraDondeViv.setDocument(new TextLimiter(50));
        tfOtroComp.setDocument(new TextLimiter(50));
        tfOtroMaterial.setDocument(new TextLimiter(50));
        tfOtroNoComp.setDocument(new TextLimiter(50));
        tfOtroTransporte.setDocument(new TextLimiter(50));
        tfProblemasCorz.setDocument(new TextLimiter(30));
        
        taObservaciones.setDocument(new TextLimiter(500));
        taRazon.setDocument(new TextLimiter(100));
        taRazonIgl.setDocument(new TextLimiter(100));
        
        tabbed.setEnabledAt(1, false);
        tabbed.setEnabledAt(2, false);
        tabbed.setEnabledAt(3, false);
    }

    public static void Listar(){
        if (!lbCode.getText().equals("") || lbCode.getText() != null) {
            DefaultTableModel tabla = new DefaultTableModel();
            D_AspectoSocial as = new D_AspectoSocial();
            ArrayList<D_AspectoSocial> lista = as.ListarParentescos(Integer.parseInt(lbCode.getText()));
            
            tabla.addColumn("Nombre Completo");
            tabla.addColumn("Parentesco");
            tabla.addColumn("Edad");
            tabla.addColumn("Ocupación");
            tabla.addColumn("Ingreso Mensual");
            tabla.setRowCount(lista.size());

            int i = 0;

            for(D_AspectoSocial x:lista){
                tabla.setValueAt(x.getName(),i,0);
                tabla.setValueAt(x.getParent(),i,1);
                tabla.setValueAt(x.getEdad(),i,2);
                tabla.setValueAt(x.getOcupacion(),i,3);
                tabla.setValueAt(x.getSalario(),i,4);
                i++;
            }
            tblParentesco.setModel(tabla);
            
            tblParentesco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tblParentesco.getColumnModel().getColumn(0).setPreferredWidth(280);
            tblParentesco.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblParentesco.getColumnModel().getColumn(2).setPreferredWidth(35);
            tblParentesco.getColumnModel().getColumn(3).setPreferredWidth(235);
            tblParentesco.getColumnModel().getColumn(4).setPreferredWidth(100);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgParticipaReligion = new javax.swing.ButtonGroup();
        bgAtencionMedica = new javax.swing.ButtonGroup();
        bgTomaMedicina = new javax.swing.ButtonGroup();
        bgOtroProyecto = new javax.swing.ButtonGroup();
        bgEsteProyecto = new javax.swing.ButtonGroup();
        bgOtroProyectoNoCompas = new javax.swing.ButtonGroup();
        bgHermanosRegistrados = new javax.swing.ButtonGroup();
        bgPiePlano = new javax.swing.ButtonGroup();
        bgPieVaro = new javax.swing.ButtonGroup();
        bgPieEquino = new javax.swing.ButtonGroup();
        bgFaltaMano = new javax.swing.ButtonGroup();
        bgFaltaDedo = new javax.swing.ButtonGroup();
        bgNoMovBraz = new javax.swing.ButtonGroup();
        bgNoMovPierna = new javax.swing.ButtonGroup();
        bgNoMovMano = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabbed = new javax.swing.JTabbedPane();
        pnPag1 = new javax.swing.JPanel();
        pnComandos1 = new javax.swing.JPanel();
        btGuardar1 = new javax.swing.JButton();
        btCerrar1 = new javax.swing.JButton();
        btPrint1 = new javax.swing.JButton();
        pnContent1 = new javax.swing.JPanel();
        pnDatosGrales = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbIglesiaProj = new javax.swing.JLabel();
        lbEncuestador = new javax.swing.JLabel();
        lbLugarFecha = new javax.swing.JLabel();
        lbNameNino = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbFecNac = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        lbCodeEv = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        pnBanner = new javax.swing.JPanel();
        lbImg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnSocial = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblParentesco = new javax.swing.JTable();
        btEditRow = new javax.swing.JButton();
        btAddRow = new javax.swing.JButton();
        btDelRow = new javax.swing.JButton();
        btMsg = new javax.swing.JButton();
        pnIntegFam = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbVivenCAmbos = new javax.swing.JLabel();
        lbTutorNino = new javax.swing.JLabel();
        lbEstadoPadres = new javax.swing.JLabel();
        taRazon = new javax.swing.JTextArea();
        pnPag2 = new javax.swing.JPanel();
        pnComandos2 = new javax.swing.JPanel();
        btGuardar2 = new javax.swing.JButton();
        btCerrar2 = new javax.swing.JButton();
        btPrint2 = new javax.swing.JButton();
        pnContent2 = new javax.swing.JPanel();
        pnVivienda = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cbxDondeViv = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        cbxMaterial = new javax.swing.JComboBox();
        tfOtraDondeViv = new javax.swing.JTextField();
        tfOtroMaterial = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        spDormitorios = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        cbxTipoPiso = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        cbAgua = new javax.swing.JCheckBox();
        cbLetrina = new javax.swing.JCheckBox();
        cbAlcantarillado = new javax.swing.JCheckBox();
        cbTelf = new javax.swing.JCheckBox();
        cbLuz = new javax.swing.JCheckBox();
        cbBasura = new javax.swing.JCheckBox();
        jLabel37 = new javax.swing.JLabel();
        spCuadras = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        cbxTransporte = new javax.swing.JComboBox();
        tfOtroTransporte = new javax.swing.JTextField();
        pnEducacion = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbEducacion = new javax.swing.JLabel();
        lbNivelEdu = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbOtrosEstudios = new javax.swing.JLabel();
        lbRazon = new javax.swing.JLabel();
        pnReligion = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cbxReligion = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        tfNameIgl = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        rbSiParticReligion = new javax.swing.JRadioButton();
        rbNoParticReligion = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taRazonIgl = new javax.swing.JTextArea();
        pnPag3 = new javax.swing.JPanel();
        pnSalud = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cbxEnfermedades = new javax.swing.JComboBox();
        tfProblemasCorz = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        cbPPlano = new javax.swing.JCheckBox();
        cbPEquino = new javax.swing.JCheckBox();
        cbPVaro = new javax.swing.JCheckBox();
        cbFMano = new javax.swing.JCheckBox();
        cbFDedo = new javax.swing.JCheckBox();
        cbSordo = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        cbNoMueveBrazo = new javax.swing.JCheckBox();
        cbNoMuevePierna = new javax.swing.JCheckBox();
        cbNoMueveMano = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        rbSiAtencionMed = new javax.swing.JRadioButton();
        rbSiTomaMed = new javax.swing.JRadioButton();
        rbNoAtencionMed = new javax.swing.JRadioButton();
        rbNoTomaMed = new javax.swing.JRadioButton();
        cbDefectoHabla = new javax.swing.JCheckBox();
        cbMudo = new javax.swing.JCheckBox();
        pnOpciones = new javax.swing.JPanel();
        rbPiePlanoDer = new javax.swing.JRadioButton();
        rbPieEquinoIzq = new javax.swing.JRadioButton();
        rbPieEquinoDer = new javax.swing.JRadioButton();
        rbPieVaroDer = new javax.swing.JRadioButton();
        rbPieVaroIzq = new javax.swing.JRadioButton();
        rbFManoIzq = new javax.swing.JRadioButton();
        rbFManoDer = new javax.swing.JRadioButton();
        rbFDedoIzq = new javax.swing.JRadioButton();
        rbFDedoDer = new javax.swing.JRadioButton();
        cbOidoIzq = new javax.swing.JCheckBox();
        cbOidoDer = new javax.swing.JCheckBox();
        rbBrazoIzq = new javax.swing.JRadioButton();
        rbBrazoDer = new javax.swing.JRadioButton();
        rbPiernaIzq = new javax.swing.JRadioButton();
        rbPiernaDer = new javax.swing.JRadioButton();
        rbManoIzq = new javax.swing.JRadioButton();
        rbManoDer = new javax.swing.JRadioButton();
        rbPiePlanoIzq = new javax.swing.JRadioButton();
        pnComandos3 = new javax.swing.JPanel();
        btGuardar3 = new javax.swing.JButton();
        btCerrar3 = new javax.swing.JButton();
        btPrint3 = new javax.swing.JButton();
        pnPag4 = new javax.swing.JPanel();
        pnComandos4 = new javax.swing.JPanel();
        btGuardar4 = new javax.swing.JButton();
        btCerrar4 = new javax.swing.JButton();
        btPrint4 = new javax.swing.JButton();
        pnContent4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taObservaciones = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        rbNoOtroCompassion = new javax.swing.JRadioButton();
        rbSiOtroCompassion = new javax.swing.JRadioButton();
        tfOtroComp = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        rbNoEsteProyecto = new javax.swing.JRadioButton();
        rbSiEsteProyecto = new javax.swing.JRadioButton();
        lbProjName = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        rbNoOtroNoCompassion = new javax.swing.JRadioButton();
        rbSiOtroNoCompassion = new javax.swing.JRadioButton();
        tfOtroNoComp = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        rbNoHermanoRegistrado = new javax.swing.JRadioButton();
        rbSiHermanoRegistrado = new javax.swing.JRadioButton();
        tfHnoOtroComp = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ficha Socioeconómica");
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(900, 700));
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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 600));

        tabbed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabbed.setMaximumSize(new java.awt.Dimension(850, 225));
        tabbed.setPreferredSize(new java.awt.Dimension(900, 950));
        tabbed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedStateChanged(evt);
            }
        });

        pnPag1.setBackground(new java.awt.Color(255, 255, 255));
        pnPag1.setPreferredSize(new java.awt.Dimension(850, 225));

        pnComandos1.setBackground(new java.awt.Color(255, 255, 255));
        pnComandos1.setPreferredSize(new java.awt.Dimension(850, 102));

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

        btPrint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrint1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos1Layout = new javax.swing.GroupLayout(pnComandos1);
        pnComandos1.setLayout(pnComandos1Layout);
        pnComandos1Layout.setHorizontalGroup(
            pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(btPrint1)
                .addGap(18, 18, 18)
                .addComponent(btGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        pnComandos1Layout.setVerticalGroup(
            pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btPrint1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnContent1.setBackground(new java.awt.Color(255, 255, 255));
        pnContent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnDatosGrales.setBackground(new java.awt.Color(255, 255, 255));
        pnDatosGrales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Nombre de la Iglesia:");
        pnDatosGrales.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 1, -1, -1));

        jLabel6.setText("Encuestador:");
        pnDatosGrales.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 21, -1, -1));

        jLabel7.setText("Lugar y fecha:");
        pnDatosGrales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 21, -1, -1));

        jLabel8.setText("Nombre:");
        pnDatosGrales.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 62, -1, -1));

        jLabel9.setText("Dirección:");
        pnDatosGrales.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 82, -1, -1));

        jLabel10.setText("Fecha de nacimiento:");
        pnDatosGrales.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 102, -1, -1));

        jLabel11.setText("Sexo:");
        pnDatosGrales.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 62, -1, -1));

        jLabel12.setText("Edad:");
        pnDatosGrales.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 102, -1, -1));

        lbIglesiaProj.setText("Quinta Iglesia Bautista Galilea");
        pnDatosGrales.add(lbIglesiaProj, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 1, -1, -1));

        lbEncuestador.setText("                        ");
        pnDatosGrales.add(lbEncuestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 21, -1, -1));

        lbLugarFecha.setText("                       ");
        pnDatosGrales.add(lbLugarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 21, -1, -1));

        lbNameNino.setText("                        ");
        pnDatosGrales.add(lbNameNino, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 62, -1, -1));

        lbDireccion.setText(" ");
        pnDatosGrales.add(lbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 82, 585, -1));

        lbFecNac.setText("                 ");
        pnDatosGrales.add(lbFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 102, -1, -1));

        lbSexo.setText("             ");
        pnDatosGrales.add(lbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 62, -1, -1));

        lbEdad.setText("       ");
        pnDatosGrales.add(lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 102, -1, -1));

        lbCodeEv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCodeEv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCodigo.png"))); // NOI18N
        lbCodeEv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCodeEvMouseClicked(evt);
            }
        });
        pnDatosGrales.add(lbCodeEv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 20));
        pnDatosGrales.add(lbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 50, 12));

        pnContent1.add(pnDatosGrales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 850, -1));

        pnBanner.setBackground(new java.awt.Color(255, 255, 255));
        pnBanner.setPreferredSize(new java.awt.Dimension(850, 225));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("FICHA SOCIOECONÓMICA");

        javax.swing.GroupLayout pnBannerLayout = new javax.swing.GroupLayout(pnBanner);
        pnBanner.setLayout(pnBannerLayout);
        pnBannerLayout.setHorizontalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBannerLayout.createSequentialGroup()
                .addGap(0, 266, Short.MAX_VALUE)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        pnBannerLayout.setVerticalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addComponent(lbImg, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pnContent1.add(pnBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 143));

        pnSocial.setBackground(new java.awt.Color(255, 255, 255));
        pnSocial.setMinimumSize(new java.awt.Dimension(800, 100));
        pnSocial.setPreferredSize(new java.awt.Dimension(850, 351));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("I.- ASPECTO SOCIAL Y ECONÓMICO:");

        tblParentesco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblParentesco.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblParentesco.getTableHeader().setResizingAllowed(false);
        tblParentesco.getTableHeader().setReorderingAllowed(false);
        tblParentesco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblParentescoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblParentesco);

        btEditRow.setText("Editar");
        btEditRow.setEnabled(false);
        btEditRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditRowActionPerformed(evt);
            }
        });

        btAddRow.setText("Agregar");
        btAddRow.setEnabled(false);
        btAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddRowActionPerformed(evt);
            }
        });

        btDelRow.setText("Eliminar");
        btDelRow.setEnabled(false);
        btDelRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelRowActionPerformed(evt);
            }
        });

        btMsg.setText("...");
        btMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMsgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSocialLayout = new javax.swing.GroupLayout(pnSocial);
        pnSocial.setLayout(pnSocialLayout);
        pnSocialLayout.setHorizontalGroup(
            pnSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSocialLayout.createSequentialGroup()
                .addGroup(pnSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnSocialLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(529, 529, 529))
                    .addGroup(pnSocialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnSocialLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btAddRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btEditRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnSocialLayout.createSequentialGroup()
                                .addComponent(btDelRow)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnSocialLayout.setVerticalGroup(
            pnSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSocialLayout.createSequentialGroup()
                .addGroup(pnSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(btMsg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnSocialLayout.createSequentialGroup()
                        .addComponent(btEditRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAddRow)
                        .addGap(18, 18, 18)
                        .addComponent(btDelRow)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnContent1.add(pnSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, 340));

        pnIntegFam.setBackground(new java.awt.Color(255, 255, 255));
        pnIntegFam.setPreferredSize(new java.awt.Dimension(850, 178));

        jLabel16.setText("¿Vive el niño con ambos padres?:");

        jLabel17.setText("Si responde No, ¿Quién es el tutor?:");

        jLabel18.setText("Razón por la que el niño no vive con sus padres:");

        jLabel19.setText("Integración Familiar (Padres):");

        lbVivenCAmbos.setText("   ");

        lbTutorNino.setText("                           ");

        lbEstadoPadres.setText("                 ");

        taRazon.setColumns(20);
        taRazon.setLineWrap(true);
        taRazon.setRows(3);
        taRazon.setWrapStyleWord(true);
        taRazon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        taRazon.setEnabled(false);

        javax.swing.GroupLayout pnIntegFamLayout = new javax.swing.GroupLayout(pnIntegFam);
        pnIntegFam.setLayout(pnIntegFamLayout);
        pnIntegFamLayout.setHorizontalGroup(
            pnIntegFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIntegFamLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnIntegFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnIntegFamLayout.createSequentialGroup()
                        .addGroup(pnIntegFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(pnIntegFamLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbVivenCAmbos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnIntegFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnIntegFamLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTutorNino))
                            .addComponent(taRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnIntegFamLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEstadoPadres)))
                .addGap(31, 96, Short.MAX_VALUE))
        );
        pnIntegFamLayout.setVerticalGroup(
            pnIntegFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIntegFamLayout.createSequentialGroup()
                .addGroup(pnIntegFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(lbVivenCAmbos)
                    .addComponent(lbTutorNino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnIntegFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnIntegFamLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(60, 60, 60)
                        .addGroup(pnIntegFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lbEstadoPadres)))
                    .addComponent(taRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pnContent1.add(pnIntegFam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, 130));

        javax.swing.GroupLayout pnPag1Layout = new javax.swing.GroupLayout(pnPag1);
        pnPag1.setLayout(pnPag1Layout);
        pnPag1Layout.setHorizontalGroup(
            pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag1Layout.createSequentialGroup()
                .addGroup(pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnContent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnPag1Layout.setVerticalGroup(
            pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag1Layout.createSequentialGroup()
                .addComponent(pnContent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 1", pnPag1);

        pnPag2.setBackground(new java.awt.Color(255, 255, 255));
        pnPag2.setPreferredSize(new java.awt.Dimension(850, 225));

        pnComandos2.setBackground(new java.awt.Color(255, 255, 255));
        pnComandos2.setPreferredSize(new java.awt.Dimension(850, 191));

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

        btPrint2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrint2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos2Layout = new javax.swing.GroupLayout(pnComandos2);
        pnComandos2.setLayout(pnComandos2Layout);
        pnComandos2Layout.setHorizontalGroup(
            pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos2Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(btPrint2)
                .addGap(18, 18, 18)
                .addComponent(btGuardar2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        pnComandos2Layout.setVerticalGroup(
            pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGuardar2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btPrint2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pnContent2.setBackground(new java.awt.Color(255, 255, 255));
        pnContent2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnVivienda.setBackground(new java.awt.Color(255, 255, 255));
        pnVivienda.setPreferredSize(new java.awt.Dimension(850, 100));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("III.- VIVIENDA");

        jLabel32.setText("El niño vive en:");

        cbxDondeViv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casa Propia", "Casa Alquilada", "Casa Prestada", "Otra" }));
        cbxDondeViv.setNextFocusableComponent(tfOtraDondeViv);
        cbxDondeViv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDondeVivActionPerformed(evt);
            }
        });

        jLabel33.setText("Material de construcción:");

        cbxMaterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Madera", "Ladrillo y cemento", "Adobe", "Lámino,Plástico,Cartón", "Otro" }));
        cbxMaterial.setNextFocusableComponent(tfOtroMaterial);
        cbxMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMaterialActionPerformed(evt);
            }
        });

        tfOtraDondeViv.setEnabled(false);
        tfOtraDondeViv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtraDondeVivKeyReleased(evt);
            }
        });

        tfOtroMaterial.setEnabled(false);
        tfOtroMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtroMaterialKeyReleased(evt);
            }
        });

        jLabel34.setText("¿Cuántos dormitorios tienen en la casa?");

        spDormitorios.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        jLabel35.setText("¿Tipo de piso de la casa?");

        cbxTipoPiso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ladrillo", "Cerámica", "Azulejos", "Embaldosado", "Tierra" }));

        jLabel36.setText("Servicios con que cuenta la vivienda");

        cbAgua.setBackground(new java.awt.Color(255, 255, 255));
        cbAgua.setSelected(true);
        cbAgua.setText("a) Agua potable");

        cbLetrina.setBackground(new java.awt.Color(255, 255, 255));
        cbLetrina.setSelected(true);
        cbLetrina.setText("b) Sanitario o letrina");

        cbAlcantarillado.setBackground(new java.awt.Color(255, 255, 255));
        cbAlcantarillado.setText("c) Alcantarillado");

        cbTelf.setBackground(new java.awt.Color(255, 255, 255));
        cbTelf.setText("d) Teléfono");

        cbLuz.setBackground(new java.awt.Color(255, 255, 255));
        cbLuz.setSelected(true);
        cbLuz.setText("e) Energía eléctrica");

        cbBasura.setBackground(new java.awt.Color(255, 255, 255));
        cbBasura.setSelected(true);
        cbBasura.setText("f) Recolección de basura");

        jLabel37.setText("¿Distancia de la casa del niño al Proyecto? (En cuadras):");

        spCuadras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel38.setText("¿Cómo llega hasta el Proyecto?");

        cbxTransporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Caminando", "Transporte urbano colectivo", "Vehiculo", "Otro" }));
        cbxTransporte.setNextFocusableComponent(tfOtroTransporte);
        cbxTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTransporteActionPerformed(evt);
            }
        });

        tfOtroTransporte.setEnabled(false);
        tfOtroTransporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtroTransporteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnViviendaLayout = new javax.swing.GroupLayout(pnVivienda);
        pnVivienda.setLayout(pnViviendaLayout);
        pnViviendaLayout.setHorizontalGroup(
            pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnViviendaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfOtroTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel36)
                        .addComponent(jLabel31)
                        .addGroup(pnViviendaLayout.createSequentialGroup()
                            .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfOtraDondeViv, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnViviendaLayout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxDondeViv, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnViviendaLayout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(171, 171, 171)
                            .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnViviendaLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbxTipoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnViviendaLayout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfOtroMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pnViviendaLayout.createSequentialGroup()
                            .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbAgua)
                                .addComponent(cbLetrina))
                            .addGap(61, 61, 61)
                            .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbAlcantarillado)
                                .addComponent(cbTelf))
                            .addGap(47, 47, 47)
                            .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbLuz)
                                .addComponent(cbBasura)))
                        .addGroup(pnViviendaLayout.createSequentialGroup()
                            .addComponent(jLabel37)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(spCuadras, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)
                            .addComponent(jLabel38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnViviendaLayout.setVerticalGroup(
            pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDondeViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(cbxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfOtraDondeViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOtroMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(spDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(cbxTipoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAgua)
                    .addComponent(cbAlcantarillado)
                    .addComponent(cbLuz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLetrina)
                    .addComponent(cbTelf)
                    .addComponent(cbBasura))
                .addGap(18, 18, 18)
                .addGroup(pnViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(spCuadras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(cbxTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfOtroTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pnContent2.add(pnVivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 276));

        pnEducacion.setBackground(new java.awt.Color(255, 255, 255));
        pnEducacion.setPreferredSize(new java.awt.Dimension(424, 100));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("II.- EDUCACIÓN");

        jLabel22.setText("El niño está cursando o estudiando:");

        lbEducacion.setText("             ");

        lbNivelEdu.setText("       ");

        jLabel23.setText("Otros estudios:");

        jLabel24.setText("El niño NO está estudiando. ¿Por qué?");

        lbOtrosEstudios.setText("                  ");

        lbRazon.setText("                 ");

        javax.swing.GroupLayout pnEducacionLayout = new javax.swing.GroupLayout(pnEducacion);
        pnEducacion.setLayout(pnEducacionLayout);
        pnEducacionLayout.setHorizontalGroup(
            pnEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEducacionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRazon)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20)
                    .addGroup(pnEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnEducacionLayout.createSequentialGroup()
                            .addComponent(lbEducacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNivelEdu))
                        .addGroup(pnEducacionLayout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbOtrosEstudios))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        pnEducacionLayout.setVerticalGroup(
            pnEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEducacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEducacion)
                    .addComponent(lbNivelEdu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lbOtrosEstudios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRazon)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pnContent2.add(pnEducacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 214));

        pnReligion.setBackground(new java.awt.Color(255, 255, 255));
        pnReligion.setPreferredSize(new java.awt.Dimension(424, 100));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("ASPECTO RELIGIOSO");

        jLabel26.setText("*Este punto no es limitación para que el niño sea inscrito en el CAI.");

        jLabel27.setText("Religión que profesa la familia:");

        cbxReligion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Evangélica", "Católica", "Otra", "Ninguna" }));
        cbxReligion.setNextFocusableComponent(tfNameIgl);
        cbxReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxReligionActionPerformed(evt);
            }
        });

        jLabel28.setText("Nombre de la iglesia:");

        tfNameIgl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNameIglKeyReleased(evt);
            }
        });

        jLabel29.setText("¿Son participantes de esta religión?");

        rbSiParticReligion.setBackground(new java.awt.Color(255, 255, 255));
        bgParticipaReligion.add(rbSiParticReligion);
        rbSiParticReligion.setSelected(true);
        rbSiParticReligion.setText("Si");
        rbSiParticReligion.setActionCommand("Si");
        rbSiParticReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiParticReligionActionPerformed(evt);
            }
        });

        rbNoParticReligion.setBackground(new java.awt.Color(255, 255, 255));
        bgParticipaReligion.add(rbNoParticReligion);
        rbNoParticReligion.setText("No");
        rbNoParticReligion.setActionCommand("No");
        rbNoParticReligion.setNextFocusableComponent(taRazonIgl);
        rbNoParticReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoParticReligionActionPerformed(evt);
            }
        });

        jLabel30.setText("Si contestó NO, Explique:");

        taRazonIgl.setColumns(20);
        taRazonIgl.setLineWrap(true);
        taRazonIgl.setRows(3);
        taRazonIgl.setWrapStyleWord(true);
        taRazonIgl.setAutoscrolls(false);
        taRazonIgl.setEnabled(false);
        jScrollPane4.setViewportView(taRazonIgl);

        javax.swing.GroupLayout pnReligionLayout = new javax.swing.GroupLayout(pnReligion);
        pnReligion.setLayout(pnReligionLayout);
        pnReligionLayout.setHorizontalGroup(
            pnReligionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnReligionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnReligionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30)
                    .addGroup(pnReligionLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSiParticReligion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNoParticReligion))
                    .addGroup(pnReligionLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNameIgl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnReligionLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane4))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnReligionLayout.setVerticalGroup(
            pnReligionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnReligionLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnReligionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cbxReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnReligionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tfNameIgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnReligionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(rbSiParticReligion)
                    .addComponent(rbNoParticReligion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnContent2.add(pnReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 214));

        javax.swing.GroupLayout pnPag2Layout = new javax.swing.GroupLayout(pnPag2);
        pnPag2.setLayout(pnPag2Layout);
        pnPag2Layout.setHorizontalGroup(
            pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag2Layout.createSequentialGroup()
                .addGroup(pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnContent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        pnPag2Layout.setVerticalGroup(
            pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag2Layout.createSequentialGroup()
                .addComponent(pnContent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 304, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 2", pnPag2);

        pnPag3.setBackground(new java.awt.Color(255, 255, 255));
        pnPag3.setPreferredSize(new java.awt.Dimension(850, 225));

        pnSalud.setBackground(new java.awt.Color(255, 255, 255));
        pnSalud.setPreferredSize(new java.awt.Dimension(850, 100));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("IV.- ASPECTO, SALUD Y NUTRICIÓN.");

        jLabel25.setText("Elija una de las enfermedades que el niño presenta. Si es sano no seleccione ninguna. Si necesita especificar más hágalo en las Observaciones.");

        jLabel40.setText("Escriba el nombre específico de esta enfermedad:");

        cbxEnfermedades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Epilepsia", "Asma", "Hepatitis", "Alergias a comidas", "Alergia al polvo", "Bronquitis", "Miopía", "Estrabismo", "Problemas en el corazón" }));
        cbxEnfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEnfermedadesActionPerformed(evt);
            }
        });

        tfProblemasCorz.setEnabled(false);
        tfProblemasCorz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfProblemasCorzKeyReleased(evt);
            }
        });

        jLabel41.setText("Malformación congénita:");

        cbPPlano.setBackground(new java.awt.Color(255, 255, 255));
        cbPPlano.setText("Pie Plano");
        cbPPlano.setNextFocusableComponent(rbPiePlanoIzq);
        cbPPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPPlanoActionPerformed(evt);
            }
        });

        cbPEquino.setBackground(new java.awt.Color(255, 255, 255));
        cbPEquino.setText("Pie Equino");
        cbPEquino.setNextFocusableComponent(rbPieEquinoIzq);
        cbPEquino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPEquinoActionPerformed(evt);
            }
        });

        cbPVaro.setBackground(new java.awt.Color(255, 255, 255));
        cbPVaro.setText("Pie Varo");
        cbPVaro.setNextFocusableComponent(rbPieVaroIzq);
        cbPVaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPVaroActionPerformed(evt);
            }
        });

        cbFMano.setBackground(new java.awt.Color(255, 255, 255));
        cbFMano.setText("Le hace falta la mano");
        cbFMano.setNextFocusableComponent(rbFManoIzq);
        cbFMano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFManoActionPerformed(evt);
            }
        });

        cbFDedo.setBackground(new java.awt.Color(255, 255, 255));
        cbFDedo.setText("Le falta(n) dedito(s) en la mano");
        cbFDedo.setNextFocusableComponent(rbFDedoIzq);
        cbFDedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFDedoActionPerformed(evt);
            }
        });

        cbSordo.setBackground(new java.awt.Color(255, 255, 255));
        cbSordo.setText("Sordo de oído (s)");
        cbSordo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSordoActionPerformed(evt);
            }
        });

        jLabel42.setText("Lesión:");

        cbNoMueveBrazo.setBackground(new java.awt.Color(255, 255, 255));
        cbNoMueveBrazo.setText("No mueve el brazo");
        cbNoMueveBrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNoMueveBrazoActionPerformed(evt);
            }
        });

        cbNoMuevePierna.setBackground(new java.awt.Color(255, 255, 255));
        cbNoMuevePierna.setText("No mueve la pierna");
        cbNoMuevePierna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNoMuevePiernaActionPerformed(evt);
            }
        });

        cbNoMueveMano.setBackground(new java.awt.Color(255, 255, 255));
        cbNoMueveMano.setText("No mueve la mano");
        cbNoMueveMano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNoMueveManoActionPerformed(evt);
            }
        });

        jLabel43.setText("¿Recibe el niño atención médica a esta enfermedad?");

        jLabel44.setText("¿Está tomando medicina para esta enfermedad?");

        rbSiAtencionMed.setBackground(new java.awt.Color(255, 255, 255));
        bgAtencionMedica.add(rbSiAtencionMed);
        rbSiAtencionMed.setText("Si");
        rbSiAtencionMed.setActionCommand("1");

        rbSiTomaMed.setBackground(new java.awt.Color(255, 255, 255));
        bgTomaMedicina.add(rbSiTomaMed);
        rbSiTomaMed.setText("Si");
        rbSiTomaMed.setActionCommand("1");

        rbNoAtencionMed.setBackground(new java.awt.Color(255, 255, 255));
        bgAtencionMedica.add(rbNoAtencionMed);
        rbNoAtencionMed.setSelected(true);
        rbNoAtencionMed.setText("No");
        rbNoAtencionMed.setActionCommand("0");

        rbNoTomaMed.setBackground(new java.awt.Color(255, 255, 255));
        bgTomaMedicina.add(rbNoTomaMed);
        rbNoTomaMed.setSelected(true);
        rbNoTomaMed.setText("No");
        rbNoTomaMed.setActionCommand("0");

        cbDefectoHabla.setBackground(new java.awt.Color(255, 255, 255));
        cbDefectoHabla.setText("Tiene defecto al hablar");

        cbMudo.setBackground(new java.awt.Color(255, 255, 255));
        cbMudo.setText("Es mudo");

        pnOpciones.setBackground(new java.awt.Color(255, 255, 255));

        rbPiePlanoDer.setBackground(new java.awt.Color(255, 255, 255));
        bgPiePlano.add(rbPiePlanoDer);
        rbPiePlanoDer.setText("Derecho");
        rbPiePlanoDer.setActionCommand("1");
        rbPiePlanoDer.setEnabled(false);
        rbPiePlanoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPiePlanoDerActionPerformed(evt);
            }
        });

        rbPieEquinoIzq.setBackground(new java.awt.Color(255, 255, 255));
        bgPieEquino.add(rbPieEquinoIzq);
        rbPieEquinoIzq.setText("Izquierdo");
        rbPieEquinoIzq.setActionCommand("0");
        rbPieEquinoIzq.setEnabled(false);
        rbPieEquinoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPieEquinoIzqActionPerformed(evt);
            }
        });

        rbPieEquinoDer.setBackground(new java.awt.Color(255, 255, 255));
        bgPieEquino.add(rbPieEquinoDer);
        rbPieEquinoDer.setText("Derecho");
        rbPieEquinoDer.setActionCommand("1");
        rbPieEquinoDer.setEnabled(false);
        rbPieEquinoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPieEquinoDerActionPerformed(evt);
            }
        });

        rbPieVaroDer.setBackground(new java.awt.Color(255, 255, 255));
        bgPieVaro.add(rbPieVaroDer);
        rbPieVaroDer.setText("Derecho");
        rbPieVaroDer.setActionCommand("1");
        rbPieVaroDer.setEnabled(false);
        rbPieVaroDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPieVaroDerActionPerformed(evt);
            }
        });

        rbPieVaroIzq.setBackground(new java.awt.Color(255, 255, 255));
        bgPieVaro.add(rbPieVaroIzq);
        rbPieVaroIzq.setText("Izquierdo");
        rbPieVaroIzq.setActionCommand("0");
        rbPieVaroIzq.setEnabled(false);
        rbPieVaroIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPieVaroIzqActionPerformed(evt);
            }
        });

        rbFManoIzq.setBackground(new java.awt.Color(255, 255, 255));
        bgFaltaMano.add(rbFManoIzq);
        rbFManoIzq.setText("Izquierda");
        rbFManoIzq.setActionCommand("0");
        rbFManoIzq.setEnabled(false);
        rbFManoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFManoIzqActionPerformed(evt);
            }
        });

        rbFManoDer.setBackground(new java.awt.Color(255, 255, 255));
        bgFaltaMano.add(rbFManoDer);
        rbFManoDer.setText("Derecha");
        rbFManoDer.setActionCommand("1");
        rbFManoDer.setEnabled(false);
        rbFManoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFManoDerActionPerformed(evt);
            }
        });

        rbFDedoIzq.setBackground(new java.awt.Color(255, 255, 255));
        bgFaltaDedo.add(rbFDedoIzq);
        rbFDedoIzq.setText("Izquierda");
        rbFDedoIzq.setActionCommand("0");
        rbFDedoIzq.setEnabled(false);
        rbFDedoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFDedoIzqActionPerformed(evt);
            }
        });

        rbFDedoDer.setBackground(new java.awt.Color(255, 255, 255));
        bgFaltaDedo.add(rbFDedoDer);
        rbFDedoDer.setText("Derecha");
        rbFDedoDer.setActionCommand("1");
        rbFDedoDer.setEnabled(false);
        rbFDedoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFDedoDerActionPerformed(evt);
            }
        });

        cbOidoIzq.setBackground(new java.awt.Color(255, 255, 255));
        cbOidoIzq.setText("Izquierdo");
        cbOidoIzq.setActionCommand("0");
        cbOidoIzq.setEnabled(false);
        cbOidoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOidoIzqActionPerformed(evt);
            }
        });

        cbOidoDer.setBackground(new java.awt.Color(255, 255, 255));
        cbOidoDer.setText("Derecho");
        cbOidoDer.setActionCommand("1");
        cbOidoDer.setEnabled(false);
        cbOidoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOidoDerActionPerformed(evt);
            }
        });

        rbBrazoIzq.setBackground(new java.awt.Color(255, 255, 255));
        bgNoMovBraz.add(rbBrazoIzq);
        rbBrazoIzq.setText("Izquierdo");
        rbBrazoIzq.setActionCommand("0");
        rbBrazoIzq.setEnabled(false);
        rbBrazoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBrazoIzqActionPerformed(evt);
            }
        });

        rbBrazoDer.setBackground(new java.awt.Color(255, 255, 255));
        bgNoMovBraz.add(rbBrazoDer);
        rbBrazoDer.setText("Derecho");
        rbBrazoDer.setActionCommand("1");
        rbBrazoDer.setEnabled(false);
        rbBrazoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBrazoDerActionPerformed(evt);
            }
        });

        rbPiernaIzq.setBackground(new java.awt.Color(255, 255, 255));
        bgNoMovPierna.add(rbPiernaIzq);
        rbPiernaIzq.setText("Izquierda");
        rbPiernaIzq.setActionCommand("0");
        rbPiernaIzq.setEnabled(false);
        rbPiernaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPiernaIzqActionPerformed(evt);
            }
        });

        rbPiernaDer.setBackground(new java.awt.Color(255, 255, 255));
        bgNoMovPierna.add(rbPiernaDer);
        rbPiernaDer.setText("Derecha");
        rbPiernaDer.setActionCommand("1");
        rbPiernaDer.setEnabled(false);
        rbPiernaDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPiernaDerActionPerformed(evt);
            }
        });

        rbManoIzq.setBackground(new java.awt.Color(255, 255, 255));
        bgNoMovMano.add(rbManoIzq);
        rbManoIzq.setText("Izquierda");
        rbManoIzq.setActionCommand("0");
        rbManoIzq.setEnabled(false);
        rbManoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManoIzqActionPerformed(evt);
            }
        });

        rbManoDer.setBackground(new java.awt.Color(255, 255, 255));
        bgNoMovMano.add(rbManoDer);
        rbManoDer.setText("Derecha");
        rbManoDer.setActionCommand("1");
        rbManoDer.setEnabled(false);
        rbManoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManoDerActionPerformed(evt);
            }
        });

        rbPiePlanoIzq.setBackground(new java.awt.Color(255, 255, 255));
        bgPiePlano.add(rbPiePlanoIzq);
        rbPiePlanoIzq.setText("Izquierdo");
        rbPiePlanoIzq.setActionCommand("0");
        rbPiePlanoIzq.setEnabled(false);
        rbPiePlanoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPiePlanoIzqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnOpcionesLayout = new javax.swing.GroupLayout(pnOpciones);
        pnOpciones.setLayout(pnOpcionesLayout);
        pnOpcionesLayout.setHorizontalGroup(
            pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOpcionesLayout.createSequentialGroup()
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOpcionesLayout.createSequentialGroup()
                        .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFDedoIzq)
                            .addComponent(rbPieEquinoIzq)
                            .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rbFManoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(rbPieVaroIzq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbOidoIzq)
                            .addComponent(rbPiePlanoIzq, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFManoDer)
                            .addComponent(rbFDedoDer)
                            .addComponent(cbOidoDer)
                            .addComponent(rbPieVaroDer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbPieEquinoDer)
                            .addComponent(rbPiePlanoDer))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnOpcionesLayout.createSequentialGroup()
                        .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rbManoIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbPiernaIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPiernaDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbManoDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnOpcionesLayout.createSequentialGroup()
                        .addComponent(rbBrazoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbBrazoDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnOpcionesLayout.setVerticalGroup(
            pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOpcionesLayout.createSequentialGroup()
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPiePlanoDer)
                    .addComponent(rbPiePlanoIzq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPieEquinoIzq)
                    .addComponent(rbPieEquinoDer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPieVaroIzq)
                    .addComponent(rbPieVaroDer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFManoIzq)
                    .addComponent(rbFManoDer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFDedoIzq)
                    .addComponent(rbFDedoDer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOidoIzq)
                    .addComponent(cbOidoDer))
                .addGap(49, 49, 49)
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBrazoIzq)
                    .addComponent(rbBrazoDer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPiernaIzq)
                    .addComponent(rbPiernaDer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbManoIzq)
                    .addComponent(rbManoDer))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnSaludLayout = new javax.swing.GroupLayout(pnSalud);
        pnSalud.setLayout(pnSaludLayout);
        pnSaludLayout.setHorizontalGroup(
            pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaludLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSaludLayout.createSequentialGroup()
                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addComponent(cbxEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProblemasCorz))
                            .addComponent(jLabel25)
                            .addComponent(jLabel39)
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnSaludLayout.createSequentialGroup()
                                        .addComponent(rbSiTomaMed)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNoTomaMed))
                                    .addGroup(pnSaludLayout.createSequentialGroup()
                                        .addComponent(rbSiAtencionMed)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNoAtencionMed)))))
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(pnSaludLayout.createSequentialGroup()
                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(cbPVaro))
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(cbPEquino))
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(cbPPlano))
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(cbFMano))
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbNoMueveMano)
                                    .addComponent(cbNoMuevePierna)))
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDefectoHabla)
                                    .addComponent(cbMudo)
                                    .addComponent(cbSordo)
                                    .addComponent(cbNoMueveBrazo)))
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(cbFDedo))
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnSaludLayout.setVerticalGroup(
            pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaludLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(tfProblemasCorz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSaludLayout.createSequentialGroup()
                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(cbPPlano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPEquino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPVaro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFMano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFDedo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSordo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDefectoHabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNoMueveBrazo)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNoMuevePierna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNoMueveMano)
                        .addGap(18, 18, 18)
                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(rbSiAtencionMed)
                            .addComponent(rbNoAtencionMed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(rbSiTomaMed)
                            .addComponent(rbNoTomaMed)))
                    .addComponent(pnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnComandos3.setBackground(new java.awt.Color(255, 255, 255));
        pnComandos3.setPreferredSize(new java.awt.Dimension(850, 100));

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
                .addGap(262, 262, 262)
                .addComponent(btPrint3)
                .addGap(27, 27, 27)
                .addComponent(btGuardar3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(btCerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        pnComandos3Layout.setVerticalGroup(
            pnComandos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnComandos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGuardar3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btPrint3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnPag3Layout = new javax.swing.GroupLayout(pnPag3);
        pnPag3.setLayout(pnPag3Layout);
        pnPag3Layout.setHorizontalGroup(
            pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag3Layout.createSequentialGroup()
                .addGroup(pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnComandos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        pnPag3Layout.setVerticalGroup(
            pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag3Layout.createSequentialGroup()
                .addComponent(pnSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 356, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 3", pnPag3);

        pnPag4.setBackground(new java.awt.Color(255, 255, 255));
        pnPag4.setPreferredSize(new java.awt.Dimension(850, 225));

        pnComandos4.setBackground(new java.awt.Color(255, 255, 255));

        btGuardar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar4ActionPerformed(evt);
            }
        });

        btCerrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar4ActionPerformed(evt);
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
                .addGap(330, 330, 330)
                .addComponent(btPrint4)
                .addGap(18, 18, 18)
                .addComponent(btGuardar4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btCerrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        pnComandos4Layout.setVerticalGroup(
            pnComandos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComandos4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnComandos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btPrint4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGuardar4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pnContent4.setBackground(new java.awt.Color(255, 255, 255));
        pnContent4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 192));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("VI.- OBSERVACIONES.");

        jLabel54.setText("(Incluya cualquier información que considere necesaria aquí)");

        taObservaciones.setColumns(20);
        taObservaciones.setLineWrap(true);
        taObservaciones.setRows(5);
        jScrollPane5.setViewportView(taObservaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel53)
                .addGap(26, 26, 26)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnContent4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 852, 208));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(850, 221));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("V.- OTRA INFORMACIÓN.");

        jLabel46.setText("1. El niño ha participado en otro Proyecto de Compassion anteriormente:");

        rbNoOtroCompassion.setBackground(new java.awt.Color(255, 255, 255));
        bgOtroProyecto.add(rbNoOtroCompassion);
        rbNoOtroCompassion.setSelected(true);
        rbNoOtroCompassion.setText("No");
        rbNoOtroCompassion.setActionCommand("0");
        rbNoOtroCompassion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoOtroCompassionActionPerformed(evt);
            }
        });

        rbSiOtroCompassion.setBackground(new java.awt.Color(255, 255, 255));
        bgOtroProyecto.add(rbSiOtroCompassion);
        rbSiOtroCompassion.setText("Si, ¿En cuál?");
        rbSiOtroCompassion.setActionCommand("1");
        rbSiOtroCompassion.setNextFocusableComponent(tfOtroComp);
        rbSiOtroCompassion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiOtroCompassionActionPerformed(evt);
            }
        });

        tfOtroComp.setEnabled(false);
        tfOtroComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtroCompKeyReleased(evt);
            }
        });

        jLabel47.setText("2. En este Proyecto de Compassion:");

        rbNoEsteProyecto.setBackground(new java.awt.Color(255, 255, 255));
        bgEsteProyecto.add(rbNoEsteProyecto);
        rbNoEsteProyecto.setSelected(true);
        rbNoEsteProyecto.setText("No");
        rbNoEsteProyecto.setActionCommand("0");
        rbNoEsteProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoEsteProyectoActionPerformed(evt);
            }
        });

        rbSiEsteProyecto.setBackground(new java.awt.Color(255, 255, 255));
        bgEsteProyecto.add(rbSiEsteProyecto);
        rbSiEsteProyecto.setText("Si, ¿En cuál?");
        rbSiEsteProyecto.setActionCommand("1");
        rbSiEsteProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiEsteProyectoActionPerformed(evt);
            }
        });

        lbProjName.setText("      ");

        jLabel49.setText("3. El niño ha participado en otro Proyecto, no necesariamente de Compassion:");

        rbNoOtroNoCompassion.setBackground(new java.awt.Color(255, 255, 255));
        bgOtroProyectoNoCompas.add(rbNoOtroNoCompassion);
        rbNoOtroNoCompassion.setSelected(true);
        rbNoOtroNoCompassion.setText("No");
        rbNoOtroNoCompassion.setActionCommand("0");
        rbNoOtroNoCompassion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoOtroNoCompassionActionPerformed(evt);
            }
        });

        rbSiOtroNoCompassion.setBackground(new java.awt.Color(255, 255, 255));
        bgOtroProyectoNoCompas.add(rbSiOtroNoCompassion);
        rbSiOtroNoCompassion.setText("Si, ¿En cuál?");
        rbSiOtroNoCompassion.setActionCommand("1");
        rbSiOtroNoCompassion.setNextFocusableComponent(tfOtroNoComp);
        rbSiOtroNoCompassion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiOtroNoCompassionActionPerformed(evt);
            }
        });

        tfOtroNoComp.setEnabled(false);
        tfOtroNoComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtroNoCompKeyReleased(evt);
            }
        });

        jLabel50.setText("4. Alguno de los hermanos de este niño está registrado en algún Proyecto de Compassion:");

        rbNoHermanoRegistrado.setBackground(new java.awt.Color(255, 255, 255));
        bgHermanosRegistrados.add(rbNoHermanoRegistrado);
        rbNoHermanoRegistrado.setSelected(true);
        rbNoHermanoRegistrado.setText("No");
        rbNoHermanoRegistrado.setActionCommand("0");
        rbNoHermanoRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoHermanoRegistradoActionPerformed(evt);
            }
        });

        rbSiHermanoRegistrado.setBackground(new java.awt.Color(255, 255, 255));
        bgHermanosRegistrados.add(rbSiHermanoRegistrado);
        rbSiHermanoRegistrado.setText("Si, ¿En cuál?");
        rbSiHermanoRegistrado.setActionCommand("1");
        rbSiHermanoRegistrado.setNextFocusableComponent(tfHnoOtroComp);
        rbSiHermanoRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiHermanoRegistradoActionPerformed(evt);
            }
        });

        tfHnoOtroComp.setEnabled(false);
        tfHnoOtroComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfHnoOtroCompKeyReleased(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("NOTA:");

        jLabel52.setText("Si este niño está registrado en algún proyecto de Compassion, no se deberá incluir en el Registro Actual.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel52))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbNoHermanoRegistrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSiHermanoRegistrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfHnoOtroComp, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbNoOtroNoCompassion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSiOtroNoCompassion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfOtroNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbNoEsteProyecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSiEsteProyecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbProjName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(rbNoOtroCompassion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rbSiOtroCompassion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfOtroComp)))
                    .addComponent(jLabel47)
                    .addComponent(jLabel49))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel45)
                .addGap(26, 26, 26)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNoOtroCompassion)
                    .addComponent(rbSiOtroCompassion)
                    .addComponent(tfOtroComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNoEsteProyecto)
                    .addComponent(rbSiEsteProyecto)
                    .addComponent(lbProjName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNoOtroNoCompassion)
                    .addComponent(rbSiOtroNoCompassion)
                    .addComponent(tfOtroNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNoHermanoRegistrado)
                    .addComponent(rbSiHermanoRegistrado)
                    .addComponent(tfHnoOtroComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnContent4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 852, 374));

        javax.swing.GroupLayout pnPag4Layout = new javax.swing.GroupLayout(pnPag4);
        pnPag4.setLayout(pnPag4Layout);
        pnPag4Layout.setHorizontalGroup(
            pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag4Layout.createSequentialGroup()
                .addGroup(pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnContent4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        pnPag4Layout.setVerticalGroup(
            pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag4Layout.createSequentialGroup()
                .addComponent(pnContent4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 228, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 4", pnPag4);

        jScrollPane1.setViewportView(tabbed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar1ActionPerformed
        int code = Integer.parseInt(lbCode.getText());
        D_FichaSocioEc fse = new D_FichaSocioEc();
        if (fse.saveFichaSocioEc(code, lbEducacion.getText())) {
            if (fse.updateRazonNoVivenJuntos(code, taRazon.getText())) {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                tabbed.setEnabledAt(1, true);
                tabbed.setEnabledAt(2, true);
                tabbed.setEnabledAt(3, true);
            }
            
        }
        
   }//GEN-LAST:event_btGuardar1ActionPerformed

    private void btCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar1ActionPerformed

    private void btGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar2ActionPerformed
        int code = Integer.parseInt(lbCode.getText());
        D_FichaSocioEc fse = new D_FichaSocioEc();

        String dondeVive = cbxDondeViv.getSelectedItem().toString();
        if ("Otra".equals(dondeVive)) {
            dondeVive = tfOtraDondeViv.getText();
        }
        String material = cbxMaterial.getSelectedItem().toString();
        if ("Otro".equals(material)) {
            material = tfOtroMaterial.getText();
        }
        
        String trans = cbxTransporte.getSelectedItem().toString();
        if ("Otro".equals(trans)) {
            trans = tfOtroTransporte.getText();
        }
        
        int dormitorios = Integer.parseInt(spDormitorios.getValue().toString());
        
        String a,b,c,d,e,f;
        if (cbAgua.isSelected()) a = "1";
        else a = "0";
        if (cbAlcantarillado.isSelected()) b = "1";
        else b = "0";
        if (cbLuz.isSelected()) c = "1";
        else c = "0";
        if (cbLetrina.isSelected()) d = "1";
        else d = "0";
        if (cbTelf.isSelected()) e = "1";
        else e = "0";
        if (cbBasura.isSelected()) f = "1";
        else f = "0";
        String servicios = a+b+c+d+e+f;
        
        int cuadras = Integer.parseInt(spCuadras.getValue().toString());
        
        fse.saveReligion(code, cbxReligion.getSelectedItem().toString(), tfNameIgl.getText(), bgParticipaReligion.getSelection().getActionCommand(),taRazonIgl.getText());
        fse.saveVivienda(code, dondeVive, material,dormitorios, cbxTipoPiso.getSelectedItem().toString(), servicios, cuadras, trans);
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
    }//GEN-LAST:event_btGuardar2ActionPerformed

    private void btCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar2ActionPerformed

    private void btGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar3ActionPerformed
        int code = Integer.parseInt(lbCode.getText());
        D_FichaSocioEc fse = new D_FichaSocioEc();

        String pplano = "00";
        if (rbPiePlanoIzq.isSelected()) pplano = "10";
        if (rbPiePlanoDer.isSelected()) pplano = "01";
        
        String pequino = "00";
        if (rbPieEquinoIzq.isSelected()) pequino = "10";
        if (rbPieEquinoDer.isSelected()) pequino = "01";
        
        String pvaro = "00";
        if (rbPieVaroIzq.isSelected()) pvaro = "10";
        if (rbPieVaroDer.isSelected()) pvaro = "01";
        
        String faltaMano = "00";
        if (rbFManoIzq.isSelected()) faltaMano = "10";
        if (rbFManoDer.isSelected()) faltaMano = "01";
        
        String faltaDedo = "00";
        if (rbFDedoIzq.isSelected()) faltaDedo = "10";
        if (rbFDedoDer.isSelected()) faltaDedo = "01";
        
        String a,b,sordo,c,d,elhabla;
        if (cbOidoIzq.isSelected()) a = "1";
        else a = "0";
        
        if (cbOidoDer.isSelected()) b = "1";
        else b = "0";
        
        if (cbDefectoHabla.isSelected()) c = "1";
        else c = "0";
        
        if (cbMudo.isSelected()) d = "1";
        else d = "0";
        
        sordo = a+b;
        elhabla = c+d;
        
        String enfermedad = cbxEnfermedades.getSelectedItem().toString();
        
        String nMovBrz = "00";
        if (rbBrazoIzq.isSelected()) nMovBrz = "10";
        if (rbBrazoDer.isSelected()) nMovBrz = "01";

        String nMovPierna = "00";
        if (rbPiernaIzq.isSelected()) nMovPierna = "10";
        if (rbPiernaDer.isSelected()) nMovPierna = "01";
        
        String nMovMano = "00";
        if (rbManoIzq.isSelected()) nMovMano = "10";
        if (rbManoDer.isSelected()) nMovMano = "01";
        
        int recibTrat = Integer.parseInt(bgAtencionMedica.getSelection().getActionCommand());
        int tomaMed = Integer.parseInt(bgTomaMedicina.getSelection().getActionCommand());
        
        if (fse.saveAspctSaludNutr(code, enfermedad, tfProblemasCorz.getText(),pplano,pequino, 
pvaro,faltaMano,faltaDedo,sordo,elhabla,nMovBrz,nMovPierna,nMovMano,recibTrat,tomaMed)) {
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        }
    }//GEN-LAST:event_btGuardar3ActionPerformed

    private void btCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar3ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar3ActionPerformed

    private void btGuardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar4ActionPerformed
        int code = Integer.parseInt(lbCode.getText());
        D_FichaSocioEc fse = new D_FichaSocioEc();
        int bOProj = Integer.parseInt(bgOtroProyecto.getSelection().getActionCommand());
        int bEProj = Integer.parseInt(bgEsteProyecto.getSelection().getActionCommand());
        int bOProjN = Integer.parseInt(bgOtroProyectoNoCompas.getSelection().getActionCommand());
        int bHnos = Integer.parseInt(bgHermanosRegistrados.getSelection().getActionCommand());
        
        fse.saveParticipacion(code, bOProj, tfOtroComp.getText(), bEProj, bOProjN, tfOtroNoComp.getText(), bHnos, tfHnoOtroComp.getText());
        if (fse.updateObservaciones(code, taObservaciones.getText())) {
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        }
    }//GEN-LAST:event_btGuardar4ActionPerformed

    private void btCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar4ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar4ActionPerformed

    private void btEditRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditRowActionPerformed
        DAspectSocial as = new DAspectSocial(JOptionPane.getFrameForComponent(this), true);
        as.setLocationRelativeTo(null);
        DAspectSocial.lbOperacion.setText("Editando");
        
        int fila = tblParentesco.getSelectedRow();
        
        String nombre = tblParentesco.getValueAt(fila, 0).toString();
        
        DAspectSocial.lbNombre.setText(nombre);
        
        DAspectSocial.tfName1.setText(nombre);
        DAspectSocial.tfParentesco.setText(tblParentesco.getValueAt(fila, 1).toString());
        int edad = Integer.parseInt(tblParentesco.getValueAt(fila, 2).toString());
        DAspectSocial.spEdad.setValue(edad);
        
        DAspectSocial.tfOcupacion.setText(tblParentesco.getValueAt(fila, 3).toString());
        DAspectSocial.tfIngreso.setText(tblParentesco.getValueAt(fila, 4).toString());
        
        if (fila != 0) {
            DAspectSocial.tfName1.setEnabled(true);
            DAspectSocial.tfParentesco.setEnabled(true);
            DAspectSocial.spEdad.setEnabled(true);
        }else {
            DAspectSocial.tfName1.setEnabled(false);
            DAspectSocial.tfParentesco.setEnabled(false);
            DAspectSocial.spEdad.setEnabled(false);
        }
        
        as.setVisible(true);
    }//GEN-LAST:event_btEditRowActionPerformed

    private void cbxReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxReligionActionPerformed
        if (cbxReligion.getSelectedItem()=="Ninguna") {
            tfNameIgl.setText("");
            tfNameIgl.setEnabled(false);
            rbNoParticReligion.setSelected(true);
            rbSiParticReligion.setSelected(false);
            rbSiParticReligion.setEnabled(false);
            taRazonIgl.setText("");
            taRazonIgl.setEnabled(false);
        }else{
            cbxReligion.transferFocus();
            tfNameIgl.setEnabled(true);
            tfNameIgl.requestFocus();
            rbNoParticReligion.setSelected(false);
            rbSiParticReligion.setSelected(true);
            rbSiParticReligion.setEnabled(true);
            taRazonIgl.setText("");
            taRazonIgl.setEnabled(false);            
        }
    }//GEN-LAST:event_cbxReligionActionPerformed

    private void cbxDondeVivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDondeVivActionPerformed
        if (cbxDondeViv.getSelectedItem()=="Otra") {
            tfOtraDondeViv.setEnabled(true);
            cbxDondeViv.transferFocus();
        } else {
            tfOtraDondeViv.setEnabled(false);
            tfOtraDondeViv.setText("");
        }
    }//GEN-LAST:event_cbxDondeVivActionPerformed

    private void cbxMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMaterialActionPerformed
        if (cbxMaterial.getSelectedItem()=="Otro") {
            tfOtroMaterial.setEnabled(true);
            cbxMaterial.transferFocus();
        } else {
            tfOtroMaterial.setEnabled(false);
            tfOtroMaterial.setText("");
        }
    }//GEN-LAST:event_cbxMaterialActionPerformed

    private void cbxTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTransporteActionPerformed
        if (cbxTransporte.getSelectedItem()=="Otro") {
            tfOtroTransporte.setEnabled(true);
            cbxTransporte.transferFocus();
        } else {
            tfOtroTransporte.setEnabled(false);
            tfOtroTransporte.setText("");
        }
    }//GEN-LAST:event_cbxTransporteActionPerformed

    private void rbNoParticReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoParticReligionActionPerformed
        if (cbxReligion.getSelectedItem()!="Ninguna") {
            taRazonIgl.setEnabled(true);
            rbNoParticReligion.transferFocus();
        }
    }//GEN-LAST:event_rbNoParticReligionActionPerformed

    private void rbSiParticReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiParticReligionActionPerformed
        taRazonIgl.setText("");
        taRazonIgl.setEnabled(false);
    }//GEN-LAST:event_rbSiParticReligionActionPerformed

    private void cbxEnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEnfermedadesActionPerformed
        if (cbxEnfermedades.getSelectedItem()=="Problemas en el corazón") {
            tfProblemasCorz.setEnabled(true);
            cbxEnfermedades.transferFocus();
        } else {
            tfProblemasCorz.setText("");
            tfProblemasCorz.setEnabled(false);
        }
    }//GEN-LAST:event_cbxEnfermedadesActionPerformed

    private void cbPPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPPlanoActionPerformed

        if (cbPPlano.isSelected()) {
            rbPiePlanoIzq.setEnabled(true);
            rbPiePlanoDer.setEnabled(true);
        } else {
            bgPiePlano.clearSelection();
            rbPiePlanoIzq.setEnabled(false);
            rbPiePlanoDer.setEnabled(false);
        }
    }//GEN-LAST:event_cbPPlanoActionPerformed

    private void cbPEquinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPEquinoActionPerformed
        if (cbPEquino.isSelected()) {
            rbPieEquinoIzq.setEnabled(true);
            rbPieEquinoDer.setEnabled(true);
        } else {
            bgPieEquino.clearSelection();
            rbPieEquinoIzq.setEnabled(false);
            rbPieEquinoDer.setEnabled(false);           
        }
    }//GEN-LAST:event_cbPEquinoActionPerformed

    private void cbPVaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPVaroActionPerformed
        if (cbPVaro.isSelected()) {
            rbPieVaroIzq.setEnabled(true);
            rbPieVaroDer.setEnabled(true);
        } else {
            bgPieVaro.clearSelection();
            rbPieVaroIzq.setEnabled(false);
            rbPieVaroDer.setEnabled(false);
        }
    }//GEN-LAST:event_cbPVaroActionPerformed

    private void cbFManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFManoActionPerformed
        if (cbFMano.isSelected()) {
            rbFManoIzq.setEnabled(true);
            rbFManoDer.setEnabled(true);
        } else {
            bgFaltaMano.clearSelection();
            rbFManoIzq.setEnabled(false);
            rbFManoDer.setEnabled(false);
        }
    }//GEN-LAST:event_cbFManoActionPerformed

    private void cbFDedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFDedoActionPerformed
        if (cbFDedo.isSelected()) {
            rbFDedoIzq.setEnabled(true);
            rbFDedoDer.setEnabled(true);
        } else {
            bgFaltaDedo.clearSelection();
            rbFDedoIzq.setEnabled(false);
            rbFDedoDer.setEnabled(false);
        }
    }//GEN-LAST:event_cbFDedoActionPerformed

    private void cbSordoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSordoActionPerformed
        if (cbSordo.isSelected()) {
            cbOidoIzq.setEnabled(true);
            cbOidoDer.setEnabled(true);
        } else {
            cbOidoIzq.setSelected(false);
            cbOidoDer.setSelected(false);
            cbOidoIzq.setEnabled(false);
            cbOidoDer.setEnabled(false);
        }
    }//GEN-LAST:event_cbSordoActionPerformed

    private void cbNoMueveBrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNoMueveBrazoActionPerformed
        if (cbNoMueveBrazo.isSelected()) {
            rbBrazoIzq.setEnabled(true);
            rbBrazoDer.setEnabled(true);
        } else {
            bgNoMovBraz.clearSelection();
            rbBrazoIzq.setEnabled(false);
            rbBrazoDer.setEnabled(false);
        }
    }//GEN-LAST:event_cbNoMueveBrazoActionPerformed

    private void cbNoMuevePiernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNoMuevePiernaActionPerformed
        if (cbNoMuevePierna.isSelected()) {
            rbPiernaIzq.setEnabled(true);
            rbPiernaDer.setEnabled(true);
        } else {
            bgNoMovPierna.clearSelection();
            rbPiernaIzq.setEnabled(false);
            rbPiernaDer.setEnabled(false);
        }
    }//GEN-LAST:event_cbNoMuevePiernaActionPerformed

    private void cbNoMueveManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNoMueveManoActionPerformed
        if (cbNoMueveMano.isSelected()) {
            rbManoIzq.setEnabled(true);
            rbManoDer.setEnabled(true);
        } else {
            bgNoMovMano.clearSelection();
            rbManoIzq.setEnabled(false);
            rbManoDer.setEnabled(false);
        }
    }//GEN-LAST:event_cbNoMueveManoActionPerformed

    private void rbPiePlanoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPiePlanoDerActionPerformed
        if (rbPieEquinoDer.isSelected()) bgPieEquino.clearSelection();
        
        if (rbPieVaroDer.isSelected()) bgPieVaro.clearSelection();
    }//GEN-LAST:event_rbPiePlanoDerActionPerformed

    private void rbPieEquinoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPieEquinoIzqActionPerformed
        if (rbPiePlanoIzq.isSelected()) bgPiePlano.clearSelection();
        
        if (rbPieVaroIzq.isSelected()) bgPieVaro.clearSelection();
    }//GEN-LAST:event_rbPieEquinoIzqActionPerformed

    private void rbPieEquinoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPieEquinoDerActionPerformed
        if (rbPiePlanoDer.isSelected()) bgPiePlano.clearSelection();
        
        if (rbPieVaroDer.isSelected()) bgPieVaro.clearSelection();
    }//GEN-LAST:event_rbPieEquinoDerActionPerformed

    private void rbPieVaroIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPieVaroIzqActionPerformed
        if (rbPiePlanoIzq.isSelected()) bgPiePlano.clearSelection();
        
        if (rbPieEquinoIzq.isSelected()) bgPieEquino.clearSelection();
    }//GEN-LAST:event_rbPieVaroIzqActionPerformed

    private void rbPieVaroDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPieVaroDerActionPerformed
        if (rbPiePlanoDer.isSelected()) bgPiePlano.clearSelection();
        
        if (rbPieEquinoDer.isSelected()) bgPieEquino.clearSelection();
    }//GEN-LAST:event_rbPieVaroDerActionPerformed

    private void rbFManoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFManoIzqActionPerformed
        rbFManoDer.setSelected(false);
        rbFManoIzq.setSelected(true);
    }//GEN-LAST:event_rbFManoIzqActionPerformed

    private void rbFManoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFManoDerActionPerformed
        rbFManoIzq.setSelected(false);
        rbFManoDer.setSelected(true);
    }//GEN-LAST:event_rbFManoDerActionPerformed

    private void rbFDedoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFDedoIzqActionPerformed
        rbFDedoDer.setSelected(false);
        rbFDedoIzq.setSelected(true);
    }//GEN-LAST:event_rbFDedoIzqActionPerformed

    private void rbFDedoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFDedoDerActionPerformed
        rbFDedoIzq.setSelected(false);
        rbFDedoDer.setSelected(true);
    }//GEN-LAST:event_rbFDedoDerActionPerformed

    private void cbOidoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOidoDerActionPerformed
        cbSordo.setSelected(true);
    }//GEN-LAST:event_cbOidoDerActionPerformed

    private void rbBrazoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBrazoIzqActionPerformed
        rbBrazoDer.setSelected(false);
        rbBrazoIzq.setSelected(true);
    }//GEN-LAST:event_rbBrazoIzqActionPerformed

    private void rbBrazoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBrazoDerActionPerformed
        rbBrazoIzq.setSelected(false);
        rbBrazoDer.setSelected(true);
    }//GEN-LAST:event_rbBrazoDerActionPerformed

    private void rbPiernaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPiernaIzqActionPerformed
        rbPiernaDer.setSelected(false);
        rbPiernaIzq.setSelected(true);
    }//GEN-LAST:event_rbPiernaIzqActionPerformed

    private void rbPiernaDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPiernaDerActionPerformed
        rbPiernaIzq.setSelected(false);
        rbPiernaDer.setSelected(true);
    }//GEN-LAST:event_rbPiernaDerActionPerformed

    private void rbManoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManoIzqActionPerformed
        rbManoDer.setSelected(false);
        rbManoIzq.setSelected(true);
    }//GEN-LAST:event_rbManoIzqActionPerformed

    private void rbManoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManoDerActionPerformed
        rbManoIzq.setSelected(false);
        rbManoDer.setSelected(true);
    }//GEN-LAST:event_rbManoDerActionPerformed

    private void rbSiOtroCompassionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiOtroCompassionActionPerformed
        tfOtroComp.setEnabled(true);
        rbSiOtroCompassion.transferFocus();
    }//GEN-LAST:event_rbSiOtroCompassionActionPerformed

    private void rbNoOtroCompassionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoOtroCompassionActionPerformed
        tfOtroComp.setText("");
        tfOtroComp.setEnabled(false);
    }//GEN-LAST:event_rbNoOtroCompassionActionPerformed

    private void rbNoEsteProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoEsteProyectoActionPerformed
        lbProjName.setText("");
    }//GEN-LAST:event_rbNoEsteProyectoActionPerformed

    private void rbSiEsteProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiEsteProyectoActionPerformed
        lbProjName.setText("NI-126. Marcos 10:14");
    }//GEN-LAST:event_rbSiEsteProyectoActionPerformed

    private void rbNoOtroNoCompassionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoOtroNoCompassionActionPerformed
        tfOtroNoComp.setText("");
        tfOtroNoComp.setEnabled(false);
    }//GEN-LAST:event_rbNoOtroNoCompassionActionPerformed

    private void rbSiOtroNoCompassionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiOtroNoCompassionActionPerformed
        tfOtroNoComp.setEnabled(true);
        rbSiOtroNoCompassion.transferFocus();
    }//GEN-LAST:event_rbSiOtroNoCompassionActionPerformed

    private void rbNoHermanoRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoHermanoRegistradoActionPerformed
        tfHnoOtroComp.setText("");
        tfHnoOtroComp.setEnabled(false);
    }//GEN-LAST:event_rbNoHermanoRegistradoActionPerformed

    private void rbSiHermanoRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiHermanoRegistradoActionPerformed
        tfHnoOtroComp.setEnabled(true);
        rbSiHermanoRegistrado.transferFocus();
    }//GEN-LAST:event_rbSiHermanoRegistradoActionPerformed

    private void cbOidoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOidoIzqActionPerformed
        cbSordo.setSelected(true);
    }//GEN-LAST:event_cbOidoIzqActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.fichaSE = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void rbPiePlanoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPiePlanoIzqActionPerformed
        if (rbPieEquinoIzq.isSelected()) bgPieEquino.clearSelection();
        
        if (rbPieVaroIzq.isSelected()) bgPieVaro.clearSelection();
    }//GEN-LAST:event_rbPiePlanoIzqActionPerformed

    private void btAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRowActionPerformed
        DAspectSocial as = new DAspectSocial(JOptionPane.getFrameForComponent(this), true);
        as.setLocationRelativeTo(null);
        DAspectSocial.lbOperacion.setText("Nuevo");
        as.setVisible(true);
    }//GEN-LAST:event_btAddRowActionPerformed

    private void tblParentescoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParentescoMouseClicked
        btEditRow.setEnabled(true);
        btDelRow.setEnabled(true);
    }//GEN-LAST:event_tblParentescoMouseClicked

    private void lbCodeEvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCodeEvMouseClicked
        DListadoAlumnos laluf = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        laluf.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Ficha Socioeconómica");
        laluf.setVisible(true);
    }//GEN-LAST:event_lbCodeEvMouseClicked

    private void btPrint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint2ActionPerformed
        
    }//GEN-LAST:event_btPrint2ActionPerformed

private String panelPrint = "";
    private void btPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint1ActionPerformed
        panelPrint = "pnContent1";
        try {
           PrinterJob job = PrinterJob.getPrinterJob();
           job.setPrintable(this);
            boolean aceptar_impresion = job.printDialog();
             if(aceptar_impresion)
                job.print();

        } catch (PrinterException ex) {
            Logger.getLogger(IHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPrint1ActionPerformed

    private void btPrint3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPrint3ActionPerformed

    private void btPrint4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrint4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPrint4ActionPerformed

    private void btDelRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelRowActionPerformed
        int fila = tblParentesco.getSelectedRow();
        System.out.println("Es la fila numero: " + fila);
        if (fila != 0) {
            D_AspectoSocial as = new D_AspectoSocial();
            String name = tblParentesco.getValueAt(fila, 0).toString();
            String pare = tblParentesco.getValueAt(fila, 1).toString();
            
            int op = JOptionPane.showConfirmDialog(null, "¿ Está seguro(a) de eliminar a este familiar ?\n*ESTA ACCIÓN NO SE PUEDE DESHACER.","Tenga precaución en esta decisión", JOptionPane.CANCEL_OPTION);

            if (op == JOptionPane.YES_OPTION){
                as.delASocial(Integer.parseInt(lbCode.getText()),name,pare);
                Listar();
                System.out.println("Fila Eliminada: " + tblParentesco.getRowCount());
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se puede eliminar la primera fila,\nPorque es el dato del solicitante");
        }
    }//GEN-LAST:event_btDelRowActionPerformed

    private void tfNameIglKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameIglKeyReleased
        if(!tfNameIgl.getText().matches(letras)){
            tfNameIgl.setText("");
        }
    }//GEN-LAST:event_tfNameIglKeyReleased

    private void tfOtraDondeVivKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtraDondeVivKeyReleased
        if(!tfOtraDondeViv.getText().matches(letras)){
            tfOtraDondeViv.setText("");
        }
    }//GEN-LAST:event_tfOtraDondeVivKeyReleased

    private void tfOtroMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtroMaterialKeyReleased
        if(!tfOtroMaterial.getText().matches(letras)){
            tfOtroMaterial.setText("");
        }
    }//GEN-LAST:event_tfOtroMaterialKeyReleased

    private void tfOtroTransporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtroTransporteKeyReleased
        if(!tfOtroTransporte.getText().matches(letras)){
            tfOtroTransporte.setText("");
        }
    }//GEN-LAST:event_tfOtroTransporteKeyReleased

    private void tfProblemasCorzKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProblemasCorzKeyReleased
        if(!tfProblemasCorz.getText().matches(letras)){
            tfProblemasCorz.setText("");
        }
    }//GEN-LAST:event_tfProblemasCorzKeyReleased

    private void tfOtroCompKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtroCompKeyReleased
        if(!tfOtroComp.getText().matches(letras)){
            tfOtroComp.setText("");
        }
    }//GEN-LAST:event_tfOtroCompKeyReleased

    private void tfOtroNoCompKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtroNoCompKeyReleased
        if(!tfOtroNoComp.getText().matches(letras)){
            tfOtroNoComp.setText("");
        }
    }//GEN-LAST:event_tfOtroNoCompKeyReleased

    private void tfHnoOtroCompKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHnoOtroCompKeyReleased
        if(!tfHnoOtroComp.getText().matches(letras)){
            tfHnoOtroComp.setText("");
        }
    }//GEN-LAST:event_tfHnoOtroCompKeyReleased

    private void tabbedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedStateChanged

    }//GEN-LAST:event_tabbedStateChanged

    private void btMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMsgActionPerformed
        DMsgFicSociEcon msgfs = new DMsgFicSociEcon(JOptionPane.getFrameForComponent(this), true);
        msgfs.setLocationRelativeTo(null);
        msgfs.setVisible(true);
    }//GEN-LAST:event_btMsgActionPerformed

    public static void consultarTodo(int codigo){
        D_FichaSocioEc fse = new D_FichaSocioEc();

        fse.consultaPag1(codigo);
        fse.consultaPag2(codigo);
        fse.consultaPag3(codigo);
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
            pnSalud.printAll(graphics);
        }
        if (panelPrint.equals("pnContent4")) {
            pnContent4.printAll(graphics);
        }

        return PAGE_EXISTS;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAtencionMedica;
    private javax.swing.ButtonGroup bgEsteProyecto;
    private javax.swing.ButtonGroup bgFaltaDedo;
    private javax.swing.ButtonGroup bgFaltaMano;
    private javax.swing.ButtonGroup bgHermanosRegistrados;
    private javax.swing.ButtonGroup bgNoMovBraz;
    private javax.swing.ButtonGroup bgNoMovMano;
    private javax.swing.ButtonGroup bgNoMovPierna;
    private javax.swing.ButtonGroup bgOtroProyecto;
    private javax.swing.ButtonGroup bgOtroProyectoNoCompas;
    private javax.swing.ButtonGroup bgParticipaReligion;
    private javax.swing.ButtonGroup bgPieEquino;
    private javax.swing.ButtonGroup bgPiePlano;
    private javax.swing.ButtonGroup bgPieVaro;
    private javax.swing.ButtonGroup bgTomaMedicina;
    public static javax.swing.JButton btAddRow;
    private javax.swing.JButton btCerrar1;
    private javax.swing.JButton btCerrar2;
    private javax.swing.JButton btCerrar3;
    private javax.swing.JButton btCerrar4;
    public static javax.swing.JButton btDelRow;
    public static javax.swing.JButton btEditRow;
    public static javax.swing.JButton btGuardar1;
    private javax.swing.JButton btGuardar2;
    private javax.swing.JButton btGuardar3;
    private javax.swing.JButton btGuardar4;
    private javax.swing.JButton btMsg;
    private javax.swing.JButton btPrint1;
    private javax.swing.JButton btPrint2;
    private javax.swing.JButton btPrint3;
    private javax.swing.JButton btPrint4;
    public static javax.swing.JCheckBox cbAgua;
    public static javax.swing.JCheckBox cbAlcantarillado;
    public static javax.swing.JCheckBox cbBasura;
    public static javax.swing.JCheckBox cbDefectoHabla;
    public static javax.swing.JCheckBox cbFDedo;
    public static javax.swing.JCheckBox cbFMano;
    public static javax.swing.JCheckBox cbLetrina;
    public static javax.swing.JCheckBox cbLuz;
    public static javax.swing.JCheckBox cbMudo;
    public static javax.swing.JCheckBox cbNoMueveBrazo;
    public static javax.swing.JCheckBox cbNoMueveMano;
    public static javax.swing.JCheckBox cbNoMuevePierna;
    public static javax.swing.JCheckBox cbOidoDer;
    public static javax.swing.JCheckBox cbOidoIzq;
    public static javax.swing.JCheckBox cbPEquino;
    public static javax.swing.JCheckBox cbPPlano;
    public static javax.swing.JCheckBox cbPVaro;
    public static javax.swing.JCheckBox cbSordo;
    public static javax.swing.JCheckBox cbTelf;
    public static javax.swing.JComboBox cbxDondeViv;
    public static javax.swing.JComboBox cbxEnfermedades;
    public static javax.swing.JComboBox cbxMaterial;
    public static javax.swing.JComboBox cbxReligion;
    public static javax.swing.JComboBox cbxTipoPiso;
    public static javax.swing.JComboBox cbxTransporte;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbCodeEv;
    public static javax.swing.JLabel lbDireccion;
    public static javax.swing.JLabel lbEdad;
    public static javax.swing.JLabel lbEducacion;
    public static javax.swing.JLabel lbEncuestador;
    public static javax.swing.JLabel lbEstadoPadres;
    public static javax.swing.JLabel lbFecNac;
    private javax.swing.JLabel lbIglesiaProj;
    public static javax.swing.JLabel lbImg;
    public static javax.swing.JLabel lbLugarFecha;
    public static javax.swing.JLabel lbNameNino;
    public static javax.swing.JLabel lbNivelEdu;
    public static javax.swing.JLabel lbOtrosEstudios;
    public static javax.swing.JLabel lbProjName;
    public static javax.swing.JLabel lbRazon;
    public static javax.swing.JLabel lbSexo;
    public static javax.swing.JLabel lbTutorNino;
    public static javax.swing.JLabel lbVivenCAmbos;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnComandos1;
    private javax.swing.JPanel pnComandos2;
    private javax.swing.JPanel pnComandos3;
    private javax.swing.JPanel pnComandos4;
    private javax.swing.JPanel pnContent1;
    private javax.swing.JPanel pnContent2;
    private javax.swing.JPanel pnContent4;
    private javax.swing.JPanel pnDatosGrales;
    private javax.swing.JPanel pnEducacion;
    private javax.swing.JPanel pnIntegFam;
    private javax.swing.JPanel pnOpciones;
    private javax.swing.JPanel pnPag1;
    private javax.swing.JPanel pnPag2;
    private javax.swing.JPanel pnPag3;
    private javax.swing.JPanel pnPag4;
    private javax.swing.JPanel pnReligion;
    private javax.swing.JPanel pnSalud;
    private javax.swing.JPanel pnSocial;
    private javax.swing.JPanel pnVivienda;
    public static javax.swing.JRadioButton rbBrazoDer;
    public static javax.swing.JRadioButton rbBrazoIzq;
    public static javax.swing.JRadioButton rbFDedoDer;
    public static javax.swing.JRadioButton rbFDedoIzq;
    public static javax.swing.JRadioButton rbFManoDer;
    public static javax.swing.JRadioButton rbFManoIzq;
    public static javax.swing.JRadioButton rbManoDer;
    public static javax.swing.JRadioButton rbManoIzq;
    public static javax.swing.JRadioButton rbNoAtencionMed;
    public static javax.swing.JRadioButton rbNoEsteProyecto;
    public static javax.swing.JRadioButton rbNoHermanoRegistrado;
    public static javax.swing.JRadioButton rbNoOtroCompassion;
    public static javax.swing.JRadioButton rbNoOtroNoCompassion;
    public static javax.swing.JRadioButton rbNoParticReligion;
    public static javax.swing.JRadioButton rbNoTomaMed;
    public static javax.swing.JRadioButton rbPieEquinoDer;
    public static javax.swing.JRadioButton rbPieEquinoIzq;
    public static javax.swing.JRadioButton rbPiePlanoDer;
    public static javax.swing.JRadioButton rbPiePlanoIzq;
    public static javax.swing.JRadioButton rbPieVaroDer;
    public static javax.swing.JRadioButton rbPieVaroIzq;
    public static javax.swing.JRadioButton rbPiernaDer;
    public static javax.swing.JRadioButton rbPiernaIzq;
    public static javax.swing.JRadioButton rbSiAtencionMed;
    public static javax.swing.JRadioButton rbSiEsteProyecto;
    public static javax.swing.JRadioButton rbSiHermanoRegistrado;
    public static javax.swing.JRadioButton rbSiOtroCompassion;
    public static javax.swing.JRadioButton rbSiOtroNoCompassion;
    public static javax.swing.JRadioButton rbSiParticReligion;
    public static javax.swing.JRadioButton rbSiTomaMed;
    public static javax.swing.JSpinner spCuadras;
    public static javax.swing.JSpinner spDormitorios;
    public static javax.swing.JTextArea taObservaciones;
    public static javax.swing.JTextArea taRazon;
    public static javax.swing.JTextArea taRazonIgl;
    public static javax.swing.JTabbedPane tabbed;
    public static javax.swing.JTable tblParentesco;
    public static javax.swing.JTextField tfHnoOtroComp;
    public static javax.swing.JTextField tfNameIgl;
    public static javax.swing.JTextField tfOtraDondeViv;
    public static javax.swing.JTextField tfOtroComp;
    public static javax.swing.JTextField tfOtroMaterial;
    public static javax.swing.JTextField tfOtroNoComp;
    public static javax.swing.JTextField tfOtroTransporte;
    public static javax.swing.JTextField tfProblemasCorz;
    // End of variables declaration//GEN-END:variables
}