package com.te.springjaxb.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "user-other-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserOtherInfo implements Serializable{

	@XmlElement
	private String gender;
	
	@XmlElement
	private Long aadhar;
}
