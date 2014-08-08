
package modelo;

public class Patro {
    private String nombre, id;
    
    public Patro(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
}