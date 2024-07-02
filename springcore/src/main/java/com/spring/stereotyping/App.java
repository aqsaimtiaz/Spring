package com.spring.stereotyping;

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
        		new ClassPathXmlApplicationContext("com/spring/stereotyping/Config.xml");
       
        
        System.out.println("+++++++++++++++++");
       
        Student b = (Student) context.getBean("s1");
      System.out.println(b);
      
    }
}
