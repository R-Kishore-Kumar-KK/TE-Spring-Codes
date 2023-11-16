<%@page import="com.te.servlets3.beans.Employee"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		EntityManagerFactory emf = null;
	EntityManager em = null;

	try {
		emf = Persistence.createEntityManagerFactory("interns");
		em = emf.createEntityManager();

		String user = request.getParameter("user");

		String que = "Select count(*) from Employee where UserName=:un";
		Query queryUser = em.createQuery(que);
		Object resUser = queryUser.setParameter("un", user).getSingleResult();
		int i = ((Number) resUser).intValue();

		if (i > 0) {

			String update = "from Employee where UserName=:nam";

			Query query = em.createQuery(update);

			query.setParameter("nam", user);

			List<Employee> ref = query.getResultList();

			for (Employee obj : ref) {
	%>
	<h3>Your Account Information</h3>
	<table border="1">
		<tr align="center">
			<th><h3>Title</h3></th>
			<th><h3>Information</h3></th>
		</tr>
		<tr align="center">
			<td>ID:</td>
			<td><%=obj.getId()%></td>
		</tr>
		<tr align="center">
			<td>Name:</td>
			<td><%=obj.getName()%></td>
		</tr>
		<tr align="center">
			<td>Password:</td>
			<td><%=obj.getPassword()%></td>
		</tr>
		<tr align="center">
			<td>Date of birth:</td>
			<td><%=obj.getDob()%></td>
		</tr>
		<tr align="center">
			<td>age:</td>
			<td><%=obj.getAge()%></td>
		</tr>
		<tr align="center">
			<td>Email:</td>
			<td><%=obj.getEmail()%></td>
		</tr>
		<tr align="center">
			<td>Salary:</td>
			<td><%=obj.getSalary()%></td>
		</tr>
		<tr align="center">
			<td>Role:</td>
			<td><%=obj.getRole()%></td>
		</tr>
	</table>
	<%
		}
	} else {
	response.sendRedirect("./failedShowDetails1.jsp");
	}
	} catch (Exception e) {
	e.printStackTrace();
	} finally {
	emf.close();
	em.close();
	}
	%>
</body>
</html>