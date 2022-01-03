package com.assignment8b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main( String[] args ) {
	    ApplicationContext ctx = 
	       new ClassPathXmlApplicationContext("beansAss.xml");
	    BeanPreandPost beanPre = (BeanPreandPost) ctx.getBean("id");
	    beanPre.doSomething();

	    // Explicitly closing application 
	    // context to force bean cleanup
	    ((ClassPathXmlApplicationContext)ctx).close();    
	  }


}
