package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.beans.MessageBean;

public class MessageBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		MessageBean bean = context.getBean("msg", MessageBean.class);
		System.out.println(bean.getMsg());
		
//		((AbstractApplicationContext) context).close();
	}
}
