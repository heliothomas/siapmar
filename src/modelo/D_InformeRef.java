
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.IInformeRefDiagTrat;

public class D_InformeRef {
    
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public boolean saveInformeReferencia(int code,String fecElab,String diag,String mot,
String pulso,String presion,String tem,String freqresp,String resumen,String instrc,
String fecenvio,String acomp,String horaenvia,String seEnviaA,String medico){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveInformeReferencia(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, fecElab);
                ps.setString(3, diag);
                ps.setString(4, mot);
                ps.setString(5, pulso);
                ps.setString(6, presion);
                ps.setString(7, tem);
                ps.setString(8, freqresp);
                ps.setString(9, resumen);
                ps.setString(10, instrc);
                ps.setString(11, fecenvio);
                ps.setString(12, acomp);
                ps.setString(13, horaenvia);
                ps.setString(14, seEnviaA);
                ps.setString(15, medico);
                ps.setString(16, lib.getFechaActual());
                ps.setString(17, "usuario");
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

    public void consultaDatosGrales(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IInformeRefDiagTrat.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM Alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        IInformeRefDiagTrat.lbChildName.setText(rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel"));
                        IInformeRefDiagTrat.lbSex.setText(rs.getString("s_sexo"));
                        IInformeRefDiagTrat.lbFecNac.setText(rs.getString("f_nac"));
                        IInformeRefDiagTrat.lbEdad.setText(rs.getString("v_edad"));
                        IInformeRefDiagTrat.lbNameMom.setText(rs.getString("s_mama"));
                        IInformeRefDiagTrat.lbNamePap.setText(rs.getString("s_papa"));
                    }else{
                        IInformeRefDiagTrat.lbChildName.setText("");
                        IInformeRefDiagTrat.lbSex.setText("");
                        IInformeRefDiagTrat.lbFecNac.setText("");
                        IInformeRefDiagTrat.lbEdad.setText("");
                        IInformeRefDiagTrat.lbNameMom.setText("");
                        IInformeRefDiagTrat.lbNamePap.setText("");
                    }
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void consultaInforme(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IInformeRefDiagTrat.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT f_fecha, s_diagnostico, s_motivo, s_pulso, s_presionart, s_tempert, s_freqresp, s_resumen, s_instrucciones, f_envio, s_acompanant, s_horaenvio, s_seenviaa, s_medico FROM informereferencia WHERE c_alumno="+code);

                    if (rs.next()) {
                        IInformeRefDiagTrat.lbFecElaborac.setText(rs.getString("f_fecha"));
                        IInformeRefDiagTrat.taDiagn.setText(rs.getString("s_diagnostico"));
                        IInformeRefDiagTrat.taMotivo.setText(rs.getString("s_motivo"));
                        IInformeRefDiagTrat.tfPulso.setText(rs.getString("s_pulso"));
                        IInformeRefDiagTrat.tfPresion.setText(rs.getString("s_presionart"));
                        IInformeRefDiagTrat.tfTemp.setText(rs.getString("s_tempert"));
                        IInformeRefDiagTrat.tfFreqResp.setText(rs.getString("s_freqresp"));
                        IInformeRefDiagTrat.taResClinico.setText(rs.getString("s_resumen"));
                        IInformeRefDiagTrat.taInstrucciones.setText(rs.getString("s_instrucciones"));
                        
                        IInformeRefDiagTrat.lbFechaEnvio.setText(rs.getString("f_envio"));
                        IInformeRefDiagTrat.lbAcompanante.setText(rs.getString("s_acompanant"));
                        IInformeRefDiagTrat.lbHoraEnvio.setText(rs.getString("s_horaenvio"));
                        IInformeRefDiagTrat.lbCAsistencia.setText(rs.getString("s_seenviaa"));
                        IInformeRefDiagTrat.lbMedico.setText(rs.getString("s_medico"));
                    }else{
                        IInformeRefDiagTrat.lbFecElaborac.setText(lib.getFechaActual());
                        IInformeRefDiagTrat.taDiagn.setText("");
                        IInformeRefDiagTrat.taMotivo.setText("");
                        IInformeRefDiagTrat.tfPulso.setText("");
                        IInformeRefDiagTrat.tfPresion.setText("");
                        IInformeRefDiagTrat.tfTemp.setText("");
                        IInformeRefDiagTrat.tfFreqResp.setText("");
                        IInformeRefDiagTrat.taResClinico.setText("");
                        IInformeRefDiagTrat.taInstrucciones.setText("");
                        
                        IInformeRefDiagTrat.lbFechaEnvio.setText("");
                        IInformeRefDiagTrat.lbAcompanante.setText("");
                        IInformeRefDiagTrat.lbHoraEnvio.setText("");
                        IInformeRefDiagTrat.lbCAsistencia.setText("");
                        IInformeRefDiagTrat.lbMedico.setText("");
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
