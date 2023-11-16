<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	String err = (String) request.getAttribute("err");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp|Page</title>
</head>
<body>

<% if(err != null && !err.isEmpty()){ %>
	<h2 style="color: red"><%= err %></h2>
<%} %>
<fieldset>
		<legend>SignUp</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<th>User Id</th>
					<th>:</th>
					<td><input type="number" name="id" required="required"></td>
				</tr>
				<tr>
					<th>User Name</th>
					<th>:</th>
					<td><input type="text" name="name" required="required"></td>
				</tr>
				<tr>
					<th>Mobile</th>
					<th>:</th>
					<td><input type="number" name="mobile" required="required"></td>
				</tr>
				<tr>
					<th>User Mail</th>
					<th>:</th>
					<td><input type="email" name="mail" required="required"></td>
				</tr>
				<tr>
					<th>User DOB</th>
					<th>:</th>
					<td><input type="date" name="dob" required="required"></td>
				</tr>
				<tr>
					<th>User Password</th>
					<th>:</th>
					<td><input type="password" name="pwd" required="required"></td>
				</tr>
				
				<tr>
					<th><input type="submit" value="Submit"></th>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>