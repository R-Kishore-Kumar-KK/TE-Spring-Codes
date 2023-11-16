package com.te.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springannotations.beans.MobileCompany;

@Configuration
public class MobileConfig {
	
	@Bean
	public MobileCompany getMC() {
		return new MobileCompany("Android", "Rog", 12, "Asus", 50000);
	}
}
