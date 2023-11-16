package com.te.springannotations.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.te.springannotations.beans.MessageBean;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		
		if(bean instanceof MessageBean) {
			MessageBean messageBean = (MessageBean) bean;
			System.out.println("Before init "+messageBean.getMsg());
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof MessageBean) {
			MessageBean messageBean = (MessageBean) bean;
			System.out.println("After init "+ messageBean.getMsg() );
		}
		return bean;
	}
}
