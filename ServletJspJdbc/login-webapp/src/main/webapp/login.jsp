<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>	
		<form action = "VerifyLogin" method = "post">
			Enter UserName : <input type = "text" name = "uname"><br/><br/>
			Enter PassWord : <input type = "password" name = "pw"><br/><br/>
			<input type = "submit" value = "Login">
		</form>
	</body>
</html>