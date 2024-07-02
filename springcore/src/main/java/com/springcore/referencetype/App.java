package com.springcore.referencetype;

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
        		new ClassPathXmlApplicationContext("com/springcore/referencetype/Config.xml");
        
        A emp = (A) context.getBean("aref");
        System.out.println(emp);
        
       
    }
}
