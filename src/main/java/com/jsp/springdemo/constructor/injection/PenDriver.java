package com.jsp.springdemo.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {

	public static void main(String[] args) {

//		This is Using BeanFactory

//		ClassPathResource classPathResource = new ClassPathResource("myspringconstructor.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
//		Pen pen = (Pen) beanFactory.getBean("myPen");
//		System.out.println(pen.name);
//		System.out.println(pen.price);
//		System.out.println(pen.colour);

//		-----------------------------------------------------------------------------------------------------------------

//		This is Using ApplicationContext

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspringconstructor.xml");
		Pen pen = (Pen) applicationContext.getBean("myPen");
		System.out.println(pen.name);
		System.out.println(pen.price);
		System.out.println(pen.colour);

	}

}
