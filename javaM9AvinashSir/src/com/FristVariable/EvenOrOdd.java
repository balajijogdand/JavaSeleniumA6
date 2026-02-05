package com.FristVariable;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		// scanner class create
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		// creating variable and storing the data which is pass by the the user.
		int num=sc.nextInt();
		// if condition statement
		if (num%2==0) {
			System.out.println("Even no is "+num);
		}
		else {
			System.out.println("Odd no is "+num);
		}
	}

}
