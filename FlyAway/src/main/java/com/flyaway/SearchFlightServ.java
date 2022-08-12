package com.flyaway;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

public class SearchFlightServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchFlightServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter o = response.getWriter();
			Connection con = JDBCConnect.getMyConnection();
			String dot = request.getParameter("dot");
			String board = request.getParameter("pb");
			String dest = request.getParameter("dest");
			int no_person = Integer.parseInt(request.getParameter("nop"));
			
			String str = "select * from flyaway.flight_details";
			Statement ps = con.createStatement();
			ResultSet ans = ps.executeQuery(str);
			o.println("<html><body>");
			o.println("<table border=2>");
			o.println("<tr><th>Airlines</th><th>Flight Name</th><th>Price Per Person</th></tr>");
			int c=0;
			while(ans.next()) {
				if(ans.getDate(1).toString().equals(dot)&& ans.getString(2).equalsIgnoreCase(board)&&ans.getString(3).equalsIgnoreCase(dest)&&ans.getInt(4)>no_person)
				{
					o.print("<tr>");
					o.print("<td>"+ans.getString(5)+"</td>");
					o.print("<td>"+ans.getString(6)+"</td>");
					o.print("<td>"+ans.getInt(7)+"</td>");
					o.print("</tr>");
					c=1;
				}
			}
			if(c==0)
				o.println("No Flights Available");
			o.println("</table>");
			o.println("</html></body>");
			if(c==1)
			{
				RequestDispatcher rd = request.getRequestDispatcher("selectflight.jsp");
				rd.include(request, response);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);		
		}
	}

}
