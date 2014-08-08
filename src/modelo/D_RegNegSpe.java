
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.IRegNecSpe;


public class D_RegNegSpe {
    
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public boolean saveRegNecSpe(int code,int g1,int g2,int g3,int g4,int g5,int g6,int g7,int g8,int g9,int g10,String obs,int casos){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveRegNecesidadesEsp(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setInt(2, g1);
                ps.setInt(3, g2);
                ps.setInt(4, g3);
                ps.setInt(5, g4);
                ps.setInt(6, g5);
                ps.setInt(7, g6);
                ps.setInt(8, g7);
                ps.setInt(9, g8);
                ps.setInt(10, g9);
                ps.setInt(11, g10);
                ps.setString(12, obs);
                ps.setInt(13, casos);
                ps.setString(14, lib.getFechaActual());
                ps.setString(15, "usuario");
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
    
    public void consultaPag1(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IRegNecSpe.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_fname, s_sname, s_fapel, s_sapel FROM alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        IRegNecSpe.lbName.setText(rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel"));
                        IRegNecSpe.btGuardar.setEnabled(true);
                    }
                    else IRegNecSpe.lbName.setText("");
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_habla, b_atencion, b_hablador, b_agresivo, b_autoestima, b_sonidos, b_palabra, b_mezclamayus, b_escinversa, b_separapalabr, s_observaciones, v_casos FROM RegNecesidadesEsp WHERE c_alumno="+code);

                    if (rs.next()) {
                        int a = rs.getInt("b_habla");
                        int b = rs.getInt("b_atencion");
                        int c = rs.getInt("b_hablador");
                        int d = rs.getInt("b_agresivo");
                        int e = rs.getInt("b_autoestima");
                        int f = rs.getInt("b_sonidos");
                        int g = rs.getInt("b_palabra");
                        int h = rs.getInt("b_mezclamayus");
                        int i = rs.getInt("b_escinversa");
                        int j = rs.getInt("b_separapalabr");
                        
                        if (a == 0) IRegNecSpe.rbNunca1.setSelected(true);
                        else IRegNecSpe.rbNunca1.setSelected(false);
                        if (a == 1) IRegNecSpe.rbPocas1.setSelected(true);
                        else IRegNecSpe.rbPocas1.setSelected(false);
                        if (a == 2) IRegNecSpe.rbKSiempre1.setSelected(true);
                        else IRegNecSpe.rbKSiempre1.setSelected(false);
                        if (a == 3) IRegNecSpe.rbSiempre1.setSelected(true);
                        else IRegNecSpe.rbSiempre1.setSelected(false);
                        
                        if (b == 0) IRegNecSpe.rbNunca2.setSelected(true);
                        else IRegNecSpe.rbNunca2.setSelected(false);
                        if (b == 1) IRegNecSpe.rbPocas2.setSelected(true);
                        else IRegNecSpe.rbPocas2.setSelected(false);
                        if (b == 2) IRegNecSpe.rbKSiempre2.setSelected(true);
                        else IRegNecSpe.rbKSiempre2.setSelected(false);
                        if (b == 3) IRegNecSpe.rbSiempre2.setSelected(true);
                        else IRegNecSpe.rbSiempre2.setSelected(false);
                        
                        if (c == 0) IRegNecSpe.rbNunca3.setSelected(true);
                        else IRegNecSpe.rbNunca3.setSelected(false);
                        if (c == 1) IRegNecSpe.rbPocas3.setSelected(true);
                        else IRegNecSpe.rbPocas3.setSelected(false);
                        if (c == 2) IRegNecSpe.rbKSiempre3.setSelected(true);
                        else IRegNecSpe.rbKSiempre3.setSelected(false);
                        if (c == 3) IRegNecSpe.rbSiempre3.setSelected(true);
                        else IRegNecSpe.rbSiempre3.setSelected(false);
                        
                        if (d == 0) IRegNecSpe.rbNunca4.setSelected(true);
                        else IRegNecSpe.rbNunca4.setSelected(false);
                        if (d == 1) IRegNecSpe.rbPocas4.setSelected(true);
                        else IRegNecSpe.rbPocas4.setSelected(false);
                        if (d == 2) IRegNecSpe.rbKSiempre4.setSelected(true);
                        else IRegNecSpe.rbKSiempre4.setSelected(false);
                        if (d == 3) IRegNecSpe.rbSiempre4.setSelected(true);
                        else IRegNecSpe.rbSiempre4.setSelected(false);
                        
                        if (e == 0) IRegNecSpe.rbNunca5.setSelected(true);
                        else IRegNecSpe.rbNunca5.setSelected(false);
                        if (e == 1) IRegNecSpe.rbPocas5.setSelected(true);
                        else IRegNecSpe.rbPocas5.setSelected(false);
                        if (e == 2) IRegNecSpe.rbKSiempre5.setSelected(true);
                        else IRegNecSpe.rbKSiempre5.setSelected(false);
                        if (e == 3) IRegNecSpe.rbSiempre5.setSelected(true);
                        else IRegNecSpe.rbSiempre5.setSelected(false);
                        
                        if (f == 0) IRegNecSpe.rbNunca6.setSelected(true);
                        else IRegNecSpe.rbNunca6.setSelected(false);
                        if (f == 1) IRegNecSpe.rbPocas6.setSelected(true);
                        else IRegNecSpe.rbPocas6.setSelected(false);
                        if (f == 2) IRegNecSpe.rbKSiempre6.setSelected(true);
                        else IRegNecSpe.rbKSiempre6.setSelected(false);
                        if (f == 3) IRegNecSpe.rbSiempre6.setSelected(true);
                        else IRegNecSpe.rbSiempre6.setSelected(false);
                        
                        if (g == 0) IRegNecSpe.rbNunca7.setSelected(true);
                        else IRegNecSpe.rbNunca7.setSelected(false);
                        if (g == 1) IRegNecSpe.rbPocas7.setSelected(true);
                        else IRegNecSpe.rbPocas7.setSelected(false);
                        if (g == 2) IRegNecSpe.rbKSiempre7.setSelected(true);
                        else IRegNecSpe.rbKSiempre7.setSelected(false);
                        if (g == 3) IRegNecSpe.rbSiempre7.setSelected(true);
                        else IRegNecSpe.rbSiempre7.setSelected(false);
                        
                        if (h == 0) IRegNecSpe.rbNunca8.setSelected(true);
                        else IRegNecSpe.rbNunca8.setSelected(false);
                        if (h == 1) IRegNecSpe.rbPocas8.setSelected(true);
                        else IRegNecSpe.rbPocas8.setSelected(false);
                        if (h == 2) IRegNecSpe.rbKSiempre8.setSelected(true);
                        else IRegNecSpe.rbKSiempre8.setSelected(false);
                        if (h == 3) IRegNecSpe.rbSiempre8.setSelected(true);
                        else IRegNecSpe.rbSiempre8.setSelected(false);
                        
                        if (i == 0) IRegNecSpe.rbNunca9.setSelected(true);
                        else IRegNecSpe.rbNunca9.setSelected(false);
                        if (i == 1) IRegNecSpe.rbPocas9.setSelected(true);
                        else IRegNecSpe.rbPocas9.setSelected(false);
                        if (i == 2) IRegNecSpe.rbKSiempre9.setSelected(true);
                        else IRegNecSpe.rbKSiempre9.setSelected(false);
                        if (i == 3) IRegNecSpe.rbSiempre9.setSelected(true);
                        else IRegNecSpe.rbSiempre9.setSelected(false);
                        
                        if (j == 0) IRegNecSpe.rbNunca10.setSelected(true);
                        else IRegNecSpe.rbNunca10.setSelected(false);
                        if (j == 1) IRegNecSpe.rbPocas10.setSelected(true);
                        else IRegNecSpe.rbPocas10.setSelected(false);
                        if (j == 2) IRegNecSpe.rbKSiempre10.setSelected(true);
                        else IRegNecSpe.rbKSiempre10.setSelected(false);
                        if (j == 3) IRegNecSpe.rbSiempre10.setSelected(true);
                        else IRegNecSpe.rbSiempre10.setSelected(false);
                        
                        IRegNecSpe.edpObservaciones.setText(rs.getString("s_observaciones"));
                        IRegNecSpe.lbNCAdvertnc.setText(rs.getString("v_casos"));
                    }else{
                        IRegNecSpe.buttonGroup1.clearSelection();
                        IRegNecSpe.rbNunca1.setSelected(true);
                        IRegNecSpe.buttonGroup2.clearSelection();
                        IRegNecSpe.rbNunca2.setSelected(true);
                        IRegNecSpe.buttonGroup3.clearSelection();
                        IRegNecSpe.rbNunca3.setSelected(true);
                        IRegNecSpe.buttonGroup4.clearSelection();
                        IRegNecSpe.rbNunca4.setSelected(true);
                        IRegNecSpe.buttonGroup5.clearSelection();
                        IRegNecSpe.rbNunca5.setSelected(true);
                        IRegNecSpe.buttonGroup6.clearSelection();
                        IRegNecSpe.rbNunca6.setSelected(true);
                        IRegNecSpe.buttonGroup7.clearSelection();
                        IRegNecSpe.rbNunca7.setSelected(true);
                        IRegNecSpe.buttonGroup8.clearSelection();
                        IRegNecSpe.rbNunca8.setSelected(true);
                        IRegNecSpe.buttonGroup9.clearSelection();
                        IRegNecSpe.rbNunca9.setSelected(true);
                        IRegNecSpe.buttonGroup10.clearSelection();
                        IRegNecSpe.rbNunca10.setSelected(true);
                        IRegNecSpe.edpObservaciones.setText("");
                        IRegNecSpe.lbNCAdvertnc.setText("0");
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
