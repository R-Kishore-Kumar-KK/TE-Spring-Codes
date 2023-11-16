package com.te.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.springannotations.beans.MessageBean;
import com.te.springannotations.configuration.MessageConfig;

public class MessageTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		
		MessageBean bean = context.getBean("messageBean", MessageBean.class);
		bean.setMsg("Spring Core");
		System.out.println(bean.getMsg()+ " util Phase");
		
		((AbstractApplicationContext) context).close();
	}
}
