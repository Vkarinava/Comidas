
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.menu;

public class menus {
    
    private menu obj_menu= new menu(); 
    
    public menu getObj_menu() {
            return obj_menu;
        }
    
    public  void traer_food(Connection conexion) throws SQLException {
        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM 'comidas'"  );
            
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                System.out.println(resultado.getString("titulo"));
                System.out.println(resultado.getInt("nivel_de_prioridad"));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        
    }
    
}
