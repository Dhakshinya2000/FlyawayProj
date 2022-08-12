package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		PrintWriter o = response.getWriter();
		o.println("<html><body>");
		o.println("<br/><br/>");
		o.println("<h1>User Details</h1>");
		o.println("<br/><br/>");
		o.println("Date Of Travel: "+s.getAttribute("date"));
		o.println("<br/><br/>");
		o.println("Flight Name: "+s.getAttribute("flight name"));
		o.println("<br/><br/>");
		o.println("Airlines: "+s.getAttribute("Airlines"));
		o.println("<br/><br/>");
		o.println("Boarding Point: "+s.getAttribute("Boarding Point"));
		o.println("<br/><br/>");
		o.println("Destination: "+s.getAttribute("Destination"));
		o.println("<br/><br/>");
		o.println("Number Of Passengers: "+s.getAttribute("Nop"));
		o.println("<br/><br/>");
		o.println("Price: "+s.getAttribute("Price"));
		o.println("<br/><br/>");
		o.println("Total Price: "+s.getAttribute("TotalPrice"));
		o.println("<br/><br/>");
		o.println("</html></body>");
		RequestDispatcher rd = request.getRequestDispatcher("UserDetails");
		rd.include(request, response);
	}

}
