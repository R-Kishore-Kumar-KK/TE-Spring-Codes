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

@WebServlet("/passedit")

public class EditPasswordServlet extends HttpServlet {
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

			String email = request.getParameter("email");
			String oldPwd = request.getParameter("oldPassword");
			String newPwd = request.getParameter("newPassword");

			String query = "select count(*) from Employee where password=:pwd and email=:mail";
			Query que = manager.createQuery(query);

			que.setParameter("pwd", oldPwd);
			que.setParameter("mail", email);

			Object res = que.getSingleResult();
			int i = ((Number) res).intValue();

			if (i > 0) {
				String update = "update Employee set password=:new where password=:old and email=:email";

				Query query1 = manager.createQuery(update);

				query1.setParameter("new", newPwd);
				query1.setParameter("old", oldPwd);
				query1.setParameter("email", email);

				int updateRecord = query1.executeUpdate();
				transaction.commit();
				response.sendRedirect("./successEditName.jsp");
			} else {
				response.sendRedirect("./failedEditPassword.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
	}
}
