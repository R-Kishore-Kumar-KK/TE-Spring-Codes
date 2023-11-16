package com.te.autowirespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.autowirespring.beans.Car;
import com.te.autowirespring.configuration.CarEngineConfig;

public class CarTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CarEngineConfig.class);
	
		Car car = context.getBean(Car.class);
		
		System.out.println(car.getEngine().getEngineType());
		System.out.println(car.getEngine().getMph());
		
		System.out.println(car.getCompany().getModel());
		System.out.println(car.getCompany().getName());
	}
}
