package com.te.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springrest.beans.EmployeeInfo;
import com.te.springrest.customexception.EmployeeException;
import com.te.springrest.customexception.EntityNotFoundExp;


@Repository
public class HibernateImpl implements EmployeeDao {

	@PersistenceUnit
	EntityManagerFactory factory;
	
	

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
		
			throw new EmployeeException("Data not found for"+id);
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

			if ( newData.getName() != null) {
				oldData.setName(newData.getName());
			}

			if (newData.getMobile() != null) {
				oldData.setMobile(newData.getMobile());
			}

			if ( newData.getMail() != null) {
				oldData.setMail(newData.getMail());
			}
			
			if ( newData.getPwd() != null) {
				oldData.setPwd(newData.getPwd());
			}

			if (newData.getDob() != null) {
				oldData.setDob(newData.getDob());
			}
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			throw new EmployeeException("Something went Wrong");
		}
		return isUpdated;
	}

	@Override
	public List<EmployeeInfo> getAllData() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from EmployeeInfo");
		try {
			return query.getResultList();
		} catch (Exception e) {
			throw new EmployeeException("No Data found");
		}

	}
}

