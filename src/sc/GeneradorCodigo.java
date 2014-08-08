
package sc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class GeneradorCodigo {
    
Connection conx;
Statement st;
ResultSet rs;
    
    public int getLastCode(){
        int ultimo = 0;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                st = conx.createStatement();
                rs = st.executeQuery("select MAX(c_alumno) from alumno");
                
                while(rs.next()){
                    ultimo = rs.getInt("max");
                }
                ultimo = ultimo + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return ultimo;
    }
    
}
