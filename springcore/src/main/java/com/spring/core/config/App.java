package com.spring.core.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        
        ApplicationContext context =
        		new AnnotationConfigApplicationContext(JavaConfig.class);
       
        Student b = (Student) context.getBean("getStudent");
      System.out.println(b);
      b.study();
      
    }
}
