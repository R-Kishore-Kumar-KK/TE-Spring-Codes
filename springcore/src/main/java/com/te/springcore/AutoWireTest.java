package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.beans.Employee;

public class AutoWireTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("allConfiguration.xml");
		Employee employee = context.getBean("emp", Employee.class);
		
		System.out.println("Employee Details");
		System.out.println(employee.getName());
		System.out.println(employee.getRole());
		System.out.println(employee.getId());
		System.out.println("Department Details");
		System.out.println(employee.getDept().getDeptName());
		System.out.println(employee.getDept().getDeptId());
	}
}
