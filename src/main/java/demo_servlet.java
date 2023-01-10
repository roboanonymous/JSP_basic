import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/demo_servlet")

public class demo_servlet extends HttpServlet {
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException
	{
		String name = "Samyak" ;
		
		
		request.setAttribute("label", name);
		RequestDispatcher rd =  request.getRequestDispatcher("Display.jsp");
		
		rd.forward(request, response);
		
	}

}
