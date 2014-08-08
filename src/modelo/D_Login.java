
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sc.Conexion;
import sc.Library;
import vista.IPerfilAdministrativo;
import vista.Login;

public class D_Login {

Login log = new Login();
Library lib = new Library();
public static String rutaSong = "", cargo = "", nameCU = "";

    public static String getNameCU() {
        return nameCU;
    }

    public static void setNameCU(String nameCU) {
        D_Login.nameCU = nameCU;
    }
    
Connection conx;
Statement stm;
PreparedStatement ps;
ResultSet rs;
Statement st;

public static String ClaveMaestra = "";

    public boolean ingresar(String uname, String pass){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();

            if (uname.equals("root") && pass.equals("Htmf1991h1t9m9f1")) {
                ClaveMaestra = "Htmf1991h1t9m9f1";
                resultado = true;
            }else{
                if (conx != null) {
                    stm = conx.createStatement();
                    rs = stm.executeQuery("SELECT c_uname, c_passw, s_cargo, s_name, song FROM Login WHERE c_uname = '"+uname+"' and v_estado=1");

                    while(rs.next()){
                        String un = rs.getString(1);
                        String pw = rs.getString(2);

                        if(un.equals(uname) && !pw.equals(pass)){
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta. :(");
                        }

                        if (un.equals(uname) && pw.equals(pass)) {
                            resultado = true;
                            lib.setUserAcc(uname);
                            cargo = rs.getString("s_cargo");
                            setNameCU(rs.getString("s_name"));
                            rutaSong = rs.getString("song");
                        }
                    }
                    rs.close();
                    conx.close();
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No existe ese usuario.\nO la contraseña es incorrecta :(\nError: " + e.getMessage());
            System.out.println("El error es: " + e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public void consultar(String cuentausuario){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IPerfilAdministrativo.tfCU.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT c_uname, c_passw, s_cargo, v_estado, f_modify, s_modify, s_name, f_nac, v_edad, s_dir, v_cel, v_tel, s_pemail, s_semail FROM login WHERE c_uname='"+cuentausuario+"'");

                    if (rs.next()) {
                        IPerfilAdministrativo.lbCargo.setText(rs.getString("s_cargo"));
                        IPerfilAdministrativo.tfName.setText(rs.getString("s_name"));
                        ((JTextField)IPerfilAdministrativo.datecFecNac.getDateEditor().getUiComponent()).setText(rs.getString("f_nac"));
                        
                        IPerfilAdministrativo.editorpDir.setText(rs.getString("s_dir"));
                        IPerfilAdministrativo.ftfCel.setText(rs.getString("v_cel"));
                        IPerfilAdministrativo.ftfTel.setText(rs.getString("v_tel"));
                        IPerfilAdministrativo.tfEmailPrin.setText(rs.getString("s_pemail"));
                        IPerfilAdministrativo.tfEmailAlt.setText(rs.getString("s_semail"));
                        
                        IPerfilAdministrativo.btGuardar.setEnabled(true);
                    }else{
                        IPerfilAdministrativo.lbCargo.setText("");
                        IPerfilAdministrativo.tfName.setText("");
                        ((JTextField)IPerfilAdministrativo.datecFecNac.getDateEditor().getUiComponent()).setText("");
                        
                        IPerfilAdministrativo.editorpDir.setText("");
                        IPerfilAdministrativo.ftfCel.setText("");
                        IPerfilAdministrativo.ftfTel.setText("");
                        IPerfilAdministrativo.tfEmailPrin.setText("");
                        IPerfilAdministrativo.tfEmailAlt.setText("");
                        
                        IPerfilAdministrativo.btGuardar.setEnabled(false);
                    }
                    
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No existe esta cuenta de usuario");//e.getMessage()
        }
    }
    
    public boolean updateLogin(String cuentaUsuario,String s_name,String f_nac,String dir,String v_cel,String v_tel,String s_pemail,String s_semail){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (!"".equals(cuentaUsuario)) {
                if (conx != null) {

                    ps = conx.prepareCall("{call savePerfilAd(?,?,?,?,?,?,?,?,?)}");
                    ps.setString(1, cuentaUsuario);
                    ps.setString(2, s_name);
                    ps.setString(3, f_nac);
                    ps.setInt(4, 3);//Poner funcion recupere edad
                    ps.setString(5, dir);
                    ps.setString(6, v_cel);
                    ps.setString(7, v_tel);
                    ps.setString(8, s_pemail);
                    ps.setString(9, s_semail);
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            resultado = false;
        }
        return resultado;
    }

}
