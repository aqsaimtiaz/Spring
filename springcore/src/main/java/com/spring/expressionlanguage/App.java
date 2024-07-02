package com.spring.expressionlanguage;

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
      
        
        ApplicationContext context =
        		new ClassPathXmlApplicationContext("com/spring/expressionlanguage/Config.xml");
       
        
        Demo b = (Demo) context.getBean("demo");
      System.out.println(b);
      
    }
}
