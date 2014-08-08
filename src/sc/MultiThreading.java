package sc;

import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;
import modelo.D_Login;
import vista.MenuMain;

public class MultiThreading extends Thread{

    public MultiThreading(String s){
        super(s);      
    }

    public void run() {
        if (getName().equals("music")){
            iniciosesion();
        }
        if (getName().equals("ui")){
            MenuMain frmMain = new MenuMain();
            if (D_Login.cargo.equals("Secretario")) {
                MenuMain.miRtCU.setEnabled(false);
            }
            if (D_Login.cargo.equals("Docente")) {
                MenuMain.menuReportes.setEnabled(false);
                MenuMain.menuConfigur.setEnabled(false);
                MenuMain.miCU.setEnabled(false);
                MenuMain.miPerfAdm.setEnabled(false);
                MenuMain.miABAlumno.setEnabled(false);
            }
            frmMain.setVisible(true);
        }
    }

    public void iniciosesion(){
        try {
            String opcion = D_Login.rutaSong;
            String abspath = "";
            File file = null;
            
            if (opcion != null) {
                if (!"".equals(opcion)) {
                if (!opcion.equals("No") && !D_Login.ClaveMaestra.equals("Htmf1991h1t9m9f1")) {
                    if (opcion.length() < 5) {
                        String rutaProj = System.getProperty("user.dir");
                        
                        if (opcion.equals("is1")) {
                            file = new File(rutaProj + "/files/is1.mp3");
                        }
                        if (opcion.equals("is2")) {
                            file = new File(rutaProj + "/files/is2.mp3");
                        }
                        if (opcion.equals("is3")) {
                            file = new File(rutaProj + "/files/is3.mp3");
                        }
                        if (opcion.equals("is4")) {
                            file = new File(rutaProj + "/files/is4.mp3");
                        }
                        if (opcion.equals("is5")) {
                            file = new File(rutaProj + "/files/is5.mp3");
                        }
                        abspath = file.getAbsolutePath();
                    }else{
                        abspath = opcion;
                    }

                    FileInputStream fis = new FileInputStream(abspath);
                    Player playmp3 = new Player(fis);
                    playmp3.play();
                }
            }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new  MultiThreading("music").start(); 
        new  MultiThreading("ui").start();  
    }
    
}