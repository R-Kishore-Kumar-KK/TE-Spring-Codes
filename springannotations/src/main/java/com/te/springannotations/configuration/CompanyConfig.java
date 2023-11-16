package com.te.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springannotations.beans.Company;

@Configuration
public class CompanyConfig {

	@Bean("cone")
	public Company getCompanyOne() {
		return new Company("Yamaha", "RD350");
	}
	
	@Bean("ctwo")
	public Company getCompanyTwo() {
		return new Company("RE", "Continental");
	}
}
