
package controller;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class conexion {
    private static Connection conn;
   
    public conexion(){

        String driver = "com.mysql.cj.jdbc.Driver";
        String userdb = "root";
        String passdb = "Admin0101";
        String url = "jdbc:mysql://localhost:3306/comidas";

        try{
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url, userdb, passdb);
            if(conn != null){
                System.out.println("Conexión establecida exitosamente***********");
            }
            // Connect?
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Conexión Fallida:\n\n"+ex);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    /*
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/test";

    public void conection(String Nombre,String tipo) {
        con=null;
        try{
            Class.forName(driver);
            con= DriverManager.getConnection(url, user, pass);
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion" + e);
        }   
    }*/
}
