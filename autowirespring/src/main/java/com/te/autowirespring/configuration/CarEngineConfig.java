package com.te.autowirespring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.autowirespring.beans.CarEngine;

@Configuration
@ComponentScan("com.te.autowirespring.beans")
@Import({CarCompanyConfig.class})
public class CarEngineConfig {

	@Bean("one")
	public CarEngine getCarEngineOne() {
		return new CarEngine("Diesel",1000);
		
	}
	
	@Bean("two")
	public CarEngine getCarEngineTwo() {
		return new CarEngine("Petrol",2000);
		
	}
}
