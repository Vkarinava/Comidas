
package controller;

import java.sql.*;
import java.sql.SQLException;

public class conexion {
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/test";
    // en su caso deben poner en URL, localhost o la ip
    //del servidor 

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
    }
}
