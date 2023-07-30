package com.example.catalog;

public class Order {
	private int orderId;
	private String name;
	
	public int getOrderId()
	{
		return this.orderId;
	}
	public String getName()
	{
		return this.name;
	}
	public void setOrderId(int num)
	{
		this.orderId=num;
	}
	public void setName(String n)
	{
		this.name=n;
	}

}
