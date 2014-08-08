
package sc;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen extends JPanel{
    
    BufferedImage img;
    
    public Imagen(BufferedImage image, Dimension d){
        img = image;
        setSize(d);
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon imgFondo = new ImageIcon(img);//Capturamos la imagen
        g.drawImage(imgFondo.getImage(), 0, 0, getWidth(), getHeight(), null);//Asignacion de tamaño imagens
        setOpaque(false);
        super.paintComponent(g);
    }
    
}
