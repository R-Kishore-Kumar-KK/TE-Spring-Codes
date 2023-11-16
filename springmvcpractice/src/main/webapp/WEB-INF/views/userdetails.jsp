<%@page import="com.te.springmvcpractice.beans.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
	String name = (String) request.getAttribute("userName");
	Integer id = (Integer) request.getAttribute("userId");
	String mail = (String) request.getAttribute("mail");
	String password = (String) request.getAttribute("password");
	Integer age = (Integer) request.getAttribute("age");
	String role = (String) request.getAttribute("role");
	Double salary = (Double) request.getAttribute("salary");
	UserDetails detail = (UserDetails) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if(id != null){ %>
	<h1>User Name = <%= name %></h1>
	<h1>User ID = <%= id %></h1>
	<h1>Mail = <%= mail %></h1>
	<h1>Password = <%= password %></h1>
	<h1>Age = <%= age %></h1>
	<h1>Role = <%= role %></h1>
	<h1>Salary = <%= salary %></h1>
	<%} %>
	<% if(detail != null){ %>
	<h1>User Name = <%= detail.getName() %></h1>
	<h1>User ID = <%= detail.getId() %></h1>
	<h1>Mail = <%= detail.getEmail() %></h1>
	<h1>Password = <%= detail.getPassword() %></h1>
	<h1>Age = <%= detail.getAge() %></h1>
	<h1>Role = <%= detail.getRole() %></h1>
	<h1>Salary = <%= detail.getSalary() %></h1>
	<%} %>
</body>
</html>