package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static ApplicationContext context;

	public static void main( String[] args )
    {
     context = new  ClassPathXmlApplicationContext("com/springcore/Bean1.xml");
     Customer customer = (Customer) context.getBean("customer");
     System.out.println(customer);
    }
	

}
