package ontap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sua {
    public static void main(String[] args) throws SQLException {
        ontap.ConnectJDBC connectJDBC = new ontap.ConnectJDBC();
        Connection conn = connectJDBC.connection();
        String query = "update Authors set author_id =3 where author_id=21 ";
        PreparedStatement preparedStatement =conn.prepareStatement(query);
        int number = preparedStatement.executeUpdate();
        if (number!=0){
            System.out.println("thanh cong");
        }
        preparedStatement.close();
    }
}
