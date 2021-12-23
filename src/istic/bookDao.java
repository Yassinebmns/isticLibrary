package istic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import com.model.user;
//import com.util.dbUtil;

public class bookDao {

	private Connection connection;

    public bookDao() {
        connection = dbUtil.getConnection();
    }

    public void addbook(Book B) {       
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into book(title,author,type,image) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, B.getTitle());
            preparedStatement.setString(2, B.getAuthor());
            preparedStatement.setString(3, B.getType());
            preparedStatement.setString(4, B.getImage());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(int Idbook) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from book where book_id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, Idbook);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  /* 
    public void updateUser(user usr) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update test.user set  pass=?" +"where userid=?");
            // Parameters start with 1
            preparedStatement.setString(1, usr.getpass());
            preparedStatement.setInt(2, usr.getUserid());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
*/
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM istic_library.book");
            while (rs.next()) {
                Book bk = new Book();
                bk.setId(rs.getInt("book_id"));
                bk.setTitle(rs.getString("title"));
                bk.setAuthor(rs.getString("author"));
                bk.setType(rs.getString("type"));
                bk.setImage(rs.getString("image"));
                books.add(bk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    public Book getBookById(int Idbook) {
        Book bk = new Book();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from istic_library.book where book_id=?");
            preparedStatement.setInt(1, Idbook);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
            	bk.setId(rs.getInt("book_id"));
                bk.setTitle(rs.getString("title"));
                bk.setAuthor(rs.getString("author"));
                bk.setType(rs.getString("type"));
                bk.setImage(rs.getString("image"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bk;
    }
}








