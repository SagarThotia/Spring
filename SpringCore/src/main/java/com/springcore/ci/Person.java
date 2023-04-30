package com.springcore.ci;

public class Person 
{
	private int personId;
	private String name;
	private Certificate certi;
	
	
	public Person() 
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(int personId, String name, Certificate certi) 
	{
		super();
		this.personId = personId;
		this.name = name;
		this.certi=certi;
	}
	

	@Override
	public String toString()
	{
		return this.personId + " : " + this.name + " { " + this.certi.name + "}";
	}
}
