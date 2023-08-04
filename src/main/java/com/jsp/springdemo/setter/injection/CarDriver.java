package com.jsp.springdemo.setter.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {

	public static void main(String[] args) {

//		This is Using BeanFactory

//		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
//		Car car = (Car) beanFactory.getBean("myCar");
//		System.out.println(car.getName());
//		System.out.println(car.getBrand());
//		System.out.println(car.getColour());

//		-----------------------------------------------------------------------------------------------------------------

//		This is Using ApplicationContext

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Car car = (Car) applicationContext.getBean("myCar");
		System.out.println(car.getName());
		System.out.println(car.getBrand());
		System.out.println(car.getColour());
	}

}
