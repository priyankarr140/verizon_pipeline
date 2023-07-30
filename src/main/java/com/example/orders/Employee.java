package com.example.orders;

import javax.persistence.Entity;

@Entity
public class Employee
{
	private int userId;
	private String name;
	public Employee(int userId,String name)
	{
		this.userId=userId;
		this.name=name;
	}
	public int getUserId()
	{
		return this.userId;
	}
	public String getName()
	{
		return this.name;
	}
	public String getData()
	{
		return "how are you";
	}
	public String test()
	{
	    return "this method";	
	}
}