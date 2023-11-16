package com.te.console.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{

	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
//	@Column
//	private Date dateofbirth;
	
	@Column
	private String email;
	
	@Column
	private double salary;
	
	@Column
	private String role;
	
	public Employee(String name, String password, String email, double salary, String role) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.salary = salary;
		this.role = role;
	}
}
