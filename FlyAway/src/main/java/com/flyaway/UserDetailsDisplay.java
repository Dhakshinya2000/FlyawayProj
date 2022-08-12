package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDetailsDisplay
 */
public class UserDetailsDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailsDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cname = request.getParameter("custname");
		String cpwd = request.getParameter("custpwd");
		String conpwd = request.getParameter("custconpwd");
		String aad = request.getParameter("anum");
		PrintWriter o = response.getWriter();
		o.println("<html><body>");
		o.println("<br/><br/>");
		if(cpwd.equals(conpwd))
		{
			o.println("Customer name: "+cname);
			o.println("<br/><br/>");
			o.println("Aadhar Card Number: "+aad);
			o.println("<br/><br/>");
			o.println("<a href='payment.jsp'>Proceed To Pay</a>");
			o.println("</html></body>");
		}
		else
		{
			o.println("Password Mismatch");
		}
	}

}
