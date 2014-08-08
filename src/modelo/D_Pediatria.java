
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sc.Conexion;
import sc.Library;
import vista.DVacunacion;
import vista.IPediatrica;

public class D_Pediatria {
    
Library lib = new Library();
Connection conx;
PreparedStatement ps;
Statement st;
ResultSet rs;

    public void consultaPag1(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IPediatrica.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM Alumno WHERE c_alumno="+code);

                    if (rs.next()) {
                        IPediatrica.lbNombreCompleto.setText(rs.getString("s_fapel")+" "+rs.getString("s_sapel")+" "+rs.getString("s_fname")+" "+rs.getString("s_sname"));
                        IPediatrica.lbSexo.setText(rs.getString("s_sexo"));
                        IPediatrica.lbDomicilio.setText(rs.getString("s_direc"));
                        IPediatrica.lbFecNac.setText(rs.getString("f_nac"));
                        IPediatrica.lbLugarNac.setText(rs.getString("s_lugarNac"));
                        IPediatrica.lbNameMad.setText(rs.getString("s_mama"));
                        IPediatrica.lbNamePad.setText(rs.getString("s_papa"));
                        
                        IPediatrica.lbEdad.setText(rs.getString("v_edad"));
                        
                        IPediatrica.btDataGral.setEnabled(true);
                        IPediatrica.btGuardar1.setEnabled(true);
                        
                        IPediatrica.tabbed.setEnabledAt(1, false);
                        IPediatrica.tabbed.setEnabledAt(2, false);
                        IPediatrica.tabbed.setEnabledAt(3, false);
                        IPediatrica.tabbed.setEnabledAt(4, false);
                    }else{
                        IPediatrica.lbNombreCompleto.setText("");
                        IPediatrica.lbSexo.setText("");
                        IPediatrica.lbDomicilio.setText("");
                        IPediatrica.lbFecNac.setText("");
                        IPediatrica.lbLugarNac.setText("");
                        IPediatrica.lbNameMad.setText("");
                        IPediatrica.lbNamePad.setText("");
                        
                        IPediatrica.lbEdad.setText("");
                        
                        IPediatrica.btDataGral.setEnabled(false);
                        IPediatrica.btGuardar1.setEnabled(false);
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM Pediatria WHERE c_alumno="+code);

                    if (rs.next()) {
                        IPediatrica.lbF1Consulta.setText(rs.getString("f_consulta"));
                        IPediatrica.taMotivoConsulta.setText(rs.getString("s_motivocons"));
                        IPediatrica.tfNacioEn.setText(rs.getString("s_nacioen"));
                        IPediatrica.tfMaternidad.setText(rs.getString("s_maternidad"));
                        IPediatrica.tfPartoEn.setText(rs.getString("s_partoen"));
                        IPediatrica.spNGesta.setValue(rs.getInt("v_numgesta"));
                        IPediatrica.spNAbortos.setValue(rs.getInt("v_numabortos"));
                        IPediatrica.tfMeses.setText(rs.getString("s_meses"));
                        IPediatrica.tfCausas.setText(rs.getString("s_causas"));
                        IPediatrica.spPesoAlNacer.setValue(rs.getInt("v_pesonacer"));
                        IPediatrica.tfNeonato.setText(rs.getString("s_neonato"));
                        IPediatrica.tfApgar.setText(rs.getString("s_apgar"));
                        IPediatrica.tfEmbarazo.setText(rs.getString("s_embarazo"));
                        IPediatrica.tfParto.setText(rs.getString("s_parto"));
                        IPediatrica.tfCausaCesarea.setText(rs.getString("s_causacesarea"));
                        IPediatrica.tfTallaAlNacer.setText(rs.getString("s_tallaNacer"));
                        IPediatrica.tfCirCef.setText(rs.getString("s_circef"));
                        IPediatrica.taExamLab.setText(rs.getString("s_examslab"));
                        IPediatrica.taObservaciones.setText(rs.getString("s_observaciones"));
                    }else{
                        IPediatrica.lbF1Consulta.setText("");
                        IPediatrica.taMotivoConsulta.setText("");
                        IPediatrica.tfNacioEn.setText("");
                        IPediatrica.tfMaternidad.setText("");
                        IPediatrica.tfPartoEn.setText("");
                        IPediatrica.spNGesta.setValue(0);
                        IPediatrica.spNAbortos.setValue(0);
                        IPediatrica.tfMeses.setText("");
                        IPediatrica.tfCausas.setText("");
                        IPediatrica.spPesoAlNacer.setValue(0);
                        IPediatrica.tfNeonato.setText("");
                        IPediatrica.tfApgar.setText("");
                        IPediatrica.tfEmbarazo.setText("");
                        IPediatrica.tfParto.setText("");
                        IPediatrica.tfCausaCesarea.setText("");
                        IPediatrica.tfTallaAlNacer.setText("");
                        IPediatrica.tfCirCef.setText("");
                        IPediatrica.taExamLab.setText("");
                        IPediatrica.taObservaciones.setText("");
                    }
                    
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: "+ e.getMessage());
        }
    }
    
    public void consultaPag2(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IPediatrica.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM AntecedentesMadre WHERE c_alumno="+code);

                    if (rs.next()) {
                        IPediatrica.lbNameMom.setText(IPediatrica.lbNameMad.getText());
                        IPediatrica.lbPesoM.setText(rs.getString("v_peso"));
                        IPediatrica.lbTallaM.setText(rs.getString("v_talla"));
                        IPediatrica.lbEdadM.setText(rs.getString("v_edad"));
                        IPediatrica.lbSaludM.setText(rs.getString("s_salud"));
                        IPediatrica.lbNumPartos.setText(rs.getString("v_partos"));
                        IPediatrica.lbEscolaridadM.setText(rs.getString("s_escolaridad"));
                    }else{
                        IPediatrica.lbNameMom.setText(IPediatrica.lbNameMad.getText());
                        IPediatrica.lbPesoM.setText("0");
                        IPediatrica.lbTallaM.setText("");
                        IPediatrica.lbEdadM.setText("0");
                        IPediatrica.lbSaludM.setText("");
                        IPediatrica.lbNumPartos.setText("0");
                        IPediatrica.lbEscolaridadM.setText("");
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM AntecedentesPadre WHERE c_alumno="+code);

                    if (rs.next()) {
                        IPediatrica.lbNamePap.setText(IPediatrica.lbNamePad.getText());
                        IPediatrica.lbPesoP.setText(rs.getString("v_peso"));
                        IPediatrica.lbTallaP.setText(rs.getString("v_talla"));
                        IPediatrica.lbEdadP.setText(rs.getString("v_edad"));
                        IPediatrica.lbSaludP.setText(rs.getString("s_salud"));
                        IPediatrica.lbEscolaridadP.setText(rs.getString("s_escolaridad"));
                    }else{
                        IPediatrica.lbNamePap.setText(IPediatrica.lbNamePad.getText());
                        IPediatrica.lbPesoP.setText("0");
                        IPediatrica.lbTallaP.setText("");
                        IPediatrica.lbEdadP.setText("0");
                        IPediatrica.lbSaludP.setText("");
                        IPediatrica.lbEscolaridadP.setText("");
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM AntecedentesGrales WHERE c_alumno="+code);

                    if (rs.next()) {
                        IPediatrica.lbContacTB.setText(rs.getString("s_contactoTB"));
                        IPediatrica.lbHnos.setText(rs.getString("s_hermanos"));
                        IPediatrica.lbAlegria.setText(rs.getString("s_alegria"));
                        IPediatrica.lbDiabetes.setText(rs.getString("s_diabetes"));
                        IPediatrica.lbTuberculosis.setText(rs.getString("s_tuberculosis"));
                        IPediatrica.lbConvulsiones.setText(rs.getString("s_convulsiones"));
                        IPediatrica.lbOtrosAntec.setText(rs.getString("s_otros"));
                        IPediatrica.taPatalogicos.setText(rs.getString("s_patologicos"));
                    }else{
                        IPediatrica.lbContacTB.setText("");
                        IPediatrica.lbHnos.setText("");
                        IPediatrica.lbAlegria.setText("");
                        IPediatrica.lbDiabetes.setText("");
                        IPediatrica.lbTuberculosis.setText("");
                        IPediatrica.lbConvulsiones.setText("");
                        IPediatrica.lbOtrosAntec.setText("");
                        IPediatrica.taPatalogicos.setText("");
                    }
                    
                    st.close();
                    rs.close();
                    
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void consultaPag3(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IPediatrica.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM Enfermedades WHERE c_alumno="+code);

                    if (rs.next()) {
                        IPediatrica.lbTosfer.setText(rs.getString("s_tosFerina"));
                        IPediatrica.lbSaramp.setText(rs.getString("s_sarampion"));
                        IPediatrica.lbRube.setText(rs.getString("s_rubeola"));
                        IPediatrica.lbPaper.setText(rs.getString("s_papera"));
                        IPediatrica.lbVaric.setText(rs.getString("s_varicela"));
                        IPediatrica.lbEscarlat.setText(rs.getString("s_escarlatina"));
                        IPediatrica.lbApendic.setText(rs.getString("s_apendicitis"));
                        IPediatrica.lbFiebReum.setText(rs.getString("s_fiebreReum"));
                        IPediatrica.lbOtit.setText(rs.getString("s_otitis"));
                        IPediatrica.lbIRS.setText(rs.getString("s_irs"));
                        IPediatrica.lbAmigdal.setText(rs.getString("s_amigdalitis"));
                        IPediatrica.lbConvuls.setText(rs.getString("s_convulsiones"));
                        IPediatrica.lbDifteria.setText(rs.getString("s_difteria"));
                        IPediatrica.lbConstipac.setText(rs.getString("s_constipacion"));
                        IPediatrica.lbOperac.setText(rs.getString("s_operaciones"));
                        IPediatrica.lbDiarrea.setText(rs.getString("s_diarrea"));
                        IPediatrica.lbAmebiasis.setText(rs.getString("s_amebiasis"));
                    }else{
                        IPediatrica.lbTosfer.setText("");
                        IPediatrica.lbSaramp.setText("");
                        IPediatrica.lbRube.setText("");
                        IPediatrica.lbPaper.setText("");
                        IPediatrica.lbVaric.setText("");
                        IPediatrica.lbEscarlat.setText("");
                        IPediatrica.lbApendic.setText("");
                        IPediatrica.lbFiebReum.setText("");
                        IPediatrica.lbOtit.setText("");
                        IPediatrica.lbIRS.setText("");
                        IPediatrica.lbAmigdal.setText("");
                        IPediatrica.lbConvuls.setText("");
                        IPediatrica.lbDifteria.setText("");
                        IPediatrica.lbConstipac.setText("");
                        IPediatrica.lbOperac.setText("");
                        IPediatrica.lbDiarrea.setText("");
                        IPediatrica.lbAmebiasis.setText("");
                    }
                    
                    st.close();
                    rs.close();
                    
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM Alimentacion WHERE c_alumno="+code);

                    if (rs.next()) {
                        IPediatrica.lbPech.setText(rs.getString("s_pecho"));
                        IPediatrica.lbAblac.setText(rs.getString("s_ablactacion"));
                        IPediatrica.lbVitam.setText(rs.getString("s_vitaminas"));
                        IPediatrica.lbDiet.setText(rs.getString("s_dieta"));
                        IPediatrica.lbVomi.setText(rs.getString("s_vomito"));
                        IPediatrica.lbAlerg.setText(rs.getString("s_alergia"));
                        IPediatrica.lbOtro.setText(rs.getString("s_otro"));
                        IPediatrica.lbEvolDes.setText(rs.getString("s_evolucionDes"));
                        IPediatrica.lbSento.setText(rs.getString("s_sento"));
                        IPediatrica.lbCamino.setText(rs.getString("s_camino"));
                        IPediatrica.lbFrasesCort.setText(rs.getString("s_frases"));
                        IPediatrica.lbEsfint.setText(rs.getString("s_esfinteres"));
                        IPediatrica.lbPadec.setText(rs.getString("s_padcmntActual"));
                        
                        IPediatrica.lbDurac.setText(rs.getString("v_duracion"));
                        IPediatrica.lbAlimB.setText(rs.getString("s_alimBland"));
                        IPediatrica.lbLevanto.setText(rs.getString("s_levanto"));
                        IPediatrica.lbPrimerPal.setText(rs.getString("s_primWords"));
                        IPediatrica.lbPrimerDient.setText(rs.getString("s_primDiente"));
                        IPediatrica.lbRecto.setText(rs.getString("s_recto"));
                    }else{
                        IPediatrica.lbPech.setText("");
                        IPediatrica.lbAblac.setText("");
                        IPediatrica.lbVitam.setText("");
                        IPediatrica.lbDiet.setText("");
                        IPediatrica.lbVomi.setText("");
                        IPediatrica.lbAlerg.setText("");
                        IPediatrica.lbOtro.setText("");
                        IPediatrica.lbEvolDes.setText("");
                        IPediatrica.lbSento.setText("");
                        IPediatrica.lbCamino.setText("");
                        IPediatrica.lbFrasesCort.setText("");
                        IPediatrica.lbEsfint.setText("");
                        IPediatrica.lbPadec.setText("");
                        IPediatrica.lbDurac.setText("");
                        IPediatrica.lbAlimB.setText("");
                        IPediatrica.lbLevanto.setText("");
                        IPediatrica.lbPrimerPal.setText("");
                        IPediatrica.lbPrimerDient.setText("");
                        IPediatrica.lbRecto.setText("");
                    }
                    
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void consultaPag4(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IPediatrica.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM ExamenFisico WHERE c_alumno="+code);

                    if (rs.next()) {
                        IPediatrica.tfPeso.setText(rs.getString("s_peso"));
                        IPediatrica.tfTalla.setText(rs.getString("s_talla"));
                        IPediatrica.tfTemp.setText(rs.getString("s_temper"));
                        IPediatrica.tfPerim.setText(rs.getString("s_perimetro"));
                        IPediatrica.tfCabeza.setText(rs.getString("s_cabeza"));
                        IPediatrica.tfOjos.setText(rs.getString("s_ojos"));
                        IPediatrica.tfOi2.setText(rs.getString("s_oidos"));
                        IPediatrica.tfBok.setText(rs.getString("s_boca"));
                        IPediatrica.tfNariz.setText(rs.getString("s_nariz"));
                        IPediatrica.tfFaring.setText(rs.getString("s_faring"));
                        IPediatrica.tfCuello.setText(rs.getString("s_cuello"));
                        IPediatrica.tfTorax.setText(rs.getString("s_torax"));
                        IPediatrica.tfCoraz.setText(rs.getString("s_coraz"));
                        IPediatrica.tfPulmon.setText(rs.getString("s_pulmons"));
                        IPediatrica.tfAbdom.setText(rs.getString("s_abdomen"));
                        IPediatrica.tfGenit.setText(rs.getString("s_genitales"));
                        IPediatrica.tfExtremid.setText(rs.getString("s_xtremidads"));
                        IPediatrica.tfPiel.setText(rs.getString("s_piel"));
                        IPediatrica.tfAdenop.setText(rs.getString("s_adenopa"));
                        IPediatrica.tfRefSup.setText(rs.getString("s_reflSuprf"));
                        IPediatrica.tfRefProf.setText(rs.getString("s_reflProf"));
                        IPediatrica.tfPost.setText(rs.getString("s_postura"));
                        IPediatrica.tfDesar.setText(rs.getString("s_desarrollo"));
                        IPediatrica.tfNutr.setText(rs.getString("s_nutricion"));
                    }else{
                        IPediatrica.tfPeso.setText("");
                        IPediatrica.tfTalla.setText("");
                        IPediatrica.tfTemp.setText("");
                        IPediatrica.tfPerim.setText("");
                        IPediatrica.tfCabeza.setText("");
                        IPediatrica.tfOjos.setText("");
                        IPediatrica.tfOi2.setText("");
                        IPediatrica.tfBok.setText("");
                        IPediatrica.tfNariz.setText("");
                        IPediatrica.tfFaring.setText("");
                        IPediatrica.tfCuello.setText("");
                        IPediatrica.tfTorax.setText("");
                        IPediatrica.tfCoraz.setText("");
                        IPediatrica.tfPulmon.setText("");
                        IPediatrica.tfAbdom.setText("");
                        IPediatrica.tfGenit.setText("");
                        IPediatrica.tfExtremid.setText("");
                        IPediatrica.tfPiel.setText("");
                        IPediatrica.tfAdenop.setText("");
                        IPediatrica.tfRefSup.setText("");
                        IPediatrica.tfRefProf.setText("");
                        IPediatrica.tfPost.setText("");
                        IPediatrica.tfDesar.setText("");
                        IPediatrica.tfNutr.setText("");
                    }
                    
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void consultaVacunacion(int code){
        try {
            conx = Conexion.getSQLConnection();

            if (!"".equals(IPediatrica.lbCode.getText())) {
                if (conx != null) {
                    st = conx.createStatement();
                    rs = st.executeQuery("SELECT * FROM Vacunacion WHERE c_alumno="+code);

                    if (rs.next()) {
                        ((JTextField)DVacunacion.datec1.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna1"));
                        ((JTextField)DVacunacion.datec2.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna2"));
                        ((JTextField)DVacunacion.datec3.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna3"));
                        ((JTextField)DVacunacion.datec4.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna4"));
                        ((JTextField)DVacunacion.datec5.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna5"));
                        ((JTextField)DVacunacion.datec6.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna6"));
                        ((JTextField)DVacunacion.datec7.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna7"));
                        ((JTextField)DVacunacion.datec8.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna8"));
                        ((JTextField)DVacunacion.datec9.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna9"));
                        ((JTextField)DVacunacion.datec10.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna10"));
                        ((JTextField)DVacunacion.datec11.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna11"));
                        ((JTextField)DVacunacion.datec12.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna12"));
                        ((JTextField)DVacunacion.datec13.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna13"));
                        ((JTextField)DVacunacion.datec14.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna14"));
                        ((JTextField)DVacunacion.datec15.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna15"));
                        ((JTextField)DVacunacion.datec16.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna16"));
                        ((JTextField)DVacunacion.datec17.getDateEditor().getUiComponent()).setText(rs.getString("f_vacuna17"));
                    }else{
                        ((JTextField)DVacunacion.datec1.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec2.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec3.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec4.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec5.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec6.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec7.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec8.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec9.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec10.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec11.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec12.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec13.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec14.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec15.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec16.getDateEditor().getUiComponent()).setText("");
                        ((JTextField)DVacunacion.datec17.getDateEditor().getUiComponent()).setText("");
                    }
                    st.close();
                    rs.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void updateAlumno(int code,String mama, String papa){
        try {
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                st = conx.createStatement();
                st.executeUpdate("update Alumno set s_mama='"+mama+"',s_papa='"+papa+"' where c_alumno="+code);
                IPediatrica.lbNameMad.setText(mama);
                IPediatrica.lbNamePad.setText(papa);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public boolean savePediatria(){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call savePediatria(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                
                ps.setInt(1, Integer.parseInt(IPediatrica.lbCode.getText()));
                ps.setInt(2, 1);
                ps.setString(3, IPediatrica.lbF1Consulta.getText());
                ps.setString(4, IPediatrica.taMotivoConsulta.getText());
                ps.setString(5, IPediatrica.tfNacioEn.getText());
                ps.setString(6, IPediatrica.tfMaternidad.getText());
                ps.setString(7, IPediatrica.tfPartoEn.getText());
                ps.setInt(8, Integer.parseInt(IPediatrica.spNGesta.getValue().toString()));
                ps.setInt(9, Integer.parseInt(IPediatrica.spNAbortos.getValue().toString()));
                ps.setString(10, IPediatrica.tfMeses.getText());
                ps.setString(11, IPediatrica.tfCausas.getText());
                ps.setInt(12, Integer.parseInt(IPediatrica.spPesoAlNacer.getValue().toString()));
                ps.setString(13, IPediatrica.tfNeonato.getText());
                ps.setString(14, IPediatrica.tfApgar.getText());
                ps.setString(15, IPediatrica.tfEmbarazo.getText());
                ps.setString(16, IPediatrica.tfParto.getText());
                ps.setString(17, IPediatrica.tfCausaCesarea.getText());
                ps.setString(18, IPediatrica.tfTallaAlNacer.getText());
                ps.setString(19, IPediatrica.tfCirCef.getText());
                ps.setString(20, IPediatrica.taExamLab.getText());
                ps.setString(21, IPediatrica.taObservaciones.getText());
                ps.setString(22, lib.getFechaActual());
                ps.setString(23, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
                
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    public boolean saveAntecPadre(){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveAntecedentesPadre(?,?,?,?,?,?,?,?)}");

                ps.setInt(1, Integer.parseInt(IPediatrica.lbCode.getText()));
                ps.setInt(2, Integer.parseInt(IPediatrica.lbPesoP.getText()));
                ps.setString(3, IPediatrica.lbTallaP.getText());
                ps.setInt(4, Integer.parseInt(IPediatrica.lbEdadP.getText()));
                ps.setString(5, IPediatrica.lbSaludP.getText());
                ps.setString(6, IPediatrica.lbEscolaridadP.getText());
                ps.setString(7, lib.getFechaActual());
                ps.setString(8, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
                
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    public boolean saveAntecMadre(){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                
                ps = conx.prepareCall("{call saveAntecedentesMadre(?,?,?,?,?,?,?,?,?)}");

                ps.setInt(1, Integer.parseInt(IPediatrica.lbCode.getText()));
                ps.setInt(2, Integer.parseInt(IPediatrica.lbPesoM.getText()));
                ps.setString(3, IPediatrica.lbTallaM.getText());
                ps.setInt(4, Integer.parseInt(IPediatrica.lbEdadM.getText()));
                ps.setString(5, IPediatrica.lbSaludM.getText());
                ps.setInt(6, Integer.parseInt(IPediatrica.lbNumPartos.getText()));
                ps.setString(7, IPediatrica.lbEscolaridadM.getText());
                ps.setString(8, lib.getFechaActual());
                ps.setString(9, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
                
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    public boolean saveAntecFam(){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                
                ps = conx.prepareCall("{call saveAntecedentesGrales(?,?,?,?,?,?,?,?,?,?,?)}");

                ps.setInt(1, Integer.parseInt(IPediatrica.lbCode.getText()));
                ps.setString(2, IPediatrica.lbContacTB.getText());
                ps.setString(3, IPediatrica.lbHnos.getText());
                ps.setString(4, IPediatrica.lbAlegria.getText());
                ps.setString(5, IPediatrica.lbDiabetes.getText());
                ps.setString(6, IPediatrica.lbTuberculosis.getText());
                ps.setString(7, IPediatrica.lbConvulsiones.getText());
                ps.setString(8, IPediatrica.lbOtrosAntec.getText());
                ps.setString(9, IPediatrica.taPatalogicos.getText());
                ps.setString(10, lib.getFechaActual());
                ps.setString(11, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
                
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    public boolean saveVacunacion(){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                
                ps = conx.prepareCall("{call saveVacunacion(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

                ps.setInt(1, Integer.parseInt(IPediatrica.lbCode.getText()));
                ps.setString(2, ((JTextField)DVacunacion.datec1.getDateEditor().getUiComponent()).getText());
                ps.setString(3, ((JTextField)DVacunacion.datec2.getDateEditor().getUiComponent()).getText());
                ps.setString(4, ((JTextField)DVacunacion.datec3.getDateEditor().getUiComponent()).getText());
                ps.setString(5, ((JTextField)DVacunacion.datec4.getDateEditor().getUiComponent()).getText());
                ps.setString(6, ((JTextField)DVacunacion.datec5.getDateEditor().getUiComponent()).getText());
                ps.setString(7, ((JTextField)DVacunacion.datec6.getDateEditor().getUiComponent()).getText());
                ps.setString(8, ((JTextField)DVacunacion.datec7.getDateEditor().getUiComponent()).getText());
                ps.setString(9, ((JTextField)DVacunacion.datec8.getDateEditor().getUiComponent()).getText());
                ps.setString(10, ((JTextField)DVacunacion.datec9.getDateEditor().getUiComponent()).getText());
                ps.setString(11, ((JTextField)DVacunacion.datec10.getDateEditor().getUiComponent()).getText());
                ps.setString(12, ((JTextField)DVacunacion.datec11.getDateEditor().getUiComponent()).getText());
                ps.setString(13, ((JTextField)DVacunacion.datec12.getDateEditor().getUiComponent()).getText());
                ps.setString(14, ((JTextField)DVacunacion.datec13.getDateEditor().getUiComponent()).getText());
                ps.setString(15, ((JTextField)DVacunacion.datec14.getDateEditor().getUiComponent()).getText());
                ps.setString(16, ((JTextField)DVacunacion.datec15.getDateEditor().getUiComponent()).getText());
                ps.setString(17, ((JTextField)DVacunacion.datec16.getDateEditor().getUiComponent()).getText());
                ps.setString(18, ((JTextField)DVacunacion.datec17.getDateEditor().getUiComponent()).getText());
                ps.setString(19, lib.getFechaActual());
                ps.setString(20, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
                
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    public boolean saveEnfermedades(){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                
                ps = conx.prepareCall("{call saveEnfermedades(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        
                ps.setInt(1, Integer.parseInt(IPediatrica.lbCode.getText()));
                ps.setString(2, IPediatrica.lbTosfer.getText());
                ps.setString(3, IPediatrica.lbApendic.getText());
                ps.setString(4, IPediatrica.lbSaramp.getText());
                ps.setString(5, IPediatrica.lbFiebReum.getText());
                ps.setString(6, IPediatrica.lbRube.getText());
                ps.setString(7, IPediatrica.lbOtit.getText());
                ps.setString(8, IPediatrica.lbPaper.getText());
                ps.setString(9, IPediatrica.lbIRS.getText());
                ps.setString(10, IPediatrica.lbVaric.getText());
                ps.setString(11, IPediatrica.lbAmigdal.getText());
                ps.setString(12, IPediatrica.lbEscarlat.getText());
                ps.setString(13, IPediatrica.lbConvuls.getText());
                ps.setString(14, IPediatrica.lbDifteria.getText());
                ps.setString(15, IPediatrica.lbConstipac.getText());
                ps.setString(16, IPediatrica.lbOperac.getText());
                ps.setString(17, IPediatrica.lbDiarrea.getText());
                ps.setString(18, IPediatrica.lbAmebiasis.getText());
                ps.setString(19, lib.getFechaActual());
                ps.setString(20, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
                
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    public boolean saveHistoriaAlimentacion(){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                
                ps = conx.prepareCall("{call saveAlimentacion(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, Integer.parseInt(IPediatrica.lbCode.getText()));
                ps.setString(2, IPediatrica.lbPech.getText());
                ps.setString(3, IPediatrica.lbDurac.getText());
                ps.setString(4, IPediatrica.lbAblac.getText());
                ps.setString(5, IPediatrica.lbVitam.getText());
                ps.setString(6, IPediatrica.lbAlimB.getText());
                ps.setString(7, IPediatrica.lbDiet.getText());
                ps.setString(8, IPediatrica.lbVomi.getText());
                ps.setString(9, IPediatrica.lbAlerg.getText());
                ps.setString(10, IPediatrica.lbOtro.getText());
                ps.setString(11, IPediatrica.lbEvolDes.getText());
                ps.setString(12, IPediatrica.lbSento.getText());
                ps.setString(13, IPediatrica.lbLevanto.getText());
                ps.setString(14, IPediatrica.lbCamino.getText());
                ps.setString(15, IPediatrica.lbPrimerPal.getText());
                ps.setString(16, IPediatrica.lbFrasesCort.getText());
                ps.setString(17, IPediatrica.lbPrimerDient.getText());
                ps.setString(18, IPediatrica.lbEsfint.getText());
                ps.setString(19, IPediatrica.lbRecto.getText());
                ps.setString(20, IPediatrica.lbPadec.getText());
                ps.setString(21, lib.getFechaActual());
                ps.setString(22, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
                
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    public boolean saveExamenFisico(){
        boolean resultado = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                
                ps = conx.prepareCall("{call saveExamenFisico(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                
                ps.setInt(1, Integer.parseInt(IPediatrica.lbCode.getText()));
                ps.setString(2, IPediatrica.lbFecha.getText());
                ps.setInt(3, Integer.parseInt(IPediatrica.lbEdad.getText()));
                ps.setString(4, IPediatrica.tfPeso.getText());
                ps.setString(5, IPediatrica.tfTalla.getText());
                ps.setString(6, IPediatrica.tfTemp.getText());
                ps.setString(7, IPediatrica.tfPerim.getText());
                ps.setString(8, IPediatrica.tfCabeza.getText());
                ps.setString(9, IPediatrica.tfOjos.getText());
                ps.setString(10, IPediatrica.tfOi2.getText());
                ps.setString(11, IPediatrica.tfBok.getText());
                ps.setString(12, IPediatrica.tfNariz.getText());
                ps.setString(13, IPediatrica.tfFaring.getText());
                ps.setString(14, IPediatrica.tfCuello.getText());
                ps.setString(15, IPediatrica.tfTorax.getText());
                ps.setString(16, IPediatrica.tfCoraz.getText());
                ps.setString(17, IPediatrica.tfPulmon.getText());
                ps.setString(18, IPediatrica.tfAbdom.getText());
                ps.setString(19, IPediatrica.tfGenit.getText());
                ps.setString(20, IPediatrica.tfExtremid.getText());
                ps.setString(21, IPediatrica.tfPiel.getText());
                ps.setString(22, IPediatrica.tfAdenop.getText());
                ps.setString(23, IPediatrica.tfRefSup.getText());
                ps.setString(24, IPediatrica.tfRefProf.getText());
                ps.setString(25, IPediatrica.tfPost.getText());
                ps.setString(26, IPediatrica.tfDesar.getText());
                ps.setString(27, IPediatrica.tfNutr.getText());
                ps.setString(28, lib.getFechaActual());
                ps.setString(29, D_Login.getNameCU());
                
                ps.executeUpdate();
                conx.close();
                
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    public void updatePediatria(){
        try {
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                st = conx.createStatement();
                st.executeUpdate("UPDATE Pediatria SET s_examsLab='"+IPediatrica.taExamLab.getText()+
"',s_observaciones='"+IPediatrica.taObservaciones.getText()+"' WHERE c_alumno="+Integer.parseInt(IPediatrica.lbCode.getText()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}