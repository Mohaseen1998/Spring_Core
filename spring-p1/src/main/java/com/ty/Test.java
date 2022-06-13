package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	Person p = (Person) context.getBean("myPerson");
	System.out.println("age:"+p.getAge());
	System.out.println("Name:"+p.getName());
}
}
