package com.ty.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("mobilesim.xml");
	Mobile m =(Mobile)context.getBean("myMobile");
	System.out.println("Name:"+m.getName());
	System.out.println("ram:"+m.getRam());
	System.out.println("service"+m.getS().getService());
	System.out.println("No:"+m.getS().getNo());
	m.getS().display();
}
}
