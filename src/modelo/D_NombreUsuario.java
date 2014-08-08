/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sc.Conexion;
import vista.Login;

/**
 *
 * @author THOMAS
 */
public class D_NombreUsuario {
    
Connection conx;
Statement st;
ResultSet rs;

    public void getUN(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM Login where v_estado=1";
        
        //Login.modelUN.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                /*Login.modelUN.addElement(new NombreUsuario(
                    rs.getString("c_uname")
                    ));
                */
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
