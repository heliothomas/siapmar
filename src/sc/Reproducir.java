package sc;

import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;
import vista.DSonidoIS;

public class Reproducir extends Thread{

private static Player mp3;

    public Reproducir(String s){
        super(s);
    }

    public void run() {
        if (getName().equals("musica")){
            playMp3();
        }
    }
    
    public static void detener(){
        mp3.close();
    }
    
    public void playMp3(){
        try {
            String opt = DSonidoIS.buttonGroup1.getSelection().getActionCommand();
            String abspath = "";
            File file = null;

            if (!opt.equals("0")) {
                if (opt.equals("1")) {                    
                    int imgPred = DSonidoIS.cbxSoundPred.getSelectedIndex();
                    String rutaProj = System.getProperty("user.dir");
                    
                    if (imgPred == 0) {
                        file = new File(rutaProj + "/files/is1.mp3");
                    }
                    if (imgPred == 1) {
                        file = new File(rutaProj + "/files/is2.mp3");
                    }
                    if (imgPred == 2) {
                        file = new File(rutaProj + "/files/is3.mp3");
                    }
                    if (imgPred == 3) {
                        file = new File(rutaProj + "/files/is4.mp3");
                    }
                    if (imgPred == 4) {
                        file = new File(rutaProj + "/files/is5.mp3");
                    }
                    abspath = file.getAbsolutePath();
                }else{
                    String txt = DSonidoIS.tfURL.getText();
                    if (!txt.equals("")) {
                        abspath = txt;
                    }   
                }
                
                FileInputStream fis = new FileInputStream(abspath);
                mp3 = new Player(fis);
                mp3.play();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al sonar el mp3: " + e.getMessage());
        }
    }

    public static void main(String[] args){
        new Reproducir("musica").start();
    }

}