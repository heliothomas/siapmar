
package sc;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LimpiarBD {
    
Connection conx;
Statement st;
ResultSet rs;
    
    public static void main(String args[]){
        new LimpiarBD().deletebd();
    }
    
    public void deletebd(){
        
        try {
            conx = Conexion.getSQLConnection();
            st = conx.createStatement();
            String selTablas = "SELECT tablename FROM pg_tables WHERE schemaname = 'public'";
            rs = st.executeQuery(selTablas);
            
            while(rs.next()){
                try {
                    st.executeQuery("delete from " + rs.getString(1));
                } catch (SQLException sqlEx) {
                    JOptionPane.showMessageDialog(null, "Error: " + sqlEx.getMessage());
                }
            }
            
        } catch (SQLException | HeadlessException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
    }
    
}