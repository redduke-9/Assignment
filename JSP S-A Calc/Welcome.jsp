<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
<center>
<h4>Login Successful</h4> Welcome to :
<h4><%= request.getParameter("login_uname")%></h4>
<input type="button" value="AgeCalculator" onClick="JavaScript:window.location='AgeCalculator.html';"/>
<input type="button" value="SimpleCalculator" onClick="JavaScript:window.location='SimpleCalculator.html';"/>
</center>
</body>
</html>