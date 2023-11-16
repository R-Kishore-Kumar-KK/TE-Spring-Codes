package com.te.autowirespring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.autowirespring.beans.SchoolDepartment;
import com.te.autowirespring.beans.Teachers;

@Configuration
@Import({SchoolDepartmentConfig.class})
public class TeachersConfig {

	@Bean("sun")
	public Teachers getTeachersData() {
		Teachers teach = new Teachers();
		teach.setId(10);
		teach.setName("Sundhar");
		return teach;
	}
	
	
	
	
}
