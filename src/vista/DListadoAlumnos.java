package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.D_Historia;
import modelo.D_ListadoAlumnos;
import sc.GeneradorCodigo;

public class DListadoAlumnos extends javax.swing.JDialog implements Printable{

GeneradorCodigo gc = new GeneradorCodigo();
    
    public DListadoAlumnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.white);
        tblAlumnos.setEditingRow(0);
        Listar();
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tblAlumnos.getColumnModel().getColumn(0).setCellRenderer( renderer );
        tblAlumnos.getColumnModel().getColumn(2).setCellRenderer( renderer );
        tblAlumnos.getColumnModel().getColumn(3).setCellRenderer( renderer );
        renderer = (DefaultTableCellRenderer)
            tblAlumnos.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        
        tblAlumnos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblAlumnos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblAlumnos.getColumnModel().getColumn(1).setPreferredWidth(391);
        tblAlumnos.getColumnModel().getColumn(2).setPreferredWidth(110);
        tblAlumnos.getColumnModel().getColumn(3).setPreferredWidth(90);
        
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    
    DefaultTableModel tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                    return false;
            }
    };

    public void Listar(){
        D_ListadoAlumnos objart = new D_ListadoAlumnos();
        
        ArrayList<D_ListadoAlumnos> lista = objart.ListarAlumnos();
        
        tabla.addColumn("Código");
        tabla.addColumn("Nombre Completo del Alumno");
        tabla.addColumn("Fecha de Nacimiento");
        tabla.addColumn("Edad");
        tabla.setRowCount(lista.size());
        
        int i = 0;
        
        for(D_ListadoAlumnos x:lista){
            tabla.setValueAt(x.getCode(),i,0);
            tabla.setValueAt(x.getName(),i,1);
            tabla.setValueAt(x.getFecNac(),i,2);
            tabla.setValueAt(x.getEdad(),i,3);
            i++;
        }
        tblAlumnos.setModel(tabla);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pnComandos = new javax.swing.JPanel();
        btClose = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        btSel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfForm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Alumnos Matriculados");
        setLocationByPlatform(true);
        setResizable(false);

        pnContent.setBackground(new java.awt.Color(255, 255, 255));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAlumnos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAlumnos.getTableHeader().setResizingAllowed(false);
        tblAlumnos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAlumnos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Lista de Alumnos Matriculados");

        tfSearch.setText("Escriba el texto a buscar");
        tfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSearchMouseClicked(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        jLabel3.setText("Filtro de búsqueda:");

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(251, 251, 251))))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnComandos.setBackground(new java.awt.Color(255, 255, 255));

        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btCerrar.png"))); // NOI18N
        btClose.setBorder(null);
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        btPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btImprimir.png"))); // NOI18N
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });

        btSel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgsys/btSeleccionar.png"))); // NOI18N
        btSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelActionPerformed(evt);
            }
        });

        jLabel2.setText("La solicitud del código es del formulario:");

        tfForm.setEditable(false);

        javax.swing.GroupLayout pnComandosLayout = new javax.swing.GroupLayout(pnComandos);
        pnComandos.setLayout(pnComandosLayout);
        pnComandosLayout.setHorizontalGroup(
            pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComandosLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfForm, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40))
        );
        pnComandosLayout.setVerticalGroup(
            pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComandosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnComandosLayout.createSequentialGroup()
                        .addComponent(btClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(btSel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnComandosLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(pnComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        if (tfForm.getText().equals("Historia del Niño")) {
            IHistory.lbCode.setText(String.valueOf(gc.getLastCode()));
            IHistory.rbNew.setSelected(true);
            IHistory.rbUpd.setSelected(false);
            D_Historia.LimpiarTodo();
            IHistory.btGuardar1.setEnabled(false);
        }

        dispose();
    }//GEN-LAST:event_btCloseActionPerformed

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

    private void btSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelActionPerformed

        String putCode = "";
        int codigo = 0;

        if (tblAlumnos.getSelectedRowCount() != 0) {
            codigo = Integer.parseInt(tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 0).toString());
            putCode = tblAlumnos.getValueAt(tblAlumnos.getSelectedRow(), 0).toString();
        }

        if (tfForm.getText().equals("Historia del Niño")) {
            if (tblAlumnos.getSelectedRowCount() != 0) {
                IHistory.lbCode.setText(putCode);
                IHistory.consultarTodo(codigo);
            } else {
                IHistory.lbCode.setText(String.valueOf(gc.getLastCode()));
                IHistory.rbNew.setSelected(true);
                IHistory.rbUpd.setSelected(false);
                D_Historia.LimpiarTodo();
                IHistory.btGuardar1.setEnabled(false);
            }
        }

        if (tblAlumnos.getSelectedRowCount() != 0) {
            if (tfForm.getText().equals("Ficha Socioeconómica")) {
                IFichaSocioEcon.lbCode.setText(putCode);
                IFichaSocioEcon.consultarTodo(codigo);
            }
            if (tfForm.getText().equals("Fondo Médico de Compassion")) {
                IFondoMedicoComp.lbCode.setText(putCode);
                IFondoMedicoComp.consultarTodo(codigo);
            }
            if (tfForm.getText().equals("Registro de Necesidades Especiales")) {
                IRegNecSpe.lbCode.setText(putCode);
                IRegNecSpe.consultarTodo(codigo);
            }
            if (tfForm.getText().equals("Informe de Referencia de Diagnósticos y Tratamiento")) {
                if (tblAlumnos.getSelectedRowCount() != 0) {
                    IInformeRefDiagTrat.lbCode.setText(putCode);
                    IInformeRefDiagTrat.consultarTodo(codigo);
                    IInformeRefDiagTrat.btGuardar.setEnabled(false);
                    IInformeRefDiagTrat.btEEnvio.setEnabled(true);
                }
            }
            if (tfForm.getText().equals("Registro de Correspondencia")) {
                IRegCorrespondencia.lbCode.setText(putCode);
                IRegCorrespondencia.consultarTodo(codigo);
            }
            if (tfForm.getText().equals("Tipo de Programa Educativo")) {
                ITipoProgEdu.lbCode.setText(putCode);
                ITipoProgEdu.consultarTodo(codigo);
            }
            if (tfForm.getText().equals("Visitas")) {
                IVisitas.lbCode.setText(putCode);
                IVisitas.consultarTodo(codigo);
            }
            if (tfForm.getText().equals("Actualización de Perfil")) {
                IActualizacionPerfiles.lbCode.setText(putCode);
                IActualizacionPerfiles.consultar(codigo);
            }
            if (tfForm.getText().equals("Altas y Bajas")) {
                DABAlumno.lbCode.setText(putCode);
                DABAlumno.consultar(codigo);
            }
            if (tfForm.getText().equals("Historia Clínica Pediátrica")) {
                IPediatrica.lbCode.setText(putCode);
                IPediatrica.consultarTodo(codigo);
            }
        }
        //Poner las demas aqui
        dispose();
    }//GEN-LAST:event_btSelActionPerformed

    private void filtrar(){
        String text = tfSearch.getText();
        final TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(tabla);
        tblAlumnos.setRowSorter(sorter);
         if (text.length() == 0) {
          sorter.setRowFilter(null);
        } else {
          sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }
    
    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        filtrar();
    }//GEN-LAST:event_tfSearchKeyReleased

    private void tfSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseClicked
        tfSearch.setText("");
        filtrar();
    }//GEN-LAST:event_tfSearchMouseClicked

    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0)
          return NO_SUCH_PAGE;

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        
        //g2d.scale(0.65, 0.80);

        pnContent.printAll(graphics);
        
        return PAGE_EXISTS;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DListadoAlumnos dialog = new DListadoAlumnos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btClose;
    private javax.swing.JButton btPrint;
    private javax.swing.JButton btSel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnComandos;
    private javax.swing.JPanel pnContent;
    public static javax.swing.JTable tblAlumnos;
    public static javax.swing.JTextField tfForm;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

}
