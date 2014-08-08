
package modelo;

public class ProgEdu {
    private String nombre;
    
    public ProgEdu(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
}