
package bloodcare;

// Database Connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection mycon() {
    Connection con = null ;
    
     try { 
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/BloodCare", "root", "");
     } catch (ClassNotFoundException |  SQLException e) {
         System.out.println(e);
    }
    return con;
}
}
      
