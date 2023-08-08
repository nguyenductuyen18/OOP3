package JDBC.bt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class xoa {
    public static void main(String[] args) throws SQLException {
                ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();
        String sytax = "DELETE FROM product_manager WHERE id=4 ";
        PreparedStatement preparedStatement = null;
        preparedStatement=connection.prepareStatement(sytax);
        int row = preparedStatement.executeUpdate();
        if (row!=0){
            System.out.println("delete thanh cong ");
        }
        connection.close();
    }
}
