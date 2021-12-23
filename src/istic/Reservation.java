package istic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Reservation {
	private int id;
	private int bookid;
	private Date reservation_begin_date;
	private Date reservation_end_date;
	private Date reservation_return_date;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public Date getReservation_begin_date() {
		return reservation_begin_date;
	}

	public void setReservation_begin_date(String reservation_begin_date) throws ParseException {
		Date x = new SimpleDateFormat("yyyy-MM-dd").parse(reservation_begin_date);
		this.reservation_begin_date = x;
		
		
		
	}

	public Date getReservation_end_date() {
		return reservation_end_date;
	}

	public void setReservation_end_date(String reservation_end_date) throws ParseException {
		// converting Stirng to LocalDate and add Days
		LocalDate date = LocalDate.parse(reservation_end_date);
	    LocalDate ndate = date.plusDays(7);
	    // Converting LocalDate to Date
	    Date x = Date.from(ndate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	    // change the format to yyyy-MM-dd
	    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
	    Date y = new SimpleDateFormat("yyyy-MM-dd").parse(formater.format(x));
	    
	    this.reservation_end_date = y;
	    
	}

	public Date getReservation_return_date() {
		return reservation_return_date;
	}

	public void setReservation_return_date(Date reservation_return_date) {
		this.reservation_return_date = reservation_return_date;
	}
	


	public Reservation() {
		
	}

}
