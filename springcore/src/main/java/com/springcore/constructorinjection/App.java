package com.springcore.constructorinjection;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context =
        		new ClassPathXmlApplicationContext("com/springcore/constructorinjection/Config.xml");
        
        Person emp = (Person) context.getBean("Person1");
        System.out.println(emp);
        
        Addition add = (Addition) context.getBean("add");
        add.sum();
    }
}
