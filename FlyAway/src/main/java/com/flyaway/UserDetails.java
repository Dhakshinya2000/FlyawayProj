package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class UserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter o = response.getWriter();
		o.println("<html><body>");
		o.println("<form action='UserDetailsDisplay' method='get'>");
		o.println("Enter Customer Name: <input type='text' name='custname'>");
		o.println("<br/><br/>");
		o.println("Enter Customer Password: <input type='text' name='custpwd'>");
		o.println("<br/><br/>");
		o.println("Enter Customer Confirm Password: <input type='text' name='custconpwd'>");
		o.println("<br/><br/>");
		o.println("Enter Customer Aadhar Number: <input type='text' name='anum'>");
		o.println("<br/><br/>");
		o.println("<input type='submit' value='Proceed'");
		o.println("</html></body>");
	}

}
