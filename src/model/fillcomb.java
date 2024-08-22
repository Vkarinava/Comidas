
package model;
import controller.conexion;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class fillcomb {
   
    public void fillcombobox(String comb, String platillo, JComboBox combo){
                String sql = "SELECT * FROM comida WHERE (tipo ='"+comb+"')";
                java.sql.Statement st;
                conexion con = new conexion();
                Connection conn = con.getConnection();
                try
                {
                    st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next())
                    {
                        combo.addItem(rs.getString(platillo));
                    }

                }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "ERROR" + e.toString());
            }
     }
    
    public void precio(String comb, String precio, JTextField combo){
        String sql = "SELECT * FROM comida WHERE (menu ='"+comb+"')";
                java.sql.Statement st;
                conexion con = new conexion();
                Connection conn = con.getConnection();
                try
                {
                    st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next())
                    {
                        combo.setText(rs.getString(precio));
                    }

                }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "ERROR" + e.toString());
            }
    }
}
