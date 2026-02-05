package com.Encapsulation;

public class FactrryMethodBikeDriver {
	public static void main(String [] args)
	{
		 FactarryMethodBike b1 =  FactarryMethodBike.getFactarryMethodBike("rs", 250000, 450, black);
		 FactarryMethodBike b2 =  FactarryMethodBike.getFactarryMethodBike("yahama", 350000, 400, blue);
		 
		 b1.printbike();
		 b2.printbike();
	
	}

}
