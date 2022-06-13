package com.ty.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("carengine.xml");
		Car c=(Car)context.getBean("myCar");
		c.e.display();

	}
}
