package Myproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.io.PrintWriter;

/**
 * Servlet implementation class Calculator and Mapping using a xml code 
 */ 
public class Calculator extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    
		     double  num1 = Double.parseDouble(request.getParameter("num1"));
		     double  num2 = Double.parseDouble(request.getParameter("num2"));
		     String op = request.getParameter("operation");
		     
		     double result = 0;
		     String message = "";
		      
		     // logic in java
		     switch(op) {
		     case "add" : 
		    	 result = num1 + num2;
		    	 message = "Add";
		    	 break;
		     case "sub" : 
		    	 result = num1 - num2;
		    	 message = "SUbtraction";
		    	 break;
		     case "mul" : 
		    	 result = num1 * num2;
		    	 message = "multipaction";
		    	 break;
		     case "div" : 
		    	 try{
		    	 result = num1 / num2;
		    	 message = "Division";
		    	 }catch( Exception  e) {
		    		  message = "Error : ( divison is not possible becasue num2 is zero )";
		    	 }
		    	 break;
		    default: 
		    	message = "INvali operation : because , not avalibe this operation on thi caclator";
		     }
		     
		     out.println("<html><body>");
		     out.print("<h2> Result </h2>");
		     
		      if(message.startsWith("Error")) {
		    	  out.println("<p style='color:red'>" + message + "</p>");
		      } else {
		        out.println("<p>Operation: " + message + "</p>");
		        out.println("<p>Result: " + result + "</p>");
		      }
		      
        	out.println("<br><a href='index.html'>Back</a>");
           out.println("</body></html>");
	 	     

		     
	}

}
