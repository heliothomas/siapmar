
package sc;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class librera {
    
private static librera libr = new librera();
    
    public static void main(String[] args) {
        
        Library lib = new Library();

        lib.setUserAcc("Fanny López");
        
        JOptionPane.showMessageDialog(null, "Nombre de usuario es: " + lib.getUserAcc() +
                "\nEdad: " + lib.getEdad("19/09/1990")+"\nFecha actual: "+lib.getFechaActual() +
                "\nResolución de pantalla: " + libr.getResolucion());
    }
    
    public String getResolucion(){
        String a = "helio y,mary se aman";
        String[] x = a.split(",");
        System.out.println("resultado:\n"+ x[0] + "\n" + x[1]);
        
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Tu resolución es de " + screenSize.width + " x " + screenSize.height);
        
        return screenSize.width + " x " + screenSize.height;
    }
}
