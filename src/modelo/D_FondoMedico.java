
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.IFondoMedicoComp;

public class D_FondoMedico {
    
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public boolean saveFondoMedico(int code,String fecElab,String desc,String trat,
int segOpi,String otroMed,String costo,String freqTrat,String contrFam,String qtySolic,int mma,int casoEst,String monto,String fDesem){
        
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveFondoMedico(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, fecElab);
                ps.setString(3, desc);
                ps.setString(4, trat);
                ps.setInt(5, segOpi);
                ps.setString(6, otroMed);
                ps.setString(7, costo);
                ps.setString(8, freqTrat);
                ps.setString(9, contrFam);
                ps.setString(10, qtySolic);
                ps.setInt(11, mma);
                ps.setInt(12, casoEst);
                ps.setString(13, monto);
                ps.setString(14, fDesem);
                ps.setString(15, lib.getFechaActual());
                ps.setString(16, "usuario");
                ps.executeUpdate();
                conx.close();
                resultado = true;
            } else {
                System.out.println("Ha ocurrido un error al conectarse a la BD PostgreSQL");
                resultado = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }

    public void consultaPag1(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IFondoMedicoComp.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_fname, s_sname, s_fapel, s_sapel, f_nac, v_edad, s_sexo, s_direc, v_cel, v_tel, s_email, s_urlfoto FROM alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        IFondoMedicoComp.lbNameNino.setText(rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel"));
                        IFondoMedicoComp.lbSexo.setText(rs.getString("s_sexo"));
                        IFondoMedicoComp.lbEdad.setText(rs.getString("v_edad"));
                        
                        IFondoMedicoComp.btEdit.setEnabled(true);
                        IFondoMedicoComp.btGuardar1.setEnabled(false);
                    }else{
                        IFondoMedicoComp.lbNameNino.setText("");
                        IFondoMedicoComp.lbSexo.setText("");
                        IFondoMedicoComp.lbEdad.setText("");
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT f_elaboracion, s_desc, s_trat, b_segopinmed, s_otromed,s_costo, s_freqtrat, s_contribfam, s_qtysolic, b_mma, b_casoest, s_montoautz, f_desembolso FROM fondomedico WHERE c_alumno="+code);

                    if (rs.next()) {
                        IFondoMedicoComp.lbFecElaborac.setText(rs.getString("f_elaboracion"));
                        IFondoMedicoComp.taDesc.setText(rs.getString("s_desc"));
                        IFondoMedicoComp.taTrat.setText(rs.getString("s_trat"));
                        String segopi = rs.getString("b_segopinmed");
                        if (segopi.equals("1")) {
                            IFondoMedicoComp.lbSegOpinion.setText("Si");
                        } else {
                            IFondoMedicoComp.lbSegOpinion.setText("No");
                        }
                        
                        IFondoMedicoComp.lbOpino.setText(rs.getString("s_otromed"));
                        IFondoMedicoComp.lbCostoEstimado.setText(rs.getString("s_costo"));
                        IFondoMedicoComp.lbFrecuencia.setText(rs.getString("s_freqtrat"));
                        IFondoMedicoComp.lbContFam.setText(rs.getString("s_contribfam"));
                        IFondoMedicoComp.lbQtyComps.setText(rs.getString("s_qtysolic"));
                        
                        String mma = rs.getString("b_mma");
                        if (mma.equals("1")) {
                            IFondoMedicoComp.lbMMA.setText("Si");
                        } else {
                            IFondoMedicoComp.lbMMA.setText("No");
                        }
                        
                        
                        String casoest = rs.getString("b_casoest");
                        if (casoest.equals("1")) {
                            IFondoMedicoComp.lbCasoEstudiado.setText("Si");
                        } else {
                            IFondoMedicoComp.lbCasoEstudiado.setText("No");
                        }
                        
                        IFondoMedicoComp.lbMontoAutorizado.setText(rs.getString("s_montoautz"));
                        IFondoMedicoComp.lbFechaDesembolso.setText(rs.getString("f_desembolso"));
                    }else{
                        IFondoMedicoComp.lbFecElaborac.setText(lib.getFechaActual());
                        IFondoMedicoComp.taDesc.setText("");
                        IFondoMedicoComp.taTrat.setText("");
                        IFondoMedicoComp.lbSegOpinion.setText("No");
                        IFondoMedicoComp.lbOpino.setText("");
                        IFondoMedicoComp.lbCostoEstimado.setText("");
                        IFondoMedicoComp.lbFrecuencia.setText("");
                        IFondoMedicoComp.lbContFam.setText("");
                        IFondoMedicoComp.lbQtyComps.setText("");
                        IFondoMedicoComp.lbMMA.setText("No");
                        IFondoMedicoComp.lbCasoEstudiado.setText("No");
                        IFondoMedicoComp.lbMontoAutorizado.setText("0");
                        IFondoMedicoComp.lbFechaDesembolso.setText("");
                    }
                    
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
