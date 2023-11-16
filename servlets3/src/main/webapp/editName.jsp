<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./nameedit" method="post">
		<div>
			<label for="old">Enter your Old Name : </label> <input required
				type="text" name="old" required />

		</div>
		
		<div>
			<label for="username">Enter your User Name : </label> <input required
				type="text" name="username" required />

		</div>

		<div>
			<br> <label for="new">Enter your New Name : </label> <input
				required type="text" name="new" required />

		</div>
		
		<div>
		<br>
		<input type="submit" value="Submit">
		</div>

	</form>
</body>
</html>