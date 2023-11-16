package com.te.autowirespring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.autowirespring.beans.FootBall;
import com.te.autowirespring.beans.Teachers;

@Configuration
@Import({FootBallTeamConfig.class})
public class FootBallConfig {

	@Bean
	public FootBall getFootBallData() {
		FootBall ball = new FootBall();
		ball.setPlayerName("Messi");
		ball.setPlayerNumber(10);
		return ball;
	}
}		
