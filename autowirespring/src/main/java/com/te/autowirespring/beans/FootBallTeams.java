package com.te.autowirespring.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FootBallTeams implements Serializable{

	private String Team1;
	
	private String Team2;
}
