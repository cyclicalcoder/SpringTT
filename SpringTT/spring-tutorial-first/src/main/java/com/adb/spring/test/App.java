
package com.adb.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// ApplicationContext context = new
		// FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/adb/spring/test/beans/beans.xml");

		Person person = (Person) context.getBean("person");
		person.display();

		System.out.println(person);
		
		Address address2 = (Address)context.getBean("address2");
		System.out.println(address2);

		((ClassPathXmlApplicationContext) context).close();

	}

}
