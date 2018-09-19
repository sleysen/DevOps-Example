 package com.training.devops;
 
 import java.io.IOException;
 import java.io.PrintWriter;
 
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 
 /**
  * Servlet implementation class AddNumbers
  */
 @WebServlet("/AddNumbers")
 public class AddNumbers extends HttpServlet {
 	private static final long serialVersionUID = 1L;
        
     /**
      * @see HttpServlet#HttpServlet()
      */
     public AddNumbers() {
         super();
         // TODO Auto-generated constructor stub
     }
 
 	/**
 	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
 	 */
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		String a_string = request.getParameter("a");
 		int a = Integer.parseInt(a_string);
 		String b_string = request.getParameter("b");
		int b = Integer.parseInt(b_string);
 		Operations operation = new Operations();
		int result = operation.addition(a, b);
 		
		Operations operation = new Operations();	
		response.setContentType("text/html");
		int result;
		String operation_name = "";
		
		String operation_request = request.getParameter("sb");
		if(operation_request.equals("A+B")) {
			result = operation.addition(a, b);
			operation_name = "addition";
		}
		else {			
			result = operation.multiplication(a,b);
			operation_name = "multiplication";
		}
		
		 request.setAttribute("result", result);
		 request.setAttribute("operation_request", operation_name);
		 request.getRequestDispatcher("/result.jsp").include(request, response);
 		
		//PrintWriter out = response.getWriter();
		//out.print("<h1>Addition Result </h1>");
		//out.print("The result is : <b>" + result + "</b>");
	    request.setAttribute("result", result);
	    request.getRequestDispatcher("/result.jsp").include(request, response);
		//response.sendRedirect("result.jsp");
		
 	}
  	/**
 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 	 */
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		// TODO Auto-generated method stub
 		doGet(request, response);
 	}
 
 }