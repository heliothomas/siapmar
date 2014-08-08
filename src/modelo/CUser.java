
package modelo;

public class CUser {
    private String uname, cargo, name;
    private int estado;

    public CUser(String usern, String carg, String nombre, int state) {
        this.uname = usern;
        this.cargo = carg;
        this.name = nombre;
        this.estado = state;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
    @Override
    public String toString(){
        return uname;
    }
}