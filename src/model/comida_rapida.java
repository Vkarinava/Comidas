
package model;

public class comida_rapida  extends comidas {
    
    public comida_rapida() {
    }

    

    @Override
    public String incluye() {
        return "productos altos en grasa y sazonadores";
        
    }

    @Override
    public String prices() {
        return "de 8.000 COP en adelante...";
    }
}
