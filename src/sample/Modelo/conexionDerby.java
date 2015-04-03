package sample.Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
/**
 * Created by Juan on 03/04/2015.
 */
public class conexionDerby {
    private static String dbURL = "jdbc:derby://localhost:1527/APP;create=false;user=me;password=mine";
    private static String tableName = "USERS";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;

    private static void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL);
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }

}
