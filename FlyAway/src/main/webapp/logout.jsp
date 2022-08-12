<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
session.invalidate();
out.println("You Logged Out Successfully");
%>
<br/><br/>
<a href="index.jsp">Click here to Return to Main Menu</a>
</body>
</html>