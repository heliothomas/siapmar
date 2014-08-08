package vista;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DBackImage extends javax.swing.JDialog {

File file = null;
private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen", "jpg","png");

    public DBackImage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        filecImg = new javax.swing.JFileChooser();
        btCerrar1 = new javax.swing.JButton();
        tfURL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxImgPred = new javax.swing.JComboBox();
        btOK = new javax.swing.JButton();
        rbImgExt = new javax.swing.JRadioButton();
        rbImgPred = new javax.swing.JRadioButton();
        rbQuitarImg = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Poner Imagen de Fondo");
        setBackground(java.awt.Color.white);
        setResizable(false);

        btCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar1ActionPerformed(evt);
            }
        });

        tfURL.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione una de las opciones");

        btOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btPoner.png"))); // NOI18N
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        rbImgExt.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbImgExt);
        rbImgExt.setText("Imagen externa");
        rbImgExt.setActionCommand("2");
        rbImgExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbImgExtActionPerformed(evt);
            }
        });

        rbImgPred.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbImgPred);
        rbImgPred.setText("Imagen predeterminada");
        rbImgPred.setActionCommand("1");
        rbImgPred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbImgPredActionPerformed(evt);
            }
        });

        rbQuitarImg.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbQuitarImg);
        rbQuitarImg.setSelected(true);
        rbQuitarImg.setText("Quitar imagen de fondo");
        rbQuitarImg.setActionCommand("0");
        rbQuitarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbQuitarImgActionPerformed(evt);
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
                        .addComponent(rbQuitarImg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(rbImgPred)
                        .addGap(6, 6, 6)
                        .addComponent(cbxImgPred, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(rbImgExt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164)
                                .addComponent(btCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(rbQuitarImg)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbImgPred)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbxImgPred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(rbImgExt)
                .addGap(7, 7, 7)
                .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btOK, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrar1ActionPerformed

public static ImageIcon fot;
    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed

        String opt = buttonGroup1.getSelection().getActionCommand();

        if (opt.equals("0")) {
            fot = null;
            MenuMain.lbFondo.setIcon(fot);
            MenuMain.lbFondo.setSize(2, 1);
            MenuMain.lbFondo.removeAll();
            MenuMain.lbFondo.repaint();
        }
        if (opt.equals("1")) {
            MenuMain.lbFondo.setVisible(true);

            int imgPred = cbxImgPred.getSelectedIndex();
            String url = "";

            if (imgPred == 0) url = "/imgsys/ifSIAPMAR_G.png";
            
            if (imgPred == 1) url = "/imgsys/ifAguaVida.jpg";
            
            if (imgPred == 2) url = "/imgsys/ifOtono.jpg";
            
            if (imgPred == 3) url = "/imgsys/ifPastosPaz.jpg";
            
            if (imgPred == 4) url = "/imgsys/ifCrecimiento.jpg";
            
            if (imgPred == 5) url = "/imgsys/ifPlaya.jpg";

            fot = new ImageIcon(getClass().getResource(url));
            MenuMain.lbFondo.setSize(MenuMain.dskp.getWidth() - 50, MenuMain.dskp.getHeight() - 50);

            ImageIcon imgRes = new ImageIcon(fot.getImage().getScaledInstance(MenuMain.lbFondo.getWidth(), MenuMain.lbFondo.getHeight(), Image.SCALE_SMOOTH));
            MenuMain.lbFondo.setIcon(imgRes);

            this.repaint();
        }
        if (opt.equals("2")) {
            MenuMain.lbFondo.setVisible(true);

            if (!tfURL.getText().equals("")) {
                MenuMain.lbFondo.setIcon(new ImageIcon(file.getAbsolutePath()));
            }

            fot = new ImageIcon(tfURL.getText());
            MenuMain.lbFondo.setSize(MenuMain.dskp.getWidth() - 50, MenuMain.dskp.getHeight() - 50);
            ImageIcon imgRes = new ImageIcon(fot.getImage().getScaledInstance(MenuMain.lbFondo.getWidth(), MenuMain.lbFondo.getHeight(), Image.SCALE_SMOOTH));

            MenuMain.lbFondo.setIcon(imgRes);

            this.repaint();
        }

    }//GEN-LAST:event_btOKActionPerformed

    private void rbImgExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbImgExtActionPerformed
        cbxImgPred.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" "}));
        filecImg.setFileFilter(filter);
        filecImg.setAcceptAllFileFilterUsed(false);
        
        int returnVal = filecImg.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = filecImg.getSelectedFile();
            tfURL.setText(file.getAbsolutePath());
        } else {
            tfURL.setText("");
        }
    }//GEN-LAST:event_rbImgExtActionPerformed

    private void rbImgPredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbImgPredActionPerformed
        if (rbImgPred.isSelected()) {
            cbxImgPred.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "SIAPMAR", "Agua de vida", "Otoño", "Pastos de paz", "Crecimiento", "Playa"
                    }));
        }
        tfURL.setText("");
    }//GEN-LAST:event_rbImgPredActionPerformed

    private void rbQuitarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbQuitarImgActionPerformed
        cbxImgPred.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" "}));
        tfURL.setText("");
    }//GEN-LAST:event_rbQuitarImgActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DBackImage dialog = new DBackImage(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxImgPred;
    private javax.swing.JFileChooser filecImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbImgExt;
    private javax.swing.JRadioButton rbImgPred;
    private javax.swing.JRadioButton rbQuitarImg;
    public static javax.swing.JTextField tfURL;
    // End of variables declaration//GEN-END:variables
}
