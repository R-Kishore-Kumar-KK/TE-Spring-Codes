<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./usernameedit" method="post">
		<div>
			<label for="old">Enter your old Username : </label> <input required
				type="text" name="old" required />

		</div>
		
		<div>
			<label for="new">Enter your new Username : </label> <input required
				type="text" name="new" required />

		</div>
		
		<div>
		<br>
		<input type="submit" value="Submit">
		</div>

	</form>
</body>
</html>