
package vista;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.D_Expediente;
import modelo.GrupoExpediente;

public class IRevExp extends JInternalFrame {

    public IRevExp() {
        initComponents();
        
        D_Expediente dgru = new D_Expediente();
        dgru.getGrupo();
        
        Listar();
    }
    
    public static DefaultComboBoxModel modelGrupo = new DefaultComboBoxModel();
    
    public static void Listar(){
        
        DefaultTableModel tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                    return false;
            }
        };
        
        D_Expediente exp = new D_Expediente();
        GrupoExpediente grup = (GrupoExpediente) cbxGrupo.getSelectedItem();
        String code = grup.getCode();
        
        ArrayList<D_Expediente> lista = exp.ListarExpedienteXGrupo(code);
        
        tabla.addColumn("Alumno");
        tabla.addColumn("Código");
        tabla.addColumn("HP");
        tabla.addColumn("PN");
        tabla.addColumn("FSE");
        tabla.addColumn("HN");
        tabla.addColumn("NA");
        tabla.addColumn("AP");
        tabla.addColumn("RC");
        tabla.addColumn("CC");
        tabla.addColumn("RR");
        tabla.addColumn("EN");
        tabla.addColumn("EA");
        tabla.addColumn("HCP");
        tabla.addColumn("IS");
        tabla.addColumn("TV");
        tabla.addColumn("TP");
        tabla.addColumn("FMC");
        tabla.addColumn("TPE");
        tabla.addColumn("B");
        tabla.addColumn("PAC");
        tabla.addColumn("RNE");
        tabla.addColumn("V");
        tabla.addColumn("RPP");
        tabla.addColumn("RA");
        tabla.addColumn("RB");
        tabla.setRowCount(lista.size());
        
        int i = 0;
        
        for(D_Expediente x:lista){
            tabla.setValueAt(x.getAlum(),i,0);
            tabla.setValueAt(x.getcAlum(),i,1);
            tabla.setValueAt(x.getHojaP(),i,2);
            tabla.setValueAt(x.getPartNac(),i,3);
            tabla.setValueAt(x.getFicSocE(),i,4);
            tabla.setValueAt(x.getHistNin(),i,5);
            tabla.setValueAt(x.getNotaAut(),i,6);
            tabla.setValueAt(x.getUpdPer(),i,7);
            tabla.setValueAt(x.getRegCarta(),i,8);
            tabla.setValueAt(x.getCuadCarta(),i,9);
            tabla.setValueAt(x.getRegRegal(),i,10);
            tabla.setValueAt(x.getEvaXLevel(),i,11);
            tabla.setValueAt(x.getEvaAnual(),i,12);
            tabla.setValueAt(x.gethCPed(),i,13);
            tabla.setValueAt(x.getInfoSeg(),i,14);
            tabla.setValueAt(x.getTarVac(),i,15);
            tabla.setValueAt(x.getTrnfProf(),i,16);
            tabla.setValueAt(x.getfMC(),i,17);
            tabla.setValueAt(x.gettPE(),i,18);
            tabla.setValueAt(x.getBolet(),i,19);
            tabla.setValueAt(x.getPartcActCom(),i,20);
            tabla.setValueAt(x.getRegNecSpe(),i,21);
            tabla.setValueAt(x.getVisit(),i,22);
            tabla.setValueAt(x.getRegPartPad(),i,23);
            tabla.setValueAt(x.getRegAnecd(),i,24);
            tabla.setValueAt(x.getRegBenfCIV(),i,25);
            i++;
        }
        tblExp.setModel(tabla);
        
        tblExp.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblExp.getColumnModel().getColumn(0).setPreferredWidth(200);
        tblExp.getColumnModel().getColumn(1).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(2).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(3).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(4).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(5).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(6).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(7).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(8).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(9).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(10).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(11).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(12).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(13).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(14).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(15).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(16).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(17).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(18).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(19).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(20).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(21).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(22).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(23).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(24).setPreferredWidth(45);
        tblExp.getColumnModel().getColumn(25).setPreferredWidth(45);
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment( JLabel.CENTER );
        
        //tblExp.getColumnModel().getColumn(0).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(1).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(2).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(3).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(4).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(5).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(6).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(7).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(8).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(9).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(10).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(11).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(12).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(13).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(14).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(15).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(16).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(17).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(18).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(19).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(20).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(21).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(22).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(23).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(24).setCellRenderer( renderer );
        tblExp.getColumnModel().getColumn(25).setCellRenderer( renderer );
        
        renderer = (DefaultTableCellRenderer) tblExp.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        
        btEdit.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnContenedor = new javax.swing.JPanel();
        pnHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbDocente = new javax.swing.JLabel();
        cbxGrupo = new javax.swing.JComboBox();
        btEdit = new javax.swing.JButton();
        btAbrev = new javax.swing.JButton();
        pnTabla = new javax.swing.JPanel();
        spnTabla = new javax.swing.JScrollPane();
        tblExp = new javax.swing.JTable();
        btX = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Revisión de Expedientes");
        setPreferredSize(new java.awt.Dimension(900, 600));
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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(700, 502));

        pnContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnContenedor.setPreferredSize(new java.awt.Dimension(859, 500));

        pnHead.setBackground(new java.awt.Color(255, 255, 255));
        pnHead.setPreferredSize(new java.awt.Dimension(500, 102));
        pnHead.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("REVISIÓN DE EXPEDIENTE");
        pnHead.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 11, -1, -1));

        jLabel2.setText("Maestro:");
        pnHead.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 67, -1, -1));

        jLabel3.setText("Grupo:");
        pnHead.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 39, -1, -1));

        lbDocente.setText("          ");
        pnHead.add(lbDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 67, -1, -1));

        cbxGrupo.setModel(modelGrupo);
        cbxGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGrupoActionPerformed(evt);
            }
        });
        pnHead.add(cbxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 36, 180, -1));

        btEdit.setText("Editar");
        btEdit.setEnabled(false);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        pnHead.add(btEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        btAbrev.setText("Ver abreviaturas de la tabla");
        btAbrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrevActionPerformed(evt);
            }
        });
        pnHead.add(btAbrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        pnTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnTabla.setPreferredSize(new java.awt.Dimension(831, 420));

        spnTabla.setAutoscrolls(true);
        spnTabla.setPreferredSize(new java.awt.Dimension(1200, 402));

        tblExp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblExp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblExp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblExp.getTableHeader().setResizingAllowed(false);
        tblExp.getTableHeader().setReorderingAllowed(false);
        tblExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExpMouseClicked(evt);
            }
        });
        spnTabla.setViewportView(tblExp);

        javax.swing.GroupLayout pnTablaLayout = new javax.swing.GroupLayout(pnTabla);
        pnTabla.setLayout(pnTablaLayout);
        pnTablaLayout.setHorizontalGroup(
            pnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTablaLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(spnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnTablaLayout.setVerticalGroup(
            pnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btX.setText("Cerrar");
        btX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnContenedorLayout = new javax.swing.GroupLayout(pnContenedor);
        pnContenedor.setLayout(pnContenedorLayout);
        pnContenedorLayout.setHorizontalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addGroup(pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnHead, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btX)
                .addGap(401, 401, 401))
        );
        pnContenedorLayout.setVerticalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContenedorLayout.createSequentialGroup()
                .addComponent(pnHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btX)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuMain.rev = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void cbxGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGrupoActionPerformed
        GrupoExpediente grup = (GrupoExpediente) cbxGrupo.getSelectedItem();
        lbDocente.setText(grup.getDocente());
        btEdit.setEnabled(false);
        Listar();
    }//GEN-LAST:event_cbxGrupoActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        DExpediente exp = new DExpediente(JOptionPane.getFrameForComponent(this), true);
        exp.setLocationRelativeTo(null);
        
        int fila = tblExp.getSelectedRow();
        
        DExpediente.lbCode.setText(tblExp.getValueAt(fila, 1).toString());
        DExpediente.lbAlumno.setText(tblExp.getValueAt(fila, 0).toString());
        DExpediente.lbGrupo.setText(cbxGrupo.getSelectedItem().toString());
        DExpediente.lbDocente.setText(lbDocente.getText());
        
        GrupoExpediente grup = (GrupoExpediente) cbxGrupo.getSelectedItem();
        DExpediente.lbCodeGrupo.setText(grup.getCode());
        
        if (tblExp.getValueAt(fila, 2) != null) {
            if (!tblExp.getValueAt(fila, 2).toString().equals("No")) 
                DExpediente.cbHojaPres.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 3) != null) {
            if (!tblExp.getValueAt(fila, 3).toString().equals("No")) 
                DExpediente.cbPartNac.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 4) != null) {
            if (!tblExp.getValueAt(fila, 4).toString().equals("No")) 
                DExpediente.cbFicSocEc.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 5) != null) {
            if (!tblExp.getValueAt(fila, 5).toString().equals("No")) 
                DExpediente.cbHistNin.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 6) != null) {
            if (!tblExp.getValueAt(fila, 6).toString().equals("No")) 
                DExpediente.cbNotaAut.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 7) != null) {
            if (!tblExp.getValueAt(fila, 7).toString().equals("No")) 
                DExpediente.cbActPerf.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 8) != null) {
            if (!tblExp.getValueAt(fila, 8).toString().equals("No")) 
                DExpediente.cbRegCor.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 9) != null) {
            if (!tblExp.getValueAt(fila, 9).toString().equals("No")) 
                DExpediente.cbCuadCarta.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 10) != null) {
            if (!tblExp.getValueAt(fila, 10).toString().equals("No")) 
                DExpediente.cbRegReg.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 11) != null) {
            if (!tblExp.getValueAt(fila, 11).toString().equals("No")) 
                DExpediente.cbEvalNiv.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 12) != null) {
            if (!tblExp.getValueAt(fila, 12).toString().equals("No")) 
                DExpediente.cbEvalAnual.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 13) != null) {
            if (!tblExp.getValueAt(fila, 13).toString().equals("No")) 
                DExpediente.cbHistCliPed.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 14) != null) {
            if (!tblExp.getValueAt(fila, 14).toString().equals("No")) 
                DExpediente.cbInfoSeg.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 15) != null) {
            if (!tblExp.getValueAt(fila, 15).toString().equals("No")) 
                DExpediente.cbTarVac.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 16) != null) {
            if (!tblExp.getValueAt(fila, 16).toString().equals("No")) 
                DExpediente.cbTransProf.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 17) != null) {
            if (!tblExp.getValueAt(fila, 17).toString().equals("No")) 
                DExpediente.cbFondoMC.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 18) != null) {
            if (!tblExp.getValueAt(fila, 18).toString().equals("No")) 
                DExpediente.cbTipoPE.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 19) != null) {
            if (!tblExp.getValueAt(fila, 19).toString().equals("No")) 
                DExpediente.cbBoletin.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 20) != null) {
            if (!tblExp.getValueAt(fila, 20).toString().equals("No")) 
                DExpediente.cbPartActCompl.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 21) != null) {
            if (!tblExp.getValueAt(fila, 21).toString().equals("No")) 
                DExpediente.cbRegNecEsp.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 22) != null) {
            if (!tblExp.getValueAt(fila, 22).toString().equals("No")) 
                DExpediente.cbVisitas.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 23) != null) {
            if (!tblExp.getValueAt(fila, 23).toString().equals("No")) 
                DExpediente.cbRegPartPad.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 24) != null) {
            if (!tblExp.getValueAt(fila, 24).toString().equals("No")) 
                DExpediente.cbRegAnec.setSelected(true);
        }
        if (tblExp.getValueAt(fila, 25) != null) {
            if (!tblExp.getValueAt(fila, 25).toString().equals("No")) 
                DExpediente.cbRegBenef.setSelected(true);
        }
        
        exp.setVisible(true);
    }//GEN-LAST:event_btEditActionPerformed

    private void tblExpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExpMouseClicked
        if (tblExp.isRowSelected(tblExp.getSelectedRow())) {
            btEdit.setEnabled(true);
        }else{
            btEdit.setEnabled(false);
        }
    }//GEN-LAST:event_tblExpMouseClicked

    private void btAbrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrevActionPerformed
        DAbrev abrev = new DAbrev(JOptionPane.getFrameForComponent(this), true);
        abrev.setLocationRelativeTo(null);
        abrev.setVisible(true);
    }//GEN-LAST:event_btAbrevActionPerformed

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        dispose();
    }//GEN-LAST:event_btXActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrev;
    private static javax.swing.JButton btEdit;
    private javax.swing.JButton btX;
    public static javax.swing.JComboBox cbxGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbDocente;
    private javax.swing.JPanel pnContenedor;
    private javax.swing.JPanel pnHead;
    private javax.swing.JPanel pnTabla;
    private javax.swing.JScrollPane spnTabla;
    public static javax.swing.JTable tblExp;
    // End of variables declaration//GEN-END:variables
}
