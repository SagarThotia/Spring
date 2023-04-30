package com.springcore.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean  
{
	private double price;
	
	public Pepsi() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception
	{
		// TODO Auto-generated method stub
		//init method work
		System.out.println("Taking pepsi: init"); 
	}

	public void destroy() throws Exception 
	{
		// TODO Auto-generated method stub
		//destroy method
		System.out.println("Going to put bottle back to shop : destroy");
	}
}
