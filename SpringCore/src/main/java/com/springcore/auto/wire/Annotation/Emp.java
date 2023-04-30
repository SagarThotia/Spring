package com.springcore.auto.wire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp 
{
	@Autowired
	@Qualifier("temp")
	private Address address;
	
	public Emp()
	{
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public Emp(Address address) 
	{
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	public Address getAddress()
	{
		return address; 
	}
	
//	@Autowired
	public void setAddress(Address address) 
	{
		System.out.println("Setting value");
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Emp [Address=" + address + "]";
	}
}
