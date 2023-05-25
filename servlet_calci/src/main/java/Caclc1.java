

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Caclc1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Answer</title></head><body><center>");
		Double a = Double.parseDouble(request.getParameter("num1"));
		Double b = Double.parseDouble(request.getParameter("num2"));
		Double c = 0.0;
		String op = request.getParameter("opr");
		if (op.equals("+")) c=a+b;
		if (op.equals("-")) c=a-b;
		if (op.equals("*")) c=a*b;
		if (op.equals("/")) c=a/b;
		
		out.println("<h3>Result: " + c + "</h3>");
		out.println("To go to main page <a href=index.html>Click here</a>");
		out.println("</center></body></html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
