package vista;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import modelo.D_Grupo;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import sc.Conexion;
import sc.Library;
import sc.OSDetector;

public class MenuMain extends javax.swing.JFrame {

//File file = null;
//private FileNameExtensionFilter filter = new FileNameExtensionFilter("backup");
Connection conx;
Statement stm;       //Sirve para consultar
PreparedStatement ps;//Sirve para insertar, eliminar y actualizar
ResultSet rs;
Library lib = new Library();

    public MenuMain() {
        initComponents();
        setLocationRelativeTo(null);
        lbFondo.setIcon(null);
        lbFondo.setSize(2, 1);
        lbFondo.removeAll();
        lbFondo.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        filecRespaldo = new javax.swing.JFileChooser();
        dskp = new javax.swing.JDesktopPane();
        lbFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMatricula = new javax.swing.JMenu();
        miHistoria = new javax.swing.JMenuItem();
        miFicSocEco = new javax.swing.JMenuItem();
        menuRegistros = new javax.swing.JMenu();
        miHCP = new javax.swing.JMenuItem();
        miRegNecSpe = new javax.swing.JMenuItem();
        miInfRefDiagnTrat = new javax.swing.JMenuItem();
        miFMedC = new javax.swing.JMenuItem();
        miRegCorresp = new javax.swing.JMenuItem();
        miTipoProgEdu = new javax.swing.JMenuItem();
        menuActividades = new javax.swing.JMenu();
        miVisitas = new javax.swing.JMenuItem();
        miActPerfil = new javax.swing.JMenuItem();
        miExp = new javax.swing.JMenuItem();
        menuConfigur = new javax.swing.JMenu();
        miGrupo = new javax.swing.JMenuItem();
        miPatrocinador = new javax.swing.JMenuItem();
        menuHerr = new javax.swing.JMenu();
        miCU = new javax.swing.JMenuItem();
        miPerfAdm = new javax.swing.JMenuItem();
        miABAlumno = new javax.swing.JMenuItem();
        miApariencia = new javax.swing.JMenu();
        miBackGround = new javax.swing.JMenuItem();
        miBackGImage = new javax.swing.JMenuItem();
        miIS = new javax.swing.JMenuItem();
        miSeaGlass = new javax.swing.JMenuItem();
        miStandard = new javax.swing.JMenuItem();
        miBlueMoon = new javax.swing.JMenuItem();
        miBlackEye = new javax.swing.JMenuItem();
        miBlueLight = new javax.swing.JMenuItem();
        miWhiteVision = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        miRtCU = new javax.swing.JMenuItem();
        miAlumAI = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miTrimes1 = new javax.swing.JMenuItem();
        miTrimes2 = new javax.swing.JMenuItem();
        miTrimes3 = new javax.swing.JMenuItem();
        miTrimes4 = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenu();
        miAcerkSiapmar = new javax.swing.JMenuItem();
        miAcerkMarcos = new javax.swing.JMenuItem();
        miManUser = new javax.swing.JMenuItem();
        miSO = new javax.swing.JMenuItem();
        miResPant = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIAPMAR");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        dskp.setBackground(new java.awt.Color(240, 240, 240));

        lbFondo.setAutoscrolls(true);
        lbFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        dskp.add(lbFondo);
        lbFondo.setBounds(30, 20, 900, 640);

        menuMatricula.setText("> Matrícula   ");

        miHistoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        miHistoria.setText("Historia");
        miHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHistoriaActionPerformed(evt);
            }
        });
        menuMatricula.add(miHistoria);

        miFicSocEco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        miFicSocEco.setText("Ficha Socioeconómica");
        miFicSocEco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFicSocEcoActionPerformed(evt);
            }
        });
        menuMatricula.add(miFicSocEco);

        jMenuBar1.add(menuMatricula);

        menuRegistros.setText("> Registros   ");

        miHCP.setText("Historia Clínica Pediátrica");
        miHCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHCPActionPerformed(evt);
            }
        });
        menuRegistros.add(miHCP);

        miRegNecSpe.setText("Registro de Necesidades Especiales");
        miRegNecSpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegNecSpeActionPerformed(evt);
            }
        });
        menuRegistros.add(miRegNecSpe);

        miInfRefDiagnTrat.setText("Informe de Referencias de Diagnósticos y Tratamiento");
        miInfRefDiagnTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInfRefDiagnTratActionPerformed(evt);
            }
        });
        menuRegistros.add(miInfRefDiagnTrat);

        miFMedC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        miFMedC.setText("Fondo Médico Compassion");
        miFMedC.setToolTipText("");
        miFMedC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFMedCActionPerformed(evt);
            }
        });
        menuRegistros.add(miFMedC);

        miRegCorresp.setText("Registro de Correspondencia");
        miRegCorresp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegCorrespActionPerformed(evt);
            }
        });
        menuRegistros.add(miRegCorresp);

        miTipoProgEdu.setText("Tipo de Programa Educativo");
        miTipoProgEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTipoProgEduActionPerformed(evt);
            }
        });
        menuRegistros.add(miTipoProgEdu);

        jMenuBar1.add(menuRegistros);

        menuActividades.setText("> Actividades   ");

        miVisitas.setText("Visitas");
        miVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisitasActionPerformed(evt);
            }
        });
        menuActividades.add(miVisitas);

        miActPerfil.setText("Actualización de Perfiles");
        miActPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActPerfilActionPerformed(evt);
            }
        });
        menuActividades.add(miActPerfil);

        miExp.setText("Revisión de Expediente");
        miExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExpActionPerformed(evt);
            }
        });
        menuActividades.add(miExp);

        jMenuBar1.add(menuActividades);

        menuConfigur.setText("> Configuraciones   ");

        miGrupo.setText("Grupos");
        miGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGrupoActionPerformed(evt);
            }
        });
        menuConfigur.add(miGrupo);

        miPatrocinador.setText("Patrocinadores");
        miPatrocinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPatrocinadorActionPerformed(evt);
            }
        });
        menuConfigur.add(miPatrocinador);

        jMenuBar1.add(menuConfigur);

        menuHerr.setText("> Herramientas   ");

        miCU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        miCU.setText("Cuentas de Usuario");
        miCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCUActionPerformed(evt);
            }
        });
        menuHerr.add(miCU);

        miPerfAdm.setText("Perfil Administrativo");
        miPerfAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerfAdmActionPerformed(evt);
            }
        });
        menuHerr.add(miPerfAdm);

        miABAlumno.setText("Dar de Baja o Alta a Alumno");
        miABAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miABAlumnoActionPerformed(evt);
            }
        });
        menuHerr.add(miABAlumno);

        miApariencia.setText("Apariencia");

        miBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/IcColor.png"))); // NOI18N
        miBackGround.setText("Color de fondo");
        miBackGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBackGroundActionPerformed(evt);
            }
        });
        miApariencia.add(miBackGround);

        miBackGImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/IcDesktopeffects.png"))); // NOI18N
        miBackGImage.setText("Imagen de fondo");
        miBackGImage.setAutoscrolls(true);
        miBackGImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBackGImageActionPerformed(evt);
            }
        });
        miApariencia.add(miBackGImage);

        miIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/IcMp3Player.png"))); // NOI18N
        miIS.setText("Sonido en inicio de sesión");
        miIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miISActionPerformed(evt);
            }
        });
        miApariencia.add(miIS);

        miSeaGlass.setText("Sea Glass");
        miSeaGlass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSeaGlassActionPerformed(evt);
            }
        });
        miApariencia.add(miSeaGlass);

        miStandard.setText("Standard");
        miStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStandardActionPerformed(evt);
            }
        });
        miApariencia.add(miStandard);

        miBlueMoon.setText("Blue Moon");
        miBlueMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlueMoonActionPerformed(evt);
            }
        });
        miApariencia.add(miBlueMoon);

        miBlackEye.setText("Black Eye");
        miBlackEye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlackEyeActionPerformed(evt);
            }
        });
        miApariencia.add(miBlackEye);

        miBlueLight.setText("Blue Light");
        miBlueLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlueLightActionPerformed(evt);
            }
        });
        miApariencia.add(miBlueLight);

        miWhiteVision.setText("White Vision");
        miWhiteVision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miWhiteVisionActionPerformed(evt);
            }
        });
        miApariencia.add(miWhiteVision);

        menuHerr.add(miApariencia);

        jMenuBar1.add(menuHerr);

        menuReportes.setText("> Reportes   ");

        miRtCU.setText("Cuentas de Usuario");
        miRtCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRtCUActionPerformed(evt);
            }
        });
        menuReportes.add(miRtCU);

        miAlumAI.setText("Alumnos Activos e Inactivos");
        miAlumAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlumAIActionPerformed(evt);
            }
        });
        menuReportes.add(miAlumAI);

        jMenu1.setText("Cumpleañeros del Trimestre");

        miTrimes1.setText("De Enero a Marzo");
        miTrimes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTrimes1ActionPerformed(evt);
            }
        });
        jMenu1.add(miTrimes1);

        miTrimes2.setText("De Abril a Junio");
        miTrimes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTrimes2ActionPerformed(evt);
            }
        });
        jMenu1.add(miTrimes2);

        miTrimes3.setText("De Julio a Septiembre");
        miTrimes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTrimes3ActionPerformed(evt);
            }
        });
        jMenu1.add(miTrimes3);

        miTrimes4.setText("De Octubre a Diciembre");
        miTrimes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTrimes4ActionPerformed(evt);
            }
        });
        jMenu1.add(miTrimes4);

        menuReportes.add(jMenu1);

        jMenuBar1.add(menuReportes);

        menuInfo.setText("> Información   ");

        miAcerkSiapmar.setText("Acerca de SIAPMAR");
        miAcerkSiapmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcerkSiapmarActionPerformed(evt);
            }
        });
        menuInfo.add(miAcerkSiapmar);

        miAcerkMarcos.setText("Acerca del Proyecto Marcos");
        miAcerkMarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcerkMarcosActionPerformed(evt);
            }
        });
        menuInfo.add(miAcerkMarcos);

        miManUser.setText("Manual de Usuario");
        miManUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miManUserActionPerformed(evt);
            }
        });
        menuInfo.add(miManUser);

        miSO.setText("Sistema Operativo huésped");
        miSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSOActionPerformed(evt);
            }
        });
        menuInfo.add(miSO);

        miResPant.setText("Resolución de pantalla");
        miResPant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miResPantActionPerformed(evt);
            }
        });
        menuInfo.add(miResPant);

        jMenuBar1.add(menuInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskp, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskp, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(966, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static IUserAccount ua = null;
    private void miCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCUActionPerformed
        if (ua == null) {
            ua = new IUserAccount();
            lib.openInternalFrame(ua);
        } else {
            lib.reopenInternalFrame(ua);
        }
    }//GEN-LAST:event_miCUActionPerformed

    public static IFondoMedicoComp fonmed = null;
    private void miFMedCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFMedCActionPerformed
        if (fonmed == null) {
            fonmed = new IFondoMedicoComp();
            lib.openInternalFrame(fonmed);
        } else {
            lib.reopenInternalFrame(fonmed);
        }
    }//GEN-LAST:event_miFMedCActionPerformed

    public static IFichaSocioEcon fichaSE = null;
    private void miFicSocEcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFicSocEcoActionPerformed
        if (fichaSE == null) {
            fichaSE = new IFichaSocioEcon();
            lib.openInternalFrame(fichaSE);
        } else {
            lib.reopenInternalFrame(fichaSE);
        }
    }//GEN-LAST:event_miFicSocEcoActionPerformed

    public static IHistory hist = null;
    private void miHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHistoriaActionPerformed
        if (hist == null) {
            hist = new IHistory();
            lib.openInternalFrame(hist);
        } else {
            lib.reopenInternalFrame(hist);
        }
    }//GEN-LAST:event_miHistoriaActionPerformed

    public static IVisitas vis = null;
    private void miVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisitasActionPerformed
        if (vis == null) {
            vis = new IVisitas();
            lib.openInternalFrame(vis);
        } else {
            lib.reopenInternalFrame(vis);
        }
    }//GEN-LAST:event_miVisitasActionPerformed

    private void miRtCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRtCUActionPerformed
        try {
            Connection con = Conexion.getSQLConnection();
            
            String master = System.getProperty("user.dir") + "/reportes/rtLogin.jasper";
            
            System.out.println("master: " + master);
            if (master == null) {
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo del reporte maestro.");
                System.exit(2);
            }
            
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObject(master);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            
            Map parametro = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e.getMessage());
        }
    }//GEN-LAST:event_miRtCUActionPerformed

    public static IRegNecSpe regNecSpe = null;
    private void miRegNecSpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegNecSpeActionPerformed
        if (regNecSpe == null) {
            regNecSpe = new IRegNecSpe();
            lib.openInternalFrame(regNecSpe);
        } else {
            lib.reopenInternalFrame(regNecSpe);
        }
    }//GEN-LAST:event_miRegNecSpeActionPerformed

    public static IRegCorrespondencia regCorres = null;
    private void miRegCorrespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegCorrespActionPerformed
        if (regCorres == null) {
            regCorres = new IRegCorrespondencia();
            lib.openInternalFrame(regCorres);
        } else {
            lib.reopenInternalFrame(regCorres);
        }
    }//GEN-LAST:event_miRegCorrespActionPerformed

    public static IInformeRefDiagTrat infRefDiagTrat = null;
    private void miInfRefDiagnTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInfRefDiagnTratActionPerformed
        if (infRefDiagTrat == null) {
            infRefDiagTrat = new IInformeRefDiagTrat();
            lib.openInternalFrame(infRefDiagTrat);
        } else {
            lib.reopenInternalFrame(infRefDiagTrat);
        }
    }//GEN-LAST:event_miInfRefDiagnTratActionPerformed

    public static ITipoProgEdu tipoProgEdu = null;
    private void miTipoProgEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTipoProgEduActionPerformed
        if (tipoProgEdu == null) {
            tipoProgEdu = new ITipoProgEdu();
            lib.openInternalFrame(tipoProgEdu);
        } else {
            lib.reopenInternalFrame(tipoProgEdu);
        }
    }//GEN-LAST:event_miTipoProgEduActionPerformed

    public static IActualizacionPerfiles actperf = null;
    private void miActPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActPerfilActionPerformed
        if (actperf == null) {
            actperf = new IActualizacionPerfiles();
            lib.openInternalFrame(actperf);
        } else {
            lib.reopenInternalFrame(actperf);
        }
    }//GEN-LAST:event_miActPerfilActionPerformed

    public static IPerfilAdministrativo perfAdm = null;
    private void miPerfAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerfAdmActionPerformed
        if (perfAdm == null) {
            perfAdm = new IPerfilAdministrativo();
            lib.openInternalFrame(perfAdm);
        } else {
            lib.reopenInternalFrame(perfAdm);
        }
    }//GEN-LAST:event_miPerfAdmActionPerformed

    private void miABAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miABAlumnoActionPerformed
        DABAlumno as = new DABAlumno(this, true);
        as.setLocationRelativeTo(null);
        as.setVisible(true);
    }//GEN-LAST:event_miABAlumnoActionPerformed

    private void miBackGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBackGroundActionPerformed
        DBackColor bc = new DBackColor(JOptionPane.getFrameForComponent(this), true);
        bc.setLocationRelativeTo(null);
        bc.setVisible(true);
    }//GEN-LAST:event_miBackGroundActionPerformed

    private void miBackGImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBackGImageActionPerformed
        DBackImage bi = new DBackImage(JOptionPane.getFrameForComponent(this), true);
        bi.setLocationRelativeTo(null);
        bi.setVisible(true);
    }//GEN-LAST:event_miBackGImageActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (DBackImage.fot != null) {
            MenuMain.lbFondo.setSize(MenuMain.dskp.getWidth()-50,MenuMain.dskp.getHeight()-50);
            ImageIcon imgRes = new ImageIcon(DBackImage.fot.getImage().getScaledInstance(MenuMain.lbFondo.getWidth(),MenuMain.lbFondo.getHeight(), Image.SCALE_SMOOTH));
            MenuMain.lbFondo.setIcon(imgRes);
            this.repaint();
        }
    }//GEN-LAST:event_formComponentResized

    private void miGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGrupoActionPerformed
        D_Grupo gr = new D_Grupo();
        if (gr.getDocentes()) {
            DGrupos g = new DGrupos(JOptionPane.getFrameForComponent(this), true);
            g.setLocationRelativeTo(null);
            g.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Debes de ingresar cuentas de usuario de docentes\nTienen que estar activos\nY debes poner los nombres de los docentes");
        }
    }//GEN-LAST:event_miGrupoActionPerformed

    private void miPatrocinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPatrocinadorActionPerformed
        DPatrocinadores patr = new DPatrocinadores(JOptionPane.getFrameForComponent(this), true);
        patr.setLocationRelativeTo(null);
        patr.setVisible(true);
    }//GEN-LAST:event_miPatrocinadorActionPerformed

    private void miAlumAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlumAIActionPerformed
        try {
            Connection con = Conexion.getSQLConnection();
            
            String master = System.getProperty("user.dir") + "/reportes/rtAlumnosAI.jasper";
            
            System.out.println("master: " + master);
            if (master == null) {
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo del reporte maestro.");
                System.exit(2);
            }
            
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObject(master);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            
            Map parametro = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El error es: " + e.getMessage());
        }
    }//GEN-LAST:event_miAlumAIActionPerformed

    private void miManUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miManUserActionPerformed

        try {
            
            String rutaProj = System.getProperty("user.dir");
            
            File mifile = new File(rutaProj + "/files/Manual de Usuario.pdf");
            
            if (OSDetector.isWindows()){
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + mifile.getAbsolutePath());
            } else if (OSDetector.isLinux() || OSDetector.isMac()){
                Runtime.getRuntime().exec(new String[]{"/usr/bin/open", mifile.getAbsolutePath()});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo: "+e.getMessage());
        }

    }//GEN-LAST:event_miManUserActionPerformed

    private void miISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miISActionPerformed
        DSonidoIS song = new DSonidoIS(JOptionPane.getFrameForComponent(this), true);
        song.setLocationRelativeTo(null);
        song.setVisible(true);
    }//GEN-LAST:event_miISActionPerformed

    private void miAcerkSiapmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcerkSiapmarActionPerformed
        DAcercaSIAPMAR as = new DAcercaSIAPMAR(this, true);
        as.setLocationRelativeTo(null);
        as.setVisible(true);
    }//GEN-LAST:event_miAcerkSiapmarActionPerformed

    private void miTrimes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTrimes1ActionPerformed
        try {
            Connection con = Conexion.getSQLConnection();
            
            String master = System.getProperty("user.dir") + "/reportes/rtCumpleanerosTriMes1.jasper";
            
            System.out.println("master: " + master);
            if (master == null) {
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo del reporte maestro.");
                System.exit(2);
            }
            
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObject(master);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            
            Map parametro = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e.getMessage());
        }
    }//GEN-LAST:event_miTrimes1ActionPerformed

    private void miTrimes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTrimes2ActionPerformed
        try {
            Connection con = Conexion.getSQLConnection();
            
            String master = System.getProperty("user.dir") + "/reportes/rtCumpleanerosTriMes2.jasper";
            
            System.out.println("master: " + master);
            if (master == null) {
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo del reporte maestro.");
                System.exit(2);
            }
            
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObject(master);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            
            Map parametro = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e.getMessage());
        }
    }//GEN-LAST:event_miTrimes2ActionPerformed

    private void miTrimes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTrimes3ActionPerformed
        try {
            Connection con = Conexion.getSQLConnection();
            
            String master = System.getProperty("user.dir") + "/reportes/rtCumpleanerosTriMes3.jasper";
            
            System.out.println("master: " + master);
            if (master == null) {
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo del reporte maestro.");
                System.exit(2);
            }
            
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObject(master);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            
            Map parametro = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e.getMessage());
        }
    }//GEN-LAST:event_miTrimes3ActionPerformed

    private void miTrimes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTrimes4ActionPerformed
        try {
            Connection con = Conexion.getSQLConnection();
            
            String master = System.getProperty("user.dir") + "/reportes/rtCumpleanerosTriMes4.jasper";
            
            System.out.println("master: " + master);
            if (master == null) {
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo del reporte maestro.");
                System.exit(2);
            }
            
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObject(master);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            
            Map parametro = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El error es: " + e.getMessage());
        }
    }//GEN-LAST:event_miTrimes4ActionPerformed

    private void miSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSOActionPerformed
        JOptionPane.showMessageDialog(null, "El Sistema Operativo huésped es:\n" + OSDetector.os);
    }//GEN-LAST:event_miSOActionPerformed

    private void miResPantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miResPantActionPerformed
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        JOptionPane.showMessageDialog(null, "La resolución de pantalla es de:\n" + screenSize.width + " x " + screenSize.height);
    }//GEN-LAST:event_miResPantActionPerformed

    private void miAcerkMarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcerkMarcosActionPerformed
        DAcercaProjM apm = new DAcercaProjM(JOptionPane.getFrameForComponent(this), true);
        apm.setLocationRelativeTo(null);
        apm.setVisible(true);
    }//GEN-LAST:event_miAcerkMarcosActionPerformed

    public static IPediatrica pedt = null;
    private void miHCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHCPActionPerformed
        if (pedt == null) {
            pedt = new IPediatrica();
            lib.openInternalFrame(pedt);
        } else {
            lib.reopenInternalFrame(pedt);
        }
    }//GEN-LAST:event_miHCPActionPerformed

    public static IRevExp rev = null;
    private void miExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExpActionPerformed
        if (rev == null) {
            rev = new IRevExp();
            lib.openInternalFrame(rev);
        } else {
            lib.reopenInternalFrame(rev);
        }
    }//GEN-LAST:event_miExpActionPerformed

    private void miSeaGlassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSeaGlassActionPerformed
        setSkin("seaGlass");
    }//GEN-LAST:event_miSeaGlassActionPerformed

    private void miStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStandardActionPerformed
        setSkin("syntheticaStandard");
    }//GEN-LAST:event_miStandardActionPerformed

    private void miBlueMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlueMoonActionPerformed
        setSkin("syntheticaBlueMoon");
    }//GEN-LAST:event_miBlueMoonActionPerformed

    private void miBlackEyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlackEyeActionPerformed
        setSkin("syntheticaBlackEye");
    }//GEN-LAST:event_miBlackEyeActionPerformed

    private void miBlueLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlueLightActionPerformed
        setSkin("syntheticaBlueLight");
    }//GEN-LAST:event_miBlueLightActionPerformed

    private void miWhiteVisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miWhiteVisionActionPerformed
        setSkin("syntheticaWhiteVision");
    }//GEN-LAST:event_miWhiteVisionActionPerformed

private void setSkin(final String skinName) {
        try {
            switch (skinName) {
                case "seaGlass":
                    UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
                    break;
                case "syntheticaStandard":
                    UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
                    break;
                case "syntheticaBlueMoon":
                    UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
                    break;
                case "syntheticaBlueLight":
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                    break;
                case "syntheticaBlackEye":
                    UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                    break;
                case "syntheticaWhiteVision":
                    UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
                    break;
            }
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        } catch (UnsupportedLookAndFeelException | ParseException e) {
            JOptionPane.showMessageDialog(null, "Error with look and feel: " + e.getMessage());
        }
    }

// String servidor, String puerto, String usuario, String password, String basedatos, String path 
    /*
    public void restaurar()
    {
        Archivo arc = new Archivo();
        String[] d = arc.leer("dbconfig").split(",");
        
        try
        {
        ProcessBuilder pbuilder;
        //Realiza la construccion del comando

        pbuilder = new ProcessBuilder( "pg_restore", "-i", "-h", d[0], "-p", d[1], "-U", d[3], "-d", d[2], "-v", "" );
        //Se ingresa el valor del password a la variable de entorno de postgres

        pbuilder.environment().put( "PGPASSWORD", d[4] );
        pbuilder.redirectErrorStream( true );
        //Ejecuta el proceso
        pbuilder.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void backupDB(){
        Archivo arc = new Archivo();
        String[] d = arc.leer("dbconfig").split(",");
        
        try{
            ProcessBuilder pb = new ProcessBuilder("C:/Program Files/PostgreSQL/9.2/bin/pg_dump.exe ", "-i", "-h", 
            d[0], "-p", d[1],"-U", d[3], "-F", "c", "-b", "-v" ,"-f", 
            "C:\\Copia.backup",d[2]);
            pb.environment().put("PGPASSWORD", d[4]);
            pb.redirectErrorStream(true);
            Process p = pb.start();
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }*/
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imgsys/controlpanel.png"));
        return retValue;
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException e) {
            System.out.println("Error with look and feel: " + e.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                MenuMain frame = new MenuMain();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dskp;
    private javax.swing.JFileChooser filecRespaldo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JLabel lbFondo;
    private javax.swing.JMenu menuActividades;
    public static javax.swing.JMenu menuConfigur;
    private javax.swing.JMenu menuHerr;
    private javax.swing.JMenu menuInfo;
    private javax.swing.JMenu menuMatricula;
    private javax.swing.JMenu menuRegistros;
    public static javax.swing.JMenu menuReportes;
    public static javax.swing.JMenuItem miABAlumno;
    private javax.swing.JMenuItem miAcerkMarcos;
    private javax.swing.JMenuItem miAcerkSiapmar;
    private javax.swing.JMenuItem miActPerfil;
    private javax.swing.JMenuItem miAlumAI;
    private javax.swing.JMenu miApariencia;
    private javax.swing.JMenuItem miBackGImage;
    private javax.swing.JMenuItem miBackGround;
    private javax.swing.JMenuItem miBlackEye;
    private javax.swing.JMenuItem miBlueLight;
    private javax.swing.JMenuItem miBlueMoon;
    public static javax.swing.JMenuItem miCU;
    private javax.swing.JMenuItem miExp;
    private javax.swing.JMenuItem miFMedC;
    private javax.swing.JMenuItem miFicSocEco;
    private javax.swing.JMenuItem miGrupo;
    private javax.swing.JMenuItem miHCP;
    private javax.swing.JMenuItem miHistoria;
    private javax.swing.JMenuItem miIS;
    private javax.swing.JMenuItem miInfRefDiagnTrat;
    private javax.swing.JMenuItem miManUser;
    private javax.swing.JMenuItem miPatrocinador;
    public static javax.swing.JMenuItem miPerfAdm;
    private javax.swing.JMenuItem miRegCorresp;
    private javax.swing.JMenuItem miRegNecSpe;
    private javax.swing.JMenuItem miResPant;
    public static javax.swing.JMenuItem miRtCU;
    private javax.swing.JMenuItem miSO;
    private javax.swing.JMenuItem miSeaGlass;
    private javax.swing.JMenuItem miStandard;
    private javax.swing.JMenuItem miTipoProgEdu;
    private javax.swing.JMenuItem miTrimes1;
    private javax.swing.JMenuItem miTrimes2;
    private javax.swing.JMenuItem miTrimes3;
    private javax.swing.JMenuItem miTrimes4;
    private javax.swing.JMenuItem miVisitas;
    private javax.swing.JMenuItem miWhiteVision;
    // End of variables declaration//GEN-END:variables
}