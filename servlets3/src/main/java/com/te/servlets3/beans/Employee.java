package com.te.servlets3.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "empinfo")
@Data
public class Employee implements Serializable {
	public Employee() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String Name;
	@Column
	private String UserName;
	@Column
	private String password;
	@Column
	private Date dob;
	@Column
	private Integer age;
	@Column
	private String email;
	@Column
	private Double salary;
	@Column
	private String role;

}

