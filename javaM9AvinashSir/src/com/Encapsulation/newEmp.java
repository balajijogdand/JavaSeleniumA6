package com.Encapsulation;

import java.util.Scanner;

public class newEmp {
    static int pass = 2611;
    private String name;
    private int id;
    private double sal;
    private String job;

    // Constructor
    newEmp(String name, int id, double sal, String job) {
        this.name = name;
        this.id = id;
        this.sal = sal;
        this.job = job;
    }

    // Private non-static method
    private void printDetails() {
        System.out.println("Employee name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee salary : " + sal);
        System.out.println("Employee job post : " + job);
    }

    // Public method to access the private method with password check
    public void getPrintDetails() {
        System.out.println("If you want to access the employee's details, please enter the password:");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if (pass == input) {
            printDetails();
            //printDetails();// Call the private method
        } else {
            System.out.println("Incorrect password. Access denied.");
        }
        s.close(); // Close the scanner
    }
}
