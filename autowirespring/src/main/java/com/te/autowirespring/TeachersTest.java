package com.te.autowirespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.autowirespring.beans.Teachers;
import com.te.autowirespring.configuration.TeachersConfig;

public class TeachersTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(TeachersConfig.class);
		
		Teachers bean = context.getBean(Teachers.class);
		
		System.out.println("Teachers Id: "+ bean.getId());
		System.out.println("Teachers Name: "+bean.getName());
		
		System.out.println("Teachers Dept Id: "+bean.getDept().getDeptId());
		System.out.println("Teachers Dept Name: "+bean.getDept().getDeptName());
	}
}
