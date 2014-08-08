
package modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sc.Conexion;

public class D_ListadoAlumnosAI {

PreparedStatement ps;
ResultSet rs;
private int code;
private String name, estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCode()
    {
        return code;
    }
    public void setCode(int codigo) 
    {
        this.code = codigo;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String nombres) 
    {
        this.name = nombres;
    }
    
    public ArrayList<D_ListadoAlumnosAI> ListarAlumnosAI(){
        
        ArrayList listado = new ArrayList();
        
        try{
            Connection conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                ps = conx.prepareStatement("SELECT c_alumno,s_fname,s_sname,s_fapel,s_sapel,s_state from Alumno order BY s_state='Activo'");
                rs = ps.executeQuery();

                D_ListadoAlumnosAI list;

                while(rs.next()){
                    list = new D_ListadoAlumnosAI();
                    list.setCode(rs.getInt("c_alumno"));
                    String nombres = rs.getString("s_fname") + " " + rs.getString("s_sname") + " " + rs.getString("s_fapel") + " " + rs.getString("s_sapel");
                    list.setName(nombres);
                    list.setEstado(rs.getString("s_state"));
                    listado.add(list);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listado;
    }
}