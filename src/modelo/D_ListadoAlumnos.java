
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sc.Conexion;

public class D_ListadoAlumnos {

PreparedStatement ps;
ResultSet rs;
private int code, edad;
private String name, fecNac;

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
    
    public String getFecNac()
    {
        return fecNac;
    }
    public void setFecNac(String fecha) 
    {
        this.fecNac = fecha;
    }
    
    public int getEdad()
    {
        return edad;
    }
    public void setEdad(int age) 
    {
        this.edad = age;
    }
    
    public ArrayList<D_ListadoAlumnos> ListarAlumnos(){
        
        ArrayList listado = new ArrayList();
        
        try{
            Connection conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                ps = conx.prepareStatement("SELECT * FROM Alumno where s_state='Activo' order by c_alumno");
                rs = ps.executeQuery();

                D_ListadoAlumnos objart;

                while(rs.next()){
                    objart = new D_ListadoAlumnos();
                    objart.setCode(rs.getInt("c_alumno"));
                    String nombres = rs.getString("s_fname") + " " + rs.getString("s_sname") + " " + rs.getString("s_fapel") + " " + rs.getString("s_sapel");
                    objart.setName(nombres);
                    objart.setFecNac(rs.getString("f_nac"));
                    objart.setEdad(rs.getInt("v_edad"));
                    listado.add(objart);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listado;
    }
    
}