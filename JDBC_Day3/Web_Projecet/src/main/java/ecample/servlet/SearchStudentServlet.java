package ecample.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.jdbc.*;
import example.jdbc.Student;


@WebServlet("/doSearch")
public class SearchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String student_id = request.getParameter("studentId");
		int studentId = Integer.parseInt(student_id);
		
		
		
		DaoInterface<Student,Integer> daoRef = new StudentDao();
		Student foundStudent = daoRef.getOne(studentId);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		RequestDispatcher dispatcher = null;
		
		if(foundStudent != null) {
			//send this student to next servlet 
			//	
			dispatcher = request.getRequestDispatcher("doDisplay");
			request.setAttribute("currentStudent", foundStudent);
			dispatcher.forward(request, response);
			out.println("<h1>Student Found </h1>");
			}
		else {
			out.println("<h1>Student Not Found, Please Try Again  </h1>");
			
			dispatcher = request.getRequestDispatcher("search_student.html ");
			dispatcher.include(request, response);
		}
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
