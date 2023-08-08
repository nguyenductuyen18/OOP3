package JDBC;

import JDBC.thuchanh.ConnectJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Xoa_du_lieu_trong_table {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();

//        String query = "DELETE FROM users WHERE id = ?";
        String query = "DELETE FROM users WHERE username = ?";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

//            pstm.setInt(1, 1);
            pstm.setString(2," Do Bich Thuan");

            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Xóa thành công " + row);
            }

            //Đóng kết nối
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
