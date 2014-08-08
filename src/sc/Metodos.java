
package sc;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Metodos {
    
    public static String ruta = "";
    private BufferedImage img = null;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen", "jpg","png");
    
    public void Abrir_Dialogo(JPanel p){
        JFileChooser elijo = new JFileChooser();
        elijo.setFileFilter(filter);
        elijo.setAcceptAllFileFilterUsed(false);
        
        int result = elijo.showOpenDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                //Se asigna a "ubicacion" el archivo de imagen seleccionado
                URL ubicacion = elijo.getSelectedFile().toURL();
                ruta = elijo.getSelectedFile().getAbsolutePath();
                //Se coloca en memoria
                cargarImagenEnBuffer(ubicacion);
                
                //Se añade al Panel
                p.add(new Imagen(getImagenDeBuffer(), p.getSize()));
                p.setVisible(true);
                p.repaint();                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "El error es: " + e.getMessage());
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    public BufferedImage getImagenDeBuffer(){
        return img;
    }
    
    private void cargarImagenEnBuffer(URL _ubicacion) throws IOException {
        img = ImageIO.read(_ubicacion);
    }
    
}
