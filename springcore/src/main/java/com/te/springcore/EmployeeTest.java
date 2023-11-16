package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.beans.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee employee = context.getBean("emp", Employee.class);
		employee.setId(100);
		employee.setName("Kishore");
		employee.setRole("Developer");
		System.out.println(employee);
		
		System.out.println("======================");
		
		Employee empWithProps = context.getBean("empProps", Employee.class);
		empWithProps.setId(500);
		System.out.println(empWithProps);
		
		System.out.println("======================");
		
		Employee empWithParConstructor = context.getBean("empWithParCon", Employee.class);
		System.out.println(empWithParConstructor);
		
	}
}
