
package model;


public class Vegetariano extends comidas {
    
    public Vegetariano() {
        
    }

    

    @Override
    public String incluye() {
        return "productos de origen vegetal, puede incluir huevo, queso etc";
        
    }

    @Override
    public String prices() {
        return "de 20.000 COP en adelante...";
    }
}
