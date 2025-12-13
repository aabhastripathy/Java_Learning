package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(name = "myGreetingServlet", urlPatterns = { "/doGreet" })
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		System.out.println("Inside init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside destroy()");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//When a request is made to this Servlet this doGet() method gets invoked it provides logic for handling the request
		System.out.println("Request Recived");
		response.setContentType("text/html");// MIME -> Multipurpose Internet Mail Extension
		String responseText = "<h1 style = 'color:red'>Welcome To Servlet</h1>";
		PrintWriter out = response.getWriter();
		out.println(responseText);
	}

}
