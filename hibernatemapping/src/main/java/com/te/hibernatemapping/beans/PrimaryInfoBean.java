package com.te.hibernatemapping.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_primary_info")
public class PrimaryInfoBean implements Serializable{

	@Id
	@Column
	private Integer empId;
	
	@Column
	private String name;
	
	@Column
	private Double salary;
	
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY ,
			mappedBy = "primaryInfoBean")
	private SecondaryInfoBean secondary; //bidirectional
	
}
