package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.D_Historia;
import modelo.D_Login;
import sc.GeneradorCodigo;
import sc.Library;
import sc.TextLimiter;

public class IHistory extends javax.swing.JInternalFrame implements Printable{

Library lib = new Library();
GeneradorCodigo gc = new GeneradorCodigo();
Connection conx;
Statement stm;
ResultSet rs;
PreparedStatement ps;
String letras = "[a-zA-ZñÑáéíóúÁÉÍÓÚ ]*";

    public IHistory() {
        initComponents();

        lbFechaHoy.setText(lib.getFechaActual());
        lbAtendedor.setText(D_Login.getNameCU());
        
        tfOtraActv.setDocument(new TextLimiter(24));
        tfOtraObl.setDocument(new TextLimiter(24));
        tfOtroInstMus.setDocument(new TextLimiter(24));
        tfOtroPasat.setDocument(new TextLimiter(24));
        tfOtraRazon.setDocument(new TextLimiter(25));
        tfOtroImped.setDocument(new TextLimiter(20));
        
        tfCEVocac.setDocument(new TextLimiter(30));
        tfCEVocac2.setDocument(new TextLimiter(30));
        tfCEAprez.setDocument(new TextLimiter(30));
        tfCEBib.setDocument(new TextLimiter(30));
        tfCEOtro.setDocument(new TextLimiter(30));
        tfCEOtro2.setDocument(new TextLimiter(30));
        tfCESec.setDocument(new TextLimiter(30));
        tfCEUniv.setDocument(new TextLimiter(30));
        tfCEUniv2.setDocument(new TextLimiter(30));
        
        tfPCImpd.setDocument(new TextLimiter(20));
        tfPCrEnf.setDocument(new TextLimiter(20));
        tfPObr.setDocument(new TextLimiter(20));
        tfPOtro.setDocument(new TextLimiter(20));
        tfMCImpd.setDocument(new TextLimiter(20));
        tfMCrEnf.setDocument(new TextLimiter(20));
        tfMObr.setDocument(new TextLimiter(20));
        tfMOtro.setDocument(new TextLimiter(20));
        
        taComentarios.setDocument(new TextLimiter(500));

        lbCode.setText(String.valueOf(gc.getLastCode()));
        
        tabbed.setEnabledAt(1, false);
        tabbed.setEnabledAt(2, false);
        tabbed.setEnabledAt(3, false);
        
        ((JTextField)datecSec.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datecUniv.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datecBib.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datecVoc.getDateEditor().getUiComponent()).setEditable(false);
        ((JTextField)datecOtro.getDateEditor().getUiComponent()).setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoIngreso = new javax.swing.ButtonGroup();
        bgTratMedico = new javax.swing.ButtonGroup();
        bgRecibMedicina = new javax.swing.ButtonGroup();
        bgAsisteEscuela = new javax.swing.ButtonGroup();
        bgNivelesEU = new javax.swing.ButtonGroup();
        bgRendimientoEscolar = new javax.swing.ButtonGroup();
        bgJuntosPadres = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabbed = new javax.swing.JTabbedPane();
        pnPag1 = new javax.swing.JPanel();
        pnComandos1 = new javax.swing.JPanel();
        btCerrar1 = new javax.swing.JButton();
        btGuardar1 = new javax.swing.JButton();
        btImprimir1 = new javax.swing.JButton();
        pnContent1 = new javax.swing.JPanel();
        pnPasatiempos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbMunecas = new javax.swing.JCheckBox();
        cbFutbol = new javax.swing.JCheckBox();
        cbBicicleta = new javax.swing.JCheckBox();
        cbCasita = new javax.swing.JCheckBox();
        cbHulla = new javax.swing.JCheckBox();
        cbBeisbol = new javax.swing.JCheckBox();
        cbCaminatas = new javax.swing.JCheckBox();
        cbMacateta = new javax.swing.JCheckBox();
        cbCanicas = new javax.swing.JCheckBox();
        cbBasket = new javax.swing.JCheckBox();
        cbNadar = new javax.swing.JCheckBox();
        cbEscondidas = new javax.swing.JCheckBox();
        cbCarros = new javax.swing.JCheckBox();
        cbVolibol = new javax.swing.JCheckBox();
        cbCorrer = new javax.swing.JCheckBox();
        cbLeer = new javax.swing.JCheckBox();
        cbArte = new javax.swing.JCheckBox();
        cbPingPong = new javax.swing.JCheckBox();
        cbSaltarSoga = new javax.swing.JCheckBox();
        cbCantar = new javax.swing.JCheckBox();
        cbMusica = new javax.swing.JCheckBox();
        cbJuegoPelota = new javax.swing.JCheckBox();
        cbContarHist = new javax.swing.JCheckBox();
        cbMusicales = new javax.swing.JCheckBox();
        tfOtroInstMus = new javax.swing.JTextField();
        cbOtrosPastDep = new javax.swing.JCheckBox();
        tfOtroPasat = new javax.swing.JTextField();
        cbJuegosGrupo = new javax.swing.JCheckBox();
        pnDatosGrales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbAtendedor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbFechaHoy = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbFecNac = new javax.swing.JLabel();
        lbSex = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbNew = new javax.swing.JRadioButton();
        rbUpd = new javax.swing.JRadioButton();
        lbCode = new javax.swing.JLabel();
        pnActividadesCrist = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbEscDominical = new javax.swing.JCheckBox();
        cbSocJovenes = new javax.swing.JCheckBox();
        cbClaseBib = new javax.swing.JCheckBox();
        cbCampamento = new javax.swing.JCheckBox();
        cbEscBibVac = new javax.swing.JCheckBox();
        cbCoro = new javax.swing.JCheckBox();
        cbOtraAct = new javax.swing.JCheckBox();
        tfOtraActv = new javax.swing.JTextField();
        pnObligaciones = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbLavaRopa = new javax.swing.JCheckBox();
        cbHuerto = new javax.swing.JCheckBox();
        cbMandados = new javax.swing.JCheckBox();
        cbCamas = new javax.swing.JCheckBox();
        cbLimpieza = new javax.swing.JCheckBox();
        cbCuidaAnimals = new javax.swing.JCheckBox();
        cbRecogeAgua = new javax.swing.JCheckBox();
        cbCuidaNinos = new javax.swing.JCheckBox();
        cbCostura = new javax.swing.JCheckBox();
        cbLena = new javax.swing.JCheckBox();
        cbEnsenaOtros = new javax.swing.JCheckBox();
        cbCVMercado = new javax.swing.JCheckBox();
        cbCocina = new javax.swing.JCheckBox();
        cbOtraObl = new javax.swing.JCheckBox();
        tfOtraObl = new javax.swing.JTextField();
        btEditDataGrales = new javax.swing.JButton();
        pnPag2 = new javax.swing.JPanel();
        pnComandos2 = new javax.swing.JPanel();
        btGuardar2 = new javax.swing.JButton();
        btCerrar2 = new javax.swing.JButton();
        btImprimir2 = new javax.swing.JButton();
        pnContent2 = new javax.swing.JPanel();
        pnSalud = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbNinguna = new javax.swing.JCheckBox();
        cbEpilepsia = new javax.swing.JCheckBox();
        cbAsma = new javax.swing.JCheckBox();
        cbPolio = new javax.swing.JCheckBox();
        cbRetardo = new javax.swing.JCheckBox();
        cbOtra = new javax.swing.JCheckBox();
        tfOtroImped = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbxColumna = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cbxPieIzq = new javax.swing.JComboBox();
        cbxPieDer = new javax.swing.JComboBox();
        cbxManoIzq = new javax.swing.JComboBox();
        cbxManoDer = new javax.swing.JComboBox();
        cbxPierIzq = new javax.swing.JComboBox();
        cbxPierDer = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        cbxBrazIzq = new javax.swing.JComboBox();
        cbxBrazDer = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        cbxHabla = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cbxOidoIzq = new javax.swing.JComboBox();
        cbxOidoDer = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cbxOjoIzq = new javax.swing.JComboBox();
        cbxOjoDer = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        rbSiTratMed = new javax.swing.JRadioButton();
        rbSiRecMed = new javax.swing.JRadioButton();
        rbNoTratMed = new javax.swing.JRadioButton();
        rbNoRecMed = new javax.swing.JRadioButton();
        pnEstudio = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        rbSiAsisteEsc = new javax.swing.JRadioButton();
        rbNoAsisteEsc = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cbxRazon = new javax.swing.JComboBox();
        tfOtraRazon = new javax.swing.JTextField();
        cbxNPreKinder = new javax.swing.JComboBox();
        cbxNKinder = new javax.swing.JComboBox();
        cbxNPrimaria = new javax.swing.JComboBox();
        cbxNBasico = new javax.swing.JComboBox();
        cbxNSecundaria = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        cbxNOtro = new javax.swing.JComboBox();
        jLabel47 = new javax.swing.JLabel();
        cbxNUniv = new javax.swing.JComboBox();
        jLabel46 = new javax.swing.JLabel();
        cbxNAprez = new javax.swing.JComboBox();
        jLabel45 = new javax.swing.JLabel();
        cbxNVocac = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        tfCEVocac = new javax.swing.JTextField();
        tfCEAprez = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        tfCEUniv = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        tfCEOtro = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        pnPag3 = new javax.swing.JPanel();
        pnComandos3 = new javax.swing.JPanel();
        btGuardar3 = new javax.swing.JButton();
        btCerrar3 = new javax.swing.JButton();
        btImprimir3 = new javax.swing.JButton();
        pnContent3 = new javax.swing.JPanel();
        pnEstudios2 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        rbRendEscBajo = new javax.swing.JRadioButton();
        rbRendEscPro = new javax.swing.JRadioButton();
        rbRendEscSob = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbSecundaria = new javax.swing.JLabel();
        lbUniversidad = new javax.swing.JLabel();
        lbEscuelaBiblica = new javax.swing.JLabel();
        lbEntrenVocac = new javax.swing.JLabel();
        lbOtroEstudio = new javax.swing.JLabel();
        datecSec = new com.toedter.calendar.JDateChooser();
        datecUniv = new com.toedter.calendar.JDateChooser();
        datecBib = new com.toedter.calendar.JDateChooser();
        datecVoc = new com.toedter.calendar.JDateChooser();
        datecOtro = new com.toedter.calendar.JDateChooser();
        tfCESec = new javax.swing.JTextField();
        tfCEUniv2 = new javax.swing.JTextField();
        tfCEBib = new javax.swing.JTextField();
        tfCEVocac2 = new javax.swing.JTextField();
        tfCEOtro2 = new javax.swing.JTextField();
        cbxMateria = new javax.swing.JComboBox();
        pnTutores = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        cbTutelaMasculina = new javax.swing.JCheckBox();
        cbTutelaFemenina = new javax.swing.JCheckBox();
        cbTutelaAjena = new javax.swing.JCheckBox();
        cbxTutorAjeno = new javax.swing.JComboBox();
        cbxTutorMasc = new javax.swing.JComboBox();
        cbxTutorFem = new javax.swing.JComboBox();
        pnECivil = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        rbJuntoSi = new javax.swing.JRadioButton();
        rbJuntoNo = new javax.swing.JRadioButton();
        rbJuntoDesco = new javax.swing.JRadioButton();
        jLabel67 = new javax.swing.JLabel();
        cbxECivil = new javax.swing.JComboBox();
        pnPadres = new javax.swing.JPanel();
        pnSoloPadre = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        cbxPadreVivo = new javax.swing.JComboBox();
        cbxPcNino = new javax.swing.JComboBox();
        cbxPImpd = new javax.swing.JComboBox();
        tfPCImpd = new javax.swing.JTextField();
        cbxPCrEnf = new javax.swing.JComboBox();
        tfPCrEnf = new javax.swing.JTextField();
        cbxPMentEnf = new javax.swing.JComboBox();
        cbxPCarc = new javax.swing.JComboBox();
        cbxPFinanz = new javax.swing.JComboBox();
        jLabel70 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        cbxMadreViva = new javax.swing.JComboBox();
        jLabel82 = new javax.swing.JLabel();
        cbxMcNino = new javax.swing.JComboBox();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        cbxMImpd = new javax.swing.JComboBox();
        jLabel85 = new javax.swing.JLabel();
        tfMCImpd = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        cbxMCrEnf = new javax.swing.JComboBox();
        jLabel87 = new javax.swing.JLabel();
        tfMCrEnf = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        cbxMMentEnf = new javax.swing.JComboBox();
        jLabel89 = new javax.swing.JLabel();
        cbxMCarc = new javax.swing.JComboBox();
        cbxMFinanz = new javax.swing.JComboBox();
        pnPag4 = new javax.swing.JPanel();
        pnComandos4 = new javax.swing.JPanel();
        btGuardar4 = new javax.swing.JButton();
        btCerrar4 = new javax.swing.JButton();
        btImprimir4 = new javax.swing.JButton();
        pnContent4 = new javax.swing.JPanel();
        pnEmpleosPad = new javax.swing.JPanel();
        pnSoloEmpleoPad = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        cbxPEmpleo = new javax.swing.JComboBox();
        cbPAgri = new javax.swing.JCheckBox();
        cbPMerc = new javax.swing.JCheckBox();
        cbPIgl = new javax.swing.JCheckBox();
        cbPProj = new javax.swing.JCheckBox();
        cbPMaes = new javax.swing.JCheckBox();
        cbPObr = new javax.swing.JCheckBox();
        cbPOtro = new javax.swing.JCheckBox();
        jLabel92 = new javax.swing.JLabel();
        tfPObr = new javax.swing.JTextField();
        tfPOtro = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        cbxMEmpleo = new javax.swing.JComboBox();
        cbMAgri = new javax.swing.JCheckBox();
        cbMMerc = new javax.swing.JCheckBox();
        cbMIgl = new javax.swing.JCheckBox();
        cbMProj = new javax.swing.JCheckBox();
        cbMMaes = new javax.swing.JCheckBox();
        cbMObr = new javax.swing.JCheckBox();
        tfMObr = new javax.swing.JTextField();
        cbMOtro = new javax.swing.JCheckBox();
        tfMOtro = new javax.swing.JTextField();
        pnNumFam = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        btENumMiemFam = new javax.swing.JButton();
        lbNHijos = new javax.swing.JLabel();
        lbNHijas = new javax.swing.JLabel();
        lbPHno = new javax.swing.JLabel();
        lbSHno = new javax.swing.JLabel();
        pnComent = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        taComentarios = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Historia del Niño");
        setPreferredSize(new java.awt.Dimension(915, 700));
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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(890, 600));

        tabbed.setPreferredSize(new java.awt.Dimension(870, 880));
        tabbed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedStateChanged(evt);
            }
        });

        pnPag1.setBackground(new java.awt.Color(255, 255, 255));

        pnComandos1.setBackground(new java.awt.Color(255, 255, 255));

        btCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar1ActionPerformed(evt);
            }
        });

        btGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar1.setEnabled(false);
        btGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar1ActionPerformed(evt);
            }
        });

        btImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos1Layout = new javax.swing.GroupLayout(pnComandos1);
        pnComandos1.setLayout(pnComandos1Layout);
        pnComandos1Layout.setHorizontalGroup(
            pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(btImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(btCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        pnComandos1Layout.setVerticalGroup(
            pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnComandos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btImprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnContent1.setBackground(new java.awt.Color(255, 255, 255));
        pnContent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnPasatiempos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("PASATIEMPOS Y DEPORTES");
        jLabel11.setToolTipText("Haga check en todas las que son aplicables");

        cbMunecas.setBackground(new java.awt.Color(255, 255, 255));
        cbMunecas.setText("Muñecas");

        cbFutbol.setBackground(new java.awt.Color(255, 255, 255));
        cbFutbol.setText("Futbol");

        cbBicicleta.setBackground(new java.awt.Color(255, 255, 255));
        cbBicicleta.setText("Bicicleta");

        cbCasita.setBackground(new java.awt.Color(255, 255, 255));
        cbCasita.setText("La casita         ");

        cbHulla.setBackground(new java.awt.Color(255, 255, 255));
        cbHulla.setText("Hulla - Hulla");

        cbBeisbol.setBackground(new java.awt.Color(255, 255, 255));
        cbBeisbol.setText("Beisbol");

        cbCaminatas.setBackground(new java.awt.Color(255, 255, 255));
        cbCaminatas.setText("Caminatas");

        cbMacateta.setBackground(new java.awt.Color(255, 255, 255));
        cbMacateta.setText("Macateta");

        cbCanicas.setBackground(new java.awt.Color(255, 255, 255));
        cbCanicas.setText("Bolas / canicas");

        cbBasket.setBackground(new java.awt.Color(255, 255, 255));
        cbBasket.setText("Basquetbol");

        cbNadar.setBackground(new java.awt.Color(255, 255, 255));
        cbNadar.setText("Nadar");

        cbEscondidas.setBackground(new java.awt.Color(255, 255, 255));
        cbEscondidas.setText("Escondidas");

        cbCarros.setBackground(new java.awt.Color(255, 255, 255));
        cbCarros.setText("Carros");

        cbVolibol.setBackground(new java.awt.Color(255, 255, 255));
        cbVolibol.setText("Volibol");

        cbCorrer.setBackground(new java.awt.Color(255, 255, 255));
        cbCorrer.setText("Correr");

        cbLeer.setBackground(new java.awt.Color(255, 255, 255));
        cbLeer.setText("Leer");

        cbArte.setBackground(new java.awt.Color(255, 255, 255));
        cbArte.setText("Arte / dibujar");

        cbPingPong.setBackground(new java.awt.Color(255, 255, 255));
        cbPingPong.setText("Ping - Pong");

        cbSaltarSoga.setBackground(new java.awt.Color(255, 255, 255));
        cbSaltarSoga.setText("Saltar soga");

        cbCantar.setBackground(new java.awt.Color(255, 255, 255));
        cbCantar.setText("Cantar");

        cbMusica.setBackground(new java.awt.Color(255, 255, 255));
        cbMusica.setText("Escuchar música");

        cbJuegoPelota.setBackground(new java.awt.Color(255, 255, 255));
        cbJuegoPelota.setText("Juegos de pelota");

        cbContarHist.setBackground(new java.awt.Color(255, 255, 255));
        cbContarHist.setText("Contar historias");

        cbMusicales.setBackground(new java.awt.Color(255, 255, 255));
        cbMusicales.setText("Instrumentos musicales:");
        cbMusicales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMusicalesActionPerformed(evt);
            }
        });

        tfOtroInstMus.setEditable(false);
        tfOtroInstMus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtroInstMusKeyReleased(evt);
            }
        });

        cbOtrosPastDep.setBackground(new java.awt.Color(255, 255, 255));
        cbOtrosPastDep.setText("Otros:");
        cbOtrosPastDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtrosPastDepActionPerformed(evt);
            }
        });

        tfOtroPasat.setEditable(false);
        tfOtroPasat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtroPasatKeyReleased(evt);
            }
        });

        cbJuegosGrupo.setBackground(new java.awt.Color(255, 255, 255));
        cbJuegosGrupo.setText("Juegos en grupo");

        javax.swing.GroupLayout pnPasatiemposLayout = new javax.swing.GroupLayout(pnPasatiempos);
        pnPasatiempos.setLayout(pnPasatiemposLayout);
        pnPasatiemposLayout.setHorizontalGroup(
            pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPasatiemposLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPasatiemposLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(303, 303, 303))
                    .addGroup(pnPasatiemposLayout.createSequentialGroup()
                        .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMacateta)
                            .addComponent(cbEscondidas)
                            .addComponent(cbLeer)
                            .addComponent(cbCantar)
                            .addComponent(cbMusicales)
                            .addComponent(cbMunecas)
                            .addComponent(cbCasita))
                        .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPasatiemposLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbHulla)
                                    .addComponent(cbCanicas)
                                    .addComponent(cbCarros)
                                    .addComponent(cbArte)
                                    .addComponent(cbMusica)
                                    .addComponent(cbJuegosGrupo))
                                .addGap(62, 62, 62)
                                .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnPasatiemposLayout.createSequentialGroup()
                                        .addComponent(cbOtrosPastDep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfOtroPasat, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnPasatiemposLayout.createSequentialGroup()
                                        .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbJuegoPelota)
                                            .addComponent(cbPingPong)
                                            .addComponent(cbVolibol)
                                            .addComponent(cbBasket)
                                            .addComponent(cbBeisbol)
                                            .addComponent(cbFutbol))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbContarHist)
                                            .addComponent(cbSaltarSoga)
                                            .addComponent(cbCorrer)
                                            .addComponent(cbNadar)
                                            .addComponent(cbCaminatas)
                                            .addComponent(cbBicicleta)))))
                            .addGroup(pnPasatiemposLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfOtroInstMus, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(151, Short.MAX_VALUE))))
        );
        pnPasatiemposLayout.setVerticalGroup(
            pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPasatiemposLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPasatiemposLayout.createSequentialGroup()
                        .addComponent(cbBicicleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCaminatas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbNadar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCorrer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSaltarSoga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbContarHist))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPasatiemposLayout.createSequentialGroup()
                        .addComponent(cbMunecas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCasita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMacateta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEscondidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbLeer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCantar))
                    .addGroup(pnPasatiemposLayout.createSequentialGroup()
                        .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFutbol)
                            .addComponent(cbJuegosGrupo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbBeisbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbBasket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbVolibol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPingPong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJuegoPelota))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPasatiemposLayout.createSequentialGroup()
                        .addComponent(cbHulla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCanicas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCarros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbArte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMusica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMusicales)
                    .addGroup(pnPasatiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfOtroInstMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbOtrosPastDep)
                        .addComponent(tfOtroPasat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pnContent1.add(pnPasatiempos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 783, -1));

        pnDatosGrales.setBackground(new java.awt.Color(255, 255, 255));
        pnDatosGrales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("HISTORIA DEL NIÑO");
        pnDatosGrales.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 11, 140, -1));

        jLabel2.setText("Llenado por:");
        pnDatosGrales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 48, -1, -1));

        jLabel3.setText("Fecha preparada:");
        pnDatosGrales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 69, -1, -1));

        jLabel4.setText("Tipo de Ingreso:");
        pnDatosGrales.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 64, -1, -1));

        lbAtendedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbAtendedor.setText("     ");
        pnDatosGrales.add(lbAtendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 47, -1, -1));

        jLabel5.setText("Número del Niño:  NI-126-");
        pnDatosGrales.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 93, -1, -1));

        jLabel6.setText("Nombre del Niño:");
        pnDatosGrales.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 117, -1, -1));

        jLabel7.setText("Fecha de Nacimiento:");
        pnDatosGrales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 143, -1, -1));

        lbFechaHoy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbFechaHoy.setText("     ");
        pnDatosGrales.add(lbFechaHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 68, -1, -1));

        lbName.setText("               ");
        pnDatosGrales.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 117, -1, -1));

        lbFecNac.setText("          ");
        pnDatosGrales.add(lbFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 143, -1, -1));

        lbSex.setText("      ");
        pnDatosGrales.add(lbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 143, -1, -1));

        jLabel8.setText("Sexo:");
        pnDatosGrales.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 143, -1, -1));

        rbNew.setBackground(new java.awt.Color(255, 255, 255));
        bgTipoIngreso.add(rbNew);
        rbNew.setSelected(true);
        rbNew.setText("Niño Nuevo");
        rbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNewActionPerformed(evt);
            }
        });
        pnDatosGrales.add(rbNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        rbUpd.setBackground(new java.awt.Color(255, 255, 255));
        bgTipoIngreso.add(rbUpd);
        rbUpd.setText("Actualización");
        rbUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUpdActionPerformed(evt);
            }
        });
        pnDatosGrales.add(rbUpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        lbCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pnDatosGrales.add(lbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 93, 51, 14));

        pnContent1.add(pnDatosGrales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        pnActividadesCrist.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ACTIVIDADES CRISTIANAS");
        jLabel9.setToolTipText("Haga check en todas las que son aplicables");

        cbEscDominical.setBackground(new java.awt.Color(255, 255, 255));
        cbEscDominical.setText("Escuela Dominical / Iglesia");

        cbSocJovenes.setBackground(new java.awt.Color(255, 255, 255));
        cbSocJovenes.setText("Sociedad de Jóvenes");

        cbClaseBib.setBackground(new java.awt.Color(255, 255, 255));
        cbClaseBib.setText("Clase Bíblica");

        cbCampamento.setBackground(new java.awt.Color(255, 255, 255));
        cbCampamento.setText("Campamento");

        cbEscBibVac.setBackground(new java.awt.Color(255, 255, 255));
        cbEscBibVac.setText("Escuela Bíblica Vacacional");

        cbCoro.setBackground(new java.awt.Color(255, 255, 255));
        cbCoro.setText("Coro");

        cbOtraAct.setBackground(new java.awt.Color(255, 255, 255));
        cbOtraAct.setText("Otras:");
        cbOtraAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtraActActionPerformed(evt);
            }
        });

        tfOtraActv.setEditable(false);
        tfOtraActv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtraActvKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnActividadesCristLayout = new javax.swing.GroupLayout(pnActividadesCrist);
        pnActividadesCrist.setLayout(pnActividadesCristLayout);
        pnActividadesCristLayout.setHorizontalGroup(
            pnActividadesCristLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActividadesCristLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(pnActividadesCristLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEscDominical)
                    .addComponent(cbEscBibVac))
                .addGap(18, 18, 18)
                .addGroup(pnActividadesCristLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSocJovenes)
                    .addComponent(cbCoro))
                .addGap(39, 39, 39)
                .addGroup(pnActividadesCristLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnActividadesCristLayout.createSequentialGroup()
                        .addComponent(cbClaseBib)
                        .addGap(40, 40, 40)
                        .addComponent(cbCampamento))
                    .addGroup(pnActividadesCristLayout.createSequentialGroup()
                        .addComponent(cbOtraAct)
                        .addGap(18, 18, 18)
                        .addComponent(tfOtraActv, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnActividadesCristLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(307, 307, 307))
        );
        pnActividadesCristLayout.setVerticalGroup(
            pnActividadesCristLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActividadesCristLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(pnActividadesCristLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEscDominical)
                    .addComponent(cbSocJovenes)
                    .addComponent(cbClaseBib)
                    .addComponent(cbCampamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnActividadesCristLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEscBibVac)
                    .addComponent(cbCoro)
                    .addComponent(cbOtraAct)
                    .addComponent(tfOtraActv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pnContent1.add(pnActividadesCrist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 783, -1));

        pnObligaciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("OBLIGACIONES FAMILIARES");
        jLabel10.setToolTipText("Haga check en todas las que son aplicables");

        cbLavaRopa.setBackground(new java.awt.Color(255, 255, 255));
        cbLavaRopa.setText("Lava ropa");

        cbHuerto.setBackground(new java.awt.Color(255, 255, 255));
        cbHuerto.setText("Huerto / Granja");

        cbMandados.setBackground(new java.awt.Color(255, 255, 255));
        cbMandados.setText("Mandados");

        cbCamas.setBackground(new java.awt.Color(255, 255, 255));
        cbCamas.setText("Tiende las camas");

        cbLimpieza.setBackground(new java.awt.Color(255, 255, 255));
        cbLimpieza.setText("Limpieza / Aseo");

        cbCuidaAnimals.setBackground(new java.awt.Color(255, 255, 255));
        cbCuidaAnimals.setText("Cuida a animales");

        cbRecogeAgua.setBackground(new java.awt.Color(255, 255, 255));
        cbRecogeAgua.setText("Recoge agua");

        cbCuidaNinos.setBackground(new java.awt.Color(255, 255, 255));
        cbCuidaNinos.setText("Cuida a niños");

        cbCostura.setBackground(new java.awt.Color(255, 255, 255));
        cbCostura.setText("Costura");

        cbLena.setBackground(new java.awt.Color(255, 255, 255));
        cbLena.setText("Recoge leña");

        cbEnsenaOtros.setBackground(new java.awt.Color(255, 255, 255));
        cbEnsenaOtros.setText("Enseña a otros");

        cbCVMercado.setBackground(new java.awt.Color(255, 255, 255));
        cbCVMercado.setText("Compra / Vende en el mercado");

        cbCocina.setBackground(new java.awt.Color(255, 255, 255));
        cbCocina.setText("Ayuda en la cocina");

        cbOtraObl.setBackground(new java.awt.Color(255, 255, 255));
        cbOtraObl.setText("Otras:");
        cbOtraObl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtraOblActionPerformed(evt);
            }
        });

        tfOtraObl.setEditable(false);
        tfOtraObl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtraOblKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnObligacionesLayout = new javax.swing.GroupLayout(pnObligaciones);
        pnObligaciones.setLayout(pnObligacionesLayout);
        pnObligacionesLayout.setHorizontalGroup(
            pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObligacionesLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbLavaRopa)
                    .addComponent(cbLimpieza)
                    .addComponent(cbCostura)
                    .addComponent(cbCocina))
                .addGap(50, 50, 50)
                .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnObligacionesLayout.createSequentialGroup()
                        .addComponent(cbOtraObl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfOtraObl, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnObligacionesLayout.createSequentialGroup()
                        .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCuidaAnimals)
                            .addComponent(cbLena)
                            .addComponent(cbHuerto))
                        .addGap(55, 55, 55)
                        .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnObligacionesLayout.createSequentialGroup()
                                .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMandados)
                                    .addComponent(cbRecogeAgua))
                                .addGap(7, 7, 7))
                            .addComponent(cbEnsenaOtros, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCuidaNinos)
                            .addComponent(cbCVMercado)
                            .addComponent(cbCamas))
                        .addGap(83, 83, 83))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnObligacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(305, 305, 305))
        );
        pnObligacionesLayout.setVerticalGroup(
            pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObligacionesLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnObligacionesLayout.createSequentialGroup()
                        .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHuerto)
                            .addComponent(cbCamas)
                            .addComponent(cbLavaRopa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCuidaAnimals)
                            .addComponent(cbCuidaNinos)
                            .addComponent(cbLimpieza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbLena)
                                .addComponent(cbCostura))
                            .addComponent(cbCVMercado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCocina)
                            .addGroup(pnObligacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbOtraObl)
                                .addComponent(tfOtraObl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnObligacionesLayout.createSequentialGroup()
                        .addComponent(cbMandados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRecogeAgua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEnsenaOtros)))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pnContent1.add(pnObligaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 783, -1));

        btEditDataGrales.setText("...");
        btEditDataGrales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditDataGralesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPag1Layout = new javax.swing.GroupLayout(pnPag1);
        pnPag1.setLayout(pnPag1Layout);
        pnPag1Layout.setHorizontalGroup(
            pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag1Layout.createSequentialGroup()
                .addGroup(pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnContent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnComandos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditDataGrales, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        pnPag1Layout.setVerticalGroup(
            pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag1Layout.createSequentialGroup()
                .addGroup(pnPag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPag1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btEditDataGrales))
                    .addComponent(pnContent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 1", pnPag1);

        pnPag2.setBackground(new java.awt.Color(255, 255, 255));

        pnComandos2.setBackground(new java.awt.Color(255, 255, 255));
        pnComandos2.setPreferredSize(new java.awt.Dimension(100, 133));

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

        btImprimir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btImprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos2Layout = new javax.swing.GroupLayout(pnComandos2);
        pnComandos2.setLayout(pnComandos2Layout);
        pnComandos2Layout.setHorizontalGroup(
            pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(btImprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btGuardar2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(btCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        pnComandos2Layout.setVerticalGroup(
            pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnComandos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGuardar2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btImprimir2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnContent2.setBackground(new java.awt.Color(255, 255, 255));
        pnContent2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSalud.setBackground(new java.awt.Color(255, 255, 255));
        pnSalud.setMinimumSize(new java.awt.Dimension(800, 300));
        pnSalud.setPreferredSize(new java.awt.Dimension(700, 300));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("SALUD");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Impedimentos Físicos / Enfermedades Crónicas");

        cbNinguna.setBackground(new java.awt.Color(255, 255, 255));
        cbNinguna.setSelected(true);
        cbNinguna.setText("Ninguna");
        cbNinguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNingunaActionPerformed(evt);
            }
        });

        cbEpilepsia.setBackground(new java.awt.Color(255, 255, 255));
        cbEpilepsia.setText("Epilepsia");
        cbEpilepsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEpilepsiaActionPerformed(evt);
            }
        });

        cbAsma.setBackground(new java.awt.Color(255, 255, 255));
        cbAsma.setText("Asma");
        cbAsma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsmaActionPerformed(evt);
            }
        });

        cbPolio.setBackground(new java.awt.Color(255, 255, 255));
        cbPolio.setText("Polio");
        cbPolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPolioActionPerformed(evt);
            }
        });

        cbRetardo.setBackground(new java.awt.Color(255, 255, 255));
        cbRetardo.setText("Retardo mental");
        cbRetardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRetardoActionPerformed(evt);
            }
        });

        cbOtra.setBackground(new java.awt.Color(255, 255, 255));
        cbOtra.setText("Otra:");
        cbOtra.setActionCommand("tfOtroImped.getText()");
        cbOtra.setNextFocusableComponent(tfOtroImped);
        cbOtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtraActionPerformed(evt);
            }
        });

        tfOtroImped.setEditable(false);
        tfOtroImped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtroImpedKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Minusválido:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        cbxColumna.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        jLabel15.setText("Columna debido a...");

        jLabel16.setText("Pie izquierdo por...");

        jLabel17.setText("Pie derecho por...");

        jLabel18.setText("Mano izquierda por...");

        jLabel19.setText("Mano derecha por...");

        jLabel20.setText("Pierna izquierda por...");

        jLabel22.setText("Brazo izquierdo por...");

        jLabel23.setText("Brazo derecho por...");

        cbxPieIzq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        cbxPieDer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        cbxManoIzq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        cbxManoDer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        cbxPierIzq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        cbxPierDer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        jLabel21.setText("Pierna derecha por...");

        cbxBrazIzq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        cbxBrazDer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Lesión", "Enfermedad", "Congénito" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxColumna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPieIzq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPieDer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxManoIzq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxManoDer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPierIzq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPierDer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxBrazIzq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxBrazDer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPieIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPieDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxManoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbxManoDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbxPierIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPierDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBrazIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBrazDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("El Habla:");

        cbxHabla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Tiene defecto", "Mudo" }));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Los Oídos:");

        jLabel26.setText("Oído izquierdo");

        jLabel27.setText("Oído derecho");

        cbxOidoIzq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Tiene defecto", "Sordo" }));

        cbxOidoDer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Tiene defecto", "Sordo" }));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("La Vista:");

        jLabel29.setText("Ojo izquierdo");

        jLabel30.setText("Ojo derecho");

        cbxOjoIzq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Tiene defecto", "Ciego" }));

        cbxOjoDer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Tiene defecto", "Ciego" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(cbxHabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(cbxOidoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxOjoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxOidoDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxOjoDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxHabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(cbxOidoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cbxOidoDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(cbxOjoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cbxOjoDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel31.setText("¿Este niño está recibiendo tratamiento médico regular?");

        jLabel32.setText("¿Este niño está recibiendo medicina regularmente?");

        rbSiTratMed.setBackground(new java.awt.Color(255, 255, 255));
        bgTratMedico.add(rbSiTratMed);
        rbSiTratMed.setText("Si");
        rbSiTratMed.setActionCommand("Si");

        rbSiRecMed.setBackground(new java.awt.Color(255, 255, 255));
        bgRecibMedicina.add(rbSiRecMed);
        rbSiRecMed.setText("Si");
        rbSiRecMed.setActionCommand("Si");

        rbNoTratMed.setBackground(new java.awt.Color(255, 255, 255));
        bgTratMedico.add(rbNoTratMed);
        rbNoTratMed.setSelected(true);
        rbNoTratMed.setText("No");
        rbNoTratMed.setActionCommand("No");

        rbNoRecMed.setBackground(new java.awt.Color(255, 255, 255));
        bgRecibMedicina.add(rbNoRecMed);
        rbNoRecMed.setSelected(true);
        rbNoRecMed.setText("No");
        rbNoRecMed.setActionCommand("No");

        javax.swing.GroupLayout pnSaludLayout = new javax.swing.GroupLayout(pnSalud);
        pnSalud.setLayout(pnSaludLayout);
        pnSaludLayout.setHorizontalGroup(
            pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaludLayout.createSequentialGroup()
                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSaludLayout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel12))
                    .addGroup(pnSaludLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(pnSaludLayout.createSequentialGroup()
                                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnSaludLayout.createSequentialGroup()
                                        .addComponent(cbNinguna)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbEpilepsia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbAsma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbPolio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbRetardo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbOtra))
                                    .addGroup(pnSaludLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(13, 13, 13)
                                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnSaludLayout.createSequentialGroup()
                                                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel31)
                                                    .addComponent(jLabel32))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rbSiRecMed)
                                                    .addComponent(rbSiTratMed)))
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnSaludLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfOtroImped, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnSaludLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbNoTratMed)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbNoRecMed))))))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        pnSaludLayout.setVerticalGroup(
            pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaludLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNinguna)
                    .addComponent(cbEpilepsia)
                    .addComponent(cbAsma)
                    .addComponent(cbPolio)
                    .addComponent(cbRetardo)
                    .addComponent(cbOtra)
                    .addComponent(tfOtroImped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(rbSiTratMed)
                    .addComponent(rbNoTratMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(rbSiRecMed)
                    .addComponent(rbNoRecMed))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pnContent2.add(pnSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 423));

        pnEstudio.setBackground(new java.awt.Color(255, 255, 255));
        pnEstudio.setMinimumSize(new java.awt.Dimension(600, 150));
        pnEstudio.setPreferredSize(new java.awt.Dimension(100, 363));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setText("ESTUDIOS");

        jLabel34.setText("¿Está asistiendo a la escuela este niño?");

        rbSiAsisteEsc.setBackground(new java.awt.Color(255, 255, 255));
        bgAsisteEscuela.add(rbSiAsisteEsc);
        rbSiAsisteEsc.setSelected(true);
        rbSiAsisteEsc.setText("Si");
        rbSiAsisteEsc.setActionCommand("1");
        rbSiAsisteEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiAsisteEscActionPerformed(evt);
            }
        });

        rbNoAsisteEsc.setBackground(new java.awt.Color(255, 255, 255));
        bgAsisteEscuela.add(rbNoAsisteEsc);
        rbNoAsisteEsc.setText("No");
        rbNoAsisteEsc.setActionCommand("0");
        rbNoAsisteEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoAsisteEscActionPerformed(evt);
            }
        });

        jLabel35.setText("Si no asiste, dé la razón");

        jLabel36.setText("Si asiste llene uno de los siguientes niveles de una escuela:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Nivel en el País");

        jLabel39.setText("Pre-Kinder");

        jLabel40.setText("Kindergarden");

        jLabel41.setText("Primaria");

        jLabel42.setText("Básico");

        jLabel43.setText("Secundaria");

        cbxRazon.setNextFocusableComponent(tfOtraRazon);
        cbxRazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRazonActionPerformed(evt);
            }
        });

        tfOtraRazon.setEditable(false);
        tfOtraRazon.setText("                                ");
        tfOtraRazon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOtraRazonKeyReleased(evt);
            }
        });

        cbxNPreKinder.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        cbxNPreKinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNPreKinderActionPerformed(evt);
            }
        });

        cbxNKinder.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));
        cbxNKinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNKinderActionPerformed(evt);
            }
        });

        cbxNPrimaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6" }));
        cbxNPrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNPrimariaActionPerformed(evt);
            }
        });

        cbxNBasico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));
        cbxNBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNBasicoActionPerformed(evt);
            }
        });

        cbxNSecundaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "4", "5", "6" }));
        cbxNSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNSecundariaActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        cbxNOtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbxNOtro.setNextFocusableComponent(tfCEOtro);
        cbxNOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNOtroActionPerformed(evt);
            }
        });

        jLabel47.setText("Otros: Nivel     .............");

        cbxNUniv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        cbxNUniv.setNextFocusableComponent(tfCEUniv);
        cbxNUniv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNUnivActionPerformed(evt);
            }
        });

        jLabel46.setText("Universidad: Nivel   ........");

        cbxNAprez.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbxNAprez.setNextFocusableComponent(tfCEAprez);
        cbxNAprez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNAprezActionPerformed(evt);
            }
        });

        jLabel45.setText("Aprendiz: Nivel     ..........");

        cbxNVocac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbxNVocac.setNextFocusableComponent(tfCEVocac);
        cbxNVocac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNVocacActionPerformed(evt);
            }
        });

        jLabel44.setText("Estudios vocacionales: Nivel");

        jLabel48.setText("Dé el curso de estudio:");

        tfCEVocac.setEditable(false);
        tfCEVocac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCEVocacKeyReleased(evt);
            }
        });

        tfCEAprez.setEditable(false);
        tfCEAprez.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCEAprezKeyReleased(evt);
            }
        });

        jLabel49.setText("Dé el curso de estudio:");

        tfCEUniv.setEditable(false);
        tfCEUniv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCEUnivKeyReleased(evt);
            }
        });

        jLabel50.setText("Dé el curso de estudio:");

        tfCEOtro.setEditable(false);
        tfCEOtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCEOtroKeyReleased(evt);
            }
        });

        jLabel51.setText("Dé el curso de estudio:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel44)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxNAprez, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxNVocac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxNUniv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxNOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCEAprez, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCEOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCEUniv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCEVocac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCEVocac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCEAprez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCEUniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel50)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCEOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel51))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(cbxNVocac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(cbxNAprez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(cbxNUniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(cbxNOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnEstudioLayout = new javax.swing.GroupLayout(pnEstudio);
        pnEstudio.setLayout(pnEstudioLayout);
        pnEstudioLayout.setHorizontalGroup(
            pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstudioLayout.createSequentialGroup()
                .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEstudioLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEstudioLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbSiAsisteEsc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbNoAsisteEsc))
                            .addComponent(jLabel36)
                            .addGroup(pnEstudioLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnEstudioLayout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jLabel33)))
                .addContainerGap())
            .addGroup(pnEstudioLayout.createSequentialGroup()
                .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEstudioLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel37))
                    .addGroup(pnEstudioLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)
                        .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxNPreKinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNKinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEstudioLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(tfOtraRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEstudioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        pnEstudioLayout.setVerticalGroup(
            pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstudioLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel33)
                .addGap(22, 22, 22)
                .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(rbSiAsisteEsc)
                    .addComponent(rbNoAsisteEsc))
                .addGap(2, 2, 2)
                .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(cbxRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOtraRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel36)
                .addGap(29, 29, 29)
                .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnEstudioLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEstudioLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel39))
                            .addGroup(pnEstudioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxNPreKinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(cbxNKinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(cbxNPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEstudioLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel42))
                            .addGroup(pnEstudioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxNBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEstudioLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel43))
                            .addGroup(pnEstudioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxNSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnContent2.add(pnEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 850, 306));

        javax.swing.GroupLayout pnPag2Layout = new javax.swing.GroupLayout(pnPag2);
        pnPag2.setLayout(pnPag2Layout);
        pnPag2Layout.setHorizontalGroup(
            pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag2Layout.createSequentialGroup()
                .addGroup(pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnContent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        pnPag2Layout.setVerticalGroup(
            pnPag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag2Layout.createSequentialGroup()
                .addComponent(pnContent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 2", pnPag2);

        pnPag3.setBackground(new java.awt.Color(255, 255, 255));

        pnComandos3.setBackground(new java.awt.Color(255, 255, 255));

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

        btImprimir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btImprimir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos3Layout = new javax.swing.GroupLayout(pnComandos3);
        pnComandos3.setLayout(pnComandos3Layout);
        pnComandos3Layout.setHorizontalGroup(
            pnComandos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos3Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btImprimir3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btGuardar3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(btCerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        pnComandos3Layout.setVerticalGroup(
            pnComandos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnComandos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGuardar3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btImprimir3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pnContent3.setBackground(new java.awt.Color(255, 255, 255));
        pnContent3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnEstudios2.setBackground(new java.awt.Color(255, 255, 255));
        pnEstudios2.setPreferredSize(new java.awt.Dimension(850, 246));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setText("ESTUDIOS");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setText("Rendimiento escolar:");

        rbRendEscBajo.setBackground(new java.awt.Color(255, 255, 255));
        bgRendimientoEscolar.add(rbRendEscBajo);
        rbRendEscBajo.setSelected(true);
        rbRendEscBajo.setText("Bajo");
        rbRendEscBajo.setActionCommand("Bajo");

        rbRendEscPro.setBackground(new java.awt.Color(255, 255, 255));
        bgRendimientoEscolar.add(rbRendEscPro);
        rbRendEscPro.setText("Promedio");
        rbRendEscPro.setActionCommand("Promedio");

        rbRendEscSob.setBackground(new java.awt.Color(255, 255, 255));
        bgRendimientoEscolar.add(rbRendEscSob);
        rbRendEscSob.setText("Sobre");
        rbRendEscSob.setActionCommand("Sobre");

        jLabel54.setText("Mejor materia del niño:");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("Planes futuros");

        jLabel56.setText("Fecha en la que el niño espera ingresar");

        jLabel58.setText("Curso de estudio");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lbSecundaria.setText("Secundaria");

        lbUniversidad.setText("Universidad");

        lbEscuelaBiblica.setText("Escuela Bíblica");

        lbEntrenVocac.setText("Entrenamiento vocacional");

        lbOtroEstudio.setText("Otro");

        datecSec.setDateFormatString("dd/MM/yyyy");

        datecUniv.setDateFormatString("dd/MM/yyyy");

        datecBib.setDateFormatString("dd/MM/yyyy");

        datecVoc.setDateFormatString("dd/MM/yyyy");

        datecOtro.setDateFormatString("dd/MM/yyyy");

        tfCESec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCESecKeyReleased(evt);
            }
        });

        tfCEUniv2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCEUniv2KeyReleased(evt);
            }
        });

        tfCEBib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCEBibKeyReleased(evt);
            }
        });

        tfCEVocac2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCEVocac2KeyReleased(evt);
            }
        });

        tfCEOtro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCEOtro2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEntrenVocac)
                    .addComponent(lbOtroEstudio)
                    .addComponent(lbUniversidad)
                    .addComponent(lbSecundaria)
                    .addComponent(lbEscuelaBiblica))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(datecOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(tfCEOtro2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(datecSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(tfCESec))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(datecUniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(tfCEUniv2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(datecBib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(tfCEBib))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(datecVoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(tfCEVocac2))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lbSecundaria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbUniversidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbEscuelaBiblica)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(datecSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datecUniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datecBib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datecVoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEntrenVocac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datecOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOtroEstudio)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tfCESec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCEUniv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCEBib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCEVocac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfCEOtro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        cbxMateria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguna", "Español", "Matemáticas", "Inglés", "Física", "Química", "Biología", "Cívica y Moral", "Ciencias Naturales", "Ciencias Sociales", "Geografía", "Historia" }));

        javax.swing.GroupLayout pnEstudios2Layout = new javax.swing.GroupLayout(pnEstudios2);
        pnEstudios2.setLayout(pnEstudios2Layout);
        pnEstudios2Layout.setHorizontalGroup(
            pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstudios2Layout.createSequentialGroup()
                .addGroup(pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEstudios2Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel52))
                    .addGroup(pnEstudios2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEstudios2Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(175, 175, 175)
                                .addComponent(jLabel56)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel58))
                            .addGroup(pnEstudios2Layout.createSequentialGroup()
                                .addGroup(pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54))
                                .addGap(18, 18, 18)
                                .addGroup(pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnEstudios2Layout.createSequentialGroup()
                                        .addComponent(rbRendEscBajo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbRendEscPro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbRendEscSob))
                                    .addComponent(cbxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEstudios2Layout.createSequentialGroup()
                .addGap(0, 161, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        pnEstudios2Layout.setVerticalGroup(
            pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstudios2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(rbRendEscBajo)
                    .addComponent(rbRendEscPro)
                    .addComponent(rbRendEscSob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(cbxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnEstudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel58)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnContent3.add(pnEstudios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 264));

        pnTutores.setBackground(new java.awt.Color(255, 255, 255));
        pnTutores.setPreferredSize(new java.awt.Dimension(850, 196));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setText("TUTORES");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("El niño está bajo la tutela de:");

        cbTutelaMasculina.setBackground(new java.awt.Color(255, 255, 255));
        cbTutelaMasculina.setSelected(true);
        cbTutelaMasculina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTutelaMasculinaActionPerformed(evt);
            }
        });

        cbTutelaFemenina.setBackground(new java.awt.Color(255, 255, 255));
        cbTutelaFemenina.setSelected(true);
        cbTutelaFemenina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTutelaFemeninaActionPerformed(evt);
            }
        });

        cbTutelaAjena.setBackground(new java.awt.Color(255, 255, 255));
        cbTutelaAjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTutelaAjenaActionPerformed(evt);
            }
        });

        cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Padre", "Hermano", "Padrastro", "Tío", "Abuelo", "Padrino" }));

        cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Madre", "Hermana", "Madrastra", "Tía", "Abuela", "Madrina" }));

        javax.swing.GroupLayout pnTutoresLayout = new javax.swing.GroupLayout(pnTutores);
        pnTutores.setLayout(pnTutoresLayout);
        pnTutoresLayout.setHorizontalGroup(
            pnTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTutoresLayout.createSequentialGroup()
                .addGroup(pnTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTutoresLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pnTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnTutoresLayout.createSequentialGroup()
                                .addComponent(cbTutelaMasculina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTutorMasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(cbTutelaFemenina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTutorFem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cbTutelaAjena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTutorAjeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnTutoresLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel57)))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        pnTutoresLayout.setVerticalGroup(
            pnTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTutoresLayout.createSequentialGroup()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTutelaMasculina)
                    .addComponent(cbxTutorMasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTutelaFemenina)
                    .addComponent(cbxTutorFem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTutelaAjena)
                    .addComponent(cbxTutorAjeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnContent3.add(pnTutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 94));

        pnECivil.setBackground(new java.awt.Color(255, 255, 255));
        pnECivil.setPreferredSize(new java.awt.Dimension(850, 178));

        jLabel64.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel64.setText("PADRES NATURALES");

        jLabel66.setText("¿Ahora están juntos los padres naturales?");

        rbJuntoSi.setBackground(new java.awt.Color(255, 255, 255));
        bgJuntosPadres.add(rbJuntoSi);
        rbJuntoSi.setSelected(true);
        rbJuntoSi.setText("Si");
        rbJuntoSi.setActionCommand("Si");
        rbJuntoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuntoSiActionPerformed(evt);
            }
        });

        rbJuntoNo.setBackground(new java.awt.Color(255, 255, 255));
        bgJuntosPadres.add(rbJuntoNo);
        rbJuntoNo.setText("No");
        rbJuntoNo.setActionCommand("No");
        rbJuntoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuntoNoActionPerformed(evt);
            }
        });

        rbJuntoDesco.setBackground(new java.awt.Color(255, 255, 255));
        bgJuntosPadres.add(rbJuntoDesco);
        rbJuntoDesco.setText("Desconocido");
        rbJuntoDesco.setActionCommand("Desconocido");
        rbJuntoDesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuntoDescoActionPerformed(evt);
            }
        });

        jLabel67.setText("Estado de matrimonio de los padres naturales:");

        cbxECivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahora casados", "Nunca eran casados", "Eran casados, ahora separados divorciados o separados permanentemente", "Eran casados, ahora separados por muerte", "Desconocido" }));

        javax.swing.GroupLayout pnECivilLayout = new javax.swing.GroupLayout(pnECivil);
        pnECivil.setLayout(pnECivilLayout);
        pnECivilLayout.setHorizontalGroup(
            pnECivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnECivilLayout.createSequentialGroup()
                .addGroup(pnECivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnECivilLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel64))
                    .addGroup(pnECivilLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(pnECivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnECivilLayout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addGap(18, 18, 18)
                                .addComponent(rbJuntoSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbJuntoNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbJuntoDesco))
                            .addGroup(pnECivilLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxECivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        pnECivilLayout.setVerticalGroup(
            pnECivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnECivilLayout.createSequentialGroup()
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnECivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(rbJuntoSi)
                    .addComponent(rbJuntoNo)
                    .addComponent(rbJuntoDesco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnECivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(cbxECivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pnContent3.add(pnECivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, 87));

        pnPadres.setBackground(new java.awt.Color(255, 255, 255));
        pnPadres.setPreferredSize(new java.awt.Dimension(850, 150));

        pnSoloPadre.setBackground(new java.awt.Color(255, 255, 255));
        pnSoloPadre.setPreferredSize(new java.awt.Dimension(425, 236));

        jLabel68.setText("Es (o está) el padre natural");

        jLabel69.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel69.setText("PADRE NATURAL");

        jLabel71.setText("¿Vivo?");

        jLabel72.setText("¿Viviendo con este niño?");

        jLabel73.setText("¿Contribuyendo financieramente al niño?");

        jLabel74.setText("¿Con impedimento?");

        jLabel75.setText("¿De qué clase?");

        jLabel76.setText("¿Crónicamente enfermo?");

        jLabel77.setText("¿De qué?");

        jLabel78.setText("¿Mentalmente enfermo?");

        jLabel79.setText("¿En la cárcel?");

        cbxPadreVivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No", "Desconocido" }));
        cbxPadreVivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPadreVivoActionPerformed(evt);
            }
        });

        cbxPcNino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbxPcNino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPcNinoActionPerformed(evt);
            }
        });

        cbxPImpd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si", "Desconocido" }));
        cbxPImpd.setNextFocusableComponent(tfPCImpd);
        cbxPImpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPImpdActionPerformed(evt);
            }
        });

        tfPCImpd.setEditable(false);
        tfPCImpd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPCImpdKeyReleased(evt);
            }
        });

        cbxPCrEnf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si", "Desconocido" }));
        cbxPCrEnf.setNextFocusableComponent(tfPCrEnf);
        cbxPCrEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPCrEnfActionPerformed(evt);
            }
        });

        tfPCrEnf.setEditable(false);
        tfPCrEnf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPCrEnfKeyReleased(evt);
            }
        });

        cbxPMentEnf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si", "Desconocido" }));
        cbxPMentEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPMentEnfActionPerformed(evt);
            }
        });

        cbxPCarc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si", "Desconocido" }));
        cbxPCarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPCarcActionPerformed(evt);
            }
        });

        cbxPFinanz.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        javax.swing.GroupLayout pnSoloPadreLayout = new javax.swing.GroupLayout(pnSoloPadre);
        pnSoloPadre.setLayout(pnSoloPadreLayout);
        pnSoloPadreLayout.setHorizontalGroup(
            pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSoloPadreLayout.createSequentialGroup()
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSoloPadreLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPCImpd, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(cbxPImpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPcNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPadreVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPCrEnf)
                            .addComponent(cbxPCrEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPCarc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPMentEnf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnSoloPadreLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel68))
                    .addGroup(pnSoloPadreLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cbxPFinanz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnSoloPadreLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel69)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        pnSoloPadreLayout.setVerticalGroup(
            pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSoloPadreLayout.createSequentialGroup()
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(cbxPadreVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(cbxPcNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(cbxPFinanz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(cbxPImpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(tfPCImpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(cbxPCrEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPCrEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(cbxPMentEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoloPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(cbxPCarc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel70.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel70.setText("MADRE NATURAL");

        jLabel80.setText("Es (o está) la madre natural");

        jLabel81.setText("¿Viva?");

        cbxMadreViva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No", "Desconocido" }));
        cbxMadreViva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMadreVivaActionPerformed(evt);
            }
        });

        jLabel82.setText("¿Viviendo con este niño?");

        cbxMcNino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        cbxMcNino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMcNinoActionPerformed(evt);
            }
        });

        jLabel83.setText("¿Contribuyendo financieramente al niño?");

        jLabel84.setText("¿Con impedimento?");

        cbxMImpd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si", "Desconocido" }));
        cbxMImpd.setNextFocusableComponent(tfMCImpd);
        cbxMImpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMImpdActionPerformed(evt);
            }
        });

        jLabel85.setText("¿De qué clase?");

        tfMCImpd.setEditable(false);
        tfMCImpd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMCImpdKeyReleased(evt);
            }
        });

        jLabel86.setText("¿Crónicamente enferma?");

        cbxMCrEnf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si", "Desconocido" }));
        cbxMCrEnf.setNextFocusableComponent(tfMCrEnf);
        cbxMCrEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMCrEnfActionPerformed(evt);
            }
        });

        jLabel87.setText("¿De qué?");

        tfMCrEnf.setEditable(false);
        tfMCrEnf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMCrEnfKeyReleased(evt);
            }
        });

        jLabel88.setText("¿Mentalmente enferma?");

        cbxMMentEnf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si", "Desconocido" }));
        cbxMMentEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMMentEnfActionPerformed(evt);
            }
        });

        jLabel89.setText("¿En la cárcel?");

        cbxMCarc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si", "Desconocido" }));
        cbxMCarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMCarcActionPerformed(evt);
            }
        });

        cbxMFinanz.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        javax.swing.GroupLayout pnPadresLayout = new javax.swing.GroupLayout(pnPadres);
        pnPadres.setLayout(pnPadresLayout);
        pnPadresLayout.setHorizontalGroup(
            pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPadresLayout.createSequentialGroup()
                .addComponent(pnSoloPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPadresLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel70))
                    .addGroup(pnPadresLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPadresLayout.createSequentialGroup()
                                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel81)
                                    .addComponent(jLabel82)
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel86)
                                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMCImpd, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(cbxMImpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxMcNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxMadreViva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMCrEnf)
                                    .addComponent(cbxMCrEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxMCarc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxMMentEnf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel80)
                            .addGroup(pnPadresLayout.createSequentialGroup()
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(cbxMFinanz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 90, Short.MAX_VALUE))
        );
        pnPadresLayout.setVerticalGroup(
            pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPadresLayout.createSequentialGroup()
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(cbxMadreViva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(cbxMcNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(cbxMFinanz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(cbxMImpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(tfMCImpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(cbxMCrEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMCrEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(cbxMMentEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPadresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(cbxMCarc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(pnSoloPadre, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );

        pnContent3.add(pnPadres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, 295));

        javax.swing.GroupLayout pnPag3Layout = new javax.swing.GroupLayout(pnPag3);
        pnPag3.setLayout(pnPag3Layout);
        pnPag3Layout.setHorizontalGroup(
            pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag3Layout.createSequentialGroup()
                .addGroup(pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnContent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        pnPag3Layout.setVerticalGroup(
            pnPag3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag3Layout.createSequentialGroup()
                .addComponent(pnContent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 3", pnPag3);

        pnPag4.setBackground(new java.awt.Color(255, 255, 255));

        pnComandos4.setBackground(new java.awt.Color(255, 255, 255));
        pnComandos4.setPreferredSize(new java.awt.Dimension(850, 193));

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

        btImprimir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btImprimir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnComandos4Layout = new javax.swing.GroupLayout(pnComandos4);
        pnComandos4.setLayout(pnComandos4Layout);
        pnComandos4Layout.setHorizontalGroup(
            pnComandos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos4Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(btImprimir4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btGuardar4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(btCerrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        pnComandos4Layout.setVerticalGroup(
            pnComandos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandos4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnComandos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGuardar4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btCerrar4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btImprimir4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnContent4.setBackground(new java.awt.Color(255, 255, 255));
        pnContent4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnEmpleosPad.setBackground(new java.awt.Color(255, 255, 255));
        pnEmpleosPad.setPreferredSize(new java.awt.Dimension(850, 228));

        pnSoloEmpleoPad.setBackground(new java.awt.Color(255, 255, 255));
        pnSoloEmpleoPad.setPreferredSize(new java.awt.Dimension(425, 351));

        jLabel90.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel90.setText("PADRE O TUTOR");

        cbxPEmpleo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Está empleado regularmente", "Está empleado a veces", "No está empleado", "No hay padre o guardián" }));
        cbxPEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPEmpleoActionPerformed(evt);
            }
        });

        cbPAgri.setBackground(new java.awt.Color(255, 255, 255));
        cbPAgri.setText("Agricultor");

        cbPMerc.setBackground(new java.awt.Color(255, 255, 255));
        cbPMerc.setText("Vende en el mercado");

        cbPIgl.setBackground(new java.awt.Color(255, 255, 255));
        cbPIgl.setText("Trabajador en la iglesia");

        cbPProj.setBackground(new java.awt.Color(255, 255, 255));
        cbPProj.setText("Trabajador en el proyecto");

        cbPMaes.setBackground(new java.awt.Color(255, 255, 255));
        cbPMaes.setText("Maestro (Profesor)");

        cbPObr.setBackground(new java.awt.Color(255, 255, 255));
        cbPObr.setText("Obrero");
        cbPObr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPObrActionPerformed(evt);
            }
        });

        cbPOtro.setBackground(new java.awt.Color(255, 255, 255));
        cbPOtro.setText("Otro");
        cbPOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPOtroActionPerformed(evt);
            }
        });

        jLabel92.setText("El padre o guardián");

        tfPObr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPObrKeyReleased(evt);
            }
        });

        tfPOtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPOtroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnSoloEmpleoPadLayout = new javax.swing.GroupLayout(pnSoloEmpleoPad);
        pnSoloEmpleoPad.setLayout(pnSoloEmpleoPadLayout);
        pnSoloEmpleoPadLayout.setHorizontalGroup(
            pnSoloEmpleoPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                .addGroup(pnSoloEmpleoPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel90))
                    .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnSoloEmpleoPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPObr)
                            .addComponent(cbPOtro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnSoloEmpleoPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPObr, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPEmpleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cbPMerc))
                    .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cbPMaes))
                    .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cbPProj))
                    .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cbPIgl))
                    .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cbPAgri)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnSoloEmpleoPadLayout.setVerticalGroup(
            pnSoloEmpleoPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSoloEmpleoPadLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel90)
                .addGap(18, 18, 18)
                .addGroup(pnSoloEmpleoPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPEmpleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addGap(18, 18, 18)
                .addComponent(cbPAgri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPMerc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPIgl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPProj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPMaes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSoloEmpleoPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPObr)
                    .addComponent(tfPObr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSoloEmpleoPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPOtro)
                    .addComponent(tfPOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel91.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel91.setText("MADRE O TUTORA");

        jLabel93.setText("La madre o guardiana");

        cbxMEmpleo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Está empleada regularmente", "Está empleada a veces", "No está empleada", "No hay madre o guardiana" }));
        cbxMEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMEmpleoActionPerformed(evt);
            }
        });

        cbMAgri.setBackground(new java.awt.Color(255, 255, 255));
        cbMAgri.setText("Agricultora");

        cbMMerc.setBackground(new java.awt.Color(255, 255, 255));
        cbMMerc.setText("Vende en el mercado");

        cbMIgl.setBackground(new java.awt.Color(255, 255, 255));
        cbMIgl.setText("Trabajadora en la iglesia");

        cbMProj.setBackground(new java.awt.Color(255, 255, 255));
        cbMProj.setText("Trabajadora en el proyecto");

        cbMMaes.setBackground(new java.awt.Color(255, 255, 255));
        cbMMaes.setText("Maestra (Profesora)");

        cbMObr.setBackground(new java.awt.Color(255, 255, 255));
        cbMObr.setText("Obrera");
        cbMObr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMObrActionPerformed(evt);
            }
        });

        tfMObr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMObrKeyReleased(evt);
            }
        });

        cbMOtro.setBackground(new java.awt.Color(255, 255, 255));
        cbMOtro.setText("Otro");
        cbMOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMOtroActionPerformed(evt);
            }
        });

        tfMOtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMOtroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnEmpleosPadLayout = new javax.swing.GroupLayout(pnEmpleosPad);
        pnEmpleosPad.setLayout(pnEmpleosPadLayout);
        pnEmpleosPadLayout.setHorizontalGroup(
            pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmpleosPadLayout.createSequentialGroup()
                .addComponent(pnSoloEmpleoPad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEmpleosPadLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel91))
                    .addGroup(pnEmpleosPadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEmpleosPadLayout.createSequentialGroup()
                                .addGroup(pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMObr)
                                    .addComponent(cbMOtro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMObr, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnEmpleosPadLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxMEmpleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbMMerc)
                            .addComponent(cbMMaes)
                            .addComponent(cbMProj)
                            .addComponent(cbMIgl)
                            .addComponent(cbMAgri))))
                .addGap(0, 109, Short.MAX_VALUE))
        );
        pnEmpleosPadLayout.setVerticalGroup(
            pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSoloEmpleoPad, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
            .addGroup(pnEmpleosPadLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel91)
                .addGap(18, 18, 18)
                .addGroup(pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMEmpleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addGap(18, 18, 18)
                .addComponent(cbMAgri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMMerc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMIgl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMProj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMMaes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMObr)
                    .addComponent(tfMObr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnEmpleosPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMOtro)
                    .addComponent(tfMOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnContent4.add(pnEmpleosPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 353));

        pnNumFam.setBackground(new java.awt.Color(255, 255, 255));
        pnNumFam.setPreferredSize(new java.awt.Dimension(850, 193));
        pnNumFam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel94.setText("NÚMERO DE MIEMBROS DE LA FAMILIA");
        pnNumFam.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 12, -1, -1));

        jLabel95.setText("Número de miembros de la familia menores de 18 años de edad (Incluyendo a este niño):");
        pnNumFam.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 51, -1, -1));

        jLabel96.setText("Hijos:");
        pnNumFam.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 76, -1, -1));

        jLabel97.setText("Hijas:");
        pnNumFam.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 76, -1, -1));

        jLabel98.setText("Hermano (os) y/o hermana (as) registrados en Compassion:");
        pnNumFam.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 96, -1, -1));

        jLabel99.setText("1-");
        pnNumFam.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 116, 16, -1));

        jLabel100.setText("2-");
        pnNumFam.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 136, 16, -1));

        btENumMiemFam.setText("...");
        btENumMiemFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btENumMiemFamActionPerformed(evt);
            }
        });
        pnNumFam.add(btENumMiemFam, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 47, 19, -1));

        lbNHijos.setText("0");
        pnNumFam.add(lbNHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 76, -1, -1));

        lbNHijas.setText("0");
        pnNumFam.add(lbNHijas, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 76, -1, -1));

        lbPHno.setText("                                                                                                ");
        pnNumFam.add(lbPHno, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 116, -1, -1));

        lbSHno.setText("                                                                                                ");
        pnNumFam.add(lbSHno, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 136, -1, -1));

        pnContent4.add(pnNumFam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 160));

        pnComent.setBackground(new java.awt.Color(255, 255, 255));
        pnComent.setPreferredSize(new java.awt.Dimension(850, 193));

        jLabel101.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel101.setText("COMENTARIOS GENERALES");

        jLabel102.setText("Incluye cualquier información adicional: Detalles médicos, escolares, familiares, etc.");

        taComentarios.setColumns(20);
        taComentarios.setLineWrap(true);
        taComentarios.setRows(5);
        taComentarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnComentLayout = new javax.swing.GroupLayout(pnComent);
        pnComent.setLayout(pnComentLayout);
        pnComentLayout.setHorizontalGroup(
            pnComentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComentLayout.createSequentialGroup()
                .addGroup(pnComentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnComentLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel101))
                    .addGroup(pnComentLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel102))
                    .addGroup(pnComentLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(taComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnComentLayout.setVerticalGroup(
            pnComentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnContent4.add(pnComent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        javax.swing.GroupLayout pnPag4Layout = new javax.swing.GroupLayout(pnPag4);
        pnPag4.setLayout(pnPag4Layout);
        pnPag4Layout.setHorizontalGroup(
            pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag4Layout.createSequentialGroup()
                .addGroup(pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnContent4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        pnPag4Layout.setVerticalGroup(
            pnPag4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPag4Layout.createSequentialGroup()
                .addComponent(pnContent4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        tabbed.addTab("Página 4", pnPag4);

        jScrollPane1.setViewportView(tabbed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar1ActionPerformed

    private void btGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar1ActionPerformed
        
        D_Historia his = new D_Historia();
        
        String a,b,c,d,e,f,g,a2,b2,c2,d2,e2,f2,g2,h2,i2,j2,k2,l2,m2,n2,
               a3,b3,c3,d3,e3,f3,g3,h3,i3,j3,k3,l3,m3,n3,o3,p3,q3,r3,s3,t3,u3,v3,w3,x3,y3,z3;
        
        //Actividades cristianas
        if (cbEscDominical.isSelected()) a = "1";
        else a = "0";

        if (cbSocJovenes.isSelected()) b = "1";
        else b = "0";
        
        if (cbClaseBib.isSelected()) c = "1";
        else c = "0";
        
        if (cbCampamento.isSelected()) d = "1";
        else d = "0";
        
        if (cbEscBibVac.isSelected()) e = "1";
        else e = "0";
        
        if (cbCoro.isSelected()) f = "1";
        else f = "0";
        
        if (cbOtraAct.isSelected()) g = "1";
        else g = "0";
        
        //Obligaciones familiares
        if (cbLavaRopa.isSelected()) a2 = "1";
        else a2 = "0";
        
        if (cbHuerto.isSelected()) b2 = "1";
        else b2 = "0";
        
        if (cbMandados.isSelected()) c2 = "1";
        else c2 = "0";
        
        if (cbCamas.isSelected()) d2 = "1";
        else d2 = "0";
        
        if (cbLimpieza.isSelected()) e2 = "1";
        else e2 = "0";
        
        if (cbCuidaAnimals.isSelected()) f2 = "1";
        else f2 = "0";
        
        if (cbRecogeAgua.isSelected()) g2 = "1";
        else g2 = "0";
        
        if (cbCuidaNinos.isSelected()) h2 = "1";
        else h2 = "0";
        
        if (cbCostura.isSelected()) i2 = "1";
        else i2 = "0";
        
        if (cbLena.isSelected()) j2 = "1";
        else j2 = "0";
        
        if (cbEnsenaOtros.isSelected()) k2 = "1";
        else k2 = "0";
        
        if (cbCVMercado.isSelected()) l2 = "1";
        else l2 = "0";
        
        if (cbCocina.isSelected()) m2 = "1";
        else m2 = "0";
        
        if (cbOtraObl.isSelected()) n2 = "1";
        else n2 = "0";
        
        //Pasatiempos y deportes
        if (cbMunecas.isSelected()) a3 = "1";
        else a3 = "0";
        
        if (cbJuegosGrupo.isSelected()) b3 = "1";
        else b3 = "0";
        
        if (cbFutbol.isSelected()) c3 = "1";
        else c3 = "0";
        
        if (cbBicicleta.isSelected()) d3 = "1";
        else d3 = "0";
        
        if (cbCasita.isSelected()) e3 = "1";
        else e3 = "0";
        
        if (cbHulla.isSelected()) f3 = "1";
        else f3 = "0";
        
        if (cbBeisbol.isSelected()) g3 = "1";
        else g3 = "0";
        
        if (cbCaminatas.isSelected()) h3 = "1";
        else h3 = "0";
        
        if (cbMacateta.isSelected()) i3 = "1";
        else i3 = "0";
        
        if (cbCanicas.isSelected()) j3 = "1";
        else j3 = "0";
        
        if (cbBasket.isSelected()) k3 = "1";
        else k3 = "0";
        
        if (cbNadar.isSelected()) l3 = "1";
        else l3 = "0";
        
        if (cbEscondidas.isSelected()) m3 = "1";
        else m3 = "0";
        
        if (cbCarros.isSelected()) n3 = "1";
        else n3 = "0";
        
        if (cbVolibol.isSelected()) o3 = "1";
        else o3 = "0";
        
        if (cbCorrer.isSelected()) p3 = "1";
        else p3 = "0";
        
        if (cbLeer.isSelected()) q3 = "1";
        else q3 = "0";
        
        if (cbArte.isSelected()) r3 = "1";
        else r3 = "0";
        
        if (cbPingPong.isSelected()) s3 = "1";
        else s3 = "0";
        
        if (cbSaltarSoga.isSelected()) t3 = "1";
        else t3 = "0";
        
        if (cbCantar.isSelected()) u3 = "1";
        else u3 = "0";
        
        if (cbMusica.isSelected()) v3 = "1";
        else v3 = "0";
        
        if (cbJuegoPelota.isSelected()) w3 = "1";
        else w3 = "0";
        
        if (cbContarHist.isSelected()) x3 = "1";
        else x3 = "0";
        
        if (cbMusicales.isSelected()) y3 = "1";
        else y3 = "0";
        
        if (cbOtrosPastDep.isSelected()) z3 = "1";
        else z3 = "0";
        
        String actvs = a+b+c+d+e+f+g;
        String oblig = a2+b2+c2+d2+e2+f2+g2+h2+i2+j2+k2+l2+m2+n2;
        String pasdep = a3+b3+c3+d3+e3+f3+g3+h3+i3+j3+k3+l3+m3+n3+o3+p3+q3+r3+s3+t3+u3+v3+w3+x3+y3+z3;
        
        int codigoAl = Integer.parseInt(lbCode.getText());
        
        if (his.saveActvCrist(codigoAl,actvs,tfOtraActv.getText())) {
            //JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
        }
        if (his.saveOblig(codigoAl,oblig,tfOtraObl.getText())) {
            //JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
        }
        if (his.savePasdep(codigoAl, pasdep, tfOtroInstMus.getText(), tfOtroPasat.getText())) {
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
            //tabbed.setEnabledAt(0, false);
            tabbed.setEnabledAt(1, true);
        }
    }//GEN-LAST:event_btGuardar1ActionPerformed

    private void btGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar2ActionPerformed
        int codigoAl = Integer.parseInt(lbCode.getText());
        
        D_Historia his2 = new D_Historia();
        
        String a,b,c,d,e,f;
        
        //Impedimentos
        if (cbNinguna.isSelected()) a = "1";
        else a = "0";

        if (cbEpilepsia.isSelected()) b = "1";
        else b = "0";
        
        if (cbAsma.isSelected()) c = "1";
        else c = "0";
        
        if (cbPolio.isSelected()) d = "1";
        else d = "0";
        
        if (cbRetardo.isSelected()) e = "1";
        else e = "0";
        
        if (cbOtra.isSelected()) f = "1";
        else f = "0";
        
        String impedimentos = a+b+c+d+e+f;
        String tratMed = bgTratMedico.getSelection().getActionCommand();
        String recMed = bgRecibMedicina.getSelection().getActionCommand();
        
        if (his2.saveImpedimentos(codigoAl, impedimentos, tfOtroImped.getText().toString(), cbxColumna.getSelectedItem().toString(),
cbxPieIzq.getSelectedItem().toString(), cbxPieDer.getSelectedItem().toString(), cbxManoIzq.getSelectedItem().toString(),
cbxManoDer.getSelectedItem().toString(), cbxPierIzq.getSelectedItem().toString(), cbxPierDer.getSelectedItem().toString(),
cbxBrazIzq.getSelectedItem().toString(), cbxBrazDer.getSelectedItem().toString(), cbxHabla.getSelectedItem().toString(),
cbxOidoIzq.getSelectedItem().toString(), cbxOidoDer.getSelectedItem().toString(), cbxOjoIzq.getSelectedItem().toString(),
cbxOjoDer.getSelectedItem().toString(), tratMed, recMed)) {
            //JOptionPane.showMessageDialog(null, "Datos de los impedimentos del niño han sido guardados correctamente");
        }
        
        //Estudios
        int asiste = Integer.parseInt(bgAsisteEscuela.getSelection().getActionCommand());
        String razon = "";
        if (!"".equals(tfOtraRazon.getText())) {
            razon = tfOtraRazon.getText();
        } else {
            razon = cbxRazon.getSelectedItem().toString();
        }
        
        String nivelAcad = "";
        int anioAcad = 0;
        if (cbxNPreKinder.getSelectedIndex()!=0) {
            nivelAcad = "Pre-Kinder";
            anioAcad = Integer.parseInt(cbxNPreKinder.getSelectedItem().toString());
        }
        if (cbxNKinder.getSelectedIndex()!=0) {
            nivelAcad = "Kindergarden";
            anioAcad = Integer.parseInt(cbxNKinder.getSelectedItem().toString());
        }
        if (cbxNPrimaria.getSelectedIndex()!=0) {
            nivelAcad = "Primaria";
            anioAcad = Integer.parseInt(cbxNPrimaria.getSelectedItem().toString());
        }
        if (cbxNBasico.getSelectedIndex()!=0) {
            nivelAcad = "Básico";
            anioAcad = Integer.parseInt(cbxNBasico.getSelectedItem().toString());
        }
        if (cbxNSecundaria.getSelectedIndex()!=0) {
            nivelAcad = "Secundaria";
            anioAcad = Integer.parseInt(cbxNSecundaria.getSelectedItem().toString());
        }
        int nvocac = Integer.parseInt(cbxNVocac.getSelectedItem().toString());
        int naprez = Integer.parseInt(cbxNAprez.getSelectedItem().toString());
        int nuniv = Integer.parseInt(cbxNUniv.getSelectedItem().toString());
        int notro = Integer.parseInt(cbxNOtro.getSelectedItem().toString());
        
        String rend = bgRendimientoEscolar.getSelection().getActionCommand();
        String materia = cbxMateria.getSelectedItem().toString();
        String fSec = ((JTextField)datecSec.getDateEditor().getUiComponent()).getText();
        String fUni = ((JTextField)datecUniv.getDateEditor().getUiComponent()).getText();
        String fBib = ((JTextField)datecBib.getDateEditor().getUiComponent()).getText();
        String fVoc = ((JTextField)datecVoc.getDateEditor().getUiComponent()).getText();
        String fOtr = ((JTextField)datecOtro.getDateEditor().getUiComponent()).getText();
       
        if (his2.saveEstudios(codigoAl,asiste,razon,nivelAcad,anioAcad,"5",nvocac,tfCEVocac.getText(),
naprez,tfCEAprez.getText(),nuniv,tfCEUniv.getText(),notro,tfCEOtro.getText(),rend,materia,fSec,tfCESec.getText(),
fUni,tfCEUniv2.getText(),fBib,tfCEBib.getText(),fVoc,tfCEVocac2.getText(),fOtr,tfCEOtro2.getText())) {            
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            tabbed.setEnabledAt(2, true);
        }
    }//GEN-LAST:event_btGuardar2ActionPerformed

    private void btCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar2ActionPerformed

    private void btGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar3ActionPerformed
        D_Historia his3 = new D_Historia();
        
        int codeA = Integer.parseInt(lbCode.getText());

        String rend = bgRendimientoEscolar.getSelection().getActionCommand();
        String materia = cbxMateria.getSelectedItem().toString();
        String fSec = ((JTextField)datecSec.getDateEditor().getUiComponent()).getText();
        String fUni = ((JTextField)datecUniv.getDateEditor().getUiComponent()).getText();
        String fBib = ((JTextField)datecBib.getDateEditor().getUiComponent()).getText();
        String fVoc = ((JTextField)datecVoc.getDateEditor().getUiComponent()).getText();
        String fOtr = ((JTextField)datecOtro.getDateEditor().getUiComponent()).getText();
        //Actualizar Estudios
        if (his3.updateEstudios(codeA, rend,materia,fSec,tfCESec.getText(),
fUni,tfCEUniv2.getText(),fBib,tfCEBib.getText(),fVoc,tfCEVocac2.getText(),fOtr,tfCEOtro2.getText())) {
            
        }
        
        String juntos = bgJuntosPadres.getSelection().getActionCommand();
        String ecivil = "";
        if ("Ahora casados".equals(cbxECivil.getSelectedItem())) {
            ecivil = "Casados";
        }
        if ("Nunca eran casados".equals(cbxECivil.getSelectedItem())) {
            ecivil = "Unidos";
        }
        if ("Eran casados, ahora separados divorciados o separados permanentemente".equals(cbxECivil.getSelectedItem())) {
            ecivil = "Divorciados";
        }
        if ("Eran casados, ahora separados por muerte".equals(cbxECivil.getSelectedItem())) {
            ecivil = "Viuda(o)";
        }
        if ("Desconocido".equals(cbxECivil.getSelectedItem())) {
            ecivil = "Desconocido";
        }
        
        String p , m , aj , a = "", b = "", c = "";

        if (cbTutelaMasculina.isSelected()) p = "1";
        else p = "0";
        
        if (cbTutelaFemenina.isSelected()) m = "1";
        else m = "0";
        
        if (cbTutelaAjena.isSelected()) aj = "1";
        else aj = "0";
        
        if (!"".equals(cbxTutorMasc.getSelectedItem().toString())) {
            a = cbxTutorMasc.getSelectedItem().toString();
        }else{
            a = "nada";
        }
        if (!"".equals(cbxTutorFem.getSelectedItem().toString())) {
            b = cbxTutorFem.getSelectedItem().toString();
        }else{
            b = "nada";
        }
        if (!"".equals(cbxTutorAjeno.getSelectedItem().toString())) {
            c = cbxTutorAjeno.getSelectedItem().toString();
        }else{
            c = "nada";
        }

        String checks = p + m + aj;
        String tutela = a +","+ b +","+ c;

        his3.saveTutela(codeA, checks, tutela);

        his3.savePadresNaturales(codeA, juntos, ecivil);
        
        String pVivo = cbxPadreVivo.getSelectedItem().toString();
        
        if (pVivo.equals("No")) {
            IHistory.cbxPEmpleo.setSelectedIndex(3);
            IHistory.cbxPEmpleo.setEnabled(false);
        } else {
            IHistory.cbxPEmpleo.setSelectedIndex(0);
            IHistory.cbxPEmpleo.setEnabled(true);
        }
        
        String pCNino = cbxPcNino.getSelectedItem().toString();
        String pFinz = cbxPFinanz.getSelectedItem().toString();
        String pImp = cbxPImpd.getSelectedItem().toString();
        String pCrEnf = cbxPCrEnf.getSelectedItem().toString();
        String pMen = cbxPMentEnf.getSelectedItem().toString();
        String pCar = cbxPCarc.getSelectedItem().toString();
        his3.savePadreNat(codeA,pVivo,pCNino,pFinz,pImp,tfPCImpd.getText(),pCrEnf,tfPCrEnf.getText(),pMen,pCar);
        
        String mVivo = cbxMadreViva.getSelectedItem().toString();
        
        if (mVivo.equals("No")) {
            IHistory.cbxMEmpleo.setSelectedIndex(3);
            IHistory.cbxMEmpleo.setEnabled(false);
        } else {
            IHistory.cbxMEmpleo.setSelectedIndex(0);
            IHistory.cbxMEmpleo.setEnabled(true);
        }
        
        String mCNino = cbxMcNino.getSelectedItem().toString();
        String mFinz = cbxMFinanz.getSelectedItem().toString();
        String mImp = cbxMImpd.getSelectedItem().toString();
        String mCrEnf = cbxMCrEnf.getSelectedItem().toString();
        String mMen = cbxMMentEnf.getSelectedItem().toString();
        String mCar = cbxMCarc.getSelectedItem().toString();
        
        if (his3.saveMadreNat(codeA,mVivo,mCNino,mFinz,mImp,tfMCImpd.getText(),mCrEnf,tfMCrEnf.getText(),mMen,mCar)) {
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            tabbed.setEnabledAt(3, true);
        }
    }//GEN-LAST:event_btGuardar3ActionPerformed

    private void btCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar3ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar3ActionPerformed

    private void btGuardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar4ActionPerformed
        D_Historia his3 = new D_Historia();
        
        int codeA = Integer.parseInt(lbCode.getText());
        
        String a,b,c,d,e,f,g;
        
        if (cbPAgri.isSelected()) a = "1";
        else a = "0";
        
        if (cbPMerc.isSelected()) b = "1";
        else b = "0";
        
        if (cbPIgl.isSelected()) c = "1";
        else c = "0";
        
        if (cbPProj.isSelected()) d = "1";
        else d = "0";
        
        if (cbPMaes.isSelected()) e = "1";
        else e = "0";
        
        if (cbPObr.isSelected()) f = "1";
        else f = "0";
        
        if (cbPOtro.isSelected()) g = "1";
        else g = "0";
        
        String oficios = a+b+c+d+e+f+g;
        
        his3.saveEmpleoTutor(codeA, cbxPEmpleo.getSelectedItem().toString(),oficios, tfPObr.getText(), tfPOtro.getText());
        
        String aa,bb,cc,dd,ee,ff,gg;
        
        if (cbMAgri.isSelected()) aa = "1";
        else aa = "0";
        
        if (cbMMerc.isSelected()) bb = "1";
        else bb = "0";
        
        if (cbMIgl.isSelected()) cc = "1";
        else cc = "0";
        
        if (cbMProj.isSelected()) dd = "1";
        else dd = "0";
        
        if (cbMMaes.isSelected()) ee = "1";
        else ee = "0";
        
        if (cbMObr.isSelected()) ff = "1";
        else ff = "0";
        
        if (cbMOtro.isSelected()) gg = "1";
        else gg = "0";
        
        String oficiosM = aa+bb+cc+dd+ee+ff+gg;
        
        his3.saveEmpleoTutora(codeA, cbxMEmpleo.getSelectedItem().toString(),oficiosM, tfMObr.getText(), tfMOtro.getText());
        
        his3.updatePadresNat(codeA, Integer.parseInt(lbNHijos.getText()), Integer.parseInt(lbNHijas.getText()), lbPHno.getText(), lbSHno.getText());
        
        if (his3.saveHistoria(codeA, taComentarios.getText())) {
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        }
    }//GEN-LAST:event_btGuardar4ActionPerformed

    private void btCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar4ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar4ActionPerformed

    
    private void btEditDataGralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditDataGralesActionPerformed
        DEditarAlumno eDG = new DEditarAlumno(JOptionPane.getFrameForComponent(this), true);
        eDG.setLocationRelativeTo(null);
        eDG.setVisible(true);
    }//GEN-LAST:event_btEditDataGralesActionPerformed

    private void cbNingunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNingunaActionPerformed
        cbEpilepsia.setSelected(false);
        cbAsma.setSelected(false);
        cbPolio.setSelected(false);
        cbRetardo.setSelected(false);
        cbOtra.setSelected(false);
        tfOtroImped.setText("");
        tfOtroImped.setEditable(false);
        cbNinguna.setSelected(true);
    }//GEN-LAST:event_cbNingunaActionPerformed

    private void cbOtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtraActionPerformed
        if (cbOtra.isSelected()) {
            tfOtroImped.setEditable(true);
            cbOtra.transferFocus();
            cbNinguna.setSelected(false);
        } else {
            tfOtroImped.setEditable(false);
            tfOtroImped.setText("");
        }
    }//GEN-LAST:event_cbOtraActionPerformed

    private void cbEpilepsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEpilepsiaActionPerformed
        cbNinguna.setSelected(false);
    }//GEN-LAST:event_cbEpilepsiaActionPerformed

    private void cbAsmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsmaActionPerformed
        cbNinguna.setSelected(false);
    }//GEN-LAST:event_cbAsmaActionPerformed

    private void cbPolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPolioActionPerformed
        cbNinguna.setSelected(false);
    }//GEN-LAST:event_cbPolioActionPerformed

    private void cbRetardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRetardoActionPerformed
        cbNinguna.setSelected(false);
    }//GEN-LAST:event_cbRetardoActionPerformed

    private void rbNoAsisteEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoAsisteEscActionPerformed
        D_Historia his = new D_Historia();
        his.asisteEscuela();
    }//GEN-LAST:event_rbNoAsisteEscActionPerformed

    private void rbSiAsisteEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiAsisteEscActionPerformed
        D_Historia his = new D_Historia();
        his.asisteEscuela();
    }//GEN-LAST:event_rbSiAsisteEscActionPerformed

    private void cbxPImpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPImpdActionPerformed
        if (cbxPImpd.getSelectedItem() == "Si") {
            tfPCImpd.setEditable(true);
            cbxPImpd.transferFocus();
        } else {
            tfPCImpd.setEditable(false);
            tfPCImpd.setText("");
        }
    }//GEN-LAST:event_cbxPImpdActionPerformed

    private void cbxMImpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMImpdActionPerformed
        if (cbxMImpd.getSelectedItem() == "Si") {
            tfMCImpd.setEditable(true);
            cbxMImpd.transferFocus();
        } else {
            tfMCImpd.setEditable(false);
            tfMCImpd.setText("");
        }
    }//GEN-LAST:event_cbxMImpdActionPerformed

    private void cbxPadreVivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPadreVivoActionPerformed
        desconocerPadre();
    }//GEN-LAST:event_cbxPadreVivoActionPerformed

    private void cbxMadreVivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMadreVivaActionPerformed
        desconocerMadre();
    }//GEN-LAST:event_cbxMadreVivaActionPerformed

    private void cbxPEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPEmpleoActionPerformed
        if (cbxPEmpleo.getSelectedItem()=="No está empleado" || cbxPEmpleo.getSelectedItem()=="No hay padre o guardián") {
            cbPAgri.setSelected(false);
            cbPAgri.setEnabled(false);
            cbPMerc.setSelected(false);
            cbPMerc.setEnabled(false);
            cbPIgl.setSelected(false);
            cbPIgl.setEnabled(false);
            cbPProj.setSelected(false);
            cbPProj.setEnabled(false);
            cbPMaes.setSelected(false);
            cbPMaes.setEnabled(false);
            cbPObr.setSelected(false);
            cbPObr.setEnabled(false);
            tfPObr.setText("");
            tfPObr.setEnabled(false);
            cbPOtro.setSelected(false);
            cbPOtro.setEnabled(false);
            tfPOtro.setText("");
            tfPOtro.setEnabled(false);
        } else {
            cbPAgri.setEnabled(true);
            cbPMerc.setEnabled(true);
            cbPIgl.setEnabled(true);
            cbPProj.setEnabled(true);
            cbPMaes.setEnabled(true);
            cbPObr.setEnabled(true);
            tfPObr.setEnabled(true);
            cbPOtro.setEnabled(true);
            tfPOtro.setEnabled(true);            
        }
    }//GEN-LAST:event_cbxPEmpleoActionPerformed

    private void cbPObrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPObrActionPerformed
        if (cbPObr.isSelected()) {
            tfPObr.setEditable(true);
            cbPObr.transferFocus();            
        } else {
            tfPObr.setEditable(false);
            tfPObr.setText("");
        }
    }//GEN-LAST:event_cbPObrActionPerformed

    private void cbPOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPOtroActionPerformed
        if (cbPOtro.isSelected()) {
            tfPOtro.setEditable(true);
            cbPOtro.transferFocus();            
        } else {
            tfPOtro.setEditable(false);
            tfPOtro.setText("");
        }
    }//GEN-LAST:event_cbPOtroActionPerformed

    private void cbMObrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMObrActionPerformed
        if (cbMObr.isSelected()) {
            tfMObr.setEditable(true);
            cbMObr.transferFocus();            
        } else {
            tfMObr.setEditable(false);
            tfMObr.setText("");
        }
    }//GEN-LAST:event_cbMObrActionPerformed

    private void cbMOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMOtroActionPerformed
        if (cbMOtro.isSelected()) {
            tfMOtro.setEditable(true);
            cbMOtro.transferFocus();            
        } else {
            tfMOtro.setEditable(false);
            tfMOtro.setText("");
        }
    }//GEN-LAST:event_cbMOtroActionPerformed

    private void cbxMEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMEmpleoActionPerformed
        if (cbxMEmpleo.getSelectedItem()=="No está empleada" || cbxMEmpleo.getSelectedItem()=="No hay madre o guardiana") {
            cbMAgri.setSelected(false);
            cbMAgri.setEnabled(false);
            cbMMerc.setSelected(false);
            cbMMerc.setEnabled(false);
            cbMIgl.setSelected(false);
            cbMIgl.setEnabled(false);
            cbMProj.setSelected(false);
            cbMProj.setEnabled(false);
            cbMMaes.setSelected(false);
            cbMMaes.setEnabled(false);
            cbMObr.setSelected(false);
            cbMObr.setEnabled(false);
            tfMObr.setText("");
            tfMObr.setEnabled(false);
            cbMOtro.setSelected(false);
            cbMOtro.setEnabled(false);
            tfMOtro.setText("");
            tfMOtro.setEnabled(false);
        } else {
            cbMAgri.setEnabled(true);
            cbMMerc.setEnabled(true);
            cbMIgl.setEnabled(true);
            cbMProj.setEnabled(true);
            cbMMaes.setEnabled(true);
            cbMObr.setEnabled(true);
            tfMObr.setEnabled(true);
            cbMOtro.setEnabled(true);
            tfMOtro.setEnabled(true);            
        }
    }//GEN-LAST:event_cbxMEmpleoActionPerformed

    private void btENumMiemFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btENumMiemFamActionPerformed
        DNumMiemFam nmm = new DNumMiemFam(JOptionPane.getFrameForComponent(this), true);
        nmm.setLocationRelativeTo(null);
        nmm.setVisible(true);
    }//GEN-LAST:event_btENumMiemFamActionPerformed

    private void cbxRazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRazonActionPerformed
        if (cbxRazon.getSelectedItem()=="Otra razón") {
            tfOtraRazon.setEditable(true);
            cbxRazon.transferFocus();
        }else{
            tfOtraRazon.setText("");
            tfOtraRazon.setEditable(false);
        }
    }//GEN-LAST:event_cbxRazonActionPerformed

    private void tfOtraActvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtraActvKeyReleased
        if(!tfOtraActv.getText().matches(letras)){
            tfOtraActv.setText("");
        }
    }//GEN-LAST:event_tfOtraActvKeyReleased

    private void tfOtraOblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtraOblKeyReleased
        if(!tfOtraObl.getText().matches(letras)){
            tfOtraObl.setText("");
        }
    }//GEN-LAST:event_tfOtraOblKeyReleased

    private void tfOtroInstMusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtroInstMusKeyReleased
        if(!tfOtroInstMus.getText().matches(letras)){
            tfOtroInstMus.setText("");
        }
    }//GEN-LAST:event_tfOtroInstMusKeyReleased

    private void tfOtroPasatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtroPasatKeyReleased
        if(!tfOtroPasat.getText().matches(letras)){
            tfOtroPasat.setText("");
        }
    }//GEN-LAST:event_tfOtroPasatKeyReleased

    private void tfOtroImpedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtroImpedKeyReleased
        if(!tfOtroImped.getText().matches(letras)){
            tfOtroImped.setText("");
        }
    }//GEN-LAST:event_tfOtroImpedKeyReleased

    private void tfOtraRazonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOtraRazonKeyReleased
        if(!tfOtraRazon.getText().matches(letras)){
            tfOtraRazon.setText("");
        }
    }//GEN-LAST:event_tfOtraRazonKeyReleased

    private void tfCEVocacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCEVocacKeyReleased
        if(!tfCEVocac.getText().matches(letras)){
            tfCEVocac.setText("");
        }
    }//GEN-LAST:event_tfCEVocacKeyReleased

    private void tfCEAprezKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCEAprezKeyReleased
        if(!tfCEAprez.getText().matches(letras)){
            tfCEAprez.setText("");
        }
    }//GEN-LAST:event_tfCEAprezKeyReleased

    private void tfCEUnivKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCEUnivKeyReleased
        if(!tfCEUniv.getText().matches(letras)){
            tfCEUniv.setText("");
        }
    }//GEN-LAST:event_tfCEUnivKeyReleased

    private void tfCEOtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCEOtroKeyReleased
        if(!tfCEOtro.getText().matches(letras)){
            tfCEOtro.setText("");
        }
    }//GEN-LAST:event_tfCEOtroKeyReleased

    private void tfCESecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCESecKeyReleased
        if(!tfCESec.getText().matches(letras)){
            tfCESec.setText("");
        }
    }//GEN-LAST:event_tfCESecKeyReleased

    private void tfCEUniv2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCEUniv2KeyReleased
        if(!tfCEUniv2.getText().matches(letras)){
            tfCEUniv2.setText("");
        }
    }//GEN-LAST:event_tfCEUniv2KeyReleased

    private void tfCEBibKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCEBibKeyReleased
        if(!tfCEBib.getText().matches(letras)){
            tfCEBib.setText("");
        }
    }//GEN-LAST:event_tfCEBibKeyReleased

    private void tfCEVocac2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCEVocac2KeyReleased
        if(!tfCEVocac2.getText().matches(letras)){
            tfCEVocac2.setText("");
        }
    }//GEN-LAST:event_tfCEVocac2KeyReleased

    private void tfCEOtro2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCEOtro2KeyReleased
        if(!tfCEOtro2.getText().matches(letras)){
            tfCEOtro2.setText("");
        }
    }//GEN-LAST:event_tfCEOtro2KeyReleased

    private void tfPCImpdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPCImpdKeyReleased
        if(!tfPCImpd.getText().matches(letras)){
            tfPCImpd.setText("");
        }
    }//GEN-LAST:event_tfPCImpdKeyReleased

    private void tfPCrEnfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPCrEnfKeyReleased
        if(!tfPCrEnf.getText().matches(letras)){
            tfPCrEnf.setText("");
        }
    }//GEN-LAST:event_tfPCrEnfKeyReleased

    private void tfMCImpdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMCImpdKeyReleased
        if(!tfMCImpd.getText().matches(letras)){
            tfMCImpd.setText("");
        }
    }//GEN-LAST:event_tfMCImpdKeyReleased

    private void tfMCrEnfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMCrEnfKeyReleased
        if(!tfMCrEnf.getText().matches(letras)){
            tfMCrEnf.setText("");
        }
    }//GEN-LAST:event_tfMCrEnfKeyReleased

    private void tfPObrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPObrKeyReleased
        if(!tfPObr.getText().matches(letras)){
            tfPObr.setText("");
        }
    }//GEN-LAST:event_tfPObrKeyReleased

    private void tfPOtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPOtroKeyReleased
        if(!tfPOtro.getText().matches(letras)){
            tfPOtro.setText("");
        }
    }//GEN-LAST:event_tfPOtroKeyReleased

    private void tfMObrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMObrKeyReleased
        if(!tfMObr.getText().matches(letras)){
            tfMObr.setText("");
        }
    }//GEN-LAST:event_tfMObrKeyReleased

    private void tfMOtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMOtroKeyReleased
        if(!tfMOtro.getText().matches(letras)){
            tfMOtro.setText("");
        }
    }//GEN-LAST:event_tfMOtroKeyReleased

    private void cbOtraActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtraActActionPerformed
        if (cbOtraAct.isSelected()) {
            tfOtraActv.setEditable(true);
            cbOtraAct.transferFocus();
        } else {
            tfOtraActv.setText("");
            tfOtraActv.setEditable(false);
        }
    }//GEN-LAST:event_cbOtraActActionPerformed

    private void cbOtraOblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtraOblActionPerformed
        if (cbOtraObl.isSelected()) {
            tfOtraObl.setEditable(true);
            cbOtraObl.transferFocus();
        } else {
            tfOtraObl.setText("");
            tfOtraObl.setEditable(false);
        }
    }//GEN-LAST:event_cbOtraOblActionPerformed

    private void cbMusicalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMusicalesActionPerformed
        if (cbMusicales.isSelected()) {
            tfOtroInstMus.setEditable(true);
            cbMusicales.transferFocus();
        } else {
            tfOtroInstMus.setText("");
            tfOtroInstMus.setEditable(false);
        }
    }//GEN-LAST:event_cbMusicalesActionPerformed

    private void cbOtrosPastDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtrosPastDepActionPerformed
        if (cbOtrosPastDep.isSelected()) {
            tfOtroPasat.setEditable(true);
            cbOtrosPastDep.transferFocus();
        } else {
            tfOtroPasat.setText("");
            tfOtroPasat.setEditable(false);
        }
    }//GEN-LAST:event_cbOtrosPastDepActionPerformed

    private void cbTutelaAjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTutelaAjenaActionPerformed
        if (!cbTutelaMasculina.isSelected() && !cbTutelaFemenina.isSelected()) {
            cbTutelaAjena.setSelected(true);
        }
        if (cbTutelaAjena.isSelected()) {
            cbTutelaMasculina.setSelected(false);
            cbTutelaFemenina.setSelected(false);
            
            cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { "Amigos","Trabajadores institucionales","Padres adoptivos","Otros parientes"}
            ));
            
            cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { ""}
            ));
            cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { ""}
            ));
        } else {
            cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { ""}
            ));
        }
        
    }//GEN-LAST:event_cbTutelaAjenaActionPerformed

    private void cbTutelaFemeninaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTutelaFemeninaActionPerformed
        if (!cbTutelaMasculina.isSelected() && !cbTutelaAjena.isSelected()) {
            cbTutelaFemenina.setSelected(true);
        }
        tutela();
    }//GEN-LAST:event_cbTutelaFemeninaActionPerformed

    private void cbTutelaMasculinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTutelaMasculinaActionPerformed
        if (!cbTutelaAjena.isSelected() && !cbTutelaFemenina.isSelected()) {
            cbTutelaMasculina.setSelected(true);
        }
        tutela();
    }//GEN-LAST:event_cbTutelaMasculinaActionPerformed

    private void cbxPCarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPCarcActionPerformed
        
        if (cbxPCarc.getSelectedItem()=="Si") {
            padreContribuye();
        }else{
            padreContribuye();
        }
        
    }//GEN-LAST:event_cbxPCarcActionPerformed

    private void cbxPMentEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPMentEnfActionPerformed
        
        if (cbxPMentEnf.getSelectedItem() == "Si") {
            padreContribuye();
        }else{
            padreContribuye();
        }
        
    }//GEN-LAST:event_cbxPMentEnfActionPerformed

    private void cbxMMentEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMMentEnfActionPerformed
        
        if (cbxMMentEnf.getSelectedItem() == "Si") {
            madreContribuye();
        }else{
            madreContribuye();
        }
        
    }//GEN-LAST:event_cbxMMentEnfActionPerformed

    private void cbxMCarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMCarcActionPerformed
        
        if (cbxMCarc.getSelectedItem()=="Si") {
            madreContribuye();
        }else{
            madreContribuye();
        }
        
    }//GEN-LAST:event_cbxMCarcActionPerformed

    private void cbxPCrEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPCrEnfActionPerformed
        
        if (cbxPCrEnf.getSelectedItem() == "Si") {
            tfPCrEnf.setEditable(true);
            cbxPCrEnf.transferFocus();
            
            padreContribuye();
        } else {
            padreContribuye();
            tfPCrEnf.setEditable(false);
            tfPCrEnf.setText("");
        }
        
    }//GEN-LAST:event_cbxPCrEnfActionPerformed

    private void cbxMCrEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMCrEnfActionPerformed
        
        if (cbxMCrEnf.getSelectedItem() == "Si") {
            tfMCrEnf.setEditable(true);
            cbxMCrEnf.transferFocus();
            
            madreContribuye();
        } else {
            madreContribuye();
            tfMCrEnf.setEditable(false);
            tfMCrEnf.setText("");
        }
        
    }//GEN-LAST:event_cbxMCrEnfActionPerformed

    private void tabbedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedStateChanged
        if (pnPag2.isShowing()) {
            tabbed.setEnabledAt(0, false);
        }
        if (pnPag3.isShowing()) {
            tabbed.setEnabledAt(1, false);
        }
        if (pnPag4.isShowing()) {
            tabbed.setEnabledAt(2, false);
        }
    }//GEN-LAST:event_tabbedStateChanged

    private void cbxNVocacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNVocacActionPerformed
        
        if (cbxNVocac.getSelectedIndex()!=0) {
            tfCEVocac.setEditable(true);
            cbxNVocac.transferFocus();
        } else {
            tfCEVocac.setEditable(false);
            tfCEVocac.setText("");
        }
        
    }//GEN-LAST:event_cbxNVocacActionPerformed

    private void cbxNAprezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNAprezActionPerformed
        
        if (cbxNAprez.getSelectedIndex()!=0) {
            tfCEAprez.setEditable(true);
            cbxNAprez.transferFocus();
        } else {
            tfCEAprez.setEditable(false);
            tfCEAprez.setText("");
        }
        
    }//GEN-LAST:event_cbxNAprezActionPerformed

    private void cbxNUnivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNUnivActionPerformed
        if (cbxNUniv.getSelectedIndex()!=0) {
            tfCEUniv.setEditable(true);
            cbxNUniv.transferFocus();
        } else {
            tfCEUniv.setEditable(false);
            tfCEUniv.setText("");
        }
    }//GEN-LAST:event_cbxNUnivActionPerformed

    private void cbxNOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNOtroActionPerformed
        if (cbxNOtro.getSelectedIndex()!=0) {
            tfCEOtro.setEditable(true);
            cbxNOtro.transferFocus();
        } else {
            tfCEOtro.setEditable(false);
            tfCEOtro.setText("");
        }
    }//GEN-LAST:event_cbxNOtroActionPerformed

    private void cbxNPreKinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNPreKinderActionPerformed
        if (cbxNPreKinder.getSelectedIndex()!=0) {
            cbxNKinder.setSelectedIndex(0);
            cbxNPrimaria.setSelectedIndex(0);
            cbxNBasico.setSelectedIndex(0);
            cbxNSecundaria.setSelectedIndex(0);
            //lbNEU.setText(cbxNPreKinder.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbxNPreKinderActionPerformed

    private void cbxNKinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNKinderActionPerformed
        if (cbxNKinder.getSelectedIndex()!=0) {
            cbxNPreKinder.setSelectedIndex(0);
            cbxNPrimaria.setSelectedIndex(0);
            cbxNBasico.setSelectedIndex(0);
            cbxNSecundaria.setSelectedIndex(0);
            //lbNEU.setText(cbxNPreKinder.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbxNKinderActionPerformed

    private void cbxNPrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNPrimariaActionPerformed
        if (cbxNPrimaria.getSelectedIndex()!=0) {
            cbxNPreKinder.setSelectedIndex(0);
            cbxNKinder.setSelectedIndex(0);
            cbxNBasico.setSelectedIndex(0);
            cbxNSecundaria.setSelectedIndex(0);
            //lbNEU.setText(cbxNPreKinder.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbxNPrimariaActionPerformed

    private void cbxNBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNBasicoActionPerformed
        if (cbxNBasico.getSelectedIndex()!=0) {
            cbxNPreKinder.setSelectedIndex(0);
            cbxNKinder.setSelectedIndex(0);
            cbxNPrimaria.setSelectedIndex(0);
            cbxNSecundaria.setSelectedIndex(0);
            //lbNEU.setText(cbxNPreKinder.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbxNBasicoActionPerformed

    private void cbxNSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNSecundariaActionPerformed
        if (cbxNSecundaria.getSelectedIndex()!=0) {
            cbxNPreKinder.setSelectedIndex(0);
            cbxNKinder.setSelectedIndex(0);
            cbxNPrimaria.setSelectedIndex(0);
            cbxNBasico.setSelectedIndex(0);
            //lbNEU.setText(cbxNPreKinder.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbxNSecundariaActionPerformed

    private void cbxPcNinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPcNinoActionPerformed

    }//GEN-LAST:event_cbxPcNinoActionPerformed

    private void cbxMcNinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMcNinoActionPerformed

    }//GEN-LAST:event_cbxMcNinoActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.hist = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void rbJuntoDescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuntoDescoActionPerformed
        IHistory.cbxECivil.setSelectedIndex(4);
    }//GEN-LAST:event_rbJuntoDescoActionPerformed

    private void rbJuntoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuntoNoActionPerformed
        IHistory.cbxECivil.setSelectedIndex(2);
    }//GEN-LAST:event_rbJuntoNoActionPerformed

    private void rbJuntoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuntoSiActionPerformed
        IHistory.cbxECivil.setSelectedIndex(0);
    }//GEN-LAST:event_rbJuntoSiActionPerformed

    private void rbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNewActionPerformed
        lbCode.setText(String.valueOf(gc.getLastCode()));
        D_Historia.LimpiarTodo();
        btGuardar1.setEnabled(false);
    }//GEN-LAST:event_rbNewActionPerformed

    private void rbUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUpdActionPerformed
        DListadoAlumnos lalu = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        lalu.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Historia del Niño");
        lalu.setVisible(true);
    }//GEN-LAST:event_rbUpdActionPerformed

private String panelPrint = "";
    private void btImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimir1ActionPerformed
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
    }//GEN-LAST:event_btImprimir1ActionPerformed

    private void btImprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimir2ActionPerformed
       panelPrint = "pnContent2";
        try {
           PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            boolean aceptar_impresion = job.printDialog();
             if(aceptar_impresion)
                job.print();

        } catch (PrinterException ex) {
            Logger.getLogger(IHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btImprimir2ActionPerformed

    private void btImprimir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimir3ActionPerformed
        panelPrint = "pnContent3";
        try {
           PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            boolean aceptar_impresion = job.printDialog();
             if(aceptar_impresion)
                job.print();

        } catch (PrinterException ex) {
            Logger.getLogger(IHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btImprimir3ActionPerformed

    private void btImprimir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimir4ActionPerformed
        panelPrint = "pnContent4";
        try {
           PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            boolean aceptar_impresion = job.printDialog();
             if(aceptar_impresion)
                job.print();

        } catch (PrinterException ex) {
            Logger.getLogger(IHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btImprimir4ActionPerformed
    
    public void tutela(){
        if (cbTutelaMasculina.isSelected()) {
            
            if (cbxPadreVivo.getSelectedItem()=="No"||cbxPcNino.getSelectedItem()=="No") {
                cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { "Hermano","Padrastro","Tío","Abuelo","Padrino"}
                ));
            } else {
                cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { "Padre","Hermano","Padrastro","Tío","Abuelo","Padrino"}
                ));
            }
            cbTutelaAjena.setSelected(false);
            cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { ""}
            ));
        } else {
            cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { ""}
            ));
        }
        
        if (cbTutelaFemenina.isSelected()) {
            
            if (cbxMadreViva.getSelectedItem()=="No"||cbxMcNino.getSelectedItem()=="No") {
                cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { "Hermana","Madrastra","Tía","Abuela","Madrina"}
                ));
                
            } else {
                cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { "Madre","Hermana","Madrastra","Tía","Abuela","Madrina"}
                ));
            }
            cbTutelaAjena.setSelected(false);
                cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
                        new String[] { ""}
            ));
        } else {

            cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { ""}
            ));            
        }
    }
    
    public void desconocerPadre(){
        if (cbxPadreVivo.getSelectedItem()=="No" || cbxPadreVivo.getSelectedItem()=="Desconocido") {
        
            
            cbxPcNino.setSelectedItem("No");
            cbxPcNino.setEnabled(false);
            
            cbxPImpd.setSelectedItem("No");
            cbxPImpd.setEnabled(false);
            tfPCImpd.setText("");
            tfPCImpd.setEditable(false);
            cbxPCrEnf.setSelectedItem("No");
            cbxPCrEnf.setEnabled(false);
            tfPCrEnf.setText("");
            tfPCrEnf.setEditable(false);
            cbxPMentEnf.setSelectedItem("No");
            cbxPMentEnf.setEnabled(false);
            cbxPCarc.setSelectedItem("No");
            cbxPCarc.setEnabled(false);
            
            cbxPFinanz.setSelectedItem("No");
            cbxPFinanz.setEnabled(false);
        } else {
            cbxPcNino.setSelectedItem("No");
            cbxPcNino.setEnabled(true);
            
            cbxPImpd.setSelectedItem("No");
            cbxPImpd.setEnabled(true);
            tfPCImpd.setText("");
            tfPCImpd.setEditable(false);
            cbxPCrEnf.setSelectedItem("No");
            cbxPCrEnf.setEnabled(true);
            tfPCrEnf.setText("");
            tfPCrEnf.setEditable(false);
            cbxPMentEnf.setSelectedItem("No");
            cbxPMentEnf.setEnabled(true);
            cbxPCarc.setSelectedItem("No");
            cbxPCarc.setEnabled(true);
            
            cbxPFinanz.setSelectedItem("No");
            cbxPFinanz.setEnabled(true);
        }        
    }
    
    public void desconocerMadre(){
        if (cbxMadreViva.getSelectedItem()=="No" || cbxMadreViva.getSelectedItem()=="Desconocido") {
            
            cbxMcNino.setSelectedItem("No");
            cbxMcNino.setEnabled(false);
            
            cbxMImpd.setSelectedItem("No");
            cbxMImpd.setEnabled(false);
            tfMCImpd.setText("");
            tfMCImpd.setEditable(false);
            cbxMCrEnf.setSelectedItem("No");
            cbxMCrEnf.setEnabled(false);
            tfMCrEnf.setText("");
            tfMCrEnf.setEditable(false);
            cbxMMentEnf.setSelectedItem("No");
            cbxMMentEnf.setEnabled(false);
            cbxMCarc.setSelectedItem("No");
            cbxMCarc.setEnabled(false);
            
            cbxMFinanz.setSelectedItem("No");
            cbxMFinanz.setEnabled(false);
        } else {
            cbxMcNino.setSelectedItem("No");
            cbxMcNino.setEnabled(true);
            
            cbxMImpd.setSelectedItem("No");
            cbxMImpd.setEnabled(true);
            tfMCImpd.setText("");
            tfMCImpd.setEditable(false);
            cbxMCrEnf.setSelectedItem("No");
            cbxMCrEnf.setEnabled(true);
            tfMCrEnf.setText("");
            tfMCrEnf.setEditable(false);
            cbxMMentEnf.setSelectedItem("No");
            cbxMMentEnf.setEnabled(true);
            cbxMCarc.setSelectedItem("No");
            cbxMCarc.setEnabled(true);
            
            cbxMFinanz.setSelectedItem("No");
            cbxMFinanz.setEnabled(true);
        }
    }
    
    public void padreContribuye(){
        if (cbxPCrEnf.getSelectedItem()=="Si" || cbxPMentEnf.getSelectedItem()=="Si" || cbxPCarc.getSelectedItem()=="Si") {
            cbxPFinanz.setSelectedItem("No");
            cbxPFinanz.setEnabled(false);
        } else {
            cbxPFinanz.setSelectedItem("Si");
            cbxPFinanz.setEnabled(true);
        }
    }
    
    public void madreContribuye(){
        if (cbxMCrEnf.getSelectedItem()=="Si" || cbxMMentEnf.getSelectedItem()=="Si" || cbxMCarc.getSelectedItem()=="Si") {
            cbxMFinanz.setSelectedItem("No");
            cbxMFinanz.setEnabled(false);
        } else {
            cbxMFinanz.setSelectedItem("Si");
            cbxMFinanz.setEnabled(true);
        }
    }
    
    public static void consultarTodo(int codigo){
        if (!lbCode.equals("")) {
            D_Historia hist = new D_Historia();
                
            //Primera pagina
            hist.consultar(codigo);

            //Segunda pagina
            hist.consultarImpedimentos(codigo);
            hist.consultarEstudios(codigo);

            //Tercera pagina
            cbTutelaMasculina.setSelected(true);
            cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] { "Padre","Hermano","Padrastro","Tío","Abuelo","Padrino"}
            ));
            cbxTutorMasc.setSelectedItem("Padre");
            cbTutelaFemenina.setSelected(true);
            cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] { "Madre","Hermana","Madrastra","Tía","Abuela","Madrina"}
            ));
            cbxTutorFem.setSelectedItem("Madre");
            cbTutelaAjena.setSelected(false);
            cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] { ""}
            ));

            hist.consultarEstudios(codigo);
            hist.consultarTutela(codigo);
            hist.consultarECivil(codigo);
            hist.consultarPadreNat(codigo);
            hist.consultarMadreNat(codigo);

            //Cuarta pagina
            hist.consultarUltPag(codigo);
            
            
        }
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
            pnContent4.printAll(graphics);
        }

        return PAGE_EXISTS;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup bgAsisteEscuela;
    private javax.swing.ButtonGroup bgJuntosPadres;
    private javax.swing.ButtonGroup bgNivelesEU;
    private javax.swing.ButtonGroup bgRecibMedicina;
    private javax.swing.ButtonGroup bgRendimientoEscolar;
    private javax.swing.ButtonGroup bgTipoIngreso;
    private javax.swing.ButtonGroup bgTratMedico;
    private javax.swing.JButton btCerrar1;
    private javax.swing.JButton btCerrar2;
    private javax.swing.JButton btCerrar3;
    private javax.swing.JButton btCerrar4;
    private javax.swing.JButton btENumMiemFam;
    private javax.swing.JButton btEditDataGrales;
    public static javax.swing.JButton btGuardar1;
    private javax.swing.JButton btGuardar2;
    private javax.swing.JButton btGuardar3;
    private javax.swing.JButton btGuardar4;
    private javax.swing.JButton btImprimir1;
    private javax.swing.JButton btImprimir2;
    private javax.swing.JButton btImprimir3;
    private javax.swing.JButton btImprimir4;
    public static javax.swing.JCheckBox cbArte;
    public static javax.swing.JCheckBox cbAsma;
    public static javax.swing.JCheckBox cbBasket;
    public static javax.swing.JCheckBox cbBeisbol;
    public static javax.swing.JCheckBox cbBicicleta;
    public static javax.swing.JCheckBox cbCVMercado;
    public static javax.swing.JCheckBox cbCamas;
    public static javax.swing.JCheckBox cbCaminatas;
    public static javax.swing.JCheckBox cbCampamento;
    public static javax.swing.JCheckBox cbCanicas;
    public static javax.swing.JCheckBox cbCantar;
    public static javax.swing.JCheckBox cbCarros;
    public static javax.swing.JCheckBox cbCasita;
    public static javax.swing.JCheckBox cbClaseBib;
    public static javax.swing.JCheckBox cbCocina;
    public static javax.swing.JCheckBox cbContarHist;
    public static javax.swing.JCheckBox cbCoro;
    public static javax.swing.JCheckBox cbCorrer;
    public static javax.swing.JCheckBox cbCostura;
    public static javax.swing.JCheckBox cbCuidaAnimals;
    public static javax.swing.JCheckBox cbCuidaNinos;
    public static javax.swing.JCheckBox cbEnsenaOtros;
    public static javax.swing.JCheckBox cbEpilepsia;
    public static javax.swing.JCheckBox cbEscBibVac;
    public static javax.swing.JCheckBox cbEscDominical;
    public static javax.swing.JCheckBox cbEscondidas;
    public static javax.swing.JCheckBox cbFutbol;
    public static javax.swing.JCheckBox cbHuerto;
    public static javax.swing.JCheckBox cbHulla;
    public static javax.swing.JCheckBox cbJuegoPelota;
    public static javax.swing.JCheckBox cbJuegosGrupo;
    public static javax.swing.JCheckBox cbLavaRopa;
    public static javax.swing.JCheckBox cbLeer;
    public static javax.swing.JCheckBox cbLena;
    public static javax.swing.JCheckBox cbLimpieza;
    public static javax.swing.JCheckBox cbMAgri;
    public static javax.swing.JCheckBox cbMIgl;
    public static javax.swing.JCheckBox cbMMaes;
    public static javax.swing.JCheckBox cbMMerc;
    public static javax.swing.JCheckBox cbMObr;
    public static javax.swing.JCheckBox cbMOtro;
    public static javax.swing.JCheckBox cbMProj;
    public static javax.swing.JCheckBox cbMacateta;
    public static javax.swing.JCheckBox cbMandados;
    public static javax.swing.JCheckBox cbMunecas;
    public static javax.swing.JCheckBox cbMusica;
    public static javax.swing.JCheckBox cbMusicales;
    public static javax.swing.JCheckBox cbNadar;
    public static javax.swing.JCheckBox cbNinguna;
    public static javax.swing.JCheckBox cbOtra;
    public static javax.swing.JCheckBox cbOtraAct;
    public static javax.swing.JCheckBox cbOtraObl;
    public static javax.swing.JCheckBox cbOtrosPastDep;
    public static javax.swing.JCheckBox cbPAgri;
    public static javax.swing.JCheckBox cbPIgl;
    public static javax.swing.JCheckBox cbPMaes;
    public static javax.swing.JCheckBox cbPMerc;
    public static javax.swing.JCheckBox cbPObr;
    public static javax.swing.JCheckBox cbPOtro;
    public static javax.swing.JCheckBox cbPProj;
    public static javax.swing.JCheckBox cbPingPong;
    public static javax.swing.JCheckBox cbPolio;
    public static javax.swing.JCheckBox cbRecogeAgua;
    public static javax.swing.JCheckBox cbRetardo;
    public static javax.swing.JCheckBox cbSaltarSoga;
    public static javax.swing.JCheckBox cbSocJovenes;
    public static javax.swing.JCheckBox cbTutelaAjena;
    public static javax.swing.JCheckBox cbTutelaFemenina;
    public static javax.swing.JCheckBox cbTutelaMasculina;
    public static javax.swing.JCheckBox cbVolibol;
    public static javax.swing.JComboBox cbxBrazDer;
    public static javax.swing.JComboBox cbxBrazIzq;
    public static javax.swing.JComboBox cbxColumna;
    public static javax.swing.JComboBox cbxECivil;
    public static javax.swing.JComboBox cbxHabla;
    public static javax.swing.JComboBox cbxMCarc;
    public static javax.swing.JComboBox cbxMCrEnf;
    public static javax.swing.JComboBox cbxMEmpleo;
    public static javax.swing.JComboBox cbxMFinanz;
    public static javax.swing.JComboBox cbxMImpd;
    public static javax.swing.JComboBox cbxMMentEnf;
    public static javax.swing.JComboBox cbxMadreViva;
    public static javax.swing.JComboBox cbxManoDer;
    public static javax.swing.JComboBox cbxManoIzq;
    public static javax.swing.JComboBox cbxMateria;
    public static javax.swing.JComboBox cbxMcNino;
    public static javax.swing.JComboBox cbxNAprez;
    public static javax.swing.JComboBox cbxNBasico;
    public static javax.swing.JComboBox cbxNKinder;
    public static javax.swing.JComboBox cbxNOtro;
    public static javax.swing.JComboBox cbxNPreKinder;
    public static javax.swing.JComboBox cbxNPrimaria;
    public static javax.swing.JComboBox cbxNSecundaria;
    public static javax.swing.JComboBox cbxNUniv;
    public static javax.swing.JComboBox cbxNVocac;
    public static javax.swing.JComboBox cbxOidoDer;
    public static javax.swing.JComboBox cbxOidoIzq;
    public static javax.swing.JComboBox cbxOjoDer;
    public static javax.swing.JComboBox cbxOjoIzq;
    public static javax.swing.JComboBox cbxPCarc;
    public static javax.swing.JComboBox cbxPCrEnf;
    public static javax.swing.JComboBox cbxPEmpleo;
    public static javax.swing.JComboBox cbxPFinanz;
    public static javax.swing.JComboBox cbxPImpd;
    public static javax.swing.JComboBox cbxPMentEnf;
    public static javax.swing.JComboBox cbxPadreVivo;
    public static javax.swing.JComboBox cbxPcNino;
    public static javax.swing.JComboBox cbxPieDer;
    public static javax.swing.JComboBox cbxPieIzq;
    public static javax.swing.JComboBox cbxPierDer;
    public static javax.swing.JComboBox cbxPierIzq;
    public static javax.swing.JComboBox cbxRazon;
    public static javax.swing.JComboBox cbxTutorAjeno;
    public static javax.swing.JComboBox cbxTutorFem;
    public static javax.swing.JComboBox cbxTutorMasc;
    public static com.toedter.calendar.JDateChooser datecBib;
    public static com.toedter.calendar.JDateChooser datecOtro;
    public static com.toedter.calendar.JDateChooser datecSec;
    public static com.toedter.calendar.JDateChooser datecUniv;
    public static com.toedter.calendar.JDateChooser datecVoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
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
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAtendedor;
    public static javax.swing.JLabel lbCode;
    public static javax.swing.JLabel lbEntrenVocac;
    public static javax.swing.JLabel lbEscuelaBiblica;
    public static javax.swing.JLabel lbFecNac;
    private javax.swing.JLabel lbFechaHoy;
    public static javax.swing.JLabel lbNHijas;
    public static javax.swing.JLabel lbNHijos;
    public static javax.swing.JLabel lbName;
    public static javax.swing.JLabel lbOtroEstudio;
    public static javax.swing.JLabel lbPHno;
    public static javax.swing.JLabel lbSHno;
    public static javax.swing.JLabel lbSecundaria;
    public static javax.swing.JLabel lbSex;
    public static javax.swing.JLabel lbUniversidad;
    private javax.swing.JPanel pnActividadesCrist;
    private javax.swing.JPanel pnComandos1;
    private javax.swing.JPanel pnComandos2;
    private javax.swing.JPanel pnComandos3;
    private javax.swing.JPanel pnComandos4;
    private javax.swing.JPanel pnComent;
    private javax.swing.JPanel pnContent1;
    private javax.swing.JPanel pnContent2;
    private javax.swing.JPanel pnContent3;
    private javax.swing.JPanel pnContent4;
    private javax.swing.JPanel pnDatosGrales;
    private javax.swing.JPanel pnECivil;
    private javax.swing.JPanel pnEmpleosPad;
    private javax.swing.JPanel pnEstudio;
    private javax.swing.JPanel pnEstudios2;
    private javax.swing.JPanel pnNumFam;
    private javax.swing.JPanel pnObligaciones;
    private javax.swing.JPanel pnPadres;
    private javax.swing.JPanel pnPag1;
    private javax.swing.JPanel pnPag2;
    private javax.swing.JPanel pnPag3;
    private javax.swing.JPanel pnPag4;
    private javax.swing.JPanel pnPasatiempos;
    private javax.swing.JPanel pnSalud;
    private javax.swing.JPanel pnSoloEmpleoPad;
    private javax.swing.JPanel pnSoloPadre;
    private javax.swing.JPanel pnTutores;
    public static javax.swing.JRadioButton rbJuntoDesco;
    public static javax.swing.JRadioButton rbJuntoNo;
    public static javax.swing.JRadioButton rbJuntoSi;
    public static javax.swing.JRadioButton rbNew;
    public static javax.swing.JRadioButton rbNoAsisteEsc;
    public static javax.swing.JRadioButton rbNoRecMed;
    public static javax.swing.JRadioButton rbNoTratMed;
    public static javax.swing.JRadioButton rbRendEscBajo;
    public static javax.swing.JRadioButton rbRendEscPro;
    public static javax.swing.JRadioButton rbRendEscSob;
    public static javax.swing.JRadioButton rbSiAsisteEsc;
    public static javax.swing.JRadioButton rbSiRecMed;
    public static javax.swing.JRadioButton rbSiTratMed;
    public static javax.swing.JRadioButton rbUpd;
    public static javax.swing.JTextArea taComentarios;
    public static javax.swing.JTabbedPane tabbed;
    public static javax.swing.JTextField tfCEAprez;
    public static javax.swing.JTextField tfCEBib;
    public static javax.swing.JTextField tfCEOtro;
    public static javax.swing.JTextField tfCEOtro2;
    public static javax.swing.JTextField tfCESec;
    public static javax.swing.JTextField tfCEUniv;
    public static javax.swing.JTextField tfCEUniv2;
    public static javax.swing.JTextField tfCEVocac;
    public static javax.swing.JTextField tfCEVocac2;
    public static javax.swing.JTextField tfMCImpd;
    public static javax.swing.JTextField tfMCrEnf;
    public static javax.swing.JTextField tfMObr;
    public static javax.swing.JTextField tfMOtro;
    public static javax.swing.JTextField tfOtraActv;
    public static javax.swing.JTextField tfOtraObl;
    public static javax.swing.JTextField tfOtraRazon;
    public static javax.swing.JTextField tfOtroImped;
    public static javax.swing.JTextField tfOtroInstMus;
    public static javax.swing.JTextField tfOtroPasat;
    public static javax.swing.JTextField tfPCImpd;
    public static javax.swing.JTextField tfPCrEnf;
    public static javax.swing.JTextField tfPObr;
    public static javax.swing.JTextField tfPOtro;
    // End of variables declaration//GEN-END:variables
}
