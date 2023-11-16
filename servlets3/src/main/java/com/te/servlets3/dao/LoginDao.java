package com.te.servlets3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.servlets3.beans.Employee;

public class LoginDao {
	
	public static boolean validate(String userName, String password) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;

		factory = Persistence.createEntityManagerFactory("interns");
		manager = factory.createEntityManager();

		String que = "from Employee where UserName=:ur and password=:pwd";
		Query query = manager.createQuery(que);

		query.setParameter("ur", userName);
		query.setParameter("pwd", password);

		Employee emp = null;

		try {
			emp = (Employee) query.getSingleResult();

			return true;

		} catch (Exception e) {

			return false;
		}

	}
}
