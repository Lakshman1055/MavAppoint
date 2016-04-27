package uta.mav.appoint;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import uta.mav.appoint.beans.GetSet;
import uta.mav.appoint.db.DatabaseManager;
import uta.mav.appoint.login.LoginUser;

/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/ForgotPassword")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	String header;
	String confirmEmail;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ForgotPasswordServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
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
		request.getRequestDispatcher("/WEB-INF/jsp/views/forgotpassword.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		session = request.getSession();
		confirmEmail = request.getParameter("emailAddress");
		String Usq1 = request.getParameter("securityQuestion1");
		String Usq2 = request.getParameter("securityQuestion2");
		String Usq3 = request.getParameter("securityQuestion3");

		DatabaseManager dbm = new DatabaseManager();
		try {
			GetSet get = dbm.getSecurityQuestions(confirmEmail);

			if (get.getsecurityQuestion1().equals(Usq1) && get.getsecurityQuestion2().equals(Usq2)
					&& get.getsecurityQuestion3().equals(Usq3)) {

				Email.sendEmail(confirmEmail, "Password change request", "Click on the below link to change password.\n"
						+ "http://localhost:8080/MavAppoint/changepassword?uemail=" + confirmEmail);
			}
			response.sendRedirect("index");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
