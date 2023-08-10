package ontap;

import java.sql.*;

public class DocBook {
    public static void main(String[] args) throws SQLException {
        ontap.ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connec = connectJDBC.connection();
        String quayry = "SELECT book_id,title,publication_year FROM Book";

        Statement statement=null;
        statement = connec.createStatement();
        ResultSet rs=statement.executeQuery(quayry);


        while (rs.next()){
            int id = rs.getInt("book_id");
            String title = rs.getNString("title");
            String data = String.valueOf(rs.getDate("publication_year"));
            String author = rs.getNString("author_name");
            String genre = rs.getNString("genre_name");
            System.out.println(id+title+data+author+genre);
        }
        statement.close();
    }


}
