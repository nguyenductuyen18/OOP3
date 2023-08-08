package JDBC.thuchanh;

import JDBC.thuchanh.ConnectJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class doc_du_lieu {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();
        // truy van
        String query = "SELECT * FROM users";
// tao Statement phair cos Statement ms truy van dc
        Statement stm = null;
        try {
            stm = conn.createStatement();
//Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);

          //  Duyệt kết quả trả về và in ra kết quả

            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                System.out.println(id + " - " + username + " - " + password + " - " + email);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
