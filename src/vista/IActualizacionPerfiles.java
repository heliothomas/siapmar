
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.D_ActualzPerfil;
import modelo.Grupo;
import modelo.Patro;
import sc.Conexion;
import sc.Library;
import sc.Metodos;


public class IActualizacionPerfiles extends javax.swing.JInternalFrame implements Printable{

File file = null;
private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen", "jpg","png");

Metodos m = new Metodos();
    
    public IActualizacionPerfiles() {
        initComponents();
        D_ActualzPerfil ap = new D_ActualzPerfil();
        ap.getGrupo();
        ap.getPatrocinador();
    }

    public static DefaultComboBoxModel cbModelGrupo = new DefaultComboBoxModel();
    public static DefaultComboBoxModel cbModelPatrocin = new DefaultComboBoxModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filecFoto = new javax.swing.JFileChooser();
        pnContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ftfCel = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        ftfTel = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbxGrupo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cbxPatrocinador = new javax.swing.JComboBox();
        lbName = new javax.swing.JLabel();
        lbFecNac = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDir = new javax.swing.JTextArea();
        lbCode = new javax.swing.JLabel();
        lbFoto = new javax.swing.JLabel();
        pnComandos = new javax.swing.JPanel();
        btFoto = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();

        filecFoto.setAcceptAllFileFilterUsed(false);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Actualización de Perfiles");
        setPreferredSize(new java.awt.Dimension(720, 650));
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

        pnContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCodigo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnContenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, -1, -1));

        jLabel2.setText("Fecha de nacimiento:");
        pnContenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 427, -1, -1));

        jLabel3.setText("Nombre:");
        pnContenedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 407, -1, -1));

        jLabel8.setText("Dirección:");
        pnContenedor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 452, -1, -1));

        jLabel9.setText("Celular:");
        pnContenedor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 521, -1, -1));

        try {
            ftfCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("8###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnContenedor.add(ftfCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 518, 67, -1));

        jLabel10.setText("Teléfono:");
        pnContenedor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 521, -1, -1));

        try {
            ftfTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("2###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnContenedor.add(ftfTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 518, 67, -1));

        jLabel11.setText("Email:");
        pnContenedor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 521, -1, -1));

        tfEmail.setText(" ");
        pnContenedor.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 518, 260, -1));

        jLabel12.setText("Grupo/Nivel actual:");
        pnContenedor.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 547, -1, -1));

        cbxGrupo.setModel(cbModelGrupo);
        pnContenedor.add(cbxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 544, 210, -1));

        jLabel13.setText("Patrocinador actual:");
        pnContenedor.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 573, -1, -1));

        cbxPatrocinador.setModel(cbModelPatrocin);
        pnContenedor.add(cbxPatrocinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 570, 210, -1));

        lbName.setText("                                                                                                                ");
        pnContenedor.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 407, -1, -1));

        lbFecNac.setText("                  ");
        pnContenedor.add(lbFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 427, -1, -1));

        taDir.setColumns(20);
        taDir.setRows(3);
        jScrollPane1.setViewportView(taDir);

        pnContenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 452, 486, -1));
        pnContenedor.add(lbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 46, 14));

        lbFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 2, true));
        pnContenedor.add(lbFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 440, 350));

        pnComandos.setBackground(new java.awt.Color(255, 255, 255));

        btFoto.setBackground(new java.awt.Color(255, 51, 51));
        btFoto.setText("Foto");
        btFoto.setEnabled(false);
        btFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFotoActionPerformed(evt);
            }
        });

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
            .addGroup(pnComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFoto)
                    .addGroup(pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btPrint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(btGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnComandosLayout.setVerticalGroup(
            pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandosLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btFoto)
                .addGap(34, 34, 34)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnComandos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addComponent(pnComandos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFotoActionPerformed
        filecFoto.setFileFilter(filter);
        
        int returnVal = filecFoto.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            
            ImageIcon fot = new ImageIcon(filecFoto.getSelectedFile().getAbsolutePath());
            
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(
                    lbFoto.getWidth(), 
                    lbFoto.getHeight(), 
                    Image.SCALE_DEFAULT));
            
            lbFoto.setIcon(icono);
            
            guardarfoto(filecFoto.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btFotoActionPerformed

    //Método que guarda una imagen JPG en la base de datos
    public boolean guardarfoto(String ruta) {
        boolean res = false;
        FileInputStream fis = null;
        Connection conx = Conexion.getSQLConnection();
        try {
            File archivo = new File(ruta);
            fis = new FileInputStream(archivo);
            String sqlQuery = "UPDATE Alumno SET s_urlFoto=? WHERE c_alumno=" + Integer.parseInt(lbCode.getText());
            
            try (PreparedStatement pstm = conx.prepareStatement(sqlQuery)) {
                pstm.setBinaryStream(1, fis,(int) archivo.length());
                pstm.execute();
                
                res = true;
            }
        } catch (FileNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
             res = false;
        } finally {
            try {
               fis.close();
             } catch (IOException e) {
               JOptionPane.showMessageDialog(null, e.getMessage());
               res = false;
             }
        }
        return res;
   }
    
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        int codigo = Integer.parseInt(lbCode.getText());
        D_ActualzPerfil ap = new D_ActualzPerfil();
        
        Grupo gru = (Grupo)cbxGrupo.getSelectedItem();
        String codGrupo = gru.getCode();
        Patro patro = (Patro)cbxPatrocinador.getSelectedItem();
        String codPatroc = patro.getID();
        
        if (Library.checkEmail(tfEmail.getText()) || tfEmail.getText().equals("")) {
            if (ap.updatePerfil(codigo, ftfCel.getText(), ftfTel.getText(), tfEmail.getText(), codGrupo, codPatroc)) {
                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Email escrito incorrectamente.");
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.actperf = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        DListadoAlumnos lalu = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        lalu.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Actualización de Perfil");
        lalu.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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

    public static void consultar(int codigo){
        D_ActualzPerfil ap = new D_ActualzPerfil();
        ap.consultaPag1(codigo);
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0)
          return NO_SUCH_PAGE;

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        g2d.scale(0.65, 0.80);

        pnContenedor.printAll(graphics);
        
        return PAGE_EXISTS;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btCerrar;
    public static javax.swing.JButton btFoto;
    public static javax.swing.JButton btGuardar;
    private javax.swing.JButton btPrint;
    public static javax.swing.JComboBox cbxGrupo;
    public static javax.swing.JComboBox cbxPatrocinador;
    private javax.swing.JFileChooser filecFoto;
    public static javax.swing.JFormattedTextField ftfCel;
    public static javax.swing.JFormattedTextField ftfTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbCode;
    public static javax.swing.JLabel lbFecNac;
    public static javax.swing.JLabel lbFoto;
    public static javax.swing.JLabel lbName;
    private javax.swing.JPanel pnComandos;
    private javax.swing.JPanel pnContenedor;
    public static javax.swing.JTextArea taDir;
    public static javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}