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

@WebServlet("/nameedit")
public class EditNameServlet extends HttpServlet {
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

			String oldUser = request.getParameter("old");
			String userName = request.getParameter("username");
			String newUser = request.getParameter("new");

			String query = "select count(*) from Employee where Name=:name and UserName=:un";
			Query que = manager.createQuery(query);

			que.setParameter("name", oldUser);
			que.setParameter("un", userName);

			Object res = que.getSingleResult();
			int i = ((Number) res).intValue();

			if (i > 0) {
				String update = "update Employee set Name=:new where Name=:old and UserName=:ur";

				Query query1 = manager.createQuery(update);

				query1.setParameter("new", newUser);
				query1.setParameter("old", oldUser);
				query1.setParameter("ur", userName);

				int updateRecord = query1.executeUpdate();
				transaction.commit();
				response.sendRedirect("./successEditName.jsp");
			} else {
				response.sendRedirect("./failedEditName.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
	}
}
