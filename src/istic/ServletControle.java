package istic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletControle
 */
@WebServlet("/ServletControle")
public class ServletControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private adminDao dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControle() {
        super();
        dao = new adminDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperation du Formulaire
		String cin= request.getParameter("cin"); // Username
		String pwd= request.getParameter("password"); // Password
		
		Admin ad=new Admin();
		ad.setCin(Integer.parseInt(cin));
		ad.setPassword(pwd);
		
		
		
		
	    if (dao.VerifyAdmin(ad)){
	    	this.getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
	    }
		else
			this.getServletContext().getRequestDispatcher("/books.jsp").forward(request, response); // PAGE D'ECHEC

			
	}

}
