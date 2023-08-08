package JDBC.bt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sua {
    public static void main(String[] args) throws SQLException {
                ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();
        String sytax =    "update product_manager set detail ='dữliệu mớ' where id = 4";

        PreparedStatement preparedStatement = null;
        preparedStatement = conn.prepareStatement(sytax);
        int row = preparedStatement.executeUpdate();
        if(row != 0){
            System.out.println("Cập nhật thành công " + row);
        }
conn.close();
    }

}
