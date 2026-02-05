package com.FristVariable;

import java.util.Scanner;

public class PrimeNotPrime{
	public static void main(String[] args) {
		// creating scanner class 
		Scanner sc=new Scanner(System.in);
		// printing statement
		System.out.println("Enter a number :");
		// storing the input to the variable which is passed to the usser  
		int num=sc.nextInt();//12
		// creating variable
		int count=0;//4
		// for loop statement
		for(int i= 1; i<=num;i++) {
			if(num%i==0) {
				count++;//12345
			}
		}
		if(count==2) {
		System.out.println("prime");
	}
		else {
			System.out.println("Not primme");
		}
		}

}
