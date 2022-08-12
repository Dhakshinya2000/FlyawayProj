<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights</title>
</head>
<body>
<form action="SearchFlightServ" method="get">
Enter Date of Travel(YYYY-MM-DD): <input type="text" name="dot">
<br/><br/>
Enter Place of Boarding: <input type="text" name="pb">
<br/><br/>
Enter Destination: <input type="text" name="dest">
<br/><br/>
Enter Number of Persons: <input type="text" name="nop">
<br/><br/>
<input type="submit" value="Search">
</form>
</body>
</html>