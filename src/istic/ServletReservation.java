package istic;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletReservation
 */
@WebServlet("/ServletReservation")
public class ServletReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private reservationDao dao;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletReservation() {
        super();
        dao = new reservationDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Reservation r=new Reservation();
		int bookid=Integer.parseInt(request.getParameter("id"));
		String date=request.getParameter("date");
			
		try {
			r.setReservation_begin_date(date);
			r.setReservation_end_date(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.setBookid(bookid);
		
		System.out.println("book id => "+r.getBookid());
		System.out.println("the date => "+date);
		System.out.println("rev begin date => "+r.getReservation_begin_date());
		System.out.println("rev end date ==> "+r.getReservation_end_date());
		
		dao.addResv(r);


		
		//String red=request.getParameter("date_end"); End date = rbd + 3jours
		
		
		
	}

}
