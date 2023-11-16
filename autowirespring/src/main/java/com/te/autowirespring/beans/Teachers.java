package com.te.autowirespring.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teachers implements Serializable{

	private Integer id;
	
	private String name;
	
	@Autowired(required = false)
	@Qualifier("bio")
	private SchoolDepartment dept;
}
