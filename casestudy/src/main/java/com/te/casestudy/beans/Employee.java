package com.te.casestudy.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "empinfo")
@Data
public class Employee implements Serializable{

	public Employee() {

	}

	@Id
	@Column
	private String Name;
	
	@Column
	private String UserName;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "Age")
	private Integer age;
	
	@Column
	private String email;
	
	@Column(name = "Salary")
	private Double salary;
	
	@Column(name = "Role")
	private String role;

	
}
