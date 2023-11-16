package com.te.springcore.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{

	private Integer id;
	
	private String name;
	
	private String role;
	
	private Department dept;
}
