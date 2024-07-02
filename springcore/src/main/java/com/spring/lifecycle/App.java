package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        
        AbstractApplicationContext context =
        		new ClassPathXmlApplicationContext("com/spring/lifecycle/Config.xml");
        context.registerShutdownHook();
   
//        Samosa emp = (Samosa) context.getBean("s1");
//        System.out.println(emp);
//        
//        System.out.println("+++++++++++++++++");
//        
//        Pepsi p = (Pepsi) context.getBean("p1");
//        System.out.println(p);
        
        System.out.println("+++++++++++++++++");
       
        Burger b = (Burger) context.getBean("b1");
      System.out.println(b);
      
    }
}
