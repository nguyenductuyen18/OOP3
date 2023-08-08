package JDBC.bt;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class them_kieu_Statement {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();
        String syntax = "insert into product_manager values (22,'tuyen','8','xe tang','hihi',10,true)";
                Statement stmt = conn.createStatement();
        stmt.executeUpdate(syntax);
    }


}
