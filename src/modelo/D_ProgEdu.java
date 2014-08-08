
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.DCartas;
import vista.DTProgEdu;
import vista.ITipoProgEdu;

public class D_ProgEdu {

Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;
private String progedu, anio, fecha;

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProgedu() {
        return progedu;
    }

    public void setProgedu(String progedu) {
        this.progedu = progedu;
    }

    public void getProgEducativo(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM vprogedu ORDER BY c_cProgEdu";
        DCartas.modelCarta.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                DTProgEdu.modelProgEdu.addElement(new ProgEdu(
                    rs.getString("s_tipoProgEdu")
                    ));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public static String getCodeTPE(String progedu){
        String codPreEdu = "";
        String anio = DTProgEdu.cbxAnio.getSelectedItem().toString();
        
        if (progedu.equals("Pre-escolar")) {
            codPreEdu = "pre" + anio;
        }
        if (progedu.equals("Primaria")) {
            codPreEdu = "pri" + anio;
        }
        if (progedu.equals("Secundaria")) {
            codPreEdu = "sec" + anio;
        }
        return codPreEdu;
    }
    
    public void saveProgEdu(int cAlu){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveProgEducativo(?,?,?,?,?)}");
                ps.setInt(1, cAlu);
                ps.setString(2, getCodeTPE(getProgedu()));
                ps.setString(3, getFecha());
                ps.setString(4, lib.getFechaActual());
                ps.setString(5, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public int getCodeProgEdu(int cAlu){
        conx = Conexion.getSQLConnection();
        int code = 0;
        try {
            st = conx.createStatement();
            rs = st.executeQuery("SELECT c_cProgEdu FROM ProgEducativo where c_alumno="+cAlu+" order by c_cProgEdu");
            
            List<Integer> cpe = new ArrayList<>();
            while (rs.next()) {
                cpe.add(Integer.valueOf(rs.getInt(1)));
            }
            code = cpe.get(ITipoProgEdu.tblProgEdu.getSelectedRow());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener codigo de la carta: " + e.getMessage());
        }
        return code;
    }
    
    public void updProgEdu(int code,String cTipoPE,String fRev){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
ps = conx.prepareStatement("UPDATE ProgEducativo SET c_tipoProgEdu='"+cTipoPE+"',f_rev='"+fRev+
"',f_modify='"+lib.getFechaActual()+"',s_modify='"+D_Login.getNameCU()+"' WHERE c_cProgEdu=" + code);
                ps.executeUpdate();
                conx.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ArrayList<D_ProgEdu> ListarProgEdus(int code){
        
        ArrayList listado = new ArrayList();
        
        try{
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                ps = conx.prepareStatement("SELECT * FROM ProgEducativo where c_alumno="+code+" order by c_cProgEdu");
                rs = ps.executeQuery();
                
                D_ProgEdu putPE;

                while(rs.next()){
                    putPE = new D_ProgEdu();
                    putPE.setProgedu(rs.getString("s_tipoCarta"));
                    putPE.setAnio(rs.getString("f_entregada"));
                    putPE.setFecha(rs.getString("f_recibida"));
                    listado.add(putPE);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listado;
    }
    
}