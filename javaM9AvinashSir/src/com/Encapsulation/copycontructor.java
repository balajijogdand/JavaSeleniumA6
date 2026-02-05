package com.Encapsulation;

public class copycontructor {
	    int number=101;
	    String brand;
	    double price;
	    int cc;
	    String model;

	    copycontructor( String brand, double price, int cc, String model)
	    {
	        

	        this.brand=brand;
	        this.price=price;
	        this.cc=cc;
	        this.model=model;
	    }

	    copycontructor(copycontructor c)
	    {
	        this.brand=c.brand;
	        this.price=c.price;
	        this.cc=c.cc;
	        this.model=c.model; 
	    }

	    public void printDetails()
	    {
	        //System.out.println( "car number is : "+number);
	        System.out.println( "car brand is : "+brand);
	        System.out.println( "car price is : "+price);
	        System.out.println( "car cc is : "+cc);
	        System.out.println( "car model is : "+model);
	        System.out.println( "======================");

	    }
	}
