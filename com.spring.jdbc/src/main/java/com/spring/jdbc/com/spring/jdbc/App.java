package com.spring.jdbc.com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "program started" );
//     
//        // NOT RECOMMENDED WAY OF DOING //
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/com/spring/jdbc/Config.xml");
//        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
//        
//        final String query = "insert into student(id, name, address) values(?,?,?)";
//        
//        int result = template.update(query, 2, "Umair", "DXB");
//        System.out.println("# " + result);
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/com/spring/jdbc/Config.xml");
//        StudentDao template = (StudentDao) context.getBean("studentDao");
//        Student student = new Student();
//        student.setId(4);
//        student.setName("Muhammad d");
//        student.setAddress("DXB");
//        int r  = template.insert(student);
//    	System.out.println("result " + r);
    	
//    	System.out.println("+++++++ updating ++++++++++ \n");
//    	Student updateStudent = new 
//    			Student();
//    	updateStudent.setId(3);
//    	updateStudent.setAddress("DXB");
//    	updateStudent.setName("Muhammad Bin Umair");
//    	int r1 = template.change(updateStudent);
//    	System.out.println("result " + r1);
        
        
//        System.out.println("+++++++ deleting +++++");
//		Student updateStudent = new 
//				Student();
//		updateStudent.setId(4);
//		int r1 = template.delete(updateStudent);
//		System.out.println("result " + r1);
        
//      System.out.println("+++++++ selecting single object +++++");
//	   Student r1 = template.getStudent(2);
//	  System.out.println("result " + r1);
//  
//	  System.out.println("+++++++ selecting multiple object +++++");
//	 List<Student> students = template.getAllStudent();
//	 
//	 for(Student s : students) {
//		 System.out.println(s);
//	 }
        
    	
    	System.out.println("Connecting via annotation context");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao template =	(StudentDao)	context.getBean("studentDao");
        Student student = new Student();
	      student.setId(6);
	      student.setName("Muhammad d");
	      student.setAddress("DXB");
	      int r  = template.insert(student);
	  	System.out.println("result " + r);
    }
    
    
  
}
