package com.te.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springannotations.beans.Employee;
import com.te.springannotations.configuration.AllImports;
import com.te.springannotations.configuration.Employee2Config;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AllImports.class);
		
		Employee bean = context.getBean(Employee.class);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		if(bean.getDept() != null) {
			System.out.println(bean.getDept().getDeptId());
			System.out.println(bean.getDept().getDeptName());
		} else {
			System.out.println("Department Definition is not Present");
		}
	}
}
