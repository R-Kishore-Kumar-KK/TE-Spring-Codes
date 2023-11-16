package com.te.springjaxb.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonRootName;

import lombok.Data;

@Data
@XmlRootElement(name = "employee-info")
@JsonRootName("user_ifo")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({"emp-id","emp-name"})
public class EmployeeInfo implements Serializable{

	@JsonProperty("emp_name")
	@XmlElement(name = "emp-name")
	private Integer empId;
	
	@XmlElement(name = "emp-id")
	@JsonProperty
	private String name;
	
	@XmlElement
	private Long mobile;
	
	@XmlTransient
	private String password;
	
	@XmlElement
	private String mailId;
	
	@XmlElement
	private Date birthday;
	
	@XmlElement
	private Date joiningDate;
	
	@XmlElement
	private String location;
	
	@XmlElement
	private String designation;
	
	@XmlElement
	private Double salary;
	
	@XmlElement
	private boolean isMarried;
	
	@XmlElement
	private UserOtherInfo otherInfo;
	
	@XmlElementWrapper(name = "user-addresses")
	private List<UserAddressBean> addressBeans;
}
