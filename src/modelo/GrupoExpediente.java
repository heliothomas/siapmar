
package modelo;

public class GrupoExpediente {
    
    private String code, name, docente;
    
    public GrupoExpediente(String codigo, String nombre, String doc) {
        this.code = codigo;
        this.name = nombre;
        this.docente = doc;
    }
    
    public String getCode(){
        return code;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public String getDocente() {
        return docente;
    }
    
}
