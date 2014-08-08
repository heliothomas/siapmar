
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.DCartas;
import vista.IRegCorrespondencia;

public class D_Cartas {

Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;
private String carta, fEnt, fRec, pat;

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    public String getfEnt() {
        return fEnt;
    }

    public void setfEnt(String fEnt) {
        this.fEnt = fEnt;
    }

    public String getfRec() {
        return fRec;
    }

    public void setfRec(String fRec) {
        this.fRec = fRec;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }
    
    public void getTipoCartas(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM TipoCarta ORDER BY s_tipoCarta";
        DCartas.modelCarta.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                DCartas.modelCarta.addElement(new Carta(
                    rs.getString("s_tipoCarta")
                    ));
            }
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void getPatrocinadores(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM Patrocinador ORDER BY c_patrocinador";
        DCartas.modelpatr.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                DCartas.modelpatr.addElement(new Patro(
                    rs.getString("s_patrocinador"),
                    rs.getString("c_patrocinador")
                    ));
            }
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void saveASocial(){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveCorrespondencia(?,?,?,?,?,?,?)}");
                ps.setInt(1, Integer.parseInt(IRegCorrespondencia.lbCode.getText()));
                ps.setString(2, getCarta());
                ps.setString(3, getfEnt());
                ps.setString(4, getfRec());
                ps.setString(5, getPat());
                ps.setString(6, lib.getFechaActual());
                ps.setString(7, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public int getCodeCarta(int cAlu){
        conx = Conexion.getSQLConnection();
        int code = 0;
        String sql = "SELECT c_corr FROM Correspondencia where c_alumno="+cAlu+" order by c_corr";
        
        try {
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            List<Integer> ccorr = new ArrayList<>();
            while (rs.next()) {
                ccorr.add(Integer.valueOf(rs.getInt(1)));
            }
            code = ccorr.get(IRegCorrespondencia.tblCorr.getSelectedRow());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener codigo de la carta: " + e.getMessage());
        }
        
        return code;
    }
    
    public void updCarta(int code,String carta,String fent,String frec,String patr){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
ps = conx.prepareStatement("UPDATE Correspondencia SET s_tipoCarta='"+carta+"',f_entregada='"+fent+
"',f_recibida='"+frec+"',s_patrocinador='"+patr+"',f_modify='"+lib.getFechaActual()+
"',s_modify='"+D_Login.getNameCU()+"' WHERE c_corr = " + code);
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
    
    public ArrayList<D_Cartas> ListarCartas(int code){
        
        ArrayList listado = new ArrayList();
        
        try{
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                ps = conx.prepareStatement("SELECT * FROM Correspondencia where c_alumno="+code+" order by c_corr");
                rs = ps.executeQuery();
                
                D_Cartas putC;

                while(rs.next()){
                    putC = new D_Cartas();
                    putC.setCarta(rs.getString("s_tipoCarta"));
                    putC.setfEnt(rs.getString("f_entregada"));
                    putC.setfRec(rs.getString("f_recibida"));
                    putC.setPat(rs.getString("s_patrocinador"));
                    listado.add(putC);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listado;
    }
    
}