package com.te.autowirespring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.autowirespring.beans.FootBallTeams;

@Configuration
public class FootBallTeamConfig {

	@Bean("mes")
	public FootBallTeams getFootBallTeams() {
		FootBallTeams team1 = new FootBallTeams();
		team1.setTeam1("Fc Barcelona");
		team1.setTeam2("Argentaina");
		return team1;
	}
}
