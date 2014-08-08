
package modelo;

public class Carta {
    private String nombre;
    
    public Carta(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
}