package com.te.autowirespring.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarEngine implements Serializable{

	private String engineType;
	
	private Integer mph;
	
	
}
