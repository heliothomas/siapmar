
package modelo;

import java.util.*;
import java.sql.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import sc.Conexion;
import vista.DAccesoPerdido;

public class MandarMail {
    
Connection conx;
Statement stm;
ResultSet rs;
    
    public void Send(String email){
        try {
            Properties prop = new Properties();
            prop.setProperty("mail.smtp.host","smtp.live.com");
            prop.setProperty("mail.smtp.starttls.enable","true");
            prop.setProperty("mail.smtp.port","587");//587 25
            prop.setProperty("mail.smtp.user","htmf@hotmail.es");
            prop.setProperty("mail.smtp.auth","true");
            
            Session sesion = Session.getDefaultInstance(prop);
            
            MimeMessage message = new MimeMessage(sesion);
            
            message.setFrom(new InternetAddress("thomas_moraflores@yahoo.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("thomas_moraflores@yahoo.com"));
            
            message.setSubject("Enviado por SIAPMAR");
            message.setText("Enviado desde SIAPMAR (Sistema de Información para el control de Actividades Programáticas Marcos 10:14).\n\n"
                    + "Estimado usuario(a): " + DAccesoPerdido.lbName.getText()
                    + "\n\nSu cuenta de usuario es: "+DAccesoPerdido.lbCU.getText()+
                    "\nY su contraseña es: " + consultarPass(DAccesoPerdido.lbCU.getText())+
                    "\n\nCon esos datos podrá tener acceso al sistema."
                    + " Recuerde cambiar su contraseña por una más compleja."
                    + " Y no proporcione sus datos de acceso a nadie.");
            
            Transport t = sesion.getTransport("smtp");
            t.connect("htmf@hotmail.es","h1t9m9f1");
            t.sendMessage(message, message.getAllRecipients());
            
            t.close();
            
            JOptionPane.showMessageDialog(null, "Felicidades, se ha enviado un mensaje a este correo electrónico:\n"+email+
                    "\nPara que pueda ingresar a SIAPMAR con sus datos de acceso");
            DAccesoPerdido.lbResultado.setText("El email se ha enviando satisfactoriamente");
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo enviar el email.\n"
                    + "Compruebe que tenga una conexión fluída a Internet.\n"
                    + "Error: " + e.getMessage());
            DAccesoPerdido.lbResultado.setText("No se ha enviado el email");
        }
    }
    
    public String consultarPass(String uname){
        String passw = "";
        try {
            conx = Conexion.getSQLConnection();

            if (conx != null) {
                stm = conx.createStatement();
                rs = stm.executeQuery("SELECT c_uname, c_passw, s_cargo, s_name FROM Login WHERE c_uname = '"+uname+"'");
                
                if (rs.next()) {
                    passw = rs.getString("c_passw");
                }

                rs.close();
                conx.close();
        } 
        }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return passw;
    }
    
}