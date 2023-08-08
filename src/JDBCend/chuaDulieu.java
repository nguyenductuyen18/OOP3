package JDBCend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class chuaDulieu {
    private String hostName = "localhost:3306";
    private String dbName = "demo_jdbc";
    private String username = "root";
    private String password = "1";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;
    public chuaDulieu chuaDulieu() throws SQLException {
        Connection connection = null ;
        connection = DriverManager.getConnection(connectionURL,username,password);
        System.out.println("ket noi thanh cong");
        return (chuaDulieu) connection;
    }

}
