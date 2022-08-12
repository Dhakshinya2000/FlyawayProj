package com.flyaway;

import java.sql.*;

public class JDBCConnect {
	static Connection con =null;
	public static Connection getMyConnection() {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","Hello12345@");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}
