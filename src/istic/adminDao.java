package istic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class adminDao {
	private Connection connection;
	
	public adminDao(){
		connection = dbUtil.getConnection();
	}
	
	
	 public boolean VerifyAdmin(Admin ad) {
	        boolean verif = false;
	        try {
	            PreparedStatement preparedStatement = connection.prepareStatement("select * from istic_library.admin where cin=? and password=?");
	            preparedStatement.setInt(1, ad.getCin());
	            preparedStatement.setString(2, ad.getPassword());
	            ResultSet rs = preparedStatement.executeQuery();

	            if (rs.next()) {
	            	verif = true;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return verif;
	    }
	
	
	
}



    










