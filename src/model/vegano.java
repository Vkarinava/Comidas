
package model;

public class vegano extends comidas {
    
    public vegano() {
    }

    @Override
    public String incluye() {
        return "productos de origen vegetal no incluyeproductos de origen animal";
        
    }

    @Override
    public String prices() {
        return "de 40.000 COP en adelante...";
    }
}