package com.springcore.Lifecycle;

public class Samosa  
{
	private double price;
	
	
	public Samosa() 
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
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Samosa [price=" + price + "]";
	}
	
	public void hey()
	{
		System.out.println("Inside init method : hey how are you?");
	}
	
	public void bye()
	{
		System.out.println("Inside destroy method : bye bye I am going to die");
	}
}


