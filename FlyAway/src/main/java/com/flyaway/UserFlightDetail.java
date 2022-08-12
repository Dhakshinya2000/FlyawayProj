package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserFlightDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserFlightDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter o = response.getWriter();
			Connection con = JDBCConnect.getMyConnection();
			String dot = request.getParameter("dot");
			String flight_name = request.getParameter("fname");
			int nop = Integer.parseInt(request.getParameter("nop"));
			
			HttpSession s = request.getSession();
			String str = "select * from flyaway.flight_details";
			Statement ps = con.createStatement();
			ResultSet ans = ps.executeQuery(str);
			int c=0;
			while(ans.next()) {
				if(ans.getDate(1).toString().equals(dot)&& ans.getString(6).equals(flight_name)&&ans.getInt(4)>nop)
				{
					s.setAttribute("date", dot);
					s.setAttribute("Airlines", ans.getString(5));
					s.setAttribute("flight name", ans.getString(6));
					s.setAttribute("Boarding Point", ans.getString(2));
					s.setAttribute("Destination", ans.getString(3));
					s.setAttribute("Nop", nop);
					s.setAttribute("Price", ans.getInt(7));
					s.setAttribute("TotalPrice", nop*ans.getInt(7));
					c=1;
				}
			}
			if(c==0)
				o.println("Invalid Entry");
			if(c==1)
			{
				RequestDispatcher rd = request.getRequestDispatcher("UserDisplay");
				rd.forward(request, response);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
