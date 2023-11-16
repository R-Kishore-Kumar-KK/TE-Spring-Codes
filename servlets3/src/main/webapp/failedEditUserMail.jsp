<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./emailedit" method="post">
		<div>
			<h2>Incorrect old Email-Id! Try Again!!!</h2>

		</div>
		<div>
			<label for="old">Enter your old mail-id : </label> <input
				required type="text" name="old" required />

		</div>

		<div>
			<label for="new">Enter your new mail-id : </label> <input
				required type="text" name="new" required />

		</div>

		<div>
			<br> <input type="submit" value="Submit">
		</div>

	</form>
</body>
</html>