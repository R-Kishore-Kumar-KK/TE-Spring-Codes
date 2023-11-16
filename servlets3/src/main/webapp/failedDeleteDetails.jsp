<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Invalid credentials</h1>
	<form action="./delete.jsp" method="get">
		<label>Enter MailId</label> <input type="email" name="mail" required>
		<label>Re-Enter Password</label> <input type="password" name="pwd"
			required> <br> <input type="submit" value="Submit">
	</form>
</body>
</html>