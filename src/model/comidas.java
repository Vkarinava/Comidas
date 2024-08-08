
package model;

public abstract class comidas {
    private  String nombre;
    
    public comidas() {

    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String incluye();
    public abstract String prices();
}



