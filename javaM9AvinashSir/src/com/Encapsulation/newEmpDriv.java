package com.Encapsulation;

public class newEmpDriv {
    // Main method to test
    public static void main(String[] args)
    {
        newEmp e1 = new newEmp("Balaji", 101, 55000.0, "s/w tester");
        newEmp e2 = new newEmp("Vikas", 102, 25000.0, "designer");
        //newEmp e3 = new newEmp("Shiva", 103, 15000.0, "Developer");
        e1.getPrintDetails();
        e2.getPrintDetails();
       // e3.getPrintDetails();
    }
}