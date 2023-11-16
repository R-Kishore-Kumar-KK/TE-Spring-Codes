<%@page import="com.te.servlets3.beans.Employee"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.Query"%>
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
	<%
		EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;

	try {

		factory = Persistence.createEntityManagerFactory("interns");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		transaction.begin();

		String email = request.getParameter("mail");
		String password = request.getParameter("pwd");

		String query = "select count(*) from Employee where email=:mail and password=:pwd";
		Query que = manager.createQuery(query);

		que.setParameter("mail", email);
		que.setParameter("pwd", password);

		Object res = que.getSingleResult();
		int i = ((Number) res).intValue();

		if (i > 0) {
			String delete = "delete from Employee where email=:mail and password=:pwd";

			Query query1 = manager.createQuery(delete);
			query1.setParameter("mail", email);
			query1.setParameter("pwd", password);

			int deleteRecord = query1.executeUpdate();
			transaction.commit();
			response.getWriter().println("<h2>Deleted Successfully</h2>");
			request.getRequestDispatcher("./homepage1.jsp").include(request, response);
		} else {
			response.sendRedirect("./failedDeleteDetails.jsp");
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		manager.close();
		factory.close();
	}
	%>
</body>
</html>