package com.Encapsulation;

public class swapnumber {
	static int a = 20;
	static int b = 40;
	
	public static void main(String[]args) {
		// before swapping 
		System.out.println("Before swaping value of a is :"+swapnumber.a);
		System.out.println("Before swaping value of b is :"+swapnumber.b);
		
		System.out.println("============================================");
		// After swapping 
		
		b = a + b;
		a = b - a;
		b = b - a;
	
		System.out.println("After swaping value of a is :"+a);
		System.out.println("After swaping value  of b is :"+b);	
	}
}
