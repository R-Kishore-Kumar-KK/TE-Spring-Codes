<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./passedit" method="post">

		<div>
			<h2>Incorrect mail id or old password! Try again!!</h2>

		</div>
		<div>
			<label for="email">Enter your mail-id : </label> <input required
				type="text" name="email" required />

		</div>
		
		<div>
			<label for="oldPassword">Enter your old Password : </label> <input required
				type="text" name="oldPassword" required />

		</div>

		<div>
			<br> <label for="newPassword">Enter your New password : </label> <input
				required type="text" name="newPassword" required />

		</div>
		
		<div>
		<br>
		<input type="submit" value="Submit">
		</div>

	</form>
</body>
</html>