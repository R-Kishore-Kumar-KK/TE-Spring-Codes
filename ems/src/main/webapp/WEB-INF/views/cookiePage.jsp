<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	String msg = (String) request.getAttribute("msg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookies</title>
</head>
<body>
	<button><a href="./read">Read Cookie</a></button>
	<button><a href="./create">Create Cookie</a></button>
	
	<% if(msg != null && !msg.isEmpty()){ %>
	<h1><%=msg %></h1>
	<%} %>
</body>
</html>