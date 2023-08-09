package ontap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnetJDBc {
    private String hostName = "localhost:3306";
    private String dbName = "product_manager_database";
    private String users ="root";
    private String passwer = "1";

    private String connectionURL = "jdbc:mysql://"+ hostName+"/"+dbName;
    public Connection connect() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(connectionURL,users,passwer);
        System.out.println("da hoan thanh");
        return connection;
    }


}

    class them {
        public static void main(String[] args) throws SQLException {
            ConnetJDBc connetJDBc = new ConnetJDBc();
            Connection connection = connetJDBc.connect();
            String cuPhap = "insert into product_manager_database values () ";
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement(cuPhap);
            connection.close();
        }
    }
