<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Videos</title>
	</head>
	<body>

	<%
		response.setHeader("cache-control", "no-cache, no-store, must-validate"); // works only from HTTP 1.1
	
		response.setHeader("pragma","no-cache"); // can be used to control back button in earlier versions - HTTP 1.0
	
		response.setHeader("expires", "0"); //for proxies

		if (session.getAttribute("username") == null)
			response.sendRedirect("login.jsp");
	%>
	<video src="seaView.mp4" controls="controls" width="350" height="250"></video>
	
	<br/>
	<br/>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/g2b-NbR48Jo" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	<br/>
	<br/>
	
	<form action = "Logout" method = "get">
		<input type = "submit" value = "LogOut">
	</form>

</body>
</html>