
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sc.Conexion;

public class D_AccesoPerdido {

PreparedStatement ps;
ResultSet rs;
private String uname, cargo, name, email1, email2, dir;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
    public ArrayList<D_AccesoPerdido> ListarDatosCU(){
        
        ArrayList listado = new ArrayList();
        
        try{
            Connection conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                ps = conx.prepareStatement("select * from Login where v_estado=1 order BY c_uname");
                rs = ps.executeQuery();

                D_AccesoPerdido list;

                while(rs.next()){
                    list = new D_AccesoPerdido();
                    //uname, cargo, name, email1, email2, dir;
                    list.setUname(rs.getString("c_uname"));
                    list.setCargo(rs.getString("s_cargo"));
                    list.setName(rs.getString("s_name"));
                    list.setEmail1(rs.getString("s_pemail"));
                    list.setEmail2(rs.getString("s_semail"));
                    list.setDir(rs.getString("s_dir"));
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