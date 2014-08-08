
package modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.ITipoProgEdu;

public class D_TipoProgEdu {
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;
private int anio;
private String progEdu, fecRev;
   
    public void consultaPag1(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(ITipoProgEdu.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_fname, s_sname, s_fapel, s_sapel, f_nac, v_edad FROM alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        ITipoProgEdu.lbName.setText(rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel"));
                        ITipoProgEdu.btAddRow.setEnabled(true);
                        ITipoProgEdu.btEditRow.setEnabled(false);
                    }
                    
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Metodos SET y GET
    public String getProgEdu()
    {
        return progEdu;
    }
    public void setProgEdu(String pe) 
    {
        this.progEdu = pe;
    }

    public int getAnio()
    {
        return anio;
    }
    public void setAnio(int year) 
    {
        this.anio = year;
    }
    
    public String getFecRev()
    {
        return fecRev;
    }
    public void setFecRev(String fecha) 
    {
        this.fecRev = fecha;
    }
    
    public ArrayList<D_TipoProgEdu> ListarProgEdu(int codigo){
        
        ArrayList listado = new ArrayList();
        
        try{
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                ps = conx.prepareStatement("SELECT * FROM vProgEdu where c_alumno="+codigo+" order by c_tipoProgEdu");
                rs = ps.executeQuery();

                D_TipoProgEdu methods;

                while(rs.next()){
                    methods = new D_TipoProgEdu();
                    methods.setProgEdu(rs.getString("s_tipoProgEdu"));
                    methods.setAnio(rs.getInt("v_anio"));
                    methods.setFecRev(rs.getString("f_rev"));
                    listado.add(methods);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listado;
    }
    
    public boolean saveProgEdu(int code, String cTipoProg, String fecRev){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {

                ps = conx.prepareCall("{call saveProgEducativo(?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, cTipoProg);
                ps.setString(3, fecRev);
                ps.setString(4, lib.getFechaActual());
                ps.setString(5, "htmf");//lib.getUserAcc()

                ps.executeUpdate();

                conx.close();
                resultado = true;
            } else {
                System.out.println("Ha ocurrido un error al conectarse a la BD PostgreSQL");
                resultado = false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }   
    
}