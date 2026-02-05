package com.interfacee;

public interface InterfaceDemo {
	public static final a = 20;
	int b = 50;
	public abstract void test();
	void test2();
	public void test3(int x, int y) {

	private void test4() {
		System.out.println("i am from private method.");
	}
	
	public static void main(String []args) {
		System.out.println(a);
		System.out.println(b);
		
		InterfaceDemo i = new InterfaceDemo();
		i.test();
		
	}
}