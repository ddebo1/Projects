<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome Page</title>
	</head>
	<body>

	<%
	
	response.setHeader("cache-control", "no-cache, no-store, must-validate");
	
	//response.setHeader("pragma","no-cache"); // can be used to control back button in earlier versions - HTTP 1.0
	
	//response.setHeader("expires", "0"); //for proxies
	
	if (session.getAttribute("username") == null)
		response.sendRedirect("login.jsp");
	%>
	
	<h1>Welcome ${username}</h1>  
	
	<br>
	
	<a href= "Videos.jsp">Click here to view videos</a>
	
	<br><br>
	
	<form action = "Logout" method = "get">
		<input type = "submit" value = "LogOut">
	</form>
</body>
</html>