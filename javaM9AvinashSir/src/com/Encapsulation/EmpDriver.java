//access private members using getter method.
package com.Encapsulation;

public class EmpDriver {
	public static void main(String[] args) {
		Emp e1 = new Emp("Balaji",101,25000);
		Emp e2 = new Emp("shiva",102,25000);
		Emp e3 = new Emp("vikas",103,25000);
		System.out.println("==========================================");
		
		//1st  Employee
		System.out.println("Company Name: "+e1.getComname());
		System.out.println("Employee ID: "+e1.getId());
		System.out.println("Employee Name: "+e1.getName());
		System.out.println("Employee Salary: "+e1.getSal());
		e1.setSal(555000);
		System.out.println("Employee Updated Salary: "+e1.getSal());
		System.out.println("==========================================");
		
		//2nd  Employee
		System.out.println("Company Name: "+e2.getComname());
		System.out.println("Employee ID: "+e2.getId());
		System.out.println("Employee Name: "+e2.getName());
		System.out.println("Employee Salary: "+e2.getSal());
		e2.setSal(505000);
		System.out.println("Employee Updated Salary: "+e2.getSal());
		System.out.println("==========================================");
		
		//3rd Employee
		System.out.println("Company Name: "+e3.getComname());
		System.out.println("Employee ID: "+e3.getId());
		System.out.println("Employee Name: "+e3.getName());
		System.out.println("Employee Salary: "+e3.getSal());
		e3.setSal(450000);
		System.out.println("Employee Updated Salary: "+e3.getSal());
		System.out.println("==========================================");
	}

}
