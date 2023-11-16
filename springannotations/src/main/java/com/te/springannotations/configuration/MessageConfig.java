package com.te.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springannotations.beans.MessageBean;
import com.te.springannotations.postprocessor.MyBeanFactoryPP;
import com.te.springannotations.postprocessor.MyBeanPostProcessor;

@Configuration
public class MessageConfig {

	@Bean("messageBean")
	public MessageBean getMsg() {
		MessageBean bean = new MessageBean();
		bean.setMsg("Hellow World");
		return bean;
	}
	
	@Bean
	public MyBeanPostProcessor getMBPP() {
		return new MyBeanPostProcessor();
	}
	
	@Bean
	public MyBeanFactoryPP getMBFPP() {
		return new MyBeanFactoryPP();
	}
}
