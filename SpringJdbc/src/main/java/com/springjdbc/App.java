package com.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;


public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "My Program Started....." );
   
        //springjdbc =>  jdbcTemplate
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        //INSERT
        Student student = new Student();
        student.setId(250);
        student.setName("Katie Chan");
        student.setCity("Phuket");
        int result = studentDao.insert(student);
        System.out.println(result + " Student data is added successfully.");
        
        //UPDATE
//        Student student = new Student();
        student.setId(250);
        student.setName("Yin Hong");
        student.setCity("Minato");
        int result1 = studentDao.change(student);
        System.out.println(result1 + " Student data is updated successfully.");
        
//        //DELETE
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter StudentId: ");
        int result2= studentDao.delete(sc.nextInt());
        System.out.println(result2 + " Student data is deleted successfully.");
        
        System.out.println("Single Data to display: ");
        
        //select single student data
        Student student1 = studentDao.getStudent(222);
        System.out.println(student1);
        
        System.out.println("Multiple Data to display: ");
        
        // select multiple Student data
          List<Student> students = studentDao.getAllStudents();
          for(Student s:students)
          {
        	  System.out.println(s);
          }
        
        
        //It is not a appropriate way to create Dao
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
//        // insert query
//        String query="insert into student(Id,Name,City) values(?,?,?)";
//        
//        //fire query
//        int result = template.update(query, 250, "Katie Chan", "Phuket");
//        
//        System.out.println("Number of record inserted.." + result);
        
         //getting data from database select query
      
    }
}
