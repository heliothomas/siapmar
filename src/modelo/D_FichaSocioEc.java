
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.IFichaSocioEcon;

public class D_FichaSocioEc {
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public boolean saveFichaSocioEc(int code, String encuestador){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveFichaSocioEc(?,?)}");
                ps.setInt(1, code);
                ps.setString(2, encuestador);
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
    
    public boolean updateRazonNoVivenJuntos(int code, String razon){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call updateRazonNoVivenJuntos(?,?)}");
                ps.setInt(1, code);
                ps.setString(2, razon);
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
    
    public boolean saveReligion(int code,String s_religion,String s_nameIgl,String b_participant,String razon){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveReligion(?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, s_religion);
                ps.setString(3, s_nameIgl);
                ps.setString(4, b_participant);
                ps.setString(5, razon);
                ps.setString(6, lib.getFechaActual());
                ps.setString(7, "usuario");
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

    public boolean saveVivienda(int code,String s_viveCasa,String s_materialConst,int v_dormitorios,String s_tipoPiso,String b_servicios,int v_cuadras,String s_transporte){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveVivienda(?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, s_viveCasa);
                ps.setString(3, s_materialConst);
                ps.setInt(4, v_dormitorios);
                ps.setString(5, s_tipoPiso);
                ps.setString(6, b_servicios);
                ps.setInt(7, v_cuadras);
                ps.setString(8, s_transporte);
                ps.setString(9, lib.getFechaActual());
                ps.setString(10, "usuario");
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
    
    public boolean saveAspctSaludNutr(int code,String s_enfermedad,String s_enfCorznEsp,String b_piePlano,String b_pieEquino,
String b_pieVaro,String b_manco,String b_faltaDedos,String b_sordo,
String b_elHabla,String b_muevBrazo,String b_muevPiern,String b_muevMano,int b_recibAtencion,int b_recibMedicina){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                
                ps = conx.prepareCall("{call saveAspctSaludNutr(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, s_enfermedad);
                ps.setString(3, s_enfCorznEsp);
                ps.setString(4, b_piePlano);
                ps.setString(5, b_pieEquino);
                ps.setString(6, b_pieVaro);
                ps.setString(7, b_manco);
                ps.setString(8, b_faltaDedos);
                ps.setString(9, b_sordo);
                ps.setString(10, b_elHabla);
                ps.setString(11, b_muevBrazo);
                ps.setString(12, b_muevPiern);
                ps.setString(13, b_muevMano);
                ps.setInt(14, b_recibAtencion);
                ps.setInt(15, b_recibMedicina);
                ps.setString(16, lib.getFechaActual());
                ps.setString(17, "usuario");
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
    
    public boolean saveParticipacion(int code,int b_otroProj,String s_otroProj,int b_esteProj,
int b_otroProjNoCompas,String s_otroProjNoCompas,int b_hnoRegProj,String s_hnoRegProj){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveParticipacion(?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setInt(2, b_otroProj);
                ps.setString(3, s_otroProj);
                ps.setInt(4, b_esteProj);
                ps.setInt(5, b_otroProjNoCompas);
                ps.setString(6, s_otroProjNoCompas);
                ps.setInt(7, b_hnoRegProj);
                ps.setString(8, s_hnoRegProj);
                ps.setString(9, lib.getFechaActual());
                ps.setString(10, "usuario");
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
    
    public boolean updateObservaciones(int code,String observ){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call updateFichaSocioEc(?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, observ);
                ps.setString(3, lib.getFechaActual());
                ps.setString(4, "usuario");
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

            if (!"".equals(IFichaSocioEcon.lbCode.getText())) {
                if (conx != null) {
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_fname, s_sname, s_fapel, s_sapel, f_nac, v_edad, s_sexo, s_direc, v_cel, v_tel, s_email, s_urlfoto FROM alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        String nombre = rs.getString("s_fname")+" "+rs.getString("s_sname")+" "+rs.getString("s_fapel")+" "+rs.getString("s_sapel");
                        
                        IFichaSocioEcon.lbNameNino.setText(nombre);
                        IFichaSocioEcon.lbSexo.setText(rs.getString("s_sexo"));
                        IFichaSocioEcon.lbDireccion.setText(rs.getString("s_direc"));
                        IFichaSocioEcon.lbFecNac.setText(rs.getString("f_nac"));
                        
                        String edad = rs.getString("v_edad");
                        IFichaSocioEcon.lbEdad.setText(edad);
                        
                        D_AspectoSocial as = new D_AspectoSocial();
                        if (as.consultarASocial()==0) {
                            as.ingresarASocial(code,nombre,Integer.parseInt(edad));
                        }
                        IFichaSocioEcon.Listar();
                        
                        if (IFichaSocioEcon.tblParentesco.getRowCount() > 0) {
                            IFichaSocioEcon.btAddRow.setEnabled(true);
                            IFichaSocioEcon.btGuardar1.setEnabled(true);
                        }
                    }else{
                        IFichaSocioEcon.lbNameNino.setText("");
                        IFichaSocioEcon.lbSexo.setText("");
                        IFichaSocioEcon.lbDireccion.setText("");
                        IFichaSocioEcon.lbFecNac.setText("");
                        IFichaSocioEcon.lbEdad.setText("");
                    }
                    
                    st.close();
                    rs.close();
                    
                    //Otros campos
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_juntos, s_ecivil, s_razonNoVivenJuntos FROM PadresNat WHERE c_alumno="+code);

                    if (rs.next()) {
                        String juntos = rs.getString("s_juntos");
                        IFichaSocioEcon.lbVivenCAmbos.setText(juntos);
                        IFichaSocioEcon.lbEstadoPadres.setText(rs.getString("s_ecivil"));
                        
                        if (juntos.equals("No")) {
                            IFichaSocioEcon.taRazon.setText(rs.getString("s_razonNoVivenJuntos"));
                            IFichaSocioEcon.taRazon.setEnabled(true);
                            IFichaSocioEcon.taRazon.requestFocus();
                        }else{
                            IFichaSocioEcon.taRazon.setText("");
                            IFichaSocioEcon.taRazon.setEnabled(false);
                        }
                        
                    }else{
                        IFichaSocioEcon.lbVivenCAmbos.setText("");
                        IFichaSocioEcon.lbEstadoPadres.setText("");
                        IFichaSocioEcon.taRazon.setText("");
                        IFichaSocioEcon.taRazon.setEnabled(false);
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_tutores FROM Tutela WHERE c_alumno="+code);

                    if (rs.next()) {
                        String tutores = rs.getString("b_tutores");
                        String[] x = tutores.split(",");
                        
                        String y;
                        if (x[2].equals("nada")) {
                            y = x[0] + ", " + x[1];
                        }else{
                            y = x[2];
                        }
                        
                        IFichaSocioEcon.lbTutorNino.setText(y);
                    }else IFichaSocioEcon.lbTutorNino.setText("");
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void consultaPag2(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IFichaSocioEcon.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_nivelacad, v_anioacad, s_vocac, s_aprndz, s_carUniv, s_otro, s_razon FROM Estudios WHERE c_alumno="+code);

                    if (rs.next()) {
                        IFichaSocioEcon.lbEducacion.setText(rs.getString("s_nivelacad"));
                        IFichaSocioEcon.lbNivelEdu.setText(rs.getString("v_anioacad"));
                        
                        String a = rs.getString("s_vocac");
                        String b = rs.getString("s_aprndz");
                        String c = rs.getString("s_carUniv");
                        String d = rs.getString("s_otro");
                        String curso;
                        
                        if (a.equals("")) {
                            if (b.equals("")) {
                                if (c.equals("")) {
                                    if (d.equals("")) {
                                        curso = "";
                                    }else curso = d;
                                }else curso = c;
                            }else curso = b;
                        }else curso = a;
                        
                        IFichaSocioEcon.lbOtrosEstudios.setText(curso);
                        IFichaSocioEcon.lbRazon.setText(rs.getString("s_razon"));
                        
                    }else{
                        IFichaSocioEcon.lbEducacion.setText("");
                        IFichaSocioEcon.lbNivelEdu.setText("");
                        IFichaSocioEcon.lbOtrosEstudios.setText("");
                        IFichaSocioEcon.lbRazon.setText("");
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_religion, s_nameigl, b_participant, s_razon FROM Religion WHERE c_alumno="+code);

                    if (rs.next()) {
                        IFichaSocioEcon.cbxReligion.setSelectedItem(rs.getString("s_religion"));
                        IFichaSocioEcon.tfNameIgl.setText(rs.getString("s_nameigl"));
                        String part = rs.getString("b_participant");
                        if (part.equals("Si")) {
                            IFichaSocioEcon.rbSiParticReligion.setSelected(true);
                            IFichaSocioEcon.rbNoParticReligion.setSelected(false);
                            IFichaSocioEcon.taRazonIgl.setEnabled(false);
                        } else {
                            IFichaSocioEcon.rbSiParticReligion.setSelected(false);
                            IFichaSocioEcon.rbNoParticReligion.setSelected(true);
                            IFichaSocioEcon.taRazonIgl.setEnabled(true);
                        }
                        IFichaSocioEcon.taRazonIgl.setText(rs.getString("s_razon"));
                    }else{
                        IFichaSocioEcon.cbxReligion.setSelectedItem("Evangélica");
                        IFichaSocioEcon.tfNameIgl.setText("");
                        IFichaSocioEcon.rbSiParticReligion.setSelected(true);
                        IFichaSocioEcon.rbNoParticReligion.setSelected(false);
                        IFichaSocioEcon.taRazonIgl.setText("");
                    }
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_vivecasa, s_materialconst, v_dormitorios, s_tipopiso, b_servicios, v_cuadras, s_transporte FROM Vivienda WHERE c_alumno="+code);

                    if (rs.next()) {
                        String dondevive = rs.getString("s_vivecasa");
                        if (!dondevive.equals("Casa Propia")&&!dondevive.equals("Casa Alquilada")&&!dondevive.equals("Casa Prestada")) {
                            IFichaSocioEcon.cbxDondeViv.setSelectedIndex(3);
                            IFichaSocioEcon.tfOtraDondeViv.setText(dondevive);
                        } else {
                            IFichaSocioEcon.cbxDondeViv.setSelectedItem(dondevive);
                            IFichaSocioEcon.tfOtraDondeViv.setText("");
                            IFichaSocioEcon.tfOtraDondeViv.setEnabled(false);
                        }
                        
                        String material = rs.getString("s_materialconst");
                        if (!material.equals("Madera")&&!material.equals("Ladrillo y cemento")&&!material.equals("Adobe")&&!material.equals("Lámino,Plástico,Cartón")) {
                            IFichaSocioEcon.cbxMaterial.setSelectedIndex(4);
                            IFichaSocioEcon.tfOtroMaterial.setText(material);
                        } else {
                            IFichaSocioEcon.cbxMaterial.setSelectedItem(material);
                            IFichaSocioEcon.tfOtroMaterial.setText("");
                            IFichaSocioEcon.tfOtroMaterial.setEnabled(false);
                        }
                        
                        IFichaSocioEcon.spDormitorios.setValue(rs.getInt("v_dormitorios"));
                        IFichaSocioEcon.cbxTipoPiso.setSelectedItem(rs.getString("s_tipopiso"));
                        
                        String servicios = rs.getString("b_servicios");
                        String a = servicios.substring(0, 1);
                        String b = servicios.substring(1, 2);
                        String c = servicios.substring(2, 3);
                        String d = servicios.substring(3, 4);
                        String e = servicios.substring(4, 5);
                        String f = servicios.substring(5, 6);
                        
                        if (a.equals("1"))IFichaSocioEcon.cbAgua.setSelected(true);
                        else IFichaSocioEcon.cbAgua.setSelected(false);
                        
                        if (b.equals("1"))IFichaSocioEcon.cbAlcantarillado.setSelected(true);
                        else IFichaSocioEcon.cbAlcantarillado.setSelected(false);
                        
                        if (c.equals("1"))IFichaSocioEcon.cbLuz.setSelected(true);
                        else IFichaSocioEcon.cbLuz.setSelected(false);
                        
                        if (d.equals("1"))IFichaSocioEcon.cbLetrina.setSelected(true);
                        else IFichaSocioEcon.cbLetrina.setSelected(false);
                        
                        if (e.equals("1"))IFichaSocioEcon.cbTelf.setSelected(true);
                        else IFichaSocioEcon.cbTelf.setSelected(false);
                        
                        if (f.equals("1"))IFichaSocioEcon.cbBasura.setSelected(true);
                        else IFichaSocioEcon.cbBasura.setSelected(false);
                        
                        IFichaSocioEcon.spCuadras.setValue(rs.getInt("v_cuadras"));
                        
                        String trans = rs.getString("s_transporte");
                        if (!trans.equals("Caminando")||!trans.equals("Transporte urbano colectivo")||!trans.equals("Vehiculo")) {
                            IFichaSocioEcon.cbxTransporte.setSelectedIndex(3);
                            IFichaSocioEcon.tfOtroTransporte.setText(trans);
                        } else {
                            IFichaSocioEcon.cbxTransporte.setSelectedItem(material);
                            IFichaSocioEcon.tfOtroTransporte.setText("");
                            IFichaSocioEcon.tfOtroTransporte.setEnabled(false);
                        }
                        
                    }else{
                        IFichaSocioEcon.lbEducacion.setText("");
                        IFichaSocioEcon.lbNivelEdu.setText("");
                        IFichaSocioEcon.lbOtrosEstudios.setText("");
                        IFichaSocioEcon.lbRazon.setText("");
                        
                        IFichaSocioEcon.cbxReligion.setSelectedIndex(0);
                        IFichaSocioEcon.tfNameIgl.setText("");
                        IFichaSocioEcon.rbSiParticReligion.setSelected(true);
                        IFichaSocioEcon.rbNoParticReligion.setSelected(false);
                        IFichaSocioEcon.taRazonIgl.setText("");
                        IFichaSocioEcon.taRazonIgl.setEnabled(false);
                        
                        IFichaSocioEcon.cbxDondeViv.setSelectedIndex(0);
                        IFichaSocioEcon.tfOtraDondeViv.setText("");
                        IFichaSocioEcon.tfOtraDondeViv.setEnabled(false);
                        IFichaSocioEcon.cbxMaterial.setSelectedIndex(0);
                        IFichaSocioEcon.tfOtroMaterial.setText("");
                        IFichaSocioEcon.tfOtroMaterial.setEnabled(false);
                        IFichaSocioEcon.spDormitorios.setValue(0);
                        IFichaSocioEcon.cbxTipoPiso.setSelectedIndex(0);
                        IFichaSocioEcon.cbAgua.setSelected(true);
                        IFichaSocioEcon.cbAlcantarillado.setSelected(false);
                        IFichaSocioEcon.cbLuz.setSelected(true);
                        IFichaSocioEcon.cbLetrina.setSelected(true);
                        IFichaSocioEcon.cbTelf.setSelected(false);
                        IFichaSocioEcon.cbBasura.setSelected(true);
                        IFichaSocioEcon.spCuadras.setValue(0);
                        IFichaSocioEcon.cbxTransporte.setSelectedIndex(0);
                        IFichaSocioEcon.tfOtroTransporte.setText("");
                        IFichaSocioEcon.tfOtroTransporte.setEnabled(false);
                    }
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }    
    
    public void consultaPag3(int code){
    try {
        conx = Conexion.getSQLConnection();

        if (!"".equals(IFichaSocioEcon.lbCode.getText())) {
            if (conx != null) {

                st = conx.createStatement();
                rs = st.executeQuery("SELECT s_enfermedad, s_enfcorznesp, b_pieplano, b_pieequino, b_pievaro, b_manco, b_faltadedos, b_sordo, b_elhabla, b_muevbrazo, b_muevpiern, b_muevmano, b_recibatencion, b_recibmedicina FROM aspctsaludnutr WHERE c_alumno="+code);

                if (rs.next()) {
                    IFichaSocioEcon.cbxEnfermedades.setSelectedItem(rs.getString("s_enfermedad"));
                    IFichaSocioEcon.tfProblemasCorz.setText(rs.getString("s_enfcorznesp"));

                    String pieplano = rs.getString("b_pieplano");
                    String a = pieplano.substring(0, 1);
                    String b = pieplano.substring(1, 2);

                    IFichaSocioEcon.cbPPlano.setSelected(false);
                    if (a.equals("1")&& b.equals("0")) {
                        IFichaSocioEcon.rbPiePlanoIzq.setSelected(true);
                        IFichaSocioEcon.rbPiePlanoDer.setSelected(false);
                        IFichaSocioEcon.cbPPlano.setSelected(true);
                    }
                    if (a.equals("0")&& b.equals("1")){
                        IFichaSocioEcon.rbPiePlanoIzq.setSelected(false);
                        IFichaSocioEcon.rbPiePlanoDer.setSelected(true);
                        IFichaSocioEcon.cbPPlano.setSelected(true);
                    }

                    String pieequino = rs.getString("b_pieplano");
                    String c = pieequino.substring(0, 1);
                    String d = pieequino.substring(1, 2);

                    IFichaSocioEcon.cbPEquino.setSelected(false);
                    if (c.equals("1")&& d.equals("0")) {
                        IFichaSocioEcon.rbPieEquinoIzq.setSelected(true);
                        IFichaSocioEcon.rbPieEquinoDer.setSelected(false);
                        IFichaSocioEcon.cbPEquino.setSelected(true);
                    }
                    if (c.equals("0")&& d.equals("1")){
                        IFichaSocioEcon.rbPieEquinoIzq.setSelected(false);
                        IFichaSocioEcon.rbPieEquinoDer.setSelected(true);
                        IFichaSocioEcon.cbPEquino.setSelected(true);
                    }

                    String pievaro = rs.getString("b_pievaro");
                    String e = pievaro.substring(0, 1);
                    String f = pievaro.substring(1, 2);

                    IFichaSocioEcon.cbPVaro.setSelected(false);
                    if (e.equals("1")&& f.equals("0")){
                        IFichaSocioEcon.rbPieVaroIzq.setSelected(true);
                        IFichaSocioEcon.rbPieVaroDer.setSelected(false);
                        IFichaSocioEcon.cbPVaro.setSelected(true);
                    }
                    if (e.equals("0")&& f.equals("1")){
                        IFichaSocioEcon.rbPieVaroIzq.setSelected(false);
                        IFichaSocioEcon.rbPieVaroDer.setSelected(true);
                        IFichaSocioEcon.cbPVaro.setSelected(true);
                    }

                    String faltaMano = rs.getString("b_manco");
                    String g = faltaMano.substring(0, 1);
                    String h = faltaMano.substring(1, 2);

                    IFichaSocioEcon.cbFMano.setSelected(false);
                    if (g.equals("1")&& h.equals("0")) {
                        IFichaSocioEcon.rbFManoIzq.setSelected(true);
                        IFichaSocioEcon.rbFManoDer.setSelected(false);
                        IFichaSocioEcon.cbFMano.setSelected(true);
                    }
                    if (g.equals("0")&& h.equals("1")){
                        IFichaSocioEcon.rbFManoIzq.setSelected(false);
                        IFichaSocioEcon.rbFManoDer.setSelected(true);
                        IFichaSocioEcon.cbFMano.setSelected(true);
                    }

                    String faltaDedos = rs.getString("b_faltadedos");
                    String i = faltaDedos.substring(0, 1);
                    String j = faltaDedos.substring(1, 2);

                    IFichaSocioEcon.cbFDedo.setSelected(false);
                    if (i.equals("1")&& j.equals("0")) {
                        IFichaSocioEcon.rbFDedoIzq.setSelected(true);
                        IFichaSocioEcon.rbFDedoDer.setSelected(false);
                        IFichaSocioEcon.cbFDedo.setSelected(true);
                    }
                    if (i.equals("0")&& j.equals("1")){
                        IFichaSocioEcon.rbFDedoIzq.setSelected(false);
                        IFichaSocioEcon.rbFDedoDer.setSelected(true);
                        IFichaSocioEcon.cbFDedo.setSelected(true);
                    }

                    String sordo = rs.getString("b_sordo");
                    String k = sordo.substring(0, 1);
                    String l = sordo.substring(1, 2);

                    IFichaSocioEcon.cbSordo.setSelected(false);
                    if (k.equals("1")) IFichaSocioEcon.cbOidoIzq.setSelected(true);
                    else IFichaSocioEcon.cbOidoIzq.setSelected(false);
                    if (l.equals("1")) IFichaSocioEcon.cbOidoDer.setSelected(true);
                    else IFichaSocioEcon.cbOidoIzq.setSelected(false);

                    if (k.equals("1") || l.equals("1")) IFichaSocioEcon.cbSordo.setSelected(true);
                    else IFichaSocioEcon.cbSordo.setSelected(false);

                    String habla = rs.getString("b_elhabla");
                    String h1 = habla.substring(0, 1);
                    String h2 = habla.substring(1, 2);
                    
                    if (h1.equals("1")) {
                        IFichaSocioEcon.cbDefectoHabla.setSelected(true);
                    }else{
                        IFichaSocioEcon.cbDefectoHabla.setSelected(false);
                    }
                    if (h2.equals("1")){
                        IFichaSocioEcon.cbMudo.setSelected(true);
                    }else{
                        IFichaSocioEcon.cbMudo.setSelected(false);
                    }

                    String noMvbrazo = rs.getString("b_muevbrazo");
                    String m = noMvbrazo.substring(0, 1);
                    String n = noMvbrazo.substring(1, 2);

                    IFichaSocioEcon.cbNoMueveBrazo.setSelected(false);
                    if (m.equals("1")&& n.equals("0")) {
                        IFichaSocioEcon.rbBrazoIzq.setSelected(true);
                        IFichaSocioEcon.rbBrazoDer.setSelected(false);
                        IFichaSocioEcon.cbNoMueveBrazo.setSelected(true);
                    }
                    if (m.equals("0")&& n.equals("1")){
                        IFichaSocioEcon.rbBrazoIzq.setSelected(false);
                        IFichaSocioEcon.rbBrazoDer.setSelected(true);
                        IFichaSocioEcon.cbNoMueveBrazo.setSelected(true);
                    }

                    String noMvpierna = rs.getString("b_muevpiern");
                    String o = noMvpierna.substring(0, 1);
                    String p = noMvpierna.substring(1, 2);

                    IFichaSocioEcon.cbNoMuevePierna.setSelected(false);
                    if (o.equals("1")&& p.equals("0")) {
                        IFichaSocioEcon.rbPiernaIzq.setSelected(true);
                        IFichaSocioEcon.rbPiernaDer.setSelected(false);
                        IFichaSocioEcon.cbNoMuevePierna.setSelected(true);
                    }
                    if (o.equals("0")&& p.equals("1")){
                        IFichaSocioEcon.rbPiernaIzq.setSelected(false);
                        IFichaSocioEcon.rbPiernaDer.setSelected(true);
                        IFichaSocioEcon.cbNoMuevePierna.setSelected(true);
                    }

                    String noMvmano = rs.getString("b_muevmano");
                    String q = noMvmano.substring(0, 1);
                    String r = noMvmano.substring(1, 2);

                    IFichaSocioEcon.cbNoMueveMano.setSelected(false);
                    if (q.equals("1")&& r.equals("0")) {
                        IFichaSocioEcon.rbManoIzq.setSelected(true);
                        IFichaSocioEcon.rbManoDer.setSelected(false);
                        IFichaSocioEcon.cbNoMueveMano.setSelected(true);
                    }
                    if (q.equals("0")&& r.equals("1")){
                        IFichaSocioEcon.rbManoIzq.setSelected(false);
                        IFichaSocioEcon.rbManoDer.setSelected(true);
                        IFichaSocioEcon.cbNoMueveMano.setSelected(true);
                    }

                    if (rs.getString("b_recibatencion").equals("1")) {
                        IFichaSocioEcon.rbSiAtencionMed.setSelected(true);
                        IFichaSocioEcon.rbNoAtencionMed.setSelected(false);
                    } else {
                        IFichaSocioEcon.rbSiAtencionMed.setSelected(false);
                        IFichaSocioEcon.rbNoAtencionMed.setSelected(true);
                    }

                    if (rs.getString("b_recibmedicina").equals("1")) {
                        IFichaSocioEcon.rbSiTomaMed.setSelected(true);
                        IFichaSocioEcon.rbNoTomaMed.setSelected(false);
                    } else {
                        IFichaSocioEcon.rbSiTomaMed.setSelected(false);
                        IFichaSocioEcon.rbNoTomaMed.setSelected(true);
                    }

                }else{
                    IFichaSocioEcon.cbxEnfermedades.setSelectedIndex(0);
                    IFichaSocioEcon.tfProblemasCorz.setText("");
                    IFichaSocioEcon.cbPPlano.setSelected(false);
                    IFichaSocioEcon.rbPiePlanoIzq.setSelected(false);
                    IFichaSocioEcon.rbPiePlanoDer.setSelected(false);
                    IFichaSocioEcon.cbPEquino.setSelected(false);
                    IFichaSocioEcon.rbPieEquinoIzq.setSelected(false);
                    IFichaSocioEcon.rbPieEquinoDer.setSelected(false);
                    IFichaSocioEcon.cbPVaro.setSelected(false);
                    IFichaSocioEcon.rbPieVaroIzq.setSelected(false);
                    IFichaSocioEcon.rbPieVaroDer.setSelected(false);
                    IFichaSocioEcon.cbFMano.setSelected(false);
                    IFichaSocioEcon.rbFManoIzq.setSelected(false);
                    IFichaSocioEcon.rbFManoDer.setSelected(false);
                    IFichaSocioEcon.cbFDedo.setSelected(false);
                    IFichaSocioEcon.rbFDedoIzq.setSelected(false);
                    IFichaSocioEcon.rbFDedoDer.setSelected(false);
                    IFichaSocioEcon.cbSordo.setSelected(false);
                    IFichaSocioEcon.cbOidoIzq.setSelected(false);
                    IFichaSocioEcon.cbOidoDer.setSelected(false);
                    IFichaSocioEcon.cbDefectoHabla.setSelected(false);
                    IFichaSocioEcon.cbMudo.setSelected(false);
                    IFichaSocioEcon.cbNoMueveBrazo.setSelected(false);
                    IFichaSocioEcon.rbBrazoIzq.setSelected(false);
                    IFichaSocioEcon.rbBrazoDer.setSelected(false);
                    IFichaSocioEcon.cbNoMuevePierna.setSelected(false);
                    IFichaSocioEcon.rbPiernaIzq.setSelected(false);
                    IFichaSocioEcon.rbPiernaDer.setSelected(false);
                    IFichaSocioEcon.cbNoMueveMano.setSelected(false);
                    IFichaSocioEcon.rbManoIzq.setSelected(false);
                    IFichaSocioEcon.rbManoDer.setSelected(false);

                    IFichaSocioEcon.rbSiAtencionMed.setSelected(true);
                    IFichaSocioEcon.rbNoAtencionMed.setSelected(false);
                    IFichaSocioEcon.rbSiTomaMed.setSelected(true);
                    IFichaSocioEcon.rbNoTomaMed.setSelected(false);
                }
                st.close();
                rs.close();

                st = conx.createStatement();
                rs = st.executeQuery("SELECT b_otroproj, s_otroproj, b_esteproj, b_otroprojnocompas, s_otroprojnocompas, b_hnoregproj, s_hnoregproj FROM Participacion WHERE c_alumno="+code);

                if (rs.next()) {
                    if (rs.getString("b_otroproj").equals("1")) {
                        IFichaSocioEcon.rbSiOtroCompassion.setSelected(true);
                        IFichaSocioEcon.rbNoOtroCompassion.setSelected(false);
                        IFichaSocioEcon.tfOtroComp.setText(rs.getString("s_otroproj"));
                        IFichaSocioEcon.tfOtroComp.setEnabled(true);
                    } else {
                        IFichaSocioEcon.rbSiOtroCompassion.setSelected(false);
                        IFichaSocioEcon.rbNoOtroCompassion.setSelected(true);
                        IFichaSocioEcon.tfOtroComp.setText("");
                        IFichaSocioEcon.tfOtroComp.setEnabled(false);
                    }
                    if (rs.getString("b_esteproj").equals("1")) {
                        IFichaSocioEcon.rbSiEsteProyecto.setSelected(true);
                        IFichaSocioEcon.rbNoEsteProyecto.setSelected(false);
                        IFichaSocioEcon.lbProjName.setText("NI-126. Marcos 10:14");
                    } else {
                        IFichaSocioEcon.rbSiEsteProyecto.setSelected(false);
                        IFichaSocioEcon.rbNoEsteProyecto.setSelected(true);
                    }
                    
                    if (rs.getString("b_otroprojnocompas").equals("1")) {
                        IFichaSocioEcon.rbSiOtroNoCompassion.setSelected(true);
                        IFichaSocioEcon.rbNoOtroNoCompassion.setSelected(false);
                        IFichaSocioEcon.tfOtroNoComp.setText(rs.getString("s_otroprojnocompas"));
                        IFichaSocioEcon.tfOtroNoComp.setEnabled(true);
                    } else {
                        IFichaSocioEcon.rbSiOtroNoCompassion.setSelected(false);
                        IFichaSocioEcon.rbNoOtroNoCompassion.setSelected(true);
                        IFichaSocioEcon.tfOtroNoComp.setText("");
                        IFichaSocioEcon.tfOtroNoComp.setEnabled(false);
                    }
                    if (rs.getString("b_hnoregproj").equals("1")) {
                        IFichaSocioEcon.rbSiHermanoRegistrado.setSelected(true);
                        IFichaSocioEcon.rbNoHermanoRegistrado.setSelected(false);
                        IFichaSocioEcon.tfHnoOtroComp.setText(rs.getString("s_hnoregproj"));
                        IFichaSocioEcon.tfHnoOtroComp.setEnabled(true);
                    } else {
                        IFichaSocioEcon.rbSiHermanoRegistrado.setSelected(false);
                        IFichaSocioEcon.rbNoHermanoRegistrado.setSelected(true);
                        IFichaSocioEcon.tfHnoOtroComp.setText("");
                        IFichaSocioEcon.tfHnoOtroComp.setEnabled(false);
                    }
                }else{
                    IFichaSocioEcon.rbSiOtroCompassion.setSelected(false);
                    IFichaSocioEcon.rbNoOtroCompassion.setSelected(true);
                    IFichaSocioEcon.tfOtroComp.setText("");
                    IFichaSocioEcon.tfOtroComp.setEnabled(false);

                    IFichaSocioEcon.rbSiEsteProyecto.setSelected(false);
                    IFichaSocioEcon.rbNoEsteProyecto.setSelected(true);
                    IFichaSocioEcon.lbProjName.setText("");

                    IFichaSocioEcon.rbSiOtroNoCompassion.setSelected(false);
                    IFichaSocioEcon.rbNoOtroNoCompassion.setSelected(true);
                    IFichaSocioEcon.tfOtroNoComp.setText("");
                    IFichaSocioEcon.tfOtroNoComp.setEnabled(false);

                    IFichaSocioEcon.rbSiHermanoRegistrado.setSelected(false);
                    IFichaSocioEcon.rbNoHermanoRegistrado.setSelected(true);
                    IFichaSocioEcon.tfHnoOtroComp.setText("");
                    IFichaSocioEcon.tfHnoOtroComp.setEnabled(false);
                    
                }
                st.close();
                rs.close();

                st = conx.createStatement();
                rs = st.executeQuery("SELECT s_observaciones FROM FichaSocioEc WHERE c_alumno="+code);

                if (rs.next()) {
                    IFichaSocioEcon.taObservaciones.setText(rs.getString("s_observaciones"));
                }else{
                    IFichaSocioEcon.taObservaciones.setText("");
                }
                st.close();
                rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }




}