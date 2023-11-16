package com.te.autowirespring.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Car implements Serializable{

	private CarEngine engine;
	
	private CarCompany company;
	
	public Car(@Qualifier("one")CarEngine engine,@Qualifier("cone")CarCompany company) {
		this.engine = engine;
		this.company = company;
	}
	
}
