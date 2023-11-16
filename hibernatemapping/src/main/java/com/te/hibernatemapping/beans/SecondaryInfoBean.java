package com.te.hibernatemapping.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "employee_secondary_info")
public class SecondaryInfoBean implements Serializable{

	@Id
	private Integer empId;
	
	@Column
	private Integer age;
	
	@Column
	private String gender;
	
	@Exclude
	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	private PrimaryInfoBean primaryInfoBean; //unidirectional
	
}
