package com.FristVariable;
    //non static variable 
	// non static method
	// non static initializer
	// constructor
public class MemberOfClass {
	// creating main method
	public static void main(String[] args) {
	// creating non static variable
		int a = 20;  
		test();
	}
	// creating non static method
	public static void test() {
		System.out.println("i am from test method");
	}
	// creating static multiline initilizer
	static {
		System.out.println("i am from static multiline initilizer");
	}
	// creating non static multiline initilizer
	{
		System.out.println("i am from non static multiline initilizer");
	}

}
