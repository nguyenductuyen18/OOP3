package ontap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {

     private String hostName = "localhost:3306";
    private String dbName = "list";
    private String username = "root";
    private String password = "1";
    private   String connectionURL = "jdbc:mysql://"+ hostName+"/"+dbName;



    public Connection connection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(connectionURL,username,password);
        System.out.println("thanh cong ");
        return connection;
    }

}

