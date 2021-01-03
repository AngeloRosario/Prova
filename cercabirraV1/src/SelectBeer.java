

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class SelectBeer
 */
@WebServlet("/SelectBeer")
public class SelectBeer extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Beer Selection advice<br>");
		
		String c = request.getParameter("color");
		
		out.println("<br>Got beer color" +c);
	}


}
