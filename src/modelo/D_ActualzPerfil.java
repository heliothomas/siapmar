
package modelo;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.ImagenDB;
import sc.Library;
import vista.IActualizacionPerfiles;


public class D_ActualzPerfil {
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public void getGrupo(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM Grupo ORDER BY c_grupo";
        IActualizacionPerfiles.cbModelGrupo.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                IActualizacionPerfiles.cbModelGrupo.addElement(new Grupo(
                    rs.getString("c_grupo"),
                    rs.getString("s_grupo"),
                    rs.getInt("v_de"),
                    rs.getInt("v_a"),
                    rs.getString("docente")
                    ));
            }
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void getPatrocinador(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM Patrocinador ORDER BY c_patrocinador";
        IActualizacionPerfiles.cbModelPatrocin.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                IActualizacionPerfiles.cbModelPatrocin.addElement(new Patro(
                    rs.getString("s_patrocinador"),
                    rs.getString("c_patrocinador")
                    ));
            }
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public boolean updatePerfil(int code,String cel,String tel,String email,String codGru,String codPat){
        
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call updatePerfil(?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, cel);
                ps.setString(3, tel);
                ps.setString(4, email);
                ps.setString(5, codGru);
                ps.setString(6, codPat);
                ps.setString(7, lib.getFechaActual());
                ps.setString(8, D_Login.getNameCU());
                ps.executeUpdate();
                ps.close();
                conx.close();
                resultado = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    public void consultaPag1(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IActualizacionPerfiles.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM alumno WHERE c_alumno="+code);
                    ImagenDB img = new ImagenDB();

                    if (rs.next()) {
                        IActualizacionPerfiles.lbName.setText(rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel"));
                        IActualizacionPerfiles.taDir.setText(rs.getString("s_direc"));
                        IActualizacionPerfiles.lbFecNac.setText(rs.getString("f_nac"));
                        IActualizacionPerfiles.ftfCel.setText(rs.getString("v_cel"));
                        IActualizacionPerfiles.ftfTel.setText(rs.getString("v_tel"));
                        IActualizacionPerfiles.tfEmail.setText(rs.getString("s_email"));
                        
                        if (rs.getBytes("s_urlFoto") != null) {
                            img.setArchivo(ConvertirImagen(rs.getBytes("s_urlFoto")));
                        
                            ImageIcon fot = new ImageIcon(img.getArchivo());

                            int ancho = IActualizacionPerfiles.lbFoto.getWidth();
                            int alto = IActualizacionPerfiles.lbFoto.getHeight();

                            Icon icono = new ImageIcon(
                                    fot.getImage().getScaledInstance(
                                    ancho, alto, Image.SCALE_DEFAULT));
                            
                            IActualizacionPerfiles.lbFoto.setIcon(icono);
                        }else{
                            ImageIcon fot = null;
                            IActualizacionPerfiles.lbFoto.setIcon(fot);
                            IActualizacionPerfiles.lbFoto.repaint();
                        }
                        
                        IActualizacionPerfiles.btFoto.setEnabled(true);
                        IActualizacionPerfiles.btGuardar.setEnabled(true);
                    }
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private Image ConvertirImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");    
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        return reader.read(0, param);
    }
}