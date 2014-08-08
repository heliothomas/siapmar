
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
import modelo.D_RegNegSpe;

public class IRegNecSpe extends javax.swing.JInternalFrame implements Printable{

    public IRegNecSpe() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnContenedor = new javax.swing.JPanel();
        pnComandos = new javax.swing.JPanel();
        btGuardar = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        pnContent = new javax.swing.JPanel();
        pnAspectos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbNunca1 = new javax.swing.JRadioButton();
        rbPocas1 = new javax.swing.JRadioButton();
        rbKSiempre1 = new javax.swing.JRadioButton();
        rbSiempre1 = new javax.swing.JRadioButton();
        rbNunca2 = new javax.swing.JRadioButton();
        rbPocas2 = new javax.swing.JRadioButton();
        rbKSiempre2 = new javax.swing.JRadioButton();
        rbSiempre2 = new javax.swing.JRadioButton();
        rbNunca3 = new javax.swing.JRadioButton();
        rbPocas3 = new javax.swing.JRadioButton();
        rbKSiempre3 = new javax.swing.JRadioButton();
        rbSiempre3 = new javax.swing.JRadioButton();
        rbNunca4 = new javax.swing.JRadioButton();
        rbPocas4 = new javax.swing.JRadioButton();
        rbKSiempre4 = new javax.swing.JRadioButton();
        rbSiempre4 = new javax.swing.JRadioButton();
        rbNunca5 = new javax.swing.JRadioButton();
        rbPocas5 = new javax.swing.JRadioButton();
        rbKSiempre5 = new javax.swing.JRadioButton();
        rbSiempre5 = new javax.swing.JRadioButton();
        rbNunca6 = new javax.swing.JRadioButton();
        rbPocas6 = new javax.swing.JRadioButton();
        rbKSiempre6 = new javax.swing.JRadioButton();
        rbSiempre6 = new javax.swing.JRadioButton();
        rbNunca7 = new javax.swing.JRadioButton();
        rbPocas7 = new javax.swing.JRadioButton();
        rbKSiempre7 = new javax.swing.JRadioButton();
        rbSiempre7 = new javax.swing.JRadioButton();
        rbNunca8 = new javax.swing.JRadioButton();
        rbPocas8 = new javax.swing.JRadioButton();
        rbKSiempre8 = new javax.swing.JRadioButton();
        rbSiempre8 = new javax.swing.JRadioButton();
        rbNunca9 = new javax.swing.JRadioButton();
        rbPocas9 = new javax.swing.JRadioButton();
        rbKSiempre9 = new javax.swing.JRadioButton();
        rbSiempre9 = new javax.swing.JRadioButton();
        rbNunca10 = new javax.swing.JRadioButton();
        rbPocas10 = new javax.swing.JRadioButton();
        rbKSiempre10 = new javax.swing.JRadioButton();
        rbSiempre10 = new javax.swing.JRadioButton();
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
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        pnBanner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btMsg = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        pnObservaciones = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        edpObservaciones = new javax.swing.JEditorPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbNCAdvertnc = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Necesidades Especiales");
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(785, 650));
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

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(850, 600));

        pnContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnContenedor.setPreferredSize(new java.awt.Dimension(700, 900));

        pnComandos.setBackground(new java.awt.Color(255, 255, 255));

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSave.png"))); // NOI18N
        btGuardar.setEnabled(false);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
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
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        pnComandosLayout.setVerticalGroup(
            pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnContent.setBackground(new java.awt.Color(255, 255, 255));
        pnContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnAspectos.setBackground(new java.awt.Color(255, 255, 255));
        pnAspectos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Nunca");
        pnAspectos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Pocas veces");
        pnAspectos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Casi siempre");
        pnAspectos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Siempre");
        pnAspectos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 0, -1, -1));

        rbNunca1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbNunca1);
        rbNunca1.setSelected(true);
        rbNunca1.setActionCommand("0");
        rbNunca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca1ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        rbPocas1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbPocas1);
        rbPocas1.setActionCommand("0");
        rbPocas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas1ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        rbKSiempre1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbKSiempre1);
        rbKSiempre1.setActionCommand("1");
        rbKSiempre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre1ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 20, -1, -1));

        rbSiempre1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbSiempre1);
        rbSiempre1.setActionCommand("1");
        rbSiempre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre1ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 20, -1, -1));

        rbNunca2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbNunca2);
        rbNunca2.setSelected(true);
        rbNunca2.setActionCommand("0");
        rbNunca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca2ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 59, -1, -1));

        rbPocas2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbPocas2);
        rbPocas2.setActionCommand("0");
        rbPocas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas2ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 59, -1, -1));

        rbKSiempre2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbKSiempre2);
        rbKSiempre2.setActionCommand("1");
        rbKSiempre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre2ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 59, -1, -1));

        rbSiempre2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbSiempre2);
        rbSiempre2.setActionCommand("1");
        rbSiempre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre2ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 59, -1, -1));

        rbNunca3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbNunca3);
        rbNunca3.setSelected(true);
        rbNunca3.setActionCommand("0");
        rbNunca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca3ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 131, -1, -1));

        rbPocas3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbPocas3);
        rbPocas3.setActionCommand("0");
        rbPocas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas3ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 131, -1, -1));

        rbKSiempre3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbKSiempre3);
        rbKSiempre3.setActionCommand("1");
        rbKSiempre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre3ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 131, -1, -1));

        rbSiempre3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbSiempre3);
        rbSiempre3.setActionCommand("1");
        rbSiempre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre3ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 131, -1, -1));

        rbNunca4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rbNunca4);
        rbNunca4.setSelected(true);
        rbNunca4.setActionCommand("0");
        rbNunca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca4ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 186, -1, -1));

        rbPocas4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rbPocas4);
        rbPocas4.setActionCommand("0");
        rbPocas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas4ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 186, -1, -1));

        rbKSiempre4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rbKSiempre4);
        rbKSiempre4.setActionCommand("1");
        rbKSiempre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre4ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 186, -1, -1));

        rbSiempre4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rbSiempre4);
        rbSiempre4.setActionCommand("1");
        rbSiempre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre4ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 186, -1, -1));

        rbNunca5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(rbNunca5);
        rbNunca5.setSelected(true);
        rbNunca5.setActionCommand("0");
        rbNunca5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca5ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 243, -1, -1));

        rbPocas5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(rbPocas5);
        rbPocas5.setActionCommand("0");
        rbPocas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas5ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 243, -1, -1));

        rbKSiempre5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(rbKSiempre5);
        rbKSiempre5.setActionCommand("1");
        rbKSiempre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre5ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 243, -1, -1));

        rbSiempre5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(rbSiempre5);
        rbSiempre5.setActionCommand("1");
        rbSiempre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre5ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 243, -1, -1));

        rbNunca6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(rbNunca6);
        rbNunca6.setSelected(true);
        rbNunca6.setActionCommand("0");
        rbNunca6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca6ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 298, -1, -1));

        rbPocas6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(rbPocas6);
        rbPocas6.setActionCommand("0");
        rbPocas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas6ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 298, -1, -1));

        rbKSiempre6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(rbKSiempre6);
        rbKSiempre6.setActionCommand("1");
        rbKSiempre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre6ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 298, -1, -1));

        rbSiempre6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(rbSiempre6);
        rbSiempre6.setActionCommand("1");
        rbSiempre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre6ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 298, -1, -1));

        rbNunca7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rbNunca7);
        rbNunca7.setSelected(true);
        rbNunca7.setActionCommand("0");
        rbNunca7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca7ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 343, -1, -1));

        rbPocas7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rbPocas7);
        rbPocas7.setActionCommand("0");
        rbPocas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas7ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 343, -1, -1));

        rbKSiempre7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rbKSiempre7);
        rbKSiempre7.setActionCommand("1");
        rbKSiempre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre7ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 343, -1, -1));

        rbSiempre7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rbSiempre7);
        rbSiempre7.setActionCommand("1");
        rbSiempre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre7ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 343, -1, -1));

        rbNunca8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(rbNunca8);
        rbNunca8.setSelected(true);
        rbNunca8.setActionCommand("0");
        rbNunca8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca8ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 395, -1, -1));

        rbPocas8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(rbPocas8);
        rbPocas8.setActionCommand("0");
        rbPocas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas8ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 396, -1, -1));

        rbKSiempre8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(rbKSiempre8);
        rbKSiempre8.setActionCommand("1");
        rbKSiempre8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre8ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 396, -1, -1));

        rbSiempre8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(rbSiempre8);
        rbSiempre8.setActionCommand("1");
        rbSiempre8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre8ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 396, -1, -1));

        rbNunca9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rbNunca9);
        rbNunca9.setSelected(true);
        rbNunca9.setActionCommand("0");
        rbNunca9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca9ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        rbPocas9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rbPocas9);
        rbPocas9.setActionCommand("0");
        rbPocas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas9ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        rbKSiempre9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rbKSiempre9);
        rbKSiempre9.setActionCommand("1");
        rbKSiempre9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre9ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 440, -1, -1));

        rbSiempre9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rbSiempre9);
        rbSiempre9.setActionCommand("1");
        rbSiempre9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre9ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 440, -1, -1));

        rbNunca10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(rbNunca10);
        rbNunca10.setSelected(true);
        rbNunca10.setActionCommand("0");
        rbNunca10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNunca10ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbNunca10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 492, -1, -1));

        rbPocas10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(rbPocas10);
        rbPocas10.setActionCommand("0");
        rbPocas10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPocas10ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbPocas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 492, -1, -1));

        rbKSiempre10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(rbKSiempre10);
        rbKSiempre10.setActionCommand("1");
        rbKSiempre10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKSiempre10ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbKSiempre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 492, -1, -1));

        rbSiempre10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(rbSiempre10);
        rbSiempre10.setActionCommand("1");
        rbSiempre10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiempre10ActionPerformed(evt);
            }
        });
        pnAspectos.add(rbSiempre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 492, -1, -1));

        jLabel13.setText("1. El niño presenta dificultades para pronunciar palabras y escribe como habla.");
        pnAspectos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 27, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Aspectos observados");
        pnAspectos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 2, -1, -1));

        jLabel15.setText("2. El niño presenta dificultades para mantener su atención en cualquier tipo de");
        pnAspectos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 59, -1, -1));

        jLabel16.setText("actividad y se distrae con cualquier estímulo externo, sin lograr mantener la");
        pnAspectos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 79, -1, -1));

        jLabel17.setText("concentración.");
        pnAspectos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 99, -1, -1));

        jLabel18.setText("3. Habla de forma excesiva, responde antes de que la persona termine,");
        pnAspectos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 131, -1, -1));

        jLabel19.setText("tiene dificultad para esperar su turno y frecuentemente interrumpe.");
        pnAspectos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 151, -1, -1));

        jLabel20.setText("4. El niño presenta un excesivo movimiento, no permite ser tomado del mano");
        pnAspectos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 186, -1, -1));

        jLabel21.setText(" y se muestra agresivo y violento.");
        pnAspectos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 206, -1, -1));

        jLabel22.setText("5. Presenta cambios repentinos de humor, tiene un concepto pobre de sí mismo");
        pnAspectos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 243, -1, -1));

        jLabel23.setText(" y no acepta perder, por lo que no asume sus propios fracasos.");
        pnAspectos.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 263, -1, -1));

        jLabel24.setText("6. Tiene dificultad para repetir sonidos diferentes.");
        pnAspectos.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 298, -1, -1));

        jLabel25.setText("No distingue entre un sonido y otro.");
        pnAspectos.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 318, -1, -1));

        jLabel26.setText("7. Presenta dificultades para distinguir entre una palabra y otra");
        pnAspectos.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 343, -1, -1));

        jLabel27.setText("(hablada y escrita).");
        pnAspectos.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 363, -1, -1));

        jLabel28.setText("8. Omite palabras o letras al escribirlas, mezcla en su escritura");
        pnAspectos.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 395, -1, -1));

        jLabel29.setText("mayúscula con minúscula.");
        pnAspectos.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 415, -1, -1));

        jLabel30.setText("9. Escribe en forma inversa tanto los números como las letras,");
        pnAspectos.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 440, -1, -1));

        jLabel31.setText("y sustituye unas letras por otras (por ejemplo la b por la d).");
        pnAspectos.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 460, -1, -1));

        jLabel32.setText("10. Tiene tendencia a no separar las palabras.");
        pnAspectos.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 492, -1, -1));

        pnContent.add(pnAspectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 713, -1));

        pnBanner.setBackground(new java.awt.Color(255, 255, 255));
        pnBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRO DE NECESIDADES ESPECIALES");
        pnBanner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 31, -1, -1));

        lbName.setText("     ");
        pnBanner.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCodigo.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        pnBanner.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 60, -1, -1));

        btMsg.setText("...");
        btMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMsgActionPerformed(evt);
            }
        });
        pnBanner.add(btMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 82, 20, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Elije la casilla que corresponde según tus observaciones.");
        pnBanner.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 126, -1, -1));
        pnBanner.add(lbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 60, 48, 14));

        jLabel33.setText("Nombre Completo:");
        pnBanner.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 57, -1, -1));

        jLabel34.setText("Estimado maestro/a:");
        pnBanner.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 86, -1, -1));

        pnContent.add(pnBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 713, -1));

        pnObservaciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Observaciones del maestro:");

        jScrollPane4.setViewportView(edpObservaciones);

        jLabel10.setText("*En caso de sumar 3 o más casos entre \"Casi siempre\" y \"Siempre\". Deberá transferir el caso a un psicopedagogo.");

        jLabel11.setText("Número de Casos de cuidadosa observación:");

        lbNCAdvertnc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNCAdvertnc.setText("0");

        javax.swing.GroupLayout pnObservacionesLayout = new javax.swing.GroupLayout(pnObservaciones);
        pnObservaciones.setLayout(pnObservacionesLayout);
        pnObservacionesLayout.setHorizontalGroup(
            pnObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObservacionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(pnObservacionesLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnObservacionesLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNCAdvertnc))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        pnObservacionesLayout.setVerticalGroup(
            pnObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObservacionesLayout.createSequentialGroup()
                .addGroup(pnObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbNCAdvertnc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(34, 34, 34))
        );

        pnContent.add(pnObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, -1, 138));

        javax.swing.GroupLayout pnContenedorLayout = new javax.swing.GroupLayout(pnContenedor);
        pnContenedor.setLayout(pnContenedorLayout);
        pnContenedorLayout.setHorizontalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        pnContenedorLayout.setVerticalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        int code = Integer.parseInt(lbCode.getText());
        D_RegNegSpe rne = new D_RegNegSpe();

        int g1=0,g2=0,g3=0,g4=0,g5=0,g6=0,g7=0,g8=0,g9=0,g10=0;
        
        if(rbPocas1.isSelected())g1 = 1;
        if(rbPocas2.isSelected())g2 = 1;
        if(rbPocas3.isSelected())g3 = 1;
        if(rbPocas4.isSelected())g4 = 1;
        if(rbPocas5.isSelected())g5 = 1;
        if(rbPocas6.isSelected())g6 = 1;
        if(rbPocas7.isSelected())g7 = 1;
        if(rbPocas8.isSelected())g8 = 1;
        if(rbPocas9.isSelected())g9 = 1;
        if(rbPocas10.isSelected())g10 = 1;

        if(rbKSiempre1.isSelected())g1 = 2;
        if(rbKSiempre2.isSelected())g2 = 2;
        if(rbKSiempre3.isSelected())g3 = 2;
        if(rbKSiempre4.isSelected())g4 = 2;
        if(rbKSiempre5.isSelected())g5 = 2;
        if(rbKSiempre6.isSelected())g6 = 2;
        if(rbKSiempre7.isSelected())g7 = 2;
        if(rbKSiempre8.isSelected())g8 = 2;
        if(rbKSiempre9.isSelected())g9 = 2;
        if(rbKSiempre10.isSelected())g10 = 2;
        
        if(rbSiempre1.isSelected())g1 = 3;
        if(rbSiempre2.isSelected())g2 = 3;
        if(rbSiempre3.isSelected())g3 = 3;
        if(rbSiempre4.isSelected())g4 = 3;
        if(rbSiempre5.isSelected())g5 = 3;
        if(rbSiempre6.isSelected())g6 = 3;
        if(rbSiempre7.isSelected())g7 = 3;
        if(rbSiempre8.isSelected())g8 = 3;
        if(rbSiempre9.isSelected())g9 = 3;
        if(rbSiempre10.isSelected())g10 = 3;
        
        int casos = Integer.parseInt(lbNCAdvertnc.getText());
        
        rne.saveRegNecSpe(code, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, edpObservaciones.getText(),casos);
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void btMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMsgActionPerformed
        DMsgNecSpe mne = new DMsgNecSpe(JOptionPane.getFrameForComponent(this), true);
        mne.setLocationRelativeTo(null);
        mne.setVisible(true);
    }//GEN-LAST:event_btMsgActionPerformed

    private void rbKSiempre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre1ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre1ActionPerformed

    private void rbSiempre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre1ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre1ActionPerformed

    private void rbKSiempre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre2ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre2ActionPerformed

    private void rbSiempre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre2ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre2ActionPerformed

    private void rbKSiempre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre3ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre3ActionPerformed

    private void rbSiempre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre3ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre3ActionPerformed

    private void rbKSiempre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre4ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre4ActionPerformed

    private void rbSiempre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre4ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre4ActionPerformed

    private void rbKSiempre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre5ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre5ActionPerformed

    private void rbSiempre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre5ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre5ActionPerformed

    private void rbKSiempre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre6ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre6ActionPerformed

    private void rbSiempre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre6ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre6ActionPerformed

    private void rbKSiempre7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre7ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre7ActionPerformed

    private void rbSiempre7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre7ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre7ActionPerformed

    private void rbKSiempre8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre8ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre8ActionPerformed

    private void rbSiempre8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre8ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre8ActionPerformed

    private void rbKSiempre9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre9ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre9ActionPerformed

    private void rbSiempre9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre9ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre9ActionPerformed

    private void rbKSiempre10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKSiempre10ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbKSiempre10ActionPerformed

    private void rbSiempre10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiempre10ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbSiempre10ActionPerformed

    private void rbPocas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas1ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas1ActionPerformed

    private void rbNunca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca1ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca1ActionPerformed

    private void rbNunca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca2ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca2ActionPerformed

    private void rbPocas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas2ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas2ActionPerformed

    private void rbNunca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca3ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca3ActionPerformed

    private void rbPocas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas3ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas3ActionPerformed

    private void rbPocas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas4ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas4ActionPerformed

    private void rbNunca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca4ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca4ActionPerformed

    private void rbPocas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas5ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas5ActionPerformed

    private void rbNunca5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca5ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca5ActionPerformed

    private void rbNunca6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca6ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca6ActionPerformed

    private void rbPocas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas6ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas6ActionPerformed

    private void rbPocas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas7ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas7ActionPerformed

    private void rbNunca7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca7ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca7ActionPerformed

    private void rbNunca8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca8ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca8ActionPerformed

    private void rbPocas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas8ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas8ActionPerformed

    private void rbPocas9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas9ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas9ActionPerformed

    private void rbNunca9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca9ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca9ActionPerformed

    private void rbNunca10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNunca10ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbNunca10ActionPerformed

    private void rbPocas10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPocas10ActionPerformed
        sumarCasos();
    }//GEN-LAST:event_rbPocas10ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.regNecSpe = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        DListadoAlumnos lalu = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        lalu.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Registro de Necesidades Especiales");
        lalu.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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

    public void sumarCasos(){
        
        int numCasos[] = new int[10];
        numCasos[0] = Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        numCasos[1] = Integer.parseInt(buttonGroup2.getSelection().getActionCommand());
        numCasos[2] = Integer.parseInt(buttonGroup3.getSelection().getActionCommand());
        numCasos[3] = Integer.parseInt(buttonGroup4.getSelection().getActionCommand());
        numCasos[4] = Integer.parseInt(buttonGroup5.getSelection().getActionCommand());
        numCasos[5] = Integer.parseInt(buttonGroup6.getSelection().getActionCommand());
        numCasos[6] = Integer.parseInt(buttonGroup7.getSelection().getActionCommand());
        numCasos[7] = Integer.parseInt(buttonGroup8.getSelection().getActionCommand());
        numCasos[8] = Integer.parseInt(buttonGroup9.getSelection().getActionCommand());
        numCasos[9] = Integer.parseInt(buttonGroup10.getSelection().getActionCommand());
        
        int sum = 0;
        for(int x : numCasos){
            sum += x;
        }
        lbNCAdvertnc.setText(String.valueOf(sum));
    }
    
    public static void consultarTodo(int codigo){
        D_RegNegSpe rne = new D_RegNegSpe();
        rne.consultaPag1(codigo);
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
    public javax.swing.JButton btCerrar;
    public static javax.swing.JButton btGuardar;
    private javax.swing.JButton btMsg;
    private javax.swing.JButton btPrint;
    public static javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.ButtonGroup buttonGroup10;
    public static javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.ButtonGroup buttonGroup3;
    public static javax.swing.ButtonGroup buttonGroup4;
    public static javax.swing.ButtonGroup buttonGroup5;
    public static javax.swing.ButtonGroup buttonGroup6;
    public static javax.swing.ButtonGroup buttonGroup7;
    public static javax.swing.ButtonGroup buttonGroup8;
    public static javax.swing.ButtonGroup buttonGroup9;
    public static javax.swing.JEditorPane edpObservaciones;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JLabel lbCode;
    public static javax.swing.JLabel lbNCAdvertnc;
    public static javax.swing.JLabel lbName;
    private javax.swing.JPanel pnAspectos;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnComandos;
    private javax.swing.JPanel pnContenedor;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnObservaciones;
    public static javax.swing.JRadioButton rbKSiempre1;
    public static javax.swing.JRadioButton rbKSiempre10;
    public static javax.swing.JRadioButton rbKSiempre2;
    public static javax.swing.JRadioButton rbKSiempre3;
    public static javax.swing.JRadioButton rbKSiempre4;
    public static javax.swing.JRadioButton rbKSiempre5;
    public static javax.swing.JRadioButton rbKSiempre6;
    public static javax.swing.JRadioButton rbKSiempre7;
    public static javax.swing.JRadioButton rbKSiempre8;
    public static javax.swing.JRadioButton rbKSiempre9;
    public static javax.swing.JRadioButton rbNunca1;
    public static javax.swing.JRadioButton rbNunca10;
    public static javax.swing.JRadioButton rbNunca2;
    public static javax.swing.JRadioButton rbNunca3;
    public static javax.swing.JRadioButton rbNunca4;
    public static javax.swing.JRadioButton rbNunca5;
    public static javax.swing.JRadioButton rbNunca6;
    public static javax.swing.JRadioButton rbNunca7;
    public static javax.swing.JRadioButton rbNunca8;
    public static javax.swing.JRadioButton rbNunca9;
    public static javax.swing.JRadioButton rbPocas1;
    public static javax.swing.JRadioButton rbPocas10;
    public static javax.swing.JRadioButton rbPocas2;
    public static javax.swing.JRadioButton rbPocas3;
    public static javax.swing.JRadioButton rbPocas4;
    public static javax.swing.JRadioButton rbPocas5;
    public static javax.swing.JRadioButton rbPocas6;
    public static javax.swing.JRadioButton rbPocas7;
    public static javax.swing.JRadioButton rbPocas8;
    public static javax.swing.JRadioButton rbPocas9;
    public static javax.swing.JRadioButton rbSiempre1;
    public static javax.swing.JRadioButton rbSiempre10;
    public static javax.swing.JRadioButton rbSiempre2;
    public static javax.swing.JRadioButton rbSiempre3;
    public static javax.swing.JRadioButton rbSiempre4;
    public static javax.swing.JRadioButton rbSiempre5;
    public static javax.swing.JRadioButton rbSiempre6;
    public static javax.swing.JRadioButton rbSiempre7;
    public static javax.swing.JRadioButton rbSiempre8;
    public static javax.swing.JRadioButton rbSiempre9;
    // End of variables declaration//GEN-END:variables
}