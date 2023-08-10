package JDBC.bt;

import java.sql.*;

public class ConnectJDBC {
    private String hostName = "localhost:3306";
    private String dbName = "product_manager_database";
    private String username = "root";
    private String password = "1";

    private String connectionURL = "jdbc:mysql://"+ hostName+"/"+dbName;
    public Connection connect() throws SQLException {
        Connection cnt = null;
        cnt = DriverManager.getConnection(connectionURL,username,password);

        System.out.println("thanh cong");
       return cnt;


    }



    public static void main(String[] args) throws SQLException {
//        ConnectJDBC connectJDBC = new ConnectJDBC();
//        Connection conn = connectJDBC.connect();
//        String syntax = "create table product_manager(id int primary key,name varchar(255),price char,detail varchar(255),manufacturer varchar(255),number int ,status boolean)";
//        PreparedStatement preparedStatement = null;
//        preparedStatement = conn.prepareStatement(syntax);
//        int soluong =preparedStatement.executeUpdate();
//        while (soluong!=0){
//            System.out.println("them thanh cong");
//        }
//        preparedStatement.close();














    }



}


