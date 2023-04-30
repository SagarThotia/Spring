package com.springcore.Standalone.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Standalone/Collections/StandaloneCollectionsConfig.xml");
		Person p = context.getBean("person1", Person.class);
		Person p1 = context.getBean("person2", Person.class);
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("___________________________________________________________________________________________________________________");
		System.out.println(p.getFeestructure());
		System.out.println(p.getFeestructure().getClass().getName());
		System.out.println("___________________________________________________________________________________________________________________");
		System.out.println(p.getProperties());
		System.out.println(p.getProperties().getClass().getName());
		
		
	}
}
