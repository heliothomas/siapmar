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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.D_Cartas;
import modelo.D_RegCorr;


public class IRegCorrespondencia extends javax.swing.JInternalFrame implements Printable{
    
    DefaultTableModel tbCartas = new DefaultTableModel(null, new String[]{"Tipo de Carta","Fecha Entregada","Fecha Recibida","Patrocinador"});

    ListSelectionModel lsmclientes;
    
    public IRegCorrespondencia() {
        initComponents();
    }
    

    public static void Listar(){
        if (!lbCode.getText().equals("") || lbCode.getText() != null) {
            DefaultTableModel tabla = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column) {
                        return false;
                }
            };
            D_Cartas c = new D_Cartas();
            ArrayList<D_Cartas> lista = c.ListarCartas(Integer.parseInt(lbCode.getText()));
            
            tabla.addColumn("Carta");
            tabla.addColumn("Fecha Entregada");
            tabla.addColumn("Fecha Recibida");
            tabla.addColumn("Patrocinador");
            tabla.setRowCount(lista.size());

            int i = 0;

            for(D_Cartas x:lista){
                tabla.setValueAt(x.getCarta(),i,0);
                tabla.setValueAt(x.getfEnt(),i,1);
                tabla.setValueAt(x.getfRec(),i,2);
                tabla.setValueAt(x.getPat(),i,3);
                i++;
            }
            tblCorr.setModel(tabla);
            /*
            tblCorr.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tblCorr.getColumnModel().getColumn(0).setPreferredWidth(280);
            tblCorr.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblCorr.getColumnModel().getColumn(2).setPreferredWidth(35);
            tblCorr.getColumnModel().getColumn(3).setPreferredWidth(235);*/
            
            if (tblCorr.getRowCount()>0) {
                btAddRow.setEnabled(true);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnContent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCorr = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btCerrar = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        btEditRow = new javax.swing.JButton();
        btAddRow = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de Correspondencia");
        setPreferredSize(new java.awt.Dimension(827, 500));
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

        pnContent.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRO DE CORRESPONDENCIA");

        jLabel2.setText("Nombre completo:");

        lbName.setText("     ");

        lbCode.setText("     ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCodigo.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        tblCorr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCorr.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCorr.getTableHeader().setResizingAllowed(false);
        tblCorr.getTableHeader().setReorderingAllowed(false);
        tblCorr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCorrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCorr);

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(lbCode)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(lbName))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel1)))
                        .addGap(219, 219, 219))))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbCode)
                    .addComponent(jLabel2)
                    .addComponent(lbName))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAddRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditRow, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btAddRow)
                .addGap(36, 36, 36)
                .addComponent(btEditRow)
                .addGap(154, 154, 154)
                .addComponent(btPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btCerrar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.regCorres = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        DListadoAlumnos lalu = new DListadoAlumnos(JOptionPane.getFrameForComponent(this), true);
        lalu.setLocationRelativeTo(null);
        DListadoAlumnos.tfForm.setText("Registro de Correspondencia");
        lalu.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void btEditRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditRowActionPerformed
        DCartas c = new DCartas(JOptionPane.getFrameForComponent(this), true);
        c.setLocationRelativeTo(null);
        c.lbOp.setText("Editando");

        int fila = tblCorr.getSelectedRow();

        DCartas.cbxCartas.setSelectedItem(tblCorr.getValueAt(fila, 0).toString());
        ((JTextField)DCartas.datecEntrega.getDateEditor().getUiComponent()).setText(tblCorr.getValueAt(fila, 1).toString());
        ((JTextField)DCartas.datecRecibe.getDateEditor().getUiComponent()).setText(tblCorr.getValueAt(fila, 2).toString());
        DCartas.cbxPatrocin.setSelectedItem(tblCorr.getValueAt(fila, 3).toString());

        c.setTitle("Editando una Correspondencia");
        
        c.setVisible(true);
    }//GEN-LAST:event_btEditRowActionPerformed

    private void btAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRowActionPerformed
        DCartas c = new DCartas(JOptionPane.getFrameForComponent(this), true);
        c.setLocationRelativeTo(null);
        DCartas.lbOp.setText("Nuevo");
        c.setTitle("Nueva Correspondencia");
        c.setVisible(true);
    }//GEN-LAST:event_btAddRowActionPerformed

    private void tblCorrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCorrMouseClicked
        btEditRow.setEnabled(true);
    }//GEN-LAST:event_tblCorrMouseClicked

    public static void consultarTodo(int codigo){
        D_RegCorr rc = new D_RegCorr();
        rc.consultaPag1(codigo);
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbCode;
    public static javax.swing.JLabel lbName;
    private javax.swing.JPanel pnContent;
    public static javax.swing.JTable tblCorr;
    // End of variables declaration//GEN-END:variables
}
