package JDBC.bt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class them {
    public static void main(String[] args) throws SQLException {
                        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();
        String syntax = "insert into product_manager values (29,'tuyen','8','xe tang','hihi',10,true)";
        PreparedStatement preparedStatement = null;
        preparedStatement = conn.prepareStatement(syntax);
        int soluong =preparedStatement.executeUpdate();
        if (soluong!=0){
            System.out.println("them thanh cong");
        }
        preparedStatement.close();


    }
}
