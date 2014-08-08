
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.DAspectSocial;
import vista.IFichaSocioEcon;

public class D_AspectoSocial {

Library lib = new Library();

private String name, parent, ocupacion;
private int edad, salario;
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public int consultarASocial(){
        int res = 1;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                st = conx.createStatement();
                rs = st.executeQuery("select count(*) from AspectSocioEc where c_alumno="+IFichaSocioEcon.lbCode.getText());
                
                if (rs.next()) {
                    res = rs.getInt(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            res = 1;
        }
        return res;
    }
    
    public void ingresarASocial(int code, String name, int edad){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveAspectSocioEc(?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, name);
                ps.setString(3, "Solicitante");
                ps.setInt(4, edad);
                ps.setString(5, "Estudiante");
                ps.setInt(6, 0);
                ps.setInt(7, 1);//Se pone en activo
                ps.setString(8, lib.getFechaActual());
                ps.setString(9, D_Login.getNameCU());

                ps.executeUpdate();
                conx.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void saveASocial(){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveAspectSocioEc(?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, Integer.parseInt(IFichaSocioEcon.lbCode.getText()));
                ps.setString(2, getName());
                ps.setString(3, getParent());
                ps.setInt(4, getEdad());
                ps.setString(5, getOcupacion());
                ps.setInt(6, getSalario());
                ps.setInt(7, 1);//Se pone en activo
                ps.setString(8, lib.getFechaActual());
                ps.setString(9, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al conectarse a la BD PostgreSQL");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void updASocial(){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                int code = Integer.parseInt(IFichaSocioEcon.lbCode.getText());
ps = conx.prepareStatement("UPDATE AspectSocioEc SET s_name='"+getName()+"',s_parentesco='"+getParent()+"',v_edad="
+getEdad()+",s_ocupacion='"+getOcupacion()+"',s_ingresoMes="+getSalario()+",s_state=1,f_modify='"+lib.getFechaActual()+
"',s_modify='"+D_Login.getNameCU()+"' where c_alumno="+code+" and s_name = '"+DAspectSocial.lbNombre.getText()+"'");
                ps.executeUpdate();
                conx.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void delASocial(int code, String name, String parent){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
ps = conx.prepareStatement("UPDATE AspectSocioEc SET s_state=0,f_modify='"+lib.getFechaActual()+"',s_modify='"+D_Login.getNameCU()+"'"+
" where c_alumno="+code+" and s_name='"+name+"' and s_parentesco='"+parent+"'");
                ps.executeUpdate();
                conx.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public ArrayList<D_AspectoSocial> ListarParentescos(int code){
        
        ArrayList listado = new ArrayList();
        
        try{
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                ps = conx.prepareStatement("SELECT * FROM AspectSocioEc where c_alumno="+code+" and s_state=1 order by c_parentesco");
                rs = ps.executeQuery();
                
                D_AspectoSocial putAS;

                while(rs.next()){
                    putAS = new D_AspectoSocial();
                    putAS.setName(rs.getString("s_name"));
                    putAS.setParent(rs.getString("s_parentesco"));
                    putAS.setEdad(rs.getInt("v_edad"));
                    putAS.setOcupacion(rs.getString("s_ocupacion"));
                    putAS.setSalario(rs.getInt("s_ingresoMes"));
                    listado.add(putAS);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listado;
    }
}