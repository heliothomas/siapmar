
package modelo;

import java.sql.*;
import javax.swing.*;
import sc.Conexion;
import sc.Library;
import vista.IRegCorrespondencia;

public class D_RegCorr {
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public void consultaPag1(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IRegCorrespondencia.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_fname, s_sname, s_fapel, s_sapel, f_nac, v_edad, s_sexo, s_direc, v_cel, v_tel, s_email, s_urlfoto FROM alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        IRegCorrespondencia.lbName.setText(rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel"));
                        IRegCorrespondencia.btAddRow.setEnabled(true);
                        IRegCorrespondencia.btEditRow.setEnabled(false);
                    }
                    
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        IRegCorrespondencia.Listar();
        IRegCorrespondencia.btEditRow.setEnabled(false);
    }
}
