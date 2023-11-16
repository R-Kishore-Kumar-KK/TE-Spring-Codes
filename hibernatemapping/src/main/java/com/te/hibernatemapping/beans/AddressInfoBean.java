package com.te.hibernatemapping.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "employee_address_info")
public class AddressInfoBean implements Serializable{

	@Id
	@Column
	private Integer address_id;
	
	@Column
	private Integer empId;
	
	@Column
	private String addressType;
	
	@Column
	private String city;
	
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	private PrimaryInfoBean infoBean;
}
