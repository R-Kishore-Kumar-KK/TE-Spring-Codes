package com.te.springannotations.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MobileBean implements Serializable{

	@Autowired
	private MobileCompany mobileCompany;
}
