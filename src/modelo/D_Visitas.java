
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sc.Conexion;
import sc.Library;
import vista.IVisitas;

public class D_Visitas {
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;


    public boolean saveVisitas(int code,String fecha,String motivo,String logro){
        
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveVisitas(?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, fecha);
                ps.setString(3, motivo);
                ps.setString(4, logro);
                ps.setString(5, lib.getFechaActual());
                ps.setString(6, D_Login.getNameCU());
                ps.executeUpdate();
                conx.close();
                resultado = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }

    public void consultarVisita(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IVisitas.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM Alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        IVisitas.lbName.setText(rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel"));
                        IVisitas.btSave.setEnabled(false);
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM Visitas WHERE c_alumno="+code);

                    if (rs.next()) {
                        ((JTextField)IVisitas.datecF.getDateEditor().getUiComponent()).setText(rs.getString("f_visita"));
                        IVisitas.taMotivo.setText(rs.getString("s_motivo"));
                        IVisitas.taLogro.setText(rs.getString("s_logro"));
                    }else{
                        ((JTextField)IVisitas.datecF.getDateEditor().getUiComponent()).setText("");
                        IVisitas.taMotivo.setText("");
                        IVisitas.taLogro.setText("");
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