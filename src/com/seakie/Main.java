package com.seakie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Car myCar = (Car) context.getBean("car");
		
		System.out.println("My car is " + myCar);
	}

}
