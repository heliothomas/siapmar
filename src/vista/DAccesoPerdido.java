
package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.D_AccesoPerdido;
import modelo.MandarMail;

public class DAccesoPerdido extends javax.swing.JDialog {

    public DAccesoPerdido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        getContentPane().setBackground(Color.white);
        tblCU.setEditingRow(0);
        ListarUserAccounts();
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tblCU.getColumnModel().getColumn(0).setCellRenderer( renderer );
        renderer = (DefaultTableCellRenderer)
            tblCU.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        
        tblCU.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblCU.getColumnModel().getColumn(0).setPreferredWidth(120);
        tblCU.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblCU.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblCU.getColumnModel().getColumn(3).setPreferredWidth(180);
        tblCU.getColumnModel().getColumn(4).setPreferredWidth(180);
        tblCU.getColumnModel().getColumn(5).setPreferredWidth(180);
    }
    
    DefaultTableModel tabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
                return false;
        }
    };

    public void ListarUserAccounts(){
        D_AccesoPerdido ap = new D_AccesoPerdido();
        
        ArrayList<D_AccesoPerdido> lista = ap.ListarDatosCU();
        
        tabla.addColumn("Cuenta de Usuario");
        tabla.addColumn("Cargo");
        tabla.addColumn("Nombre Asociado");
        tabla.addColumn("Email principal");
        tabla.addColumn("Email secundario");
        tabla.addColumn("Dirección");
        tabla.setRowCount(lista.size());
        
        int i = 0;
        
        for(D_AccesoPerdido x:lista){
            tabla.setValueAt(x.getUname(),i,0);
            tabla.setValueAt(x.getCargo(),i,1);
            tabla.setValueAt(x.getName(),i,2);
            tabla.setValueAt(x.getEmail1(),i,3);
            tabla.setValueAt(x.getEmail2(),i,4);
            tabla.setValueAt(x.getDir(),i,5);
            i++;
        }
        tblCU.setModel(tabla);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCU = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        btSend = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbCU = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos de acceso perdidos");

        pnContent.setBackground(new java.awt.Color(255, 255, 255));

        tblCU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCU.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCU.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCU.getTableHeader().setReorderingAllowed(false);
        tblCU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCUMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCU);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Datos de Cuentas de Usuario");

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

        jLabel2.setText("Nombre:");

        lbName.setText("    ");

        btSend.setText("Enviar");
        btSend.setEnabled(false);
        btSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSendActionPerformed(evt);
            }
        });

        jLabel5.setText("Email:");

        lbEmail.setText("         ");

        jLabel4.setText("Cuenta de Usuario:");

        lbCU.setText("       ");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Si desea enviar sus datos de acceso a este email presione el botón enviar =>");

        lbResultado.setText("       ");

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbCU))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbName))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEmail)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(lbResultado)
                                .addContainerGap())
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(btSend)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(87, 87, 87))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(353, 353, 353))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbCU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbEmail))
                .addGap(7, 7, 7)
                .addComponent(lbResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSend)
                    .addComponent(jButton1)
                    .addComponent(jLabel6))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseClicked
        tfSearch.setText("");
        filtrar();
    }//GEN-LAST:event_tfSearchMouseClicked

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        filtrar();
    }//GEN-LAST:event_tfSearchKeyReleased

    private String email;
    private void tblCUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCUMouseClicked
        int fila = tblCU.getSelectedRow();
        lbCU.setText(tblCU.getValueAt(fila, 0).toString());
        
        if (tblCU.getValueAt(fila, 2).toString() != null) {
            String name = tblCU.getValueAt(fila, 2).toString();
            if (!name.equals("")) {
                lbName.setText(name);
            }else lbName.setText("");
        }
        
        email = "";
        if (tblCU.getValueAt(fila, 3).toString() != null) {
            email = tblCU.getValueAt(fila, 3).toString();
            
            if (email.equals("")) {
                
                if (tblCU.getValueAt(fila, 4).toString() != null) {
                    email = tblCU.getValueAt(fila, 4).toString();
                    
                    if (!email.equals("")) lbEmail.setText(email);
                    else lbEmail.setText("");
                }
            }else{
                lbEmail.setText(tblCU.getValueAt(fila, 3).toString());
            }
        }
        
        if (!email.equals("") && email != null) {
            btSend.setEnabled(true);
        }else{
            btSend.setEnabled(false);
        }
    }//GEN-LAST:event_tblCUMouseClicked

    private void btSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSendActionPerformed
        lbResultado.setText("Enviando el email...");
        MandarMail mail = new MandarMail();
        mail.Send(email);
    }//GEN-LAST:event_btSendActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void filtrar(){
        String text = tfSearch.getText();
        final TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(tabla);
        tblCU.setRowSorter(sorter);
         if (text.length() == 0) {
          sorter.setRowFilter(null);
        } else {
          sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DAccesoPerdido dialog = new DAccesoPerdido(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btSend;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbCU;
    public static javax.swing.JLabel lbEmail;
    public static javax.swing.JLabel lbName;
    public static javax.swing.JLabel lbResultado;
    private javax.swing.JPanel pnContent;
    public static javax.swing.JTable tblCU;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
