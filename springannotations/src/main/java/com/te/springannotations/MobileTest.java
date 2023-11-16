package com.te.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springannotations.beans.MobileBean;

public class MobileTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig.xml");
		
		MobileBean bean = context.getBean(MobileBean.class);
		System.out.println(bean.getMobileCompany().getBrand());
		System.out.println(bean.getMobileCompany().getModel());
		System.out.println(bean.getMobileCompany().getOs());
		System.out.println(bean.getMobileCompany().getRam());
		System.out.println(bean.getMobileCompany().getPrice());
	}
}
