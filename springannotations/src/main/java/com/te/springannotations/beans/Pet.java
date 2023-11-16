package com.te.springannotations.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.springannotations.interfaces.Animal;

import lombok.Data;

@Data
public class Pet implements Serializable{

	private String name;
	
	@Autowired(required = false)
	@Qualifier("god")
	private Animal animal;
}
