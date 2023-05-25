

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Login page 2</title><body><center>");
		
		String uname = request.getParameter("txtId");
		String upass = request.getParameter("txtpass");
		
		if (uname.equals("om") && upass.equals("1234")) {
			out.println("<h1>Welcome " + uname + " </h1>");
		}
		else {
			out.println("<h1>Wrong credentials entered</h1>");
		}
		
		out.println("</center></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
