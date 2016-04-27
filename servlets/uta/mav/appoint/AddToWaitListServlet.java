package uta.mav.appoint;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import uta.mav.appoint.db.DatabaseManager;
import uta.mav.appoint.login.LoginUser;

/**
 * Servlet implementation class AddToWaitList
 */
@WebServlet("/AddToWaitList")
public class AddToWaitListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HttpSession session;
    String header;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToWaitListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		session = request.getSession();
		LoginUser user = (LoginUser) session.getAttribute("user");
		if (user == null) {
			user = new LoginUser();
			session.setAttribute("user", user);
		}
		try {
			header = "templates/" + user.getHeader() + ".jsp";
		} catch (Exception e) {

		}
		request.setAttribute("includeHeader", header);
		request.getRequestDispatcher("/WEB-INF/jsp/views/addtowaitlist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		session = request.getSession();
		String userName = request.getParameter("username");
		String userEmail = request.getParameter("useremail");
		
		DatabaseManager dbm = new DatabaseManager();
		try{
			dbm.updateWaitlist(userName, userEmail);
			response.sendRedirect("index");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
