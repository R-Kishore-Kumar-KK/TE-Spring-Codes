package com.te.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.springannotations.beans.Employee;

@Configuration
@ComponentScan("com.te.springannotations.beans")
public class Employee2Config {

	@Bean
	public Employee getEmp() {
		Employee bean = new Employee();
		bean.setId(100);
		bean.setName("Hemanth");
		return bean;
	}
}
