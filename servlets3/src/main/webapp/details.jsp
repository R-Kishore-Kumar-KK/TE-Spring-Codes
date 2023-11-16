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
	<table>
		<tr>
			<td>ID:</td>
			<td><input type="text" name="name" value="<%=obj.getId()%>"></td>
		</tr>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name" value="<%=obj.getName()%>"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="text" name="name"
				value="<%=obj.getPassword()%>"></td>
		</tr>
		<tr>
			<td>Date of birth:</td>
			<td><input type="date" name="name" value="<%=obj.getDob()%>"></td>
		</tr>
		<tr>
			<td>age:</td>
			<td><input type="number" name="name" value="<%=obj.getAge()%>"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="name" value="<%=obj.getEmail()%>"></td>
		</tr>
		<tr>
			<td>Salary:</td>
			<td><input type="number" name="name"
				value="<%=obj.getSalary()%>"></td>
		</tr>
		<tr>
			<td>Role:</td>
			<td><input type="text" name="name" value="<%=obj.getRole()%>"></td>
		</tr>
	</table>
	<%
		}
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