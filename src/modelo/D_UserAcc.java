
package modelo;

import java.sql.*;
import javax.swing.*;
import sc.*;
import vista.IUserAccount;

public class D_UserAcc {

IUserAccount vUseracc = new IUserAccount();
Library lib = new Library();
Connection conx;
PreparedStatement ps;

    public boolean saveUserAcc(String uname, String pass, String cargo, int estado){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (!"".equals(uname) && !"".equals(pass)) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveLogin(?,?,?,?,?,?)}");
                    ps.setString(1, uname);
                    ps.setString(2, pass);
                    ps.setString(3, cargo);
                    ps.setInt(4, estado);
                    ps.setString(5, lib.getFechaActual());
                    ps.setString(6, "htmf");//lib.getUserAcc()
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                } else {
                    System.out.println("Ha ocurrido un error al conectarse a la BD PostgreSQL");
                    resultado = false;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }

}