package com.te.springannotations.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Bike implements Serializable{

	private Engine engine;
	
	private Company company;
	
	@Autowired(required = false)
	public Bike(@Qualifier("two")Engine engine,@Qualifier("ctwo") Company company) {
		this.engine = engine;
		this.company = company;
	}
}
