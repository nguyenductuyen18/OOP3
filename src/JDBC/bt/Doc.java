package JDBC.bt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Doc {
    public static void main(String[] args) throws SQLException {

        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();
        String sytax = "SELECT * From product_manager where id = 3  ";
        Statement stm = null;
        stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sytax);
        while (rs.next()) {
            //name varchar(255),price char,detail varchar(255),manufacturer varchar(255),number int ,status boolean)";
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int price = rs.getInt("price");
            String detail = rs.getString("detail");
            String manufacturer = rs.getString("manufacturer");
            int number = rs.getInt("number");
            boolean status = rs.getBoolean("status");
            System.out.println(id+name+price+detail+manufacturer+number+status);
        }
        connection.close();


    }
}
