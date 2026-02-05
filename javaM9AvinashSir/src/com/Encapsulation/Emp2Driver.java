package com.Encapsulation;

public class Emp2Driver {
	public static void main (String[]args)
	{
		Emp2 E1 = new Emp2("Balaji", 101, 35000, " Software Tester");
		Emp2 E2 = new Emp2("Vikas", 102, 25000, "Grafics Designer");
	    Emp2 E3 = new Emp2("Shiva", 102, 15000, "Electrical Engeneer");
	    E1.getPrintdetails();
	    E2.getPrintdetails();
	    E3.getPrintdetails();
	}
	

}