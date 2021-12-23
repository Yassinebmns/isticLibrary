package istic;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ServletBook
 */
@WebServlet("/ServletBook")
public class ServletBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String LIST_BOOKS = "/books.jsp";
    private static String PAGE_404 = "/404.jsp";

    private bookDao dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBook() {
        super();
        dao = new bookDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("listBooks")){
            forward = LIST_BOOKS;
            request.setAttribute("books", dao.getAllBooks());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Creation d'objet
				Book b=new Book();				
				//Recuperation des donnes
				//int id=Integer.parseInt(request.getParameter("id"));
				String title=request.getParameter("title");
				String author=request.getParameter("author");
				String type=request.getParameter("type");
				String image=request.getParameter("image");
				
				//Set of Values
				//b.setId(id);
				b.setAuthor(author);
				b.setImage(image);
				b.setTitle(title);
				b.setType(type);
				
				// Insert Querry lel object "b" fel table book
				
				
				
	}

}
