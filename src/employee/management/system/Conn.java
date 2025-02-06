
package employee.management.system;
/**
 *
 * @author Gulshan kumar 
 */
import java.sql.*;
public class Conn
{
    Connection c;
    Statement s;
    //Database connection
    public Conn()
    {
          //  Exception handling
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
           // c = DriverManager.getConnection("jdbc:mysql://localhost(Error):3066?Employee","root","gulshan");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3066/Employee","root","gulshan");
            s = c.createStatement();
        }
        catch(Exception e)
        {
          e.printStackTrace();   
         // System.out.print("Coming Exception : +"+e);
        }
    }
    
}
