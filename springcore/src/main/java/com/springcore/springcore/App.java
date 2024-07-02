package com.springcore.springcore;

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
        		new ClassPathXmlApplicationContext("Config.xml");
        
        Student student1 = (Student) context.getBean("Student1");     
        System.out.print(student1);
        
        Student student2 = (Student) context.getBean("Student2");     
        System.out.print(student2);
        
        Student student3 = (Student) context.getBean("Student3");     
        System.out.print(student3);
    }
}
