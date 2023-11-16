package com.te.autowirespring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.autowirespring.beans.SchoolDepartment;
import com.te.autowirespring.beans.Teachers;

@Configuration
public class SchoolDepartmentConfig {

	@Bean("geo")
	public SchoolDepartment getDeptSocial() {
		SchoolDepartment dept1 = new SchoolDepartment();
		dept1.setDeptId(1234);
		dept1.setDeptName("Geography");
		return dept1;
	}
	
	@Bean("bio")
	public SchoolDepartment getDeptScience() {
		SchoolDepartment dept1 = new SchoolDepartment();
		dept1.setDeptId(123);
		dept1.setDeptName("Biology");
		return dept1;
	}
}
