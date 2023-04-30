package com.springcore.ConstructorInjection;

public class Certificate
{

	private String name;

	public Certificate()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return this.name;
	}	
	
}
