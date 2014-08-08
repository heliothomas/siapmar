
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.DABAlumno;
import vista.DABCU;

public class D_AltaBaja {
    
Library lib = new Library();
Connection conx;
Statement st;
ResultSet rs;

    public boolean updateAlumno(int code, String estado){
        boolean res = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx!=null) {
                st = conx.createStatement();
                st.executeUpdate("UPDATE Alumno SET s_state='"+estado+"' WHERE c_alumno="+code);
                st.close();
                conx.close();
                JOptionPane.showMessageDialog(null, "Se ha guardado el estado al alumno");
                res = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
            res = false;
        }
        return res;
    }
    
    public void getCU(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM Login";
        DABCU.modelCU.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                DABCU.modelCU.addElement(new CUser(
                        rs.getString("c_uname"),
                        rs.getString("s_cargo"),
                        rs.getString("s_name"),
                        rs.getInt("v_estado")
                        ));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void refreshCBX(){
        try {
            ArrayList ress;    
            //D_AltaBaja db = new D_AltaBaja();    
            DABCU.modelCU = new DefaultComboBoxModel();    
            ress = NameValues();    
            ListIterator iter = ress.listIterator();    
            while (iter.hasNext())    
            {    
                DABCU.modelCU.addElement(iter.next());    
            }    
            DABCU.cbxCU.setModel(DABCU.modelCU);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ArrayList<String> NameValues(){ 
        ArrayList list = null;
        try {
            
            Statement ps;  
            ResultSet res;  

            String query  = "SELECT * FROM Login";  
            conx = Conexion.getSQLConnection();  
            ps = conx.createStatement();  
            res = ps.executeQuery(query);  

            while(res.next()){
                list.add(res.getString("v_estado")); 
            }                                               
             
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return list;
    } 

    public void consultaAlumno(int code){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                st = conx.createStatement();
                rs = st.executeQuery("SELECT s_fname, s_sname, s_fapel, s_sapel, s_state FROM alumno WHERE c_alumno="+code);

                if (rs.next()) {
                    DABAlumno.lbName.setText(rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel"));
                    String estado = rs.getString("s_state");
                    DABAlumno.lbEstado.setText(estado);
                    DABAlumno.btSave.setEnabled(true);
                    
                    if (estado.equals("Activo")) DABAlumno.cbEstado.setSelected(true);
                    else DABAlumno.cbEstado.setSelected(false);
                }else{
                    DABAlumno.lbName.setText("");
                    DABAlumno.lbEstado.setText("");
                    DABAlumno.cbEstado.setSelected(true);
                    DABAlumno.btSave.setEnabled(false);
                }
                st.close();
                rs.close();
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void updateAdmon(String cuentausuario, int estado){
        try {
            conx = Conexion.getSQLConnection();
            if (conx!=null) {
                st = conx.createStatement();
                st.executeUpdate("UPDATE Login SET v_estado="+estado+" WHERE c_uname='"+cuentausuario+"'");
                st.close();
                conx.close();
                JOptionPane.showMessageDialog(null, "Se ha guardado el estado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void consultaAdmon(String cuentausuario){
        try {
            conx = Conexion.getSQLConnection();

            if (!DABCU.cbxCU.getSelectedItem().toString().equals("")) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT v_estado,s_name FROM Login WHERE c_uname='"+cuentausuario+"'");

                    if (rs.next()) {
                        DABCU.lbName.setText(rs.getString("s_name"));
                        if (rs.getInt("v_estado")==1) {
                            DABCU.cbEstado.setSelected(true);
                            DABCU.lbEstado.setText("Activo");
                        } else {
                            DABCU.cbEstado.setSelected(false);
                            DABCU.lbEstado.setText("Inactivo");
                        }
                        DABCU.btSave.setEnabled(true);
                    }else{
                        DABCU.lbName.setText("");
                        DABCU.lbEstado.setText("");
                        DABCU.cbEstado.setSelected(false);
                        DABCU.btSave.setEnabled(false);
                    }
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
