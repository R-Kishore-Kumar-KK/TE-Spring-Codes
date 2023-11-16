<%@page import="com.te.ems.beans.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	EmployeeInfo info = (EmployeeInfo) request.getAttribute("user");
%>
<%@ include file="Header.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome | Page</title>
</head>
<body>
<%
 	if(info != null){
%>
<h1 style="text-align: center;"> Welcome <%= info.getName() %></h1>
<%
 	}
%>
</body>
</html>