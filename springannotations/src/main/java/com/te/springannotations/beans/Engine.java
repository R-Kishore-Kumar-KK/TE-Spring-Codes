package com.te.springannotations.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine implements Serializable{
	
	private String engineType;
	
	private Integer cc;
	
	private Integer rpm;
}
