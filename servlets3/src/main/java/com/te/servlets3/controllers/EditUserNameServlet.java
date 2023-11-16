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

@WebServlet("/usernameedit")
public class EditUserNameServlet extends HttpServlet {
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

			String oldUserName = request.getParameter("old");
			String newUserName = request.getParameter("new");

			String query = "select count(*) from Employee where UserName=:un";
			Query que = manager.createQuery(query);

			que.setParameter("un", oldUserName);

			Object res = que.getSingleResult();
			int i = ((Number) res).intValue();

			if (i > 0) {
				String update = "update Employee set UserName=:new where UserName=:ur";

				Query query1 = manager.createQuery(update);

				query1.setParameter("new", newUserName);
				query1.setParameter("ur", oldUserName);

				String query2 = "select count(*) from Employee where UserName=:newuser";
				Query que1 = manager.createQuery(query2);

				que1.setParameter("newuser", newUserName);

				Object check = que1.getSingleResult();
				int y = ((Number) check).intValue();

				if (y == 0) {

					int updateRecord = query1.executeUpdate();
					transaction.commit();
					response.sendRedirect("./successEditName.jsp");

				}else {
					response.sendRedirect("./alreadyExistsUserName.jsp");
				}

			} else {
				response.sendRedirect("./failedEditUserName.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
	}
}
