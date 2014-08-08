
package modelo;

public class Grupo {
    
    private String code, name, docente;
    private int of , to;
    
    public Grupo(String codigo, String nombre, int de, int a, String profesor) {
        this.code = codigo;
        this.name = nombre;
        this.of = de;
        this.to = a;
        this.docente = profesor;
    }
    
    public String getCode(){
        return code;
    }
    
    @Override
    public String toString(){//getName
        return name;
    }
    public int getOf(){
        return of;
    }
    public int getTo(){
        return to;
    }
    
    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
    
}