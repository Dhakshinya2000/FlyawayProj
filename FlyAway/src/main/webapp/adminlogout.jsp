<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Logout</title>
</head>
<body>
<%
session.invalidate();
out.println("Admin Logged Out");
%>
<br/><br/>
<a href="index.jsp">Click here To return to main menu</a>
</body>
</html>