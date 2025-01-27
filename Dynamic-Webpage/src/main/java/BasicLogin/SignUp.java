package BasicLogin;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter print = response.getWriter();
//		request.getParameter("firstName");
//		request.getParameter("lastname");
//		request.getParameter("email");
//		request.getParameter("password");
//		request.getParameter("gender");
//		request.getParameter("password");
//		print.println("Registration Success");
//		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.html");
		dispatcher.forward(request, response);
	}
}
