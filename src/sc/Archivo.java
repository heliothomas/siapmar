
package sc;

import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {

    File f;
    FileReader lectorArchivo;
    FileWriter escritorArchivo;
    
    public void concatenar(String nombre, String texto)
    {
        String temp = this.leer(nombre);
        temp = temp +texto;
        this.crearTxt(nombre, temp);
    }

    public boolean crearTxt(String nombre,String texto)
    {
        boolean res = false;
        try{
            f= new File(nombre);
            escritorArchivo = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escritorArchivo);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.write(texto);
            salida.close();
            res = true;
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return res;
    }

    public String leer(String nombre)
    {
        File f;
        FileReader lectorArchivo;
        try{
            f = new File(nombre);
            lectorArchivo = new FileReader(f);
            BufferedReader br = new BufferedReader(lectorArchivo);
            String l="";
            String aux="";
            while(true)
            {
               aux=br.readLine();
               if(aux!=null)
                    l=l+aux+"\n";
               else
                   break;

            }
            br.close();
            lectorArchivo.close();
            return l;
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return null;
    }

    public  String leerGrafico()
    {
        File f;
        javax.swing.JFileChooser j= new javax.swing.JFileChooser();
        j.showOpenDialog(j);
        String path= j.getSelectedFile().getAbsolutePath();
        String lectura="";
        f = new File(path);
        try{
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux;
        while((aux = br.readLine())!=null)
            lectura = lectura+aux+"\n";
        }catch(IOException e){}
        return lectura;
    }

}