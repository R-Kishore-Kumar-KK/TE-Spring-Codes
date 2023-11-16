package com.te.ems.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfo implements Serializable{

	@Id
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column
	private String mail;
	
	@Column(name = "password")
	private String pwd;
	
	@Column
	private Date dob;
	
	@Column
	private Long mobile;
}
