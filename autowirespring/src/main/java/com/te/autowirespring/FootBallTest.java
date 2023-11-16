package com.te.autowirespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.autowirespring.beans.FootBall;
import com.te.autowirespring.configuration.FootBallConfig;

public class FootBallTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FootBallConfig.class);
		FootBall bean = context.getBean(FootBall.class);
		
		System.out.println(bean.getPlayerName());
		System.out.println(bean.getPlayerNumber());
		
		System.out.println(bean.getFootBallTeam().getTeam1());
		System.out.println(bean.getFootBallTeam().getTeam2());
	}
}
