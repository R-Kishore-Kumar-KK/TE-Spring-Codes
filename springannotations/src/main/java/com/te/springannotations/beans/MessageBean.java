package com.te.springannotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;

@Data
public class MessageBean {

	public MessageBean() {
		System.out.println("Instantiation Phase");
	}
	
	private String msg;
	
	@PostConstruct
	public void init() {
		this.msg = "InitPhase";
		System.out.println("Init Phase "+ this.msg);
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Phase");
	}
}
