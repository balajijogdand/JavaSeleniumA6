package com.FristVariable;

import java.util.Scanner;

public class ChechTheCandidateCapebleToVotingOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter yor age : ");
		int age = s.nextInt();
		System.out.println("Enter yor gender : ");
		String gender = s.next();
		
		if(age >= 21 && gender.equals("mail")) {
			System.out.println("This Person Is Capeable To Voting...");
		}
		else if (age >= 18 && gender.equals("femail")) {
			System.out.println(" This Person Is Capeable To Voting...");
		}
		else {
			System.out.println(" This Person is Not Capeable To Voting..");
		}
	}
}
