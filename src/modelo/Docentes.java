
package modelo;

public class Docentes {
    
    private String name;
    
    public Docentes(String nombre) {
        this.name = nombre;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
