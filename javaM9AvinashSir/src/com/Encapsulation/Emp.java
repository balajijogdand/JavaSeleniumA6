//access private members using getter method.
package com.Encapsulation;

public class Emp {	
	
	private static String comname = "TCS";
	private String name;
	private int id;
	private double sal;
	
	Emp (String name, int id, double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;	
	}
	
	//getter method for name
	public String getName() {
		return name;
	}
	
	//getter method for id
	public int getId() {
		return id;
	}
	

	//getter method for salary
	public double getSal() {
		return sal;
	}
	
	public String getComname() {
		return comname;
	}
	
	//setter method for salary
	public void setSal(double sal) {
		this.sal=sal;
	}
	
	

}
