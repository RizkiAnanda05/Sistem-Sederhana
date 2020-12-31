
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class konfig {
    
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/sip";
            String user = "root";
            String Password = "";
            DriverManager .registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url,user,Password);
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal mengkoneksi data");
        }
        return mysqlconfig;
    }
    
    
}
