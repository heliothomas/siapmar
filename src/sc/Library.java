package sc;

import java.awt.Dimension;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import vista.IActualizacionPerfiles;
import vista.IFichaSocioEcon;
import vista.IFondoMedicoComp;
import vista.IHistory;
import vista.IInformeRefDiagTrat;
import vista.IPediatrica;
import vista.IPerfilAdministrativo;
import vista.IRegCorrespondencia;
import vista.IRegNecSpe;
import vista.IRevExp;
import vista.ITipoProgEdu;
import vista.IUserAccount;
import vista.IVisitas;
import static vista.MenuMain.dskp;

public class Library {

    Calendar c = new GregorianCalendar();
    String dia, mes, annio, hora, minuto, segundo, nombreUsuario;

    public Library(){

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        annio = Integer.toString(c.get(Calendar.YEAR));
        hora = Integer.toString(c.get(Calendar.HOUR));
        minuto = Integer.toString(c.get(Calendar.MINUTE));
        segundo = Integer.toString(c.get(Calendar.SECOND));
        
        if (dia.length() == 1) {
            dia = "0" + dia;
        }
        if (mes.length() == 1) {
            mes = "0" + mes;
        }
    }

    public String getFechaActual(){
        return dia +"/"+ mes +"/"+ annio;
    }
    
    public String getFechaActualCompleta(){
        return dia +"/"+ mes +"/"+ annio +" "+ hora +":"+ minuto +":"+ segundo;
    }

    public void setUserAcc(String uname){
        nombreUsuario = uname;
    }

    public String getUserAcc(){
        return nombreUsuario;
    }

    public int getEdad(String fecha){
        int edad = 0;
        //Fecha actual
        int day = c.get(Calendar.DATE);
        int month = c.get(Calendar.MONTH) + 1;
        int year = c.get(Calendar.YEAR);
        
        //Fecha obtenida en jdatechooser
        int dFN = Integer.parseInt(fecha.substring(0, 2));
        int mFN = Integer.parseInt(fecha.substring(3, 5));
        int aFN = Integer.parseInt(fecha.substring(6, 10));
        
        if (aFN <= year || aFN <= year && mFN <= month || aFN <= year && mFN <= month && dFN < day) {
            if (aFN < year) {
                
                if (mFN > month || dFN > day && mFN >= month || dFN <= day && mFN > month) {
                    edad = year - aFN - 1;
                } else {
                    edad = year - aFN;
                }
                
            } else {
                edad = year - aFN;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta");
        }
        
        return edad;
    }
    
    public static boolean checkEmail (String email) {

    // Establecer el patron
    Pattern p = Pattern.compile("[-\\w\\.]+@\\w+\\.\\w+");

    // Asociar el string al patron
    Matcher m = p.matcher(email);

   // Comprobar si encaja
    return m.matches();

    }

    public void openInternalFrame(final JInternalFrame iframe) {
        dskp.add(iframe);
        setLocation(iframe);
    }

    public void reopenInternalFrame(final JInternalFrame iframe) {
        JOptionPane.showMessageDialog(null, "El Formulario ya estaba abierto.");
        if (!iframe.isMaximum()) {
            iframe.getDesktopPane().getDesktopManager().deiconifyFrame(iframe);
            iframe.getDesktopPane().getDesktopManager().maximizeFrame(iframe);
            iframe.getDesktopPane().getDesktopManager().minimizeFrame(iframe);
            iframe.moveToFront();
        }
        setLocation(iframe);
    }

    private void setLocation(final JInternalFrame iframe) {
        Dimension deskSize = dskp.getSize();
        Dimension iFSize = iframe.getSize();
        iframe.show();
        iframe.setLocation((deskSize.width - iFSize.width)/2,(deskSize.height- iFSize.height)/2);
        iframe.toFront();
    }
}