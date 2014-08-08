
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import sc.Conexion;
import vista.DCbxPatrocinador;
import vista.DPatrocinadores;

public class D_Patrocinador {
    
Connection conx;
Statement st;
ResultSet rs;
PreparedStatement ps;

    public int contarPatrocinador(){
        int cont = 0;
        conx = Conexion.getSQLConnection();
        
        if (conx != null) {
            try {
                st = conx.createStatement();
                rs = st.executeQuery("select count(*) as val from patrocinador");

                if (rs.next()) {
                    cont = rs.getInt("val");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al contar patrocinador: " + e.getMessage());
                cont = 0;
            }
        }
        return cont;
    }
    
    public void getPatro(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM Patrocinador ORDER BY c_patrocinador";
        DCbxPatrocinador.cbmodel.removeAllElements();
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                DCbxPatrocinador.cbmodel.addElement(new Patro(
                        rs.getString("s_patrocinador"),
                        rs.getString("c_patrocinador")
                        ));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public String getMaxPatro(){
        conx = Conexion.getSQLConnection();
        
        String cpatri = "PA00";
        int code = 0;
        String sql = "SELECT MAX(c_patrocinador) FROM Patrocinador";
        //Al hacer esta consulta, pone el nombre del campo = max
        
        try {
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                cpatri = rs.getString("max");
                if (cpatri == null) {
                    cpatri = "PA00";
                }
            }
            code = Integer.parseInt(cpatri.substring(2));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener codigo disponible:" + e.getMessage());
        }
        
        if(code + 1 < 10) return "PA0" + String.valueOf(code + 1);
        else return "PA" + String.valueOf(code + 1);
    }
    
    public boolean savePatrocinador(String code,String nombre){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
        if (conx != null) {

                ps = conx.prepareCall("{call savePatrocinador(?,?,?)}");
                ps.setString(1, code);
                ps.setString(2, nombre);
                ps.setInt(3, 1);

                ps.executeUpdate();

                conx.close();
                resultado = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
}