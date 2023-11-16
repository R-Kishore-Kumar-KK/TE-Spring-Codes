package com.te.springannotations.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Before Instantiation");
		
		BeanDefinition definition = beanFactory.getBeanDefinition("messageBean");
		MutablePropertyValues propertyValues = definition.getPropertyValues();
		propertyValues.add("msg", "Chennai");
	}

	
}
