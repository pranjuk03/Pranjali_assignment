package com.java.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");

		Applicationclass n = (Applicationclass) context.getBean("noob");

		n.walk();

		Build a = (Build) context.getBean("pro");
		a.Slow();

	}
}
