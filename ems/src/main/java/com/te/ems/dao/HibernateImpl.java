package com.te.ems.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.ems.beans.EmployeeInfo;
import com.te.ems.customexception.EmployeeException;
import com.te.ems.customexception.EntityNotFoundExp;

@Repository
public class HibernateImpl implements EmployeeDao {

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public EmployeeInfo authenticate(Integer id, String password) {
		EntityManager manager = factory.createEntityManager();
		EmployeeInfo info = manager.find(EmployeeInfo.class, id);
		if (info != null) {
			if (info.getPwd().equals(password)) {
				return info;
			}
		}
		manager.close();
		  throw new EmployeeException("Invalid Crdentials");
	}// end of authenticate

	@Override
	public EmployeeInfo getEmployee(Integer id) {
		EntityManager manager = factory.createEntityManager();
		EmployeeInfo info = manager.find(EmployeeInfo.class, id);
		return info;
	}

	@Override
	public boolean delete(Integer id) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeeInfo info = manager.find(EmployeeInfo.class, id);
			manager.remove(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new EntityNotFoundExp("Data not found for"+id);
		}
	}

	@Override
	public boolean register(EmployeeInfo info) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			return false;
		}
	}
	
	@Override
	public boolean update(EmployeeInfo newData) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isUpdated = false;
		try {
			transaction.begin();
			EmployeeInfo oldData = manager.find(EmployeeInfo.class, newData.getId());

			if (!newData.getName().isEmpty() && newData.getName() != null) {
				oldData.setName(newData.getName());
			}

			if (newData.getMobile() != null) {
				oldData.setMobile(newData.getMobile());
			}

			if (!newData.getMail().isEmpty() && newData.getMail() != null) {
				oldData.setMail(newData.getMail());
			}
			
			if (!newData.getPwd().isEmpty() && newData.getPwd() != null) {
				oldData.setPwd(newData.getPwd());
			}

			if (newData.getDob() != null) {
				oldData.setDob(newData.getDob());
			}
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			transaction.rollback();
			isUpdated = false;
		}
		return isUpdated;
	}

	@Override
	public List<EmployeeInfo> getAll(EmployeeInfo info) {
		EntityManager manager = factory.createEntityManager();
		String que = "from EmployeeInfo";
		Query query = manager.createQuery(que);
		List<EmployeeInfo> list = query.getResultList();
		return list;
	}
}
