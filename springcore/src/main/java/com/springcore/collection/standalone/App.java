package com.springcore.collection.standalone;

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
        		new ClassPathXmlApplicationContext("com/springcore/collection/standalone/Config.xml");
        
        Emp emp = (Emp) context.getBean("Emp1");
        System.out.println(emp);
        
       
    }
}
