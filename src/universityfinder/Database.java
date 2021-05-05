/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfinder;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rubayet Anjum Joy
 */
public class Database {
      Connection conn=null;
    
    public static Connection ConnecrDb(){
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","");
                 return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
