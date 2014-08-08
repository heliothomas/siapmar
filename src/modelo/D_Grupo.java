
package modelo;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sc.Conexion;
import vista.DCbxGrupo;
import vista.DGrupos;

public class D_Grupo {
    
Connection conx;
Statement st;
ResultSet rs;
PreparedStatement ps;

    public int contarGrupo(){
        int cont = 0;
        
        conx = Conexion.getSQLConnection();
        
        if (conx != null) {
            try {
                st = conx.createStatement();
                rs = st.executeQuery("SELECT COUNT(*) FROM Grupo");

                while(rs.next()){
                    cont = rs.getInt(1);
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al contar grupo: " + e.getMessage());
                cont = 0;
            }
        }
        return cont;
    }

    public void getGrupo(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM Grupo ORDER BY c_grupo";
        DCbxGrupo.cbmodel.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                DCbxGrupo.cbmodel.addElement(new Grupo(
                    rs.getString("c_grupo"),
                    rs.getString("s_grupo"),
                    rs.getInt("v_de"),
                    rs.getInt("v_a"),
                    rs.getString("docente")
                    ));
            }
            //DGrupos.cbxGrupo.setModel(DGrupos.cbmodel);
            
            st.close();
            rs.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }    
    
    public boolean getDocentes(){
        boolean res = false;
        conx = Conexion.getSQLConnection();
        String sql = "select s_name from Login where s_cargo='Docente' and v_estado=1 and s_name!=''";
        DGrupos.cbModelDoc.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                DGrupos.cbModelDoc.addElement(new Docentes(
                    rs.getString("s_name")
                    ));
                res = true;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return res;
    }
    
    public String getCodeGroupAvailable(){
        conx = Conexion.getSQLConnection();
        
        String cgr = "GR00";
        int code = 0;
        String sql = "SELECT MAX(c_grupo) FROM Grupo";
        
        try {
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                cgr = rs.getString("max");
                if (cgr == null) {
                    cgr = "GR00";
                }
            }
            code = Integer.parseInt(cgr.substring(2));
            
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener codigo disponible:" + e.getMessage());
        }
        
        if(code + 1 < 10) {
            return "GR0" + String.valueOf(code + 1);
        }
        else {
            return "GR" + String.valueOf(code + 1);
        }
    }
    
    public boolean saveGrupo(String code,String nombre,int de,int a,String docente){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
        if (conx != null) {

                ps = conx.prepareCall("{call saveGrupo(?,?,?,?,?)}");
                ps.setString(1, code);
                ps.setString(2, nombre);
                ps.setInt(3, de);
                ps.setInt(4, a);
                ps.setString(5, docente);

                ps.executeUpdate();

                conx.close();
                resultado = true;
            }            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
}