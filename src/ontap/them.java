package ontap;

import JDBC.bt.ConnectJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class them {
    public static void main(String[] args) throws SQLException {
        ontap.ConnectJDBC connectJDBC = new ontap.ConnectJDBC();
        Connection conn = connectJDBC.connection();
//        String query = "insert into Authors values (10,'B','2004-3-8','A') ";
//        String query = "insert into Genres values (10,'Boo') ";
        String query = "insert into Book values (10,'tuyen','2004-3-8',10,10) ";
        PreparedStatement preparedStatement =conn.prepareStatement(query);
        int number = preparedStatement.executeUpdate();
        if (number!=0){
            System.out.println("thanh cong");
        }
        preparedStatement.close();
    }
}
