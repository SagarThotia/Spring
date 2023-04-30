package com.springcore.ConstructorInjection;

import java.util.List;

public class Person 
{
	private int PersonId;
	private String name;
	private Certificate certi;
	private List<String> contactlist;
	
	public Person() 
	{

	}

	public Person(int personId, String name, Certificate certi, List<String> contactlist)
	{
		super();
		PersonId = personId;
		this.name = name;
		this.certi = certi;
		this.contactlist = contactlist;
	}



	@Override
	public String toString() 
	{
		return " [ " + this.PersonId + " : " + this.name + " : " + this.certi + " : " + this.contactlist + " ] ";
	}

}
