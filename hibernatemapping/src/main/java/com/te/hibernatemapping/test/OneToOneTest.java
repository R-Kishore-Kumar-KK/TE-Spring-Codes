package com.te.hibernatemapping.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.hibernatemapping.beans.PrimaryInfoBean;
import com.te.hibernatemapping.beans.SecondaryInfoBean;

public class OneToOneTest {

	public static void main(String[] args) {
		
		PrimaryInfoBean bean =  new PrimaryInfoBean();
		bean.setEmpId(10);
		bean.setName("Jenito");
		bean.setSalary(40000.0);
		
		SecondaryInfoBean secondaryInfoBean =  new SecondaryInfoBean();
		secondaryInfoBean.setEmpId(10);
		secondaryInfoBean.setAge(25);
		secondaryInfoBean.setGender("Male");
		secondaryInfoBean.setPrimaryInfoBean(bean);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager manager = factory.createEntityManager();
//		manager.getTransaction().begin();
//		manager.persist(secondaryInfoBean);
//		manager.getTransaction().commit();
		
		SecondaryInfoBean infoBean = manager.find(SecondaryInfoBean.class, 10);
		System.out.println(infoBean.getEmpId());
		System.out.println(infoBean.getPrimaryInfoBean().getName());
		System.out.println(infoBean.getPrimaryInfoBean().getSalary());
		
		System.out.println("Inserted");
		manager.close();
		factory.close();
	}
}
