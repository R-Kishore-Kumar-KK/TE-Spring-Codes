package com.te.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springannotations.beans.Engine;

@Configuration
@ComponentScan("com.te.springannotations.beans")
@Import({CompanyConfig.class})
public class EngineConfig {

	@Bean("one")
	public Engine getEngineOne() {
		Engine engine = new Engine();
		engine.setCc(150);
		engine.setEngineType("Petrol");
		engine.setRpm(10000);
		return engine;
	}
	
	@Bean("two")
	public Engine getEngineTwo() {
		Engine engine = new Engine();
		engine.setCc(350);
		engine.setEngineType("Diesel");
		engine.setRpm(50000);
		return engine;
	}
}
