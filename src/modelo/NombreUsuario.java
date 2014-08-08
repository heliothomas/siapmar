
package modelo;

public class NombreUsuario {
    
    private String uname;
    
    public NombreUsuario(String userName) {
        this.uname = userName;
    }
    
    
    @Override
    public String toString(){
        return uname;
    }
    
}
