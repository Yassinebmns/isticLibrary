package istic;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class reservationDao {
	private Connection connection;

    public reservationDao() {
        connection = dbUtil.getConnection();
    }
	
	public void addResv(Reservation R){
		try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into istic_library.reservation(book_id,resv_begin_date,resv_end_date) values (? ,? , ? )");
            // Parameters start with 1
            preparedStatement.setInt(1, R.getBookid());
            preparedStatement.setDate(2, new java.sql.Date(R.getReservation_begin_date().getTime()));
            preparedStatement.setDate(3, new java.sql.Date(R.getReservation_end_date().getTime()));
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
    
    
	
}
