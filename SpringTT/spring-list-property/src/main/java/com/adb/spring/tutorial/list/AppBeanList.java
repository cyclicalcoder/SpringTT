package com.adb.spring.tutorial.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBeanList {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Jungle jungle = (Jungle)context.getBean("jungle");
		System.out.println(jungle);
		System.out.println("this is committeddddddd");

	}

}
