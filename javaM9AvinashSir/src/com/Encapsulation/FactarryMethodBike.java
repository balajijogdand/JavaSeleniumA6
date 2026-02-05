package com.Encapsulation;

public class FactarryMethodBike {
	String brand;
	double price; 
	int cc;
	String color;
	
	FactarryMethodBike(String brand, double price, int cc, String color)
	{
		this.brand=brand;
		this.price=price;
		this.cc=cc;
		this.color=color;
	}
	public static FactarryMethodBike getFactarryMethodBike(String brand, double price, int cc, String color)
	{
		return new  FactarryMethodBike( brand, price, cc, color);
	}
	 
		
		public void printbike()
		{
				System.out.println("Bike Brand is : "+brand);
				System.out.println("Bike price is : "+price);
				System.out.println("Bike cc is : "+cc);
				System.out.println("Bike color is : "+color);
				System.out.println("============================");
		}	
			
	}
	
    

}
