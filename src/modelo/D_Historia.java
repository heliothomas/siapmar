
package modelo;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sc.Conexion;
import sc.Library;
import vista.IHistory;

public class D_Historia {

Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public boolean saveAlumno(int code,String fname,String sname,String fapel,String sapel,String fecnac,String lugNac,String sex,String dir){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (!fname.equals("") && !fecnac.equals("")) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveAlumno(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, fname);
                    ps.setString(3, sname);
                    ps.setString(4, fapel);
                    ps.setString(5, sapel);
                    ps.setString(6, fecnac);
                    ps.setString(7, lugNac);
                    ps.setInt(8, lib.getEdad(fecnac));
                    ps.setString(9, sex);
                    ps.setString(10, dir);
                    ps.setString(11, "Activo");
                    ps.setString(12, lib.getFechaActual());
                    ps.setString(13, D_Login.getNameCU());
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    public boolean saveActvCrist(int code,String actCris,String otraAct){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveActvdCrist(?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, actCris);
                    ps.setString(3, otraAct);
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public boolean saveOblig(int code,String oblig,String otraOblig){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveObligFam(?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, oblig);
                    ps.setString(3, otraOblig);
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public boolean savePasdep(int code,String pasdep,String inst,String otrapasdep){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call savePastDep(?,?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, pasdep);
                    ps.setString(3, inst);
                    ps.setString(4, otrapasdep);
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public void consultar(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IHistory.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_fname, s_sname, s_fapel, s_sapel, f_nac, s_sexo FROM Alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        String name1 = rs.getString(1);
                        String name2 = rs.getString(2);
                        String apel1 = rs.getString(3);
                        String apel2 = rs.getString(4);

                        IHistory.lbName.setText(name1+" "+name2+" "+apel1+" "+apel2);
                        IHistory.lbFecNac.setText(rs.getString(5));
                        IHistory.lbSex.setText(rs.getString(6));
                        
                        IHistory.btGuardar1.setEnabled(true);
                    }else{
                        IHistory.lbName.setText("");
                        IHistory.lbFecNac.setText("");
                        IHistory.lbSex.setText("");
                    }
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_actcris, s_otra FROM ActvdCrist WHERE c_alumno="+code);

                    if (rs.next()) {
                        String checks = rs.getString("b_actcris");
                        if ("1".equals(checks.substring(0, 1))) IHistory.cbEscDominical.setSelected(true);
                        else IHistory.cbEscDominical.setSelected(false);
                        
                        if ("1".equals(checks.substring(1, 2))) IHistory.cbSocJovenes.setSelected(true);
                        else IHistory.cbSocJovenes.setSelected(false);
                        
                        if ("1".equals(checks.substring(2, 3))) IHistory.cbClaseBib.setSelected(true);
                        else IHistory.cbClaseBib.setSelected(false);
                        
                        if ("1".equals(checks.substring(3, 4))) IHistory.cbCampamento.setSelected(true);
                        else IHistory.cbCampamento.setSelected(false);
                        
                        if ("1".equals(checks.substring(4, 5))) IHistory.cbEscBibVac.setSelected(true);
                        else IHistory.cbEscBibVac.setSelected(false);
                        
                        if ("1".equals(checks.substring(5, 6))) IHistory.cbCoro.setSelected(true);
                        else IHistory.cbCoro.setSelected(false);
                        
                        if ("1".equals(checks.substring(6, 7))) IHistory.cbOtraAct.setSelected(true);
                        else IHistory.cbOtraAct.setSelected(false);
                        
                        IHistory.tfOtraActv.setText(rs.getString("s_otra"));
                    } else {
                        IHistory.cbEscDominical.setSelected(false);
                        IHistory.cbSocJovenes.setSelected(false);
                        IHistory.cbClaseBib.setSelected(false);
                        IHistory.cbCampamento.setSelected(false);
                        IHistory.cbEscBibVac.setSelected(false);
                        IHistory.cbCoro.setSelected(false);
                        IHistory.cbOtraAct.setSelected(false);
                        IHistory.tfOtraActv.setText("");
                    }
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_oblig, s_otra FROM ObligFam WHERE c_alumno="+code);

                    if (rs.next()) {
                        String checks2 = rs.getString("b_oblig");

                        if ("1".equals(checks2.substring(0, 1))) IHistory.cbLavaRopa.setSelected(true);
                        else IHistory.cbLavaRopa.setSelected(false);
                        
                        if ("1".equals(checks2.substring(1, 2))) IHistory.cbHuerto.setSelected(true);
                        else IHistory.cbHuerto.setSelected(false);
                        
                        if ("1".equals(checks2.substring(2, 3))) IHistory.cbMandados.setSelected(true);
                        else IHistory.cbMandados.setSelected(false);
                        
                        if ("1".equals(checks2.substring(3, 4))) IHistory.cbCamas.setSelected(true);
                        else IHistory.cbCamas.setSelected(false);
                        
                        if ("1".equals(checks2.substring(4, 5))) IHistory.cbLimpieza.setSelected(true);
                        else IHistory.cbLimpieza.setSelected(false);
                        
                        if ("1".equals(checks2.substring(5, 6))) IHistory.cbCuidaAnimals.setSelected(true);
                        else IHistory.cbCuidaAnimals.setSelected(false);
                        
                        if ("1".equals(checks2.substring(6, 7))) IHistory.cbRecogeAgua.setSelected(true);
                        else IHistory.cbRecogeAgua.setSelected(false);
                        
                        if ("1".equals(checks2.substring(7, 8))) IHistory.cbCuidaNinos.setSelected(true);
                        else IHistory.cbCuidaNinos.setSelected(false);
                        
                        if ("1".equals(checks2.substring(8, 9))) IHistory.cbCostura.setSelected(true);
                        else IHistory.cbCostura.setSelected(false);
                        
                        if ("1".equals(checks2.substring(9, 10))) IHistory.cbLena.setSelected(true);
                        else IHistory.cbLena.setSelected(false);
                        
                        if ("1".equals(checks2.substring(10, 11))) IHistory.cbEnsenaOtros.setSelected(true);
                        else IHistory.cbEnsenaOtros.setSelected(false);
                        
                        if ("1".equals(checks2.substring(11, 12))) IHistory.cbCVMercado.setSelected(true);
                        else IHistory.cbCVMercado.setSelected(false);
                        
                        if ("1".equals(checks2.substring(12, 13))) IHistory.cbCocina.setSelected(true);
                        else IHistory.cbCocina.setSelected(false);
                        
                        if ("1".equals(checks2.substring(13, 14))) IHistory.cbOtraObl.setSelected(true);
                        else IHistory.cbOtraObl.setSelected(false);
                        
                        IHistory.tfOtraObl.setText(rs.getString("s_otra"));
                    } else {
                        IHistory.cbLavaRopa.setSelected(false);
                        IHistory.cbHuerto.setSelected(false);
                        IHistory.cbMandados.setSelected(false);
                        IHistory.cbCamas.setSelected(false);
                        IHistory.cbLimpieza.setSelected(false);
                        IHistory.cbCuidaAnimals.setSelected(false);
                        IHistory.cbRecogeAgua.setSelected(false);
                        IHistory.cbCuidaNinos.setSelected(false);
                        IHistory.cbCostura.setSelected(false);
                        IHistory.cbLena.setSelected(false);
                        IHistory.cbEnsenaOtros.setSelected(false);
                        IHistory.cbCVMercado.setSelected(false);
                        IHistory.cbCocina.setSelected(false);
                        IHistory.cbOtraObl.setSelected(false);
                        IHistory.tfOtraObl.setText("");
                    }
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_pastdep, s_instrumento, s_otro FROM PastDep WHERE c_alumno="+code);

                    if (rs.next()) {
                        String checks3 = rs.getString("b_pastdep");

                        if ("1".equals(checks3.substring(0, 1))) IHistory.cbMunecas.setSelected(true);
                        else IHistory.cbMunecas.setSelected(false);
                        
                        if ("1".equals(checks3.substring(1, 2))) IHistory.cbJuegosGrupo.setSelected(true);
                        else IHistory.cbJuegosGrupo.setSelected(false);
                        
                        if ("1".equals(checks3.substring(2, 3))) IHistory.cbFutbol.setSelected(true);
                        else IHistory.cbFutbol.setSelected(false);
                        
                        if ("1".equals(checks3.substring(3, 4))) IHistory.cbBicicleta.setSelected(true);
                        else IHistory.cbBicicleta.setSelected(false);
                        
                        if ("1".equals(checks3.substring(4, 5))) IHistory.cbCasita.setSelected(true);
                        else IHistory.cbCasita.setSelected(false);
                        
                        if ("1".equals(checks3.substring(5, 6))) IHistory.cbHulla.setSelected(true);
                        else IHistory.cbHulla.setSelected(false);
                        
                        if ("1".equals(checks3.substring(6, 7))) IHistory.cbBeisbol.setSelected(true);
                        else IHistory.cbBeisbol.setSelected(false);
                        
                        if ("1".equals(checks3.substring(7, 8))) IHistory.cbCaminatas.setSelected(true);
                        else IHistory.cbCaminatas.setSelected(false);
                        
                        if ("1".equals(checks3.substring(8, 9))) IHistory.cbMacateta.setSelected(true);
                        else IHistory.cbMacateta.setSelected(false);
                        
                        if ("1".equals(checks3.substring(9, 10))) IHistory.cbCanicas.setSelected(true);
                        else IHistory.cbCanicas.setSelected(false);
                        
                        if ("1".equals(checks3.substring(10, 11))) IHistory.cbBasket.setSelected(true);
                        else IHistory.cbBasket.setSelected(false);
                        
                        if ("1".equals(checks3.substring(11, 12))) IHistory.cbNadar.setSelected(true);
                        else IHistory.cbNadar.setSelected(false);
                        
                        if ("1".equals(checks3.substring(12, 13))) IHistory.cbEscondidas.setSelected(true);
                        else IHistory.cbEscondidas.setSelected(false);
                        
                        if ("1".equals(checks3.substring(13, 14))) IHistory.cbCarros.setSelected(true);
                        else IHistory.cbCarros.setSelected(false);
                        
                        if ("1".equals(checks3.substring(14, 15))) IHistory.cbVolibol.setSelected(true);
                        else IHistory.cbVolibol.setSelected(false);
                        
                        if ("1".equals(checks3.substring(15, 16))) IHistory.cbCorrer.setSelected(true);
                        else IHistory.cbCorrer.setSelected(false);
                        
                        if ("1".equals(checks3.substring(16, 17))) IHistory.cbLeer.setSelected(true);
                        else IHistory.cbLeer.setSelected(false);
                        
                        if ("1".equals(checks3.substring(17, 18))) IHistory.cbArte.setSelected(true);
                        else IHistory.cbArte.setSelected(false);
                        
                        if ("1".equals(checks3.substring(18, 19))) IHistory.cbPingPong.setSelected(true);
                        else IHistory.cbPingPong.setSelected(false);
                        
                        if ("1".equals(checks3.substring(19, 20))) IHistory.cbSaltarSoga.setSelected(true);
                        else IHistory.cbSaltarSoga.setSelected(false);
                        
                        if ("1".equals(checks3.substring(20, 21))) IHistory.cbCantar.setSelected(true);
                        else IHistory.cbCantar.setSelected(false);
                        
                        if ("1".equals(checks3.substring(21, 22))) IHistory.cbMusica.setSelected(true);
                        else IHistory.cbMusica.setSelected(false);
                        
                        if ("1".equals(checks3.substring(22, 23))) IHistory.cbJuegoPelota.setSelected(true);
                        else IHistory.cbJuegoPelota.setSelected(false);
                        
                        if ("1".equals(checks3.substring(23, 24))) IHistory.cbContarHist.setSelected(true);
                        else IHistory.cbContarHist.setSelected(false);
                        
                        if ("1".equals(checks3.substring(24, 25))) IHistory.cbMusicales.setSelected(true);
                        else IHistory.cbMusicales.setSelected(false);
                        
                        if ("1".equals(checks3.substring(25, 26))) IHistory.cbOtrosPastDep.setSelected(true);
                        else IHistory.cbOtrosPastDep.setSelected(false);
                        
                        IHistory.tfOtroInstMus.setText(rs.getString("s_instrumento"));
                        IHistory.tfOtroPasat.setText(rs.getString("s_otro"));
                    } else {
                        IHistory.cbMunecas.setSelected(false);
                        IHistory.cbJuegosGrupo.setSelected(false);
                        IHistory.cbFutbol.setSelected(false);
                        IHistory.cbBicicleta.setSelected(false);
                        IHistory.cbCasita.setSelected(false);
                        IHistory.cbHulla.setSelected(false);
                        IHistory.cbBeisbol.setSelected(false);
                        IHistory.cbCaminatas.setSelected(false);
                        IHistory.cbMacateta.setSelected(false);
                        IHistory.cbCanicas.setSelected(false);
                        IHistory.cbBasket.setSelected(false);
                        IHistory.cbNadar.setSelected(false);
                        IHistory.cbEscondidas.setSelected(false);
                        IHistory.cbCarros.setSelected(false);
                        IHistory.cbVolibol.setSelected(false);
                        IHistory.cbCorrer.setSelected(false);
                        IHistory.cbLeer.setSelected(false);
                        IHistory.cbArte.setSelected(false);
                        IHistory.cbPingPong.setSelected(false);
                        IHistory.cbPingPong.setSelected(false);
                        IHistory.cbSaltarSoga.setSelected(false);
                        IHistory.cbCantar.setSelected(false);
                        IHistory.cbMusica.setSelected(false);
                        IHistory.cbJuegoPelota.setSelected(false);
                        IHistory.cbContarHist.setSelected(false);
                        IHistory.cbMusicales.setSelected(false);
                        IHistory.cbOtrosPastDep.setSelected(false);
                        
                        IHistory.tfOtroInstMus.setText("");
                        IHistory.tfOtroPasat.setText("");
                    }
                    st.close();
                    rs.close();
                    
                    conx.close();

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public boolean saveImpedimentos(int code,String b_imped,String s_otra,String s_columna,String s_pieizq,String s_pieder,
            String s_manoizq, String s_manoder,String s_piernaizq,String s_piernader,String s_brazoizq,
            String s_brazoder,String s_elhabla,String s_oidoizq,String s_oidoder,String s_ojoizq,String s_ojoder,
            String b_recibtrat,String b_recibmedicn){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            

            if (conx != null) {

                ps = conx.prepareCall("{call saveImpedimentos(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, b_imped);
                ps.setString(3, s_otra);
                ps.setString(4, s_columna);
                ps.setString(5, s_pieizq);
                ps.setString(6, s_pieder);
                ps.setString(7, s_manoizq);
                ps.setString(8, s_manoder);
                ps.setString(9, s_piernaizq);
                ps.setString(10, s_piernader);
                ps.setString(11, s_brazoizq);
                ps.setString(12, s_brazoder);
                ps.setString(13, s_elhabla);
                ps.setString(14, s_oidoizq);
                ps.setString(15, s_oidoder);
                ps.setString(16, s_ojoizq);
                ps.setString(17, s_ojoder);
                ps.setString(18, b_recibtrat);
                ps.setString(19, b_recibmedicn);

                ps.executeUpdate();

                conx.close();
                resultado = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public void consultarImpedimentos(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IHistory.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_imped, s_otra, s_columna, s_pieizq, s_pieder, s_manoizq, "+
       "s_manoder, s_piernaizq, s_piernader, s_brazoizq, s_brazoder, "+
       "s_elhabla, s_oidoizq, s_oidoder, s_ojoizq, s_ojoder, b_recibtrat, "+
       "b_recibmedicn FROM Impedimentos WHERE c_alumno="+code);

                    if (rs.next()) {
                        String checks = rs.getString(1);

                        if ("1".equals(checks.substring(0, 1))) IHistory.cbNinguna.setSelected(true);
                        else IHistory.cbNinguna.setSelected(false);
                        
                        if ("1".equals(checks.substring(1, 2))) IHistory.cbEpilepsia.setSelected(true);
                        else IHistory.cbEpilepsia.setSelected(false);
                        
                        if ("1".equals(checks.substring(2, 3))) IHistory.cbAsma.setSelected(true);
                        else IHistory.cbAsma.setSelected(false);
                        
                        if ("1".equals(checks.substring(3, 4))) IHistory.cbPolio.setSelected(true);
                        else IHistory.cbPolio.setSelected(false);
                        
                        if ("1".equals(checks.substring(4, 5))) IHistory.cbRetardo.setSelected(true);
                        else IHistory.cbRetardo.setSelected(false);
                        
                        if ("1".equals(checks.substring(5, 6))) IHistory.cbOtra.setSelected(true);
                        else IHistory.cbOtra.setSelected(false);
                        
                        IHistory.tfOtroImped.setText(rs.getString(2));
                        IHistory.cbxColumna.setSelectedItem(rs.getString(3));
                        IHistory.cbxPieIzq.setSelectedItem(rs.getString(4));
                        IHistory.cbxPieDer.setSelectedItem(rs.getString(5));
                        IHistory.cbxManoIzq.setSelectedItem(rs.getString(6));
                        IHistory.cbxManoDer.setSelectedItem(rs.getString(7));
                        IHistory.cbxPierIzq.setSelectedItem(rs.getString(8));
                        IHistory.cbxPierDer.setSelectedItem(rs.getString(9));
                        IHistory.cbxBrazIzq.setSelectedItem(rs.getString(10));
                        IHistory.cbxBrazDer.setSelectedItem(rs.getString(11));
                        IHistory.cbxHabla.setSelectedItem(rs.getString(12));
                        IHistory.cbxOidoIzq.setSelectedItem(rs.getString(13));
                        IHistory.cbxOidoDer.setSelectedItem(rs.getString(14));
                        IHistory.cbxOjoIzq.setSelectedItem(rs.getString(15));
                        IHistory.cbxOjoDer.setSelectedItem(rs.getString(16));
                        
                        if ("Si".equals(rs.getString(17))) {
                            IHistory.rbSiTratMed.setSelected(true);
                            IHistory.rbNoTratMed.setSelected(false);
                        }
                        else {
                            IHistory.rbSiTratMed.setSelected(false);
                            IHistory.rbNoTratMed.setSelected(true);
                        }
                        
                        if ("Si".equals(rs.getString(18))) {
                            IHistory.rbSiRecMed.setSelected(true);
                            IHistory.rbNoRecMed.setSelected(false);
                        }
                        else {
                            IHistory.rbSiRecMed.setSelected(false);
                            IHistory.rbNoRecMed.setSelected(true);
                        }
                        
                    }else{
                        IHistory.cbNinguna.setSelected(false);
                        IHistory.cbEpilepsia.setSelected(false);
                        IHistory.cbAsma.setSelected(false);
                        IHistory.cbPolio.setSelected(false);
                        IHistory.cbRetardo.setSelected(false);
                        IHistory.cbOtra.setSelected(false);
                        IHistory.tfOtroImped.setText("");
                        IHistory.cbxColumna.setSelectedIndex(0);
                        IHistory.cbxPieIzq.setSelectedIndex(0);
                        IHistory.cbxPieDer.setSelectedIndex(0);
                        IHistory.cbxManoIzq.setSelectedIndex(0);
                        IHistory.cbxManoDer.setSelectedIndex(0);
                        IHistory.cbxPierIzq.setSelectedIndex(0);
                        IHistory.cbxPierDer.setSelectedIndex(0);
                        IHistory.cbxBrazIzq.setSelectedIndex(0);
                        IHistory.cbxBrazDer.setSelectedIndex(0);
                        IHistory.cbxHabla.setSelectedIndex(0);
                        IHistory.cbxOidoIzq.setSelectedIndex(0);
                        IHistory.cbxOidoDer.setSelectedIndex(0);
                        IHistory.cbxOjoIzq.setSelectedIndex(0);
                        IHistory.cbxOjoDer.setSelectedIndex(0);
                        IHistory.rbSiTratMed.setSelected(false);
                        IHistory.rbNoTratMed.setSelected(true);
                        IHistory.rbSiRecMed.setSelected(false);
                        IHistory.rbNoRecMed.setSelected(true);
                        
                    }
                    st.close();
                    rs.close();
                    conx.close();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }

    public boolean saveEstudios(int code,int asist,String razon,String nivelAcad,int anioAcad,
            String v_levelEU,int v_nivVocac,String s_vocac,int v_nivAprndz,String s_aprndz,int v_nivUniv,String s_carUniv,
            int v_nivOtro,String s_otro,String s_rendim,String s_mejorMat,String f_secund,String s_secund,
            String f_univ,String s_carrUniv,String f_escuelaBib,String s_cursoBib,String f_vocac,String s_cursoVocac,
            String f_otroCurso,String s_otroCurso){

        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {

                ps = conx.prepareCall("{call saveEstudios(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setInt(2, asist);
                ps.setString(3, razon);
                ps.setString(4, nivelAcad);
                ps.setInt(5, anioAcad);
                ps.setString(6, v_levelEU);
                ps.setInt(7, v_nivVocac);
                ps.setString(8, s_vocac);
                ps.setInt(9, v_nivAprndz);
                ps.setString(10, s_aprndz);
                ps.setInt(11, v_nivUniv);
                ps.setString(12, s_carUniv);
                ps.setInt(13, v_nivOtro);
                ps.setString(14, s_otro);
                ps.setString(15, s_rendim);
                ps.setString(16, s_mejorMat);
                ps.setString(17, f_secund);
                ps.setString(18, s_secund);
                ps.setString(19, f_univ);
                ps.setString(20, s_carrUniv);
                ps.setString(21, f_escuelaBib);
                ps.setString(22, s_cursoBib);
                ps.setString(23, f_vocac);
                ps.setString(24, s_cursoVocac);
                ps.setString(25, f_otroCurso);
                ps.setString(26, s_otroCurso);

                ps.executeUpdate();

                conx.close();
                resultado = true;
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public boolean updateEstudios(int code,String s_rendim,String s_mejorMat,String f_secund,String s_secund,
            String f_univ,String s_carrUniv,String f_escuelaBib,String s_cursoBib,String f_vocac,String s_cursoVocac,
            String f_otroCurso,String s_otroCurso){

        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {

                ps = conx.prepareCall("{call updateEstudios(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, code);
                ps.setString(2, s_rendim);
                ps.setString(3, s_mejorMat);
                ps.setString(4, f_secund);
                ps.setString(5, s_secund);
                ps.setString(6, f_univ);
                ps.setString(7, s_carrUniv);
                ps.setString(8, f_escuelaBib);
                ps.setString(9, s_cursoBib);
                ps.setString(10, f_vocac);
                ps.setString(11, s_cursoVocac);
                ps.setString(12, f_otroCurso);
                ps.setString(13, s_otroCurso);

                ps.executeUpdate();

                conx.close();
                resultado = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    public void consultarEstudios(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IHistory.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_asist, s_razon, s_nivelAcad, v_anioAcad, s_levelEU, "+
       "v_nivVocac, s_vocac, v_nivAprndz, s_aprndz, v_nivUniv, s_carUniv, "+
       "v_nivOtro, s_otro, s_rendim, s_mejorMat, f_secund, s_secund, "+
       "f_univ, s_carrUniv, f_escuelaBib, s_cursoBib, f_vocac, s_cursoVocac, "+
       "f_otroCurso, s_otroCurso FROM Estudios WHERE c_alumno="+code);

                    if (rs.next()) {
                        int asiste = rs.getInt("b_asist");

                        if (asiste==1) {
                            IHistory.rbSiAsisteEsc.setSelected(true);
                            //IHistory.rbNoAsisteEsc.setSelected(false);
                            asisteEscuela();
                        } else {
                            //IHistory.rbSiAsisteEsc.setSelected(false);
                            IHistory.rbNoAsisteEsc.setSelected(true);
                            asisteEscuela();
                        }
                        
                        String razon = rs.getString("s_razon");
                        if (!"".equals(razon)) {
                            if (!"Es menor de edad".equals(razon)||!"La escuela está lejos".equals(razon)||!"Por falta de recursos".equals(razon)) {
                            IHistory.cbxRazon.setModel(new javax.swing.DefaultComboBoxModel(
                                new String[] { "Es menor de edad","La escuela está lejos","Por falta de recursos","Otra razón"}
                            ));
                            IHistory.cbxRazon.setSelectedItem("Otra razón");
                            IHistory.tfOtraRazon.setText(razon);
                            } else {
                                IHistory.cbxRazon.setSelectedItem(razon);
                                IHistory.tfOtraRazon.setText("");
                            }
                        }else{
                            IHistory.cbxRazon.setSelectedItem("");
                        }
                        
                        String nivelAcad = rs.getString("s_nivelAcad");
                        String anio = rs.getString("v_anioAcad");
                        
                        if (!"".equals(nivelAcad)) {
                            if ("Pre-Kinder".equals(nivelAcad)) {
                                IHistory.cbxNPreKinder.setSelectedItem(anio);
                            }
                            if ("Kindergarden".equals(nivelAcad)) {
                                IHistory.cbxNKinder.setSelectedItem(anio);
                            }
                            if ("Primaria".equals(nivelAcad)) {
                                IHistory.cbxNPrimaria.setSelectedItem(anio);
                            }
                            if ("Básico".equals(nivelAcad)) {
                                IHistory.cbxNBasico.setSelectedItem(anio);
                            }
                            if ("Secundaria".equals(nivelAcad)) {
                                IHistory.cbxNSecundaria.setSelectedItem(anio);
                            }
                        }
                        
                        IHistory.cbxNVocac.setSelectedItem(rs.getString("v_nivVocac"));
                        IHistory.tfCEVocac.setText(rs.getString("s_vocac"));
                        IHistory.cbxNAprez.setSelectedItem(rs.getString("v_nivAprndz"));
                        IHistory.tfCEAprez.setText(rs.getString("s_aprndz"));
                        IHistory.cbxNUniv.setSelectedItem(rs.getString("v_nivUniv"));
                        IHistory.tfCEUniv.setText(rs.getString("s_carUniv"));
                        IHistory.cbxNOtro.setSelectedItem(rs.getString("v_nivOtro"));
                        IHistory.tfCEOtro.setText(rs.getString("s_otro"));
                        
                        String rend = rs.getString("s_rendim");
                        if ("Bajo".equals(rend)){
                            IHistory.rbRendEscBajo.setSelected(true);
                            IHistory.rbRendEscPro.setSelected(false);
                            IHistory.rbRendEscSob.setSelected(false);
                        }
                        if ("Promedio".equals(rend)){
                            IHistory.rbRendEscBajo.setSelected(false);
                            IHistory.rbRendEscPro.setSelected(true);
                            IHistory.rbRendEscSob.setSelected(false);
                        }
                        if ("Sobre".equals(rend)){
                            IHistory.rbRendEscBajo.setSelected(false);
                            IHistory.rbRendEscPro.setSelected(false);
                            IHistory.rbRendEscSob.setSelected(true);
                        }
                        
                        String materia = rs.getString("s_mejorMat");
                        IHistory.cbxMateria.setSelectedItem(materia);

                        ((JTextField)IHistory.datecSec.getDateEditor().getUiComponent()).setText(rs.getString("f_secund"));
                        IHistory.tfCESec.setText(rs.getString("s_secund"));
                        ((JTextField)IHistory.datecUniv.getDateEditor().getUiComponent()).setText(rs.getString("f_univ"));
                        IHistory.tfCEUniv2.setText(rs.getString("s_carrUniv"));
                        ((JTextField)IHistory.datecBib.getDateEditor().getUiComponent()).setText(rs.getString("f_escuelaBib"));
                        IHistory.tfCEBib.setText(rs.getString("s_cursoBib"));
                        ((JTextField)IHistory.datecVoc.getDateEditor().getUiComponent()).setText(rs.getString("f_vocac"));
                        IHistory.tfCEVocac2.setText(rs.getString("s_cursoVocac"));
                        ((JTextField)IHistory.datecOtro.getDateEditor().getUiComponent()).setText(rs.getString("f_otroCurso"));
                        IHistory.tfCEOtro2.setText(rs.getString("s_otroCurso"));

                    }else{
                        IHistory.rbSiAsisteEsc.setSelected(true);
                        IHistory.rbNoAsisteEsc.setSelected(false);
                        IHistory.cbxRazon.setSelectedItem("");
                        IHistory.tfOtraRazon.setText("");
                        IHistory.cbxNPreKinder.setSelectedIndex(0);
                        IHistory.cbxNKinder.setSelectedIndex(0);
                        IHistory.cbxNPrimaria.setSelectedIndex(0);
                        IHistory.cbxNBasico.setSelectedIndex(0);
                        IHistory.cbxNSecundaria.setSelectedIndex(0);
                        IHistory.cbxNVocac.setSelectedIndex(0);
                        IHistory.tfCEVocac.setText("");
                        IHistory.cbxNAprez.setSelectedIndex(0);
                        IHistory.tfCEAprez.setText("");
                        IHistory.cbxNUniv.setSelectedIndex(0);
                        IHistory.tfCEUniv.setText("");
                        IHistory.cbxNOtro.setSelectedIndex(0);
                        IHistory.tfCEOtro.setText("");
                        
                        IHistory.rbRendEscBajo.setSelected(true);
                        IHistory.rbRendEscPro.setSelected(false);
                        IHistory.rbRendEscSob.setSelected(false);
                        IHistory.cbxMateria.setSelectedIndex(0);
                        ((JTextField)IHistory.datecSec.getDateEditor().getUiComponent()).setText("");
                        IHistory.tfCESec.setText("");
                        ((JTextField)IHistory.datecUniv.getDateEditor().getUiComponent()).setText("");
                        IHistory.tfCEUniv2.setText("");
                        ((JTextField)IHistory.datecBib.getDateEditor().getUiComponent()).setText("");
                        IHistory.tfCEBib.setText("");
                        ((JTextField)IHistory.datecVoc.getDateEditor().getUiComponent()).setText("");
                        IHistory.tfCEVocac2.setText("");
                        ((JTextField)IHistory.datecOtro.getDateEditor().getUiComponent()).setText("");
                        IHistory.tfCEOtro2.setText("");
                    }
                    st.close();
                    rs.close();
                    conx.close();
                }
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void asisteEscuela(){
        if ("1".equals(IHistory.bgAsisteEscuela.getSelection().getActionCommand())) {
            IHistory.cbxRazon.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] { ""}
            ));
            IHistory.cbxRazon.setEnabled(false);
            IHistory.tfOtraRazon.setText("");
            IHistory.tfOtraRazon.setEditable(false);
            
            IHistory.cbxNPreKinder.setEnabled(true);
            IHistory.cbxNKinder.setEnabled(true);
            IHistory.cbxNPrimaria.setEnabled(true);
            IHistory.cbxNBasico.setEnabled(true);
            IHistory.cbxNSecundaria.setEnabled(true);
            
        } else {
            IHistory.cbxRazon.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] { "Es menor de edad","La escuela está lejos","Por falta de recursos","Otra razón"}
            ));
            IHistory.cbxRazon.setEnabled(true);
            IHistory.rbNoAsisteEsc.transferFocus();
            IHistory.cbxRazon.setSelectedIndex(0);
            IHistory.cbxNPreKinder.setSelectedIndex(0);
            IHistory.cbxNPreKinder.setEnabled(false);
            IHistory.cbxNKinder.setSelectedIndex(0);
            IHistory.cbxNKinder.setEnabled(false);
            IHistory.cbxNPrimaria.setSelectedIndex(0);
            IHistory.cbxNPrimaria.setEnabled(false);
            IHistory.cbxNBasico.setSelectedIndex(0);
            IHistory.cbxNBasico.setEnabled(false);
            IHistory.cbxNSecundaria.setSelectedIndex(0);
            IHistory.cbxNSecundaria.setEnabled(false);
        }
    }
   
    public boolean saveTutela(int code,String checks,String b_tutores){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveTutela(?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, checks);
                    ps.setString(3, b_tutores);
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public boolean savePadresNaturales(int code,String s_juntos,String s_eCivil){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call savePadresNat(?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, s_juntos);
                    ps.setString(3, s_eCivil);
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    public boolean savePadreNat(int code,String b_vivo,String b_viveConNino,String b_contribuyFinc,String b_impedimento,String s_impedimento,String b_cronicoEnf,String s_cronicoEnf,String b_mentalEnf,String b_enCarcel){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call savePadreNat(?,?,?,?,?,?,?,?,?,?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, b_vivo);
                    ps.setString(3, b_viveConNino);
                    ps.setString(4, b_contribuyFinc);
                    ps.setString(5, b_impedimento);
                    ps.setString(6, s_impedimento);
                    ps.setString(7, b_cronicoEnf);
                    ps.setString(8, s_cronicoEnf);
                    ps.setString(9, b_mentalEnf);
                    ps.setString(10, b_enCarcel);
                    ps.setString(11, lib.getFechaActual());
                    ps.setString(12, "usuario");//capturar el usuario
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return resultado;
    }

    public boolean saveMadreNat(int code,String b_vivo,String b_viveConNino,String b_contribuyFinc,String b_impedimento,String s_impedimento,String b_cronicoEnf,String s_cronicoEnf,String b_mentalEnf,String b_enCarcel){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveMadreNat(?,?,?,?,?,?,?,?,?,?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, b_vivo);
                    ps.setString(3, b_viveConNino);
                    ps.setString(4, b_contribuyFinc);
                    ps.setString(5, b_impedimento);
                    ps.setString(6, s_impedimento);
                    ps.setString(7, b_cronicoEnf);
                    ps.setString(8, s_cronicoEnf);
                    ps.setString(9, b_mentalEnf);
                    ps.setString(10, b_enCarcel);
                    ps.setString(11, lib.getFechaActual());
                    ps.setString(12, "usuario");//capturar el usuario
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return resultado;
    }
    
    public void consultarTutela(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IHistory.lbCode.getText())) {
                if (conx != null) {
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_opciones,b_tutores FROM tutela WHERE c_alumno="+code);

                    if (rs.next()) {
                        
                        String checks = rs.getString("b_opciones");
                        
                        String a = checks.substring(0, 1);
                        String b = checks.substring(1, 2);
                        String c = checks.substring(2, 3);
                        
                        if (a.equals("1")){
                            IHistory.cbTutelaMasculina.setSelected(true);
                            //IHistory.cbTutelaAjena.setSelected(false);
                        }
                        else IHistory.cbTutelaMasculina.setSelected(false);
                        
                        if (b.equals("1")){
                            IHistory.cbTutelaFemenina.setSelected(true);
                            //IHistory.cbTutelaAjena.setSelected(false);
                        }
                        else IHistory.cbTutelaFemenina.setSelected(false);
                        
                        if (c.equals("1")){
                            IHistory.cbTutelaAjena.setSelected(true);
                            //IHistory.cbTutelaMasculina.setSelected(false);
                            //IHistory.cbTutelaFemenina.setSelected(false);
                        }
                        else IHistory.cbTutelaAjena.setSelected(false);
                        
                        String tutela = rs.getString("b_tutores");
                        String[] x = tutela.split(",");
                        
                        if (x[0].equals("")||x[0].equals("nada")) {
                            IHistory.cbTutelaMasculina.setSelected(false);
                            IHistory.cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
                                new String[] { ""}
                            ));
                        }else{
                            IHistory.cbTutelaMasculina.setSelected(true);
                            IHistory.cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
                                new String[] { "Padre","Hermano","Padrastro","Tío","Abuelo","Padrino"}
                            ));
                            IHistory.cbxTutorMasc.setSelectedItem(x[0]);
                        }
                        
                        if (x[1].equals("")||x[1].equals("nada")) {
                            IHistory.cbTutelaFemenina.setSelected(false);
                            IHistory.cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
                                new String[] { ""}
                            ));
                        }else{
                            IHistory.cbTutelaFemenina.setSelected(true);
                            IHistory.cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
                                new String[] { "Madre","Hermana","Madrastra","Tía","Abuela","Madrina"}
                            ));
                            IHistory.cbxTutorFem.setSelectedItem(x[1]);
                        }
                        
                        if (x[2].equals("")||x[2].equals("nada")) {
                            IHistory.cbTutelaAjena.setSelected(false);
                            IHistory.cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
                                new String[] { ""}
                            ));
                        }else{
                            IHistory.cbTutelaAjena.setSelected(true);
                            IHistory.cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
                                new String[] { "Amigos","Trabajadores institucionales","Padres adoptivos","Otros parientes"}
                            ));
                            IHistory.cbxTutorAjeno.setSelectedItem(x[2]);
                        }
                    }else{
                        IHistory.cbTutelaMasculina.setSelected(true);
                        IHistory.cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
                            new String[] { "Padre","Hermano","Padrastro","Tío","Abuelo","Padrino"}
                        ));
                        IHistory.cbxTutorMasc.setSelectedItem("Padre");
                        IHistory.cbTutelaFemenina.setSelected(true);
                        IHistory.cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
                            new String[] { "Madre","Hermana","Madrastra","Tía","Abuela","Madrina"}
                        ));
                        IHistory.cbxTutorFem.setSelectedItem("Madre");
                        IHistory.cbTutelaAjena.setSelected(false);
                        IHistory.cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
                            new String[] { ""}
                        ));
                    }
                    st.close();
                    rs.close();
                    conx.close();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void consultarECivil(int codigo){
        try {
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_juntos, s_ecivil FROM PadresNat WHERE c_alumno="+codigo);

                    if (rs.next()) {
                        String juntos = rs.getString("s_juntos");
                        
                        if (juntos.equals("Si")){
                             IHistory.rbJuntoSi.setSelected(true);
                             IHistory.rbJuntoNo.setSelected(false);
                             IHistory.rbJuntoDesco.setSelected(false);
                        }
                        if (juntos.equals("No")){
                            IHistory.rbJuntoNo.setSelected(true);
                            IHistory.rbJuntoSi.setSelected(false);
                            IHistory.rbJuntoDesco.setSelected(false);
                        }
                        if (juntos.equals("Desconocido")){
                            IHistory.rbJuntoDesco.setSelected(true);
                            IHistory.rbJuntoSi.setSelected(false);
                            IHistory.rbJuntoNo.setSelected(false);
                        }
                        
                        String ecivil = rs.getString("s_ecivil");
                        if (ecivil.equals("Casados")) {
                            IHistory.cbxECivil.setSelectedIndex(0);
                        }
                        if (ecivil.equals("Unidos")) {
                            IHistory.cbxECivil.setSelectedIndex(1);
                        }
                        if (ecivil.equals("Divorciados")) {
                            IHistory.cbxECivil.setSelectedIndex(2);
                        }
                        if (ecivil.equals("Viuda(o)")) {
                            IHistory.cbxECivil.setSelectedIndex(3);
                        }
                        if (ecivil.equals("Desconocido")) {
                            IHistory.cbxECivil.setSelectedIndex(4);
                        }
                        
                    }else{
                        IHistory.rbJuntoSi.setSelected(true);
                        IHistory.rbJuntoNo.setSelected(false);
                        IHistory.rbJuntoDesco.setSelected(false);
                        IHistory.cbxECivil.setSelectedIndex(0);
                    }
                    st.close();
                    rs.close();
                    conx.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void consultarPadreNat(int code){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_vivo,b_viveconnino,b_contribuyfinc,b_impedimento,s_impedimento,b_cronicoenf,s_cronicoenf,b_mentalenf,b_encarcel FROM PadreNat WHERE c_alumno="+code);

                    if (rs.next()) {
                        String vivo = rs.getString("b_vivo");
                        
                        if (vivo.equals("No")) {
                            IHistory.cbxPEmpleo.setSelectedIndex(3);
                            IHistory.cbxPEmpleo.setEnabled(false);
                        } else {
                            IHistory.cbxPEmpleo.setSelectedIndex(0);
                            IHistory.cbxPEmpleo.setEnabled(true);
                        }
                        String vivecnino = rs.getString("b_viveconnino");
                        String finz = rs.getString("b_contribuyfinc");
                        String bImp = rs.getString("b_impedimento");
                        String impedimento = rs.getString("s_impedimento");
                        String bCro = rs.getString("b_cronicoenf");
                        String cronicoEnf = rs.getString("s_cronicoenf");
                        String bEnfMental = rs.getString("b_mentalenf");
                        String bCarcel = rs.getString("b_encarcel");
                        
                        if (vivo.equals("Si")) {
                            IHistory.cbxPadreVivo.setSelectedIndex(0);
                        }
                        if (vivo.equals("No") ) {
                            IHistory.cbxPadreVivo.setSelectedIndex(1);
                        }
                        if (vivo.equals("Desconocido")) {
                            IHistory.cbxPadreVivo.setSelectedIndex(2);
                        }
                        
                        IHistory.cbxPcNino.setSelectedItem(vivecnino);
                        IHistory.cbxPFinanz.setSelectedItem(finz);
                        IHistory.cbxPImpd.setSelectedItem(bImp);
                        IHistory.tfPCImpd.setText(impedimento);
                        IHistory.cbxPCrEnf.setSelectedItem(bCro);
                        IHistory.tfPCrEnf.setText(cronicoEnf);
                        IHistory.cbxPMentEnf.setSelectedItem(bEnfMental);
                        IHistory.cbxPCarc.setSelectedItem(bCarcel);
                    }else{
                        IHistory.cbxPadreVivo.setSelectedItem("Si");
                        IHistory.cbxPcNino.setSelectedItem("Si");
                        IHistory.cbxPFinanz.setSelectedItem("Si");
                        IHistory.cbxPImpd.setSelectedItem("No");
                        IHistory.tfPCImpd.setText("");
                        IHistory.cbxPCrEnf.setSelectedItem("No");
                        IHistory.tfPCrEnf.setText("");
                        IHistory.cbxPMentEnf.setSelectedItem("No");
                        IHistory.cbxPCarc.setSelectedItem("No");
                    }
                    st.close();
                    rs.close();
                    conx.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void consultarMadreNat(int code){
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_vivo,b_viveconnino,b_contribuyfinc,b_impedimento,s_impedimento,b_cronicoenf,s_cronicoenf,b_mentalenf,b_encarcel FROM MadreNat WHERE c_alumno="+code);

                    if (rs.next()) {
                        String viva = rs.getString("b_vivo");
                        
                        if (viva.equals("No")) {
                            IHistory.cbxMEmpleo.setSelectedIndex(3);
                            IHistory.cbxMEmpleo.setEnabled(false);
                        } else {
                            IHistory.cbxMEmpleo.setSelectedIndex(0);
                            IHistory.cbxMEmpleo.setEnabled(true);
                        }
                        
                        String mvivecnino = rs.getString("b_viveconnino");
                        String mfinz = rs.getString("b_contribuyfinc");
                        String mbImp = rs.getString("b_impedimento");
                        String mimpedimento = rs.getString("s_impedimento");
                        String mbCro = rs.getString("b_cronicoenf");
                        String mcronicoEnf = rs.getString("s_cronicoenf");
                        String mbEnfMental = rs.getString("b_mentalenf");
                        String mbCarcel = rs.getString("b_encarcel");
                        
                        if (viva.equals("Si")) {
                            IHistory.cbxMadreViva.setSelectedIndex(0);
                        }
                        if (viva.equals("No") ) {
                            IHistory.cbxMadreViva.setSelectedIndex(1);
                        }
                        if (viva.equals("Desconocido")) {
                            IHistory.cbxMadreViva.setSelectedIndex(2);
                        }
                        
                        IHistory.cbxMcNino.setSelectedItem(mvivecnino);
                        IHistory.cbxMFinanz.setSelectedItem(mfinz);
                        IHistory.cbxMImpd.setSelectedItem(mbImp);
                        IHistory.tfMCImpd.setText(mimpedimento);
                        IHistory.cbxMCrEnf.setSelectedItem(mbCro);
                        IHistory.tfMCrEnf.setText(mcronicoEnf);
                        IHistory.cbxMMentEnf.setSelectedItem(mbEnfMental);
                        IHistory.cbxMCarc.setSelectedItem(mbCarcel);
                    }else{
                        IHistory.cbxMadreViva.setSelectedItem("Si");
                        IHistory.cbxMcNino.setSelectedItem("Si");
                        IHistory.cbxMFinanz.setSelectedItem("Si");
                        IHistory.cbxMImpd.setSelectedItem("No");
                        IHistory.tfMCImpd.setText("");
                        IHistory.cbxMCrEnf.setSelectedItem("No");
                        IHistory.tfMCrEnf.setText("");
                        IHistory.cbxMMentEnf.setSelectedItem("No");
                        IHistory.cbxMCarc.setSelectedItem("No");
                    }
                    st.close();
                    rs.close();
                    conx.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public boolean saveEmpleoTutor(int code,String b_tipoEmpleos,String b_oficios,String s_obrero,String s_otroEmpleo){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveEmpleoTutor(?,?,?,?,?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, b_tipoEmpleos);
                    ps.setString(3, b_oficios);
                    ps.setString(4, s_obrero);
                    ps.setString(5, s_otroEmpleo);
                    ps.setString(6, lib.getFechaActual());
                    ps.setString(7, "usuario");//capturar el usuario
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return resultado;
    }

    public boolean saveEmpleoTutora(int code,String b_tipoEmpleos,String b_oficios,String s_obrero,String s_otroEmpleo){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveEmpleoTutora(?,?,?,?,?,?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, b_tipoEmpleos);
                    ps.setString(3, b_oficios);
                    ps.setString(4, s_obrero);
                    ps.setString(5, s_otroEmpleo);
                    ps.setString(6, lib.getFechaActual());
                    ps.setString(7, "usuario");//capturar el usuario
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return resultado;
    }
    
    public boolean updatePadresNat(int code,int v_numHijos, int v_numHijas,String s_hno1Reg, String s_hno2Reg){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call updatePadresNat(?,?,?,?,?,?,?)}");
                    ps.setInt(1, code);
                    ps.setInt(2, v_numHijos);
                    ps.setInt(3, v_numHijas);
                    ps.setString(4, s_hno1Reg);
                    ps.setString(5, s_hno2Reg);
                    ps.setString(6, lib.getFechaActual());
                    ps.setString(7, "usuario");
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return resultado;
    }
    
    public boolean saveHistoria(int code,String comentarios){
        boolean resultado = false;

        try {
            conx = Conexion.getSQLConnection();
            
            if (code != 0) {
                if (conx != null) {

                    ps = conx.prepareCall("{call saveHistoria(?,?)}");
                    ps.setInt(1, code);
                    ps.setString(2, comentarios);
                    
                    ps.executeUpdate();
                    
                    conx.close();
                    resultado = true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return resultado;
    }
    
    public void consultarUltPag(int code){
        try {
            conx = null;
            conx = Conexion.getSQLConnection();

            if (!"".equals(IHistory.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_tipoempleos, b_oficios, s_obrero, s_otroempleo FROM empleotutor WHERE c_alumno="+code);

                    if (rs.next()) {
                        IHistory.cbxPEmpleo.setSelectedItem(rs.getString("b_tipoempleos"));
                        String checksPad = rs.getString("b_oficios");
                        if ("1".equals(checksPad.substring(0, 1))) IHistory.cbPAgri.setSelected(true);
                        else IHistory.cbPAgri.setSelected(false);
                        if ("1".equals(checksPad.substring(1, 2))) IHistory.cbPMerc.setSelected(true);
                        else IHistory.cbPMerc.setSelected(false);
                        if ("1".equals(checksPad.substring(2, 3))) IHistory.cbPIgl.setSelected(true);
                        else IHistory.cbPIgl.setSelected(false);
                        if ("1".equals(checksPad.substring(3, 4))) IHistory.cbPProj.setSelected(true);
                        else IHistory.cbPProj.setSelected(false);
                        if ("1".equals(checksPad.substring(4, 5))) IHistory.cbPMaes.setSelected(true);
                        else IHistory.cbPMaes.setSelected(false);
                        if ("1".equals(checksPad.substring(5, 6))) IHistory.cbPObr.setSelected(true);
                        else IHistory.cbPObr.setSelected(false);
                        if ("1".equals(checksPad.substring(6, 7))) IHistory.cbPOtro.setSelected(true);
                        else IHistory.cbPOtro.setSelected(false);
                        
                        IHistory.tfPObr.setText(rs.getString("s_obrero"));
                        IHistory.tfPOtro.setText(rs.getString("s_otroempleo"));
                    }else{
                        IHistory.cbPAgri.setSelected(false);
                        IHistory.cbPMerc.setSelected(false);
                        IHistory.cbPIgl.setSelected(false);
                        IHistory.cbPProj.setSelected(false);
                        IHistory.cbPMaes.setSelected(false);
                        IHistory.cbPObr.setSelected(false);
                        IHistory.cbPOtro.setSelected(false);
                        IHistory.tfPObr.setText("");
                        IHistory.tfPOtro.setText("");
                    }
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT b_tipoempleos, b_oficios, s_obrero, s_otroempleo FROM empleotutora WHERE c_alumno="+code);

                    if (rs.next()) {
                        IHistory.cbxMEmpleo.setSelectedItem(rs.getString("b_tipoempleos"));
                        String checksMad = rs.getString("b_oficios");
                        if ("1".equals(checksMad.substring(0, 1))) IHistory.cbMAgri.setSelected(true);
                        else IHistory.cbMAgri.setSelected(false);
                        if ("1".equals(checksMad.substring(1, 2))) IHistory.cbMMerc.setSelected(true);
                        else IHistory.cbMMerc.setSelected(false);
                        if ("1".equals(checksMad.substring(2, 3))) IHistory.cbMIgl.setSelected(true);
                        else IHistory.cbMIgl.setSelected(false);
                        if ("1".equals(checksMad.substring(3, 4))) IHistory.cbMProj.setSelected(true);
                        else IHistory.cbMProj.setSelected(false);
                        if ("1".equals(checksMad.substring(4, 5))) IHistory.cbMMaes.setSelected(true);
                        else IHistory.cbMMaes.setSelected(false);
                        if ("1".equals(checksMad.substring(5, 6))) IHistory.cbMObr.setSelected(true);
                        else IHistory.cbMObr.setSelected(false);
                        if ("1".equals(checksMad.substring(6, 7))) IHistory.cbMOtro.setSelected(true);
                        else IHistory.cbMOtro.setSelected(false);
                        
                        IHistory.tfMObr.setText(rs.getString("s_obrero"));
                        IHistory.tfMOtro.setText(rs.getString("s_otroempleo"));
                    }else{
                        IHistory.cbMAgri.setSelected(false);
                        IHistory.cbMMerc.setSelected(false);
                        IHistory.cbMIgl.setSelected(false);
                        IHistory.cbMProj.setSelected(false);
                        IHistory.cbMMaes.setSelected(false);
                        IHistory.cbMObr.setSelected(false);
                        IHistory.cbMOtro.setSelected(false);
                        IHistory.tfMObr.setText("");
                        IHistory.tfMOtro.setText("");
                    }
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT v_numhijos,v_numhijas,s_hno1reg,s_hno2reg FROM padresnat WHERE c_alumno="+code);

                    IHistory.lbNHijos.setText("0");
                    IHistory.lbNHijas.setText("0");
                    IHistory.lbPHno.setText("");
                    IHistory.lbSHno.setText("");
                    
                    if (rs.next()) {
                        String nhijos = rs.getString("v_numhijos");
                        String nhijas = rs.getString("v_numhijas");
                        
                        if (nhijos.equals("") || nhijos == null) {
                            nhijos = "0";
                        }
                        if (nhijas.equals("") || nhijas == null) {
                            nhijas = "0";
                        }
                        
                        IHistory.lbNHijos.setText(nhijos);
                        IHistory.lbNHijas.setText(nhijas);
                        IHistory.lbPHno.setText(rs.getString("s_hno1reg"));
                        IHistory.lbSHno.setText(rs.getString("s_hno2reg"));
                    }else{
                        IHistory.lbNHijos.setText("0");
                        IHistory.lbNHijas.setText("0");
                        IHistory.lbPHno.setText("");
                        IHistory.lbSHno.setText("");
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT s_comentarios FROM Historia WHERE c_alumno="+code);
                    
                    IHistory.taComentarios.setText("");
                    
                    if (rs.next()){
                        IHistory.taComentarios.setText(rs.getString("s_comentarios"));
                    }
                    else IHistory.taComentarios.setText("");
                    
                    st.close();
                    rs.close();
                    conx.close();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public static void LimpiarTodo(){
        IHistory.lbName.setText("");
        IHistory.lbFecNac.setText("");
        IHistory.lbSex.setText("");
        
        IHistory.cbEscDominical.setSelected(false);
        IHistory.cbSocJovenes.setSelected(false);
        IHistory.cbClaseBib.setSelected(false);
        IHistory.cbCampamento.setSelected(false);
        IHistory.cbEscBibVac.setSelected(false);
        IHistory.cbCoro.setSelected(false);
        IHistory.cbOtraAct.setSelected(false);
        IHistory.tfOtraActv.setText("");
        
        IHistory.cbLavaRopa.setSelected(false);
        IHistory.cbHuerto.setSelected(false);
        IHistory.cbMandados.setSelected(false);
        IHistory.cbCamas.setSelected(false);
        IHistory.cbLimpieza.setSelected(false);
        IHistory.cbCuidaAnimals.setSelected(false);
        IHistory.cbRecogeAgua.setSelected(false);
        IHistory.cbCuidaNinos.setSelected(false);
        IHistory.cbCostura.setSelected(false);
        IHistory.cbLena.setSelected(false);
        IHistory.cbEnsenaOtros.setSelected(false);
        IHistory.cbCVMercado.setSelected(false);
        IHistory.cbCocina.setSelected(false);
        IHistory.cbOtraObl.setSelected(false);
        IHistory.tfOtraObl.setText("");
                        
        IHistory.cbMunecas.setSelected(false);
        IHistory.cbJuegosGrupo.setSelected(false);
        IHistory.cbFutbol.setSelected(false);
        IHistory.cbBicicleta.setSelected(false);
        IHistory.cbCasita.setSelected(false);
        IHistory.cbHulla.setSelected(false);
        IHistory.cbBeisbol.setSelected(false);
        IHistory.cbCaminatas.setSelected(false);
        IHistory.cbMacateta.setSelected(false);
        IHistory.cbCanicas.setSelected(false);
        IHistory.cbBasket.setSelected(false);
        IHistory.cbNadar.setSelected(false);
        IHistory.cbEscondidas.setSelected(false);
        IHistory.cbCarros.setSelected(false);
        IHistory.cbVolibol.setSelected(false);
        IHistory.cbCorrer.setSelected(false);
        IHistory.cbLeer.setSelected(false);
        IHistory.cbArte.setSelected(false);
        IHistory.cbPingPong.setSelected(false);
        IHistory.cbPingPong.setSelected(false);
        IHistory.cbSaltarSoga.setSelected(false);
        IHistory.cbCantar.setSelected(false);
        IHistory.cbMusica.setSelected(false);
        IHistory.cbJuegoPelota.setSelected(false);
        IHistory.cbContarHist.setSelected(false);
        IHistory.cbMusicales.setSelected(false);
        IHistory.cbOtrosPastDep.setSelected(false);

        IHistory.tfOtroInstMus.setText("");
        IHistory.tfOtroPasat.setText("");

        IHistory.cbNinguna.setSelected(false);
        IHistory.cbEpilepsia.setSelected(false);
        IHistory.cbAsma.setSelected(false);
        IHistory.cbPolio.setSelected(false);
        IHistory.cbRetardo.setSelected(false);
        IHistory.cbOtra.setSelected(false);
        IHistory.tfOtroImped.setText("");
        IHistory.cbxColumna.setSelectedIndex(0);
        IHistory.cbxPieIzq.setSelectedIndex(0);
        IHistory.cbxPieDer.setSelectedIndex(0);
        IHistory.cbxManoIzq.setSelectedIndex(0);
        IHistory.cbxManoDer.setSelectedIndex(0);
        IHistory.cbxPierIzq.setSelectedIndex(0);
        IHistory.cbxPierDer.setSelectedIndex(0);
        IHistory.cbxBrazIzq.setSelectedIndex(0);
        IHistory.cbxBrazDer.setSelectedIndex(0);
        IHistory.cbxHabla.setSelectedIndex(0);
        IHistory.cbxOidoIzq.setSelectedIndex(0);
        IHistory.cbxOidoDer.setSelectedIndex(0);
        IHistory.cbxOjoIzq.setSelectedIndex(0);
        IHistory.cbxOjoDer.setSelectedIndex(0);
        IHistory.rbSiTratMed.setSelected(false);
        IHistory.rbNoTratMed.setSelected(true);
        IHistory.rbSiRecMed.setSelected(false);
        IHistory.rbNoRecMed.setSelected(true);
                        
        IHistory.rbSiAsisteEsc.setSelected(true);
        IHistory.rbNoAsisteEsc.setSelected(false);
        IHistory.cbxRazon.setSelectedItem("");
        IHistory.tfOtraRazon.setText("");
        IHistory.cbxNPreKinder.setSelectedIndex(0);
        IHistory.cbxNKinder.setSelectedIndex(0);
        IHistory.cbxNPrimaria.setSelectedIndex(0);
        IHistory.cbxNBasico.setSelectedIndex(0);
        IHistory.cbxNSecundaria.setSelectedIndex(0);
        IHistory.cbxNVocac.setSelectedIndex(0);
        IHistory.tfCEVocac.setText("");
        IHistory.cbxNAprez.setSelectedIndex(0);
        IHistory.tfCEAprez.setText("");
        IHistory.cbxNUniv.setSelectedIndex(0);
        IHistory.tfCEUniv.setText("");
        IHistory.cbxNOtro.setSelectedIndex(0);
        IHistory.tfCEOtro.setText("");

        IHistory.rbRendEscBajo.setSelected(true);
        IHistory.rbRendEscPro.setSelected(false);
        IHistory.rbRendEscSob.setSelected(false);
        IHistory.cbxMateria.setSelectedIndex(0);
        ((JTextField)IHistory.datecSec.getDateEditor().getUiComponent()).setText("");
        IHistory.tfCESec.setText("");
        ((JTextField)IHistory.datecUniv.getDateEditor().getUiComponent()).setText("");
        IHistory.tfCEUniv2.setText("");
        ((JTextField)IHistory.datecBib.getDateEditor().getUiComponent()).setText("");
        IHistory.tfCEBib.setText("");
        ((JTextField)IHistory.datecVoc.getDateEditor().getUiComponent()).setText("");
        IHistory.tfCEVocac2.setText("");
        ((JTextField)IHistory.datecOtro.getDateEditor().getUiComponent()).setText("");
        IHistory.tfCEOtro2.setText("");

        IHistory.cbxRazon.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] { "Es menor de edad","La escuela está lejos","Por falta de recursos","Otra razón"}
        ));
        IHistory.cbxRazon.setEnabled(true);
        IHistory.rbNoAsisteEsc.transferFocus();
        IHistory.cbxRazon.setSelectedIndex(0);
        IHistory.cbxNPreKinder.setSelectedIndex(0);
        IHistory.cbxNPreKinder.setEnabled(false);
        IHistory.cbxNKinder.setSelectedIndex(0);
        IHistory.cbxNKinder.setEnabled(false);
        IHistory.cbxNPrimaria.setSelectedIndex(0);
        IHistory.cbxNPrimaria.setEnabled(false);
        IHistory.cbxNBasico.setSelectedIndex(0);
        IHistory.cbxNBasico.setEnabled(false);
        IHistory.cbxNSecundaria.setSelectedIndex(0);
        IHistory.cbxNSecundaria.setEnabled(false);

        IHistory.cbTutelaMasculina.setSelected(true);
        IHistory.cbxTutorMasc.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] { "Padre","Hermano","Padrastro","Tío","Abuelo","Padrino"}
        ));
        IHistory.cbxTutorMasc.setSelectedItem("Padre");
        IHistory.cbTutelaFemenina.setSelected(true);
        IHistory.cbxTutorFem.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] { "Madre","Hermana","Madrastra","Tía","Abuela","Madrina"}
        ));
        IHistory.cbxTutorFem.setSelectedItem("Madre");
        IHistory.cbTutelaAjena.setSelected(false);
        IHistory.cbxTutorAjeno.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] { ""}
        ));

        IHistory.rbJuntoSi.setSelected(true);
        IHistory.rbJuntoNo.setSelected(false);
        IHistory.rbJuntoDesco.setSelected(false);
        IHistory.cbxECivil.setSelectedIndex(0);

        IHistory.cbxPadreVivo.setSelectedItem("Si");
        IHistory.cbxPcNino.setSelectedItem("Si");
        IHistory.cbxPFinanz.setSelectedItem("Si");
        IHistory.cbxPImpd.setSelectedItem("No");
        IHistory.tfPCImpd.setText("");
        IHistory.cbxPCrEnf.setSelectedItem("No");
        IHistory.tfPCrEnf.setText("");
        IHistory.cbxPMentEnf.setSelectedItem("No");
        IHistory.cbxPCarc.setSelectedItem("No");

        IHistory.cbxMadreViva.setSelectedItem("Si");
        IHistory.cbxMcNino.setSelectedItem("Si");
        IHistory.cbxMFinanz.setSelectedItem("Si");
        IHistory.cbxMImpd.setSelectedItem("No");
        IHistory.tfMCImpd.setText("");
        IHistory.cbxMCrEnf.setSelectedItem("No");
        IHistory.tfMCrEnf.setText("");
        IHistory.cbxMMentEnf.setSelectedItem("No");
        IHistory.cbxMCarc.setSelectedItem("No");

        IHistory.cbPAgri.setSelected(false);
        IHistory.cbPMerc.setSelected(false);
        IHistory.cbPIgl.setSelected(false);
        IHistory.cbPProj.setSelected(false);
        IHistory.cbPMaes.setSelected(false);
        IHistory.cbPObr.setSelected(false);
        IHistory.cbPOtro.setSelected(false);
        IHistory.tfPObr.setText("");
        IHistory.tfPOtro.setText("");

        IHistory.cbMAgri.setSelected(false);
        IHistory.cbMMerc.setSelected(false);
        IHistory.cbMIgl.setSelected(false);
        IHistory.cbMProj.setSelected(false);
        IHistory.cbMMaes.setSelected(false);
        IHistory.cbMObr.setSelected(false);
        IHistory.cbMOtro.setSelected(false);
        IHistory.tfMObr.setText("");
        IHistory.tfMOtro.setText("");

        IHistory.lbNHijos.setText("0");
        IHistory.lbNHijas.setText("0");
        IHistory.lbPHno.setText("");
        IHistory.lbSHno.setText("");

        IHistory.taComentarios.setText("");
    }

}