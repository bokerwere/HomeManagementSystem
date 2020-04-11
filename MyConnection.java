
package homemanagementsystem.HomeRegistration;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {

    public static Connection getconnection() {
        Connection con=null;
        
        try{
          con= DriverManager.getConnection("jdbc:mysql://localhost/homemanagement","root", "");
            
         }catch(Exception ex){
            
        }
        return con;
        
    }
    
    
}
