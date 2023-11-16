package com.te.servlets3.controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emailedit")
public class EditMailServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {

			factory = Persistence.createEntityManagerFactory("interns");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			transaction.begin();

			String oldEmail = request.getParameter("old");
			String newEmail = request.getParameter("new");

			String query = "select count(*) from Employee where email=:em";
			Query que = manager.createQuery(query);

			que.setParameter("em", oldEmail);

			Object res = que.getSingleResult();
			int i = ((Number) res).intValue();

			if (i > 0) {
				String update = "update Employee set email=:new where email=:old";

				Query query1 = manager.createQuery(update);

				query1.setParameter("new", newEmail);
				query1.setParameter("old", oldEmail);

				String query2 = "select count(*) from Employee where email=:newmail";
				Query que1 = manager.createQuery(query2);

				que1.setParameter("newmail", newEmail);

				Object check = que1.getSingleResult();
				int y = ((Number) check).intValue();

				if (y == 0) {

					int updateRecord = query1.executeUpdate();
					transaction.commit();
					response.sendRedirect("./successEditName.jsp");

				}else {
					response.sendRedirect("./alreadyExistsUserMail.jsp");
				}

			} else {
				response.sendRedirect("./failedEditUserMail.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
	}
}
