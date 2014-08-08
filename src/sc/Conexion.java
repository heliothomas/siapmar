//Clase Conexion

//Primero se debe de poner el paquete que contiene esta clase
package sc;

//Se importan las librerias necesarias para trabajar
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    //Se declara un String para obtener un mensaje de error posteriormente
    public static String errorMSG = "";

    //Se realiza la función getSLQConnection para obtener
    public static Connection getSQLConnection(){
        
        Archivo arc = new Archivo();
        
        //Se inicializa la instancia del objeto Connection
    	Connection con = null;
        
        //Dentro del bloque try se escribe el código que debe funcionar en el mejor de los casos
        try {
            
            //Así se registra el driver de PostgreSQL
            Class.forName("org.postgresql.Driver");
            
            String[] p = arc.leer("dbconfig").split(",");
            
            //En el password debo utilizar .trim() para que me elimine los espacios al inicio y al final de la cadena
            con = DriverManager.getConnection("jdbc:postgresql://"+ p[0] + ":" + p[1] + "/" + p[2], p[3], p[4].trim());
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println(errorMSG = e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        //Acá retorna la conexión a la base de datos en PostgreSQL
        return con;
    }

}