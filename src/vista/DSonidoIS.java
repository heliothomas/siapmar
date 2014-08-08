package vista;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import sc.Conexion;
import sc.Reproducir;

public class DSonidoIS extends javax.swing.JDialog {

Connection conx = null;
Statement st;
File file = null;
private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo mp3", "mp3");

    public DSonidoIS(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.white);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        filecImg = new javax.swing.JFileChooser();
        rbSongPred = new javax.swing.JRadioButton();
        rbNoSong = new javax.swing.JRadioButton();
        cbxSoundPred = new javax.swing.JComboBox();
        rbSongExt = new javax.swing.JRadioButton();
        btOK = new javax.swing.JButton();
        tfURL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btCerrar1 = new javax.swing.JButton();
        tgbPlay = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sonido de Inicio de Sesión");

        rbSongPred.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbSongPred);
        rbSongPred.setText("Sonido predeterminado");
        rbSongPred.setActionCommand("1");
        rbSongPred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSongPredActionPerformed(evt);
            }
        });

        rbNoSong.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbNoSong);
        rbNoSong.setSelected(true);
        rbNoSong.setText("Quitar sonido al iniciar sesión");
        rbNoSong.setActionCommand("0");
        rbNoSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoSongActionPerformed(evt);
            }
        });

        rbSongExt.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbSongExt);
        rbSongExt.setText("Sonido externo (cualquier archivo mp3)");
        rbSongExt.setActionCommand("2");
        rbSongExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSongExtActionPerformed(evt);
            }
        });

        btOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btPoner.png"))); // NOI18N
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        tfURL.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione una de las opciones");

        btCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar1ActionPerformed(evt);
            }
        });

        tgbPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btReproducir.png"))); // NOI18N
        tgbPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(rbNoSong))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(rbSongPred)
                        .addGap(6, 6, 6)
                        .addComponent(cbxSoundPred, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(rbSongExt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tgbPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(rbNoSong)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSongPred)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbxSoundPred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(rbSongExt)
                .addGap(7, 7, 7)
                .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgbPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSongPredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSongPredActionPerformed
        if (rbSongPred.isSelected()) {
            cbxSoundPred.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "Windows 7", "Ubuntu", "Hallazgo", "Tropical", "Arpa Apacible"
                    }));
        }
        tfURL.setText("");
    }//GEN-LAST:event_rbSongPredActionPerformed

    private void rbNoSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoSongActionPerformed
        cbxSoundPred.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" "}));
        tfURL.setText("");
    }//GEN-LAST:event_rbNoSongActionPerformed

    private void rbSongExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSongExtActionPerformed
        cbxSoundPred.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" "}));
        filecImg.setFileFilter(filter);
        filecImg.setAcceptAllFileFilterUsed(false);
        
        int returnVal = filecImg.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = filecImg.getSelectedFile();
            tfURL.setText(file.getAbsolutePath());
        } else {
            tfURL.setText("");
            rbNoSong.setSelected(true);
        }
    }//GEN-LAST:event_rbSongExtActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed

        String opt = buttonGroup1.getSelection().getActionCommand();
        String url = "";

        if (opt.equals("0")) {
            url = "No";
        }
        if (opt.equals("1")) {

            int imgPred = cbxSoundPred.getSelectedIndex();

            if (imgPred == 0) {
                url = "is1";
            }
            if (imgPred == 1) {
                url = "is2";
            }
            if (imgPred == 2) {
                url = "is3";
            }
            if (imgPred == 3) {
                url = "is4";
            }
            if (imgPred == 4) {
                url = "is5";
            }
        }
        if (opt.equals("2")) {
            if (!tfURL.getText().equals("")) {
                url = file.getAbsolutePath();
            }
        }

        try {
            conx = Conexion.getSQLConnection();
            st = conx.createStatement();
            st.executeUpdate("update login set song='" + url + "'");
            JOptionPane.showMessageDialog(null, "Se ha guardado tu opción\nInicia sesión para verificar tus cambios");
        } catch (SQLException | HeadlessException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btOKActionPerformed

    private void btCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar1ActionPerformed

    private void tgbPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbPlayActionPerformed
        ImageIcon img = null;

        if (tgbPlay.isSelected()) {

            img = new ImageIcon(getClass().getResource("/imgsys/btDetener.png"));
            tgbPlay.setIcon(img);

            String[] a = {"pa"};
            Reproducir.main(a);
        } else {

            img = new ImageIcon(getClass().getResource("/imgsys/btReproducir.png"));
            tgbPlay.setIcon(img);

            Reproducir.detener();
        }
        this.repaint();
    }//GEN-LAST:event_tgbPlayActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DSonidoIS dialog = new DSonidoIS(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCerrar1;
    private javax.swing.JButton btOK;
    public static javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox cbxSoundPred;
    private javax.swing.JFileChooser filecImg;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JRadioButton rbNoSong;
    public static javax.swing.JRadioButton rbSongExt;
    public static javax.swing.JRadioButton rbSongPred;
    public static javax.swing.JTextField tfURL;
    public static javax.swing.JToggleButton tgbPlay;
    // End of variables declaration//GEN-END:variables
}