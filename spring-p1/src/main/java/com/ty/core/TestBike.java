package com.ty.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBike {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bike.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Bike b = (Bike) beanFactory.getBean("myBike");
		System.out.println("name:" + b.getName());
		System.out.println("cost:" + b.getCost());
		System.out.println("cc:" + b.getSp().getCc());
		System.out.println("transmission:" + b.getSp().getTrans());
		b.getSp().dispalay();
	}
}
