package com.te.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springannotations.beans.Department;

@Configuration
public class DepartmentConfig {

	@Bean("dev")
	@Primary
	public Department getDepartmentDev() {
		return new Department(200, "Dev");
	}
	
	@Bean("test")
	public Department getDepartmentTest() {
		return new Department(300, "Testing");
	}
	
	@Bean("hr")
	public Department getDepartmentHr() {
		return new Department(400, "HR");
	}
}
