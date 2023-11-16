package com.te.autowirespring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.autowirespring.beans.CarCompany;

@Configuration
public class CarCompanyConfig {

	@Bean("cone")
	public CarCompany getCarCompany1() {
		return new CarCompany("Bmw", "X5");
	}
	
	@Bean("ctwo")
	public CarCompany getCarCompany2() {
		return new CarCompany("Audi","A6");
	}
}
