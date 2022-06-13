package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springcot.xml");
		Student s = (Student)context.getBean("myStudent");
		System.out.println("age:"+s.getAge());
		System.out.println("Name:"+s.getName());
		System.out.println("Reg_NO:"+s.getReg_no());
	}

}
