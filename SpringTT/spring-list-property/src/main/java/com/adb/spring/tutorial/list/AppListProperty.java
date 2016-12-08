package com.adb.spring.tutorial.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppListProperty {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		FruitBasket fb = (FruitBasket) context.getBean("fruitbasket1");
		System.out.println(fb);

	}

}
