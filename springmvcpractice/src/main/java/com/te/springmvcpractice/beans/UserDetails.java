package com.te.springmvcpractice.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails implements Serializable{

	private Integer id;
	
	private String email;
	
	private String name;
	
	private String password;
	
	private Integer age;
	
	private String role;
	
	private Double salary;
}
