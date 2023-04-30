package com.springcore.Lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Example
{
	private String subject;

	public Example()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() 
	{
		return subject;
	}

	public void setSubject(String subject) 
	{
		System.out.println("Setting subject");
		this.subject = subject;
	}

	@Override
	public String toString() 
	{
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("starting method");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("ending method");
	}
	
}
