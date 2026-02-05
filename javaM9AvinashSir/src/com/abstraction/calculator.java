package com.abstraction;

abstract public class calculator {
	abstract public void add(int a, int b);
	abstract public void sub(int a, int b);
	public void mul(int a, int b) {
		System.out.println(a+b);
	}
	
	public void div(int a, int b) {
		System.out.println(a/2);
	}
	
	class calimp extends calculator{
		public void add(int a, int b) {
			System.out.println("the addition of 2 numbers");
			System.out.println(a+b);
		}
		
		public void sub(int a, int b) {
			System.out.println("the substraction of 2 numbers");
			System.out.println(a/b);
		}
		
	}

}
