package com.spring.orm.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;
import entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/orm/Config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student(1122, "Duddu", "Dubai");
        int r = studentDao.insert(student);
        System.out.println("Result " + r);
    }
}
