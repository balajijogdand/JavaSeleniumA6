// access non-Static method using getter method.
package com.Encapsulation;
import java.util.Scanner;
public class Emp2 {
	static int pass = 2611;
	private String name;
	private int id;
	private double sal;
	private String job;
	
	Emp2(String name, int id, double sal, String job)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.job=job;
	}
	//non-static method.
	public void printdetails()
	{
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee sallary : "+sal);
		System.out.println("Employee job post : "+job);
		System.out.println("============================");	}
	//create getter method to access not-static method.
	public void getPrintdetails()
	{
		System.out.println("if you want to access the employees details, plz enter the password..");
		Scanner s = new Scanner (System.in);
		int input = s.nextInt();
		if (pass == input)
		{
			getPrintdetails();
			
		}
		{
			System.out.println("Enter correct password..");
		}
		s.close();
	}
}
