package com.te.springjaxb.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "user-address")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserAddressBean implements Serializable{

	
	
	@XmlElement(name = "house-number")
	private Integer houseNum;
	
	@XmlElement
	private String street;
	
	@XmlElement
	private String city;
	
	@XmlAttribute
	private char addressType;
}
