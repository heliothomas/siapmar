
package modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sc.Conexion;
import sc.Library;
import vista.DExpediente;
import vista.IRevExp;

public class D_Expediente {

Library lib = new Library();
Connection conx;
Statement st;
ResultSet rs;
PreparedStatement ps;
private int cAlum;
private String alum,hojaP,partNac,ficSocE,histNin,notaAut,updPer,regCarta,cuadCarta,regRegal,evaXLevel,
evaAnual,hCPed,infoSeg,tarVac,trnfProf,fMC,tPE,bolet,partcActCom,regNecSpe,visit,regPartPad,
regAnecd,regBenfCIV;

    public int getcAlum() {
        return cAlum;
    }

    public void setcAlum(int cAlum) {
        this.cAlum = cAlum;
    }
    
    public String getAlum() {
        return alum;
    }

    public void setAlum(String alum) {
        this.alum = alum;
    }

    public String getBolet() {
        return bolet;
    }

    public void setBolet(String bolet) {
        this.bolet = bolet;
    }

    public String getCuadCarta() {
        return cuadCarta;
    }

    public void setCuadCarta(String cuadCarta) {
        this.cuadCarta = cuadCarta;
    }

    public String getEvaAnual() {
        return evaAnual;
    }

    public void setEvaAnual(String evaAnual) {
        this.evaAnual = evaAnual;
    }

    public String getEvaXLevel() {
        return evaXLevel;
    }

    public void setEvaXLevel(String evaXLevel) {
        this.evaXLevel = evaXLevel;
    }

    public String getfMC() {
        return fMC;
    }

    public void setfMC(String fMC) {
        this.fMC = fMC;
    }

    public String getFicSocE() {
        return ficSocE;
    }

    public void setFicSocE(String ficSocE) {
        this.ficSocE = ficSocE;
    }

    public String gethCPed() {
        return hCPed;
    }

    public void sethCPed(String hCPed) {
        this.hCPed = hCPed;
    }

    public String getHistNin() {
        return histNin;
    }

    public void setHistNin(String histNin) {
        this.histNin = histNin;
    }

    public String getHojaP() {
        return hojaP;
    }

    public void setHojaP(String hojaP) {
        this.hojaP = hojaP;
    }

    public String getInfoSeg() {
        return infoSeg;
    }

    public void setInfoSeg(String infoSeg) {
        this.infoSeg = infoSeg;
    }

    public String getNotaAut() {
        return notaAut;
    }

    public void setNotaAut(String notaAut) {
        this.notaAut = notaAut;
    }

    public String getPartNac() {
        return partNac;
    }

    public void setPartNac(String partNac) {
        this.partNac = partNac;
    }

    public String getPartcActCom() {
        return partcActCom;
    }

    public void setPartcActCom(String partcActCom) {
        this.partcActCom = partcActCom;
    }

    public String getRegAnecd() {
        return regAnecd;
    }

    public void setRegAnecd(String regAnecd) {
        this.regAnecd = regAnecd;
    }

    public String getRegBenfCIV() {
        return regBenfCIV;
    }

    public void setRegBenfCIV(String regBenfCIV) {
        this.regBenfCIV = regBenfCIV;
    }

    public String getRegCarta() {
        return regCarta;
    }

    public void setRegCarta(String regCarta) {
        this.regCarta = regCarta;
    }

    public String getRegNecSpe() {
        return regNecSpe;
    }

    public void setRegNecSpe(String regNecSpe) {
        this.regNecSpe = regNecSpe;
    }

    public String getRegPartPad() {
        return regPartPad;
    }

    public void setRegPartPad(String regPartPad) {
        this.regPartPad = regPartPad;
    }

    public String getRegRegal() {
        return regRegal;
    }

    public void setRegRegal(String regRegal) {
        this.regRegal = regRegal;
    }

    public String gettPE() {
        return tPE;
    }

    public void settPE(String tPE) {
        this.tPE = tPE;
    }

    public String getTarVac() {
        return tarVac;
    }

    public void setTarVac(String tarVac) {
        this.tarVac = tarVac;
    }

    public String getTrnfProf() {
        return trnfProf;
    }

    public void setTrnfProf(String trnfProf) {
        this.trnfProf = trnfProf;
    }

    public String getUpdPer() {
        return updPer;
    }

    public void setUpdPer(String updPer) {
        this.updPer = updPer;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }
    
    public ArrayList<D_Expediente> ListarExpedienteXGrupo(String cGrupo){
        
        ArrayList listado = new ArrayList();
        
        try{
            conx = Conexion.getSQLConnection();
            
            if (conx != null) {
                ps = conx.prepareStatement("SELECT * from vExpediente where c_nivel='"+cGrupo+"'");
                rs = ps.executeQuery();

                D_Expediente list;
                
                while(rs.next()){
                    list = new D_Expediente();
                    
                    String alumno = rs.getString("s_fname") + " " + rs.getString("s_sname") + " " + rs.getString("s_fapel") + " " + rs.getString("s_sapel");
                    list.setAlum(alumno);
                    
                    list.setcAlum(rs.getInt("c_alumno"));
                    
                    list.setHojaP(rs.getString("s_hojaP"));
                    list.setPartNac(rs.getString("s_partNac"));
                    list.setFicSocE(rs.getString("s_ficSocE"));
                    list.setHistNin(rs.getString("s_histNin"));
                    list.setNotaAut(rs.getString("s_notaAut"));
                    list.setUpdPer(rs.getString("s_updPer"));
                    list.setRegCarta(rs.getString("s_regCarta"));
                    list.setCuadCarta(rs.getString("s_cuadCarta"));
                    list.setRegRegal(rs.getString("s_regRegal"));
                    list.setEvaXLevel(rs.getString("s_evaXLevel"));
                    list.setEvaAnual(rs.getString("s_evaAnual"));
                    list.sethCPed(rs.getString("s_hCPed"));
                    list.setInfoSeg(rs.getString("s_infoSeg"));
                    list.setTarVac(rs.getString("s_tarVac"));
                    list.setTrnfProf(rs.getString("s_trnfProf"));
                    list.setfMC(rs.getString("s_fMC"));
                    list.settPE(rs.getString("s_tPE"));
                    list.setBolet(rs.getString("s_bolet"));
                    list.setPartcActCom(rs.getString("s_partcActCom"));
                    list.setRegNecSpe(rs.getString("s_regNecSpe"));
                    list.setVisit(rs.getString("s_visit"));
                    list.setRegPartPad(rs.getString("s_regPartPad"));
                    list.setRegAnecd(rs.getString("s_regAnecd"));
                    list.setRegBenfCIV(rs.getString("s_regBenfCIV"));
                    
                    listado.add(list);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: "+ e.getMessage());
        }
        return listado;
    }
    
    public void getGrupo(){
        conx = Conexion.getSQLConnection();
        String sql = "SELECT * FROM Grupo ORDER BY c_grupo";
        IRevExp.modelGrupo.removeAllElements();
        
        try{
            st = conx.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                IRevExp.modelGrupo.addElement(new GrupoExpediente(
                    rs.getString("c_grupo"),
                    rs.getString("s_grupo"),
                    rs.getString("docente")
                    ));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public boolean completarExpAlu(String cGrupo, int cAlumno){
        boolean res = false;
        try {
            conx = Conexion.getSQLConnection();
            if (conx != null) {
                ps = conx.prepareCall("{call saveExpediente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

                String hojaP = "No";
                if (DExpediente.cbHojaPres.isSelected()) hojaP = "Si";
                String partNac = "No";
                if (DExpediente.cbPartNac.isSelected()) partNac = "Si";
                String ficSocE = "No";
                if (DExpediente.cbFicSocEc.isSelected()) ficSocE = "Si";
                String histNin = "No";
                if (DExpediente.cbHistNin.isSelected()) histNin = "Si";
                String notaAut = "No";
                if (DExpediente.cbNotaAut.isSelected()) notaAut = "Si";
                String updPer = "No";
                if (DExpediente.cbActPerf.isSelected()) updPer = "Si";
                String regCarta = "No";
                if (DExpediente.cbRegCor.isSelected()) regCarta = "Si";
                String cuadCarta = "No";
                if (DExpediente.cbCuadCarta.isSelected()) cuadCarta = "Si";
                String regRegal = "No";
                if (DExpediente.cbRegReg.isSelected()) regRegal = "Si";
                String evaXLevel = "No";
                if (DExpediente.cbEvalNiv.isSelected()) evaXLevel = "Si";
                String evaAnual = "No";
                if (DExpediente.cbEvalAnual.isSelected()) evaAnual = "Si";
                String hCPed = "No";
                if (DExpediente.cbHistCliPed.isSelected()) hCPed = "Si";
                String infoSeg = "No";
                if (DExpediente.cbInfoSeg.isSelected()) infoSeg = "Si";
                String tarVac = "No";
                if (DExpediente.cbTarVac.isSelected()) tarVac = "Si";
                String trnfProf = "No";
                if (DExpediente.cbTransProf.isSelected()) trnfProf = "Si";
                String fMC = "No";
                if (DExpediente.cbFondoMC.isSelected()) fMC = "Si";
                String tPE = "No";
                if (DExpediente.cbTipoPE.isSelected()) tPE = "Si";
                String bolet = "No";
                if (DExpediente.cbBoletin.isSelected()) bolet = "Si";
                String partcActCom = "No";
                if (DExpediente.cbPartActCompl.isSelected()) partcActCom = "Si";
                String regNecSpe = "No";
                if (DExpediente.cbRegNecEsp.isSelected()) regNecSpe = "Si";
                String visit = "No";
                if (DExpediente.cbVisitas.isSelected()) visit = "Si";
                String regPartPad = "No";
                if (DExpediente.cbRegPartPad.isSelected()) regPartPad = "Si";
                String regAnecd = "No";
                if (DExpediente.cbRegAnec.isSelected()) regAnecd = "Si";
                String regBenfCIV = "No";
                if (DExpediente.cbRegBenef.isSelected()) regBenfCIV = "Si";
                
                ps.setString(1, cAlumno+cGrupo);
                ps.setInt(2, cAlumno);
                ps.setString(3, hojaP);
                ps.setString(4, partNac);
                ps.setString(5, ficSocE);
                ps.setString(6, histNin);
                ps.setString(7, notaAut);
                ps.setString(8, updPer);
                ps.setString(9, regCarta);
                ps.setString(10, cuadCarta);
                ps.setString(11, regRegal);
                ps.setString(12, evaXLevel);
                ps.setString(13, evaAnual);
                ps.setString(14, hCPed);
                ps.setString(15, infoSeg);
                ps.setString(16, tarVac);
                ps.setString(17, trnfProf);
                ps.setString(18, fMC);
                ps.setString(19, tPE);
                ps.setString(20, bolet);
                ps.setString(21, partcActCom);
                ps.setString(22, regNecSpe);
                ps.setString(23, visit);
                ps.setString(24, regPartPad);
                ps.setString(25, regAnecd);
                ps.setString(26, regBenfCIV);
                ps.setString(27, lib.getFechaActual());
                ps.setString(28, D_Login.getNameCU());

                ps.executeUpdate();
                conx.close();
                
                res = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error aqui: " + e.getMessage());
            res = false;
        }
        return res;
    }
}