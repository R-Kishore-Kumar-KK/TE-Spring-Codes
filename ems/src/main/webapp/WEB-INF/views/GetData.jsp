<%@page import="java.util.List"%>
<%@page import="com.te.ems.beans.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List<EmployeeInfo> info = (List<EmployeeInfo>) request.getAttribute("user");
String msg = (String) request.getAttribute("msg");
%>
<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get|Data</title>
</head>
<body>
	
				<% if (msg != null && !msg.isEmpty()) { %>
	 <h1 style="color: red"><%=msg%></h1>
	<% } %>
	<fieldset>
		<legend>Get Data</legend>
		<form action="./update" method="post">
			<table border="1">
			<tr>
					<th>User ID</th>
					<th>User Name</th>
					<th>Mobile Number</th>
					<th>User Mail</th>
					<th>User DOB</th>
			</tr>
			<% for (EmployeeInfo userData: info)  { %>
				<tr>
					<td> <%= userData.getId() %> </td>
					<td> <%= userData.getName() %> </td>
					<td> <%= userData.getMobile() %> </td>
					<td> <%= userData.getMail() %> </td>
					<td> <%= userData.getDob() %> </td>
				</tr>
				
		<% } %>
			</table>
		</form>
	</fieldset>
</body>
</html>