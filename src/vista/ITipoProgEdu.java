
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.D_TipoProgEdu;

public class ITipoProgEdu extends javax.swing.JInternalFrame implements Printable{


    public ITipoProgEdu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnContenedor = new javax.swing.JPanel();
        btCerrar = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        pnContent = new javax.swing.JPanel();
        pnContenido = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProgEdu = new javax.swing.JTable();
        pnBanner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        btAddRow = new javax.swing.JButton();
        btEditRow = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tipo de Programa Educativo");
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

        pnContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnContenedor.setPreferredSize(new java.awt.Dimension(680, 500));

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

        pnContent.setBackground(new java.awt.Color(255, 255, 255));
        pnContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnContenido.setBackground(new java.awt.Color(255, 255, 255));

        tblProgEdu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProgEdu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProgEdu.getTableHeader().setResizingAllowed(false);
        tblProgEdu.getTableHeader().setReorderingAllowed(false);
        tblProgEdu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProgEduMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblProgEdu);

        javax.swing.GroupLayout pnContenidoLayout = new javax.swing.GroupLayout(pnContenido);
        pnContenido.setLayout(pnContenidoLayout);
        pnContenidoLayout.setHorizontalGroup(
            pnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenidoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnContenidoLayout.setVerticalGroup(
            pnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnContent.add(pnContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 520, -1));

        pnBanner.setBackground(new java.awt.Color(255, 255, 255));
        pnBanner.setPreferredSize(new java.awt.Dimension(250, 104));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TIPO DE PROGRAMA EDUCATIVO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCodigo.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("Nombre:");

        lbName.setText("      ");

        javax.swing.GroupLayout pnBannerLayout = new javax.swing.GroupLayout(pnBanner);
        pnBanner.setLayout(pnBannerLayout);
        pnBannerLayout.setHorizontalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBannerLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lbCode, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnBannerLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(lbName)))))
                .addGap(303, 303, 303))
        );
        pnBannerLayout.setVerticalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbCode, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbName)))
        );

        pnContent.add(pnBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        btAddRow.setText("Agregar");
        btAddRow.setEnabled(false);
        btAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddRowActionPerformed(evt);
            }
        });

        btEditRow.setText("Editar");
        btEditRow.setEnabled(false);
        btEditRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnContenedorLayout = new javax.swing.GroupLayout(pnContenedor);
        pnContenedor.setLayout(pnContenedorLayout);
        pnContenedorLayout.setHorizontalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btAddRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditRow, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnContenedorLayout.setVerticalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, 517, Short.MAX_VALUE)
                .addGap(122, 122, 122))
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btAddRow)
                .addGap(36, 36, 36)
                .addComponent(btEditRow)
                .addGap(171, 171, 171)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(pnContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.tipoProgEdu = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        DListadoAlumnos lalu = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        lalu.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Tipo de Programa Educativo");
        lalu.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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

    private void btAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRowActionPerformed
        DTProgEdu dtpe = new DTProgEdu(JOptionPane.getFrameForComponent(this), true);
        dtpe.setLocationRelativeTo(null);
        DTProgEdu.lbOp.setText("Nuevo");
        dtpe.setTitle("Nuevo Programa Educativo");
        dtpe.setVisible(true);
    }//GEN-LAST:event_btAddRowActionPerformed

    private void btEditRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditRowActionPerformed
        DTProgEdu tpe = new DTProgEdu(JOptionPane.getFrameForComponent(this), true);
        tpe.setLocationRelativeTo(null);
        DTProgEdu.lbOp.setText("Editando");

        int fila = tblProgEdu.getSelectedRow();

        String progeduk = tblProgEdu.getValueAt(fila, 0).toString();
        DTProgEdu.cbxProgEdu.setSelectedItem(progeduk);
        
        if (progeduk.equals("Pre-escolar")) {
            DTProgEdu.cbxAnio.setModel(new DefaultComboBoxModel(
                new String[] { "1","2","3"}
            ));
        }
        if (progeduk.equals("Primaria") || progeduk.equals("Secundaria")) {
            DTProgEdu.cbxAnio.setModel(new DefaultComboBoxModel(
                new String[] { "1","2","3","4","5","6"}
            ));
        }
        
        DTProgEdu.cbxAnio.setSelectedItem(tblProgEdu.getValueAt(fila, 1).toString());
        ((JTextField) DTProgEdu.datecFecRev.getDateEditor().getUiComponent()).setText(tblProgEdu.getValueAt(fila, 2).toString());

        tpe.setTitle("Editando un Programa Educativo");

        tpe.setVisible(true);
    }//GEN-LAST:event_btEditRowActionPerformed

    private void tblProgEduMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProgEduMouseClicked
        btEditRow.setEnabled(true);
    }//GEN-LAST:event_tblProgEduMouseClicked
    
    public static void consultarTodo(int codigo){
        D_TipoProgEdu tpe = new D_TipoProgEdu();
        tpe.consultaPag1(codigo);
        Listar(codigo);
    }
    
    public static void Listar(int codigo){

        DefaultTableModel modelProgEdu = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                    return false;
            }
        };
        
        D_TipoProgEdu metodos = new D_TipoProgEdu();
        
        ArrayList<D_TipoProgEdu> lista = metodos.ListarProgEdu(codigo);
        
        modelProgEdu.addColumn("Programa educativo");
        modelProgEdu.addColumn("Año en que se encuentra");
        modelProgEdu.addColumn("Fecha de revisión");
        modelProgEdu.setRowCount(lista.size());
        
        int i = 0;
        
        for(D_TipoProgEdu x:lista){
            modelProgEdu.setValueAt(x.getProgEdu(),i,0);
            modelProgEdu.setValueAt(x.getAnio(),i,1);
            modelProgEdu.setValueAt(x.getFecRev(),i,2);
            i++;
        }
        tblProgEdu.setModel(modelProgEdu);
        
        if (tblProgEdu.getRowCount() > 0) {
            btAddRow.setEnabled(true);
        }
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tblProgEdu.getColumnModel().getColumn(0).setCellRenderer( renderer );
        tblProgEdu.getColumnModel().getColumn(1).setCellRenderer( renderer );
        tblProgEdu.getColumnModel().getColumn(2).setCellRenderer( renderer );
        renderer = (DefaultTableCellRenderer)
            tblProgEdu.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
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
    public static javax.swing.JButton btAddRow;
    public javax.swing.JButton btCerrar;
    public static javax.swing.JButton btEditRow;
    private javax.swing.JButton btPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JLabel lbCode;
    public static javax.swing.JLabel lbName;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnContenedor;
    private javax.swing.JPanel pnContenido;
    private javax.swing.JPanel pnContent;
    public static javax.swing.JTable tblProgEdu;
    // End of variables declaration//GEN-END:variables
}
