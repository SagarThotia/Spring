package com.springcore.Lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Lifecycle/LifeCycleConfig.xml");
		
		//registering shutdown hook
		context.registerShutdownHook();
//		Samosa s = (Samosa) context.getBean("s1");
//		System.out.println(s);
//		
//		
//		System.out.println("---------------------------------------------------------------------------------");
//		
//		//In this through using Interface order is important 
//		Pepsi p = (Pepsi) context.getBean("p1");
//		System.out.println(p);
		
		Example e = (Example) context.getBean("e1");
		System.out.println(e);
	}	

}
