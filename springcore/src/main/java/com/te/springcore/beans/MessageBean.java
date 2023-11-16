package com.te.springcore.beans;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class MessageBean implements Serializable {

	public MessageBean() {
		System.out.println("Ist Phase");
	}
	
	private String msg;
	
	public void myInit() {
		System.out.println("Init phase 2nd Phase");
	}
	
	public void myDestroy() {
		System.out.println("Destroy method 4th Phase");
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Init phase 2nd Phase"); }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("Destroy method 4th phase"); }
	 */

}
