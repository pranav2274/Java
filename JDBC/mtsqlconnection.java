//importing the required classes from java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connectionmanager {
    private static String url = "jdbc:mysql://localhost:3306/grey_goose";    
    private static String driverName = "com.mysql.cj.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "root@123";
    private static Connection con;
    private static String urlstring;

    public static Connection getConnect() throws ClassNotFoundException {
      Class.forName(driverName);                                           // registerd the JDBC driver
            try {
               con = DriverManager.getConnection(url, username, password); // formulate the JDBC url and establishing the connection
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        return con;                                                         // returning the connection object
    }
}

