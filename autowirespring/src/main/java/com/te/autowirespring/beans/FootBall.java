package com.te.autowirespring.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FootBall implements Serializable{

	private String playerName;
	
	private Integer playerNumber;
	
	@Autowired(required = false)
	private FootBallTeams footBallTeam;
}
