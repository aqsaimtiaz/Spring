package com.springcore.collection.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/autowiring/Config.xml");
    	Emp e1 = context.getBean("e1", Emp.class);
       System.out.println(e1);
    }
}
