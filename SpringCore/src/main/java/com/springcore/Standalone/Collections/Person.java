package com.springcore.Standalone.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person
{
	private List<String> friends; 
	private Map<String, Integer> feestructure;
	private Properties properties;
	
	
	public Person()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> friends, Map<String, Integer> feestructure, Properties properties)
	{
		super();
		this.friends = friends;
		this.feestructure = feestructure;
		this.properties = properties;
	}

	public List<String> getFriends() 
	{
		return friends;
	}

	public void setFriends(List<String> friends) 
	{
		this.friends = friends;
	}

	public Map<String, Integer> getFeestructure() 
	{
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure)
	{
		this.feestructure = feestructure;
	}

	public Properties getProperties() 
	{
		return properties;
	}

	public void setProperties(Properties properties) 
	{
		this.properties = properties;
	}

	@Override
	public String toString() 
	{
		return "Person [friends=" + friends + ", feestructure=" + feestructure + ", properties=" + properties + "]";
	}
	
	

}
