package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test 
{

	public static void main(String[] args) 
	{
		//for close 
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaConfig/javaconfig.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student student = context.getBean("firststudent",Student.class);
//		Student student = context.getBean("getStudent",Student.class);
		Student student1 = context.getBean("student",Student.class);
		Student student2 = context.getBean("temp",Student.class);
		Student student3 = context.getBean("con",Student.class);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		student1.Study();
		student2.Study();
		student3.Study();
		//context.close();
	}

}
