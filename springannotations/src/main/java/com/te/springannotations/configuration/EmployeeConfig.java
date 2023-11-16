package com.te.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.te.springannotations.beans.Employee;

@Configuration
public class EmployeeConfig {

	@Bean(name = "dc")
	@Scope(value="prototype")
	public Employee getEmpBean() {
		return new Employee();
	}
	
	@Bean(name = "si")
//	@Primary
	public Employee getEmpWithValues() {
		Employee bean = new Employee();
		bean.setId(200);
		bean.setName("King Kong");
		return bean;
	}
	
	@Bean(name = "ci")
	public Employee getEmpConParams() {
		return new Employee(300 , "Bala" , null);
	}
}
