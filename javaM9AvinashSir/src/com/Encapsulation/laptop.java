package com.Encapsulation;

public class laptop {
	private String brand;
	private int RAM;
	private int ROM;
	private double price;
	
	private laptop(String brand, int ROM, int RAM, double price)
	{
		this.brand = brand;
		this.ROM = ROM;
		this.RAM=RAM;
		this.price = price;
	}
	
	public static laptop getLaptop(String brand, int ROM, int RAM, double price)
	{
		laptop l1 = new laptop (brand, ROM, RAM, price);
		System.out.println(l1);
		return l1;
	}

}
