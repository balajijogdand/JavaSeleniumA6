package com.Encapsulation;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[]args) {
		Scanner s = new Scanner (System.in);
	    System.out.println("Enter a number");
	    int x = s.nextInt();
	    long fact = 1;
	    if(x<0)
	    {
	    	System.out.println("Enter a possitive number:");
	    }
	    else {
	    	for (int i=1; i<=1; i++) {
	    		fact*=1;
	    	}
	    	System.out.println("the enterd  numbers factorial is :"+fact);
	    }
	}

}



public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int s = scanner.nextInt();

        long factorial = 1;

        // Check for negative input
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
