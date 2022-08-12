<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Portal</title>
</head>
<body>
<form action="otp.jsp">
Enter Card Number: <input type="text" name="cnum">
<br/><br/>
Enter Expiry Date: <input type="text" name="edate">
<br/><br/>
Enter CVV: <input type="text" name="cvv">
<br/><br/>
<input type="submit" value="Pay">
</form>
</body>
</html>