
package sc;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    Image img;
    
    public ImagePanel(){
        // make sure the parent JPanel constructor is called
        // so it does whatever it needs to do first.
        super();
        File imag = new File(getClass().getResource("/imgsys/FechaVacunacion.png").getPath());
        img = loadImage(imag);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(img != null) {
            g.drawImage(img, 0, 0, this);
        }
    }
    
    public Image loadImage(File f) {
        Image image = getToolkit().getImage(f.getPath());        
        return image;
    }
}
