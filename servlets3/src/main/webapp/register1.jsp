<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.te.servlets3.beans.Employee"%>
<%@page import="javax.persistence.EntityTransaction"%>
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
	<form>


		<%
			EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		Employee emp = null;

		try {

			factory = Persistence.createEntityManagerFactory("interns");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			String name = request.getParameter("name");
			String username = request.getParameter("username");
			String email = request.getParameter("mail");

			String password = request.getParameter("pwd");

			Date date = null;

			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
			} catch (ParseException e) {
	
				e.printStackTrace();
			}

			Integer age = Integer.parseInt(request.getParameter("age"));
			Double salary = Double.parseDouble(request.getParameter("sal"));
			String role = request.getParameter("role");

			String que = "Select count(*) from Employee where UserName=:un";
			Query queryUser = manager.createQuery(que);

			String que1 = "Select count(*) from Employee where email=:em";
			Query queryEmail = manager.createQuery(que1);

			Object resUser = queryUser.setParameter("un", username).getSingleResult();
			Object resEmail = queryEmail.setParameter("em", email).getSingleResult();

			int i = ((Number) resUser).intValue();
			int y = ((Number) resEmail).intValue();

			if (i == 0 && y == 0) {

				transaction.begin();
				emp = new Employee();

				emp.setName(name);
				emp.setUserName(username);
				emp.setPassword(password);
				emp.setDob(date);
				emp.setAge(age);
				emp.setEmail(email);
				emp.setSalary(salary);
				emp.setRole(role);

				manager.persist(emp);

				transaction.commit();

				response.sendRedirect("registerSuccess.jsp");
			} else {
				response.sendRedirect("failure.jsp");
			}

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}

		}
		%>

		<table border="1">
			<tr>

				<th width=300px>
					<h3>ACTION</h3>
				</th>
				<th width=300px>
					<H3>DETAILS</H3>
				</th>

			</tr>
			<tr align="center">
				<td>Enter your Name</td>
				<td><input type="text" name="name" id="name" required></td>
			</tr>
			<tr align="center">
				<td>Enter unique Username</td>
				<td><input type="text" name="username" id="name" required></td>
			</tr>
			<tr align="center">
				<td>Enter Password</td>
				<td><input type="password" name="pwd" id="pwd" required></td>
			</tr>
			<tr align="center">
				<td>Enter your Date of Birth</td>
				<td><input type="date" name="dob" id="dob" required></td>
			</tr>
			<tr align="center">
				<td>Enter your age</td>
				<td><input type="number" name="age" id="age" required></td>
			</tr>
			<tr align="center">
				<td>Enter your email-id</td>
				<td><input type="email" name="mail" id="mail" required></td>
			</tr>

			<tr align="center">
				<td>Enter salary</td>
				<td><input type="number" name="sal" id="sal" required></td>
			</tr>
			<tr align="center">
				<td>Enter your role</td>
				<td><input type="text" name="role" id="role" required></td>
			</tr>

		</table>
		<br>
		<div>
			<input type="submit" value="Register"> <input type="submit"
				value="Cancel">
		</div>
	</form>
</body>
</html>