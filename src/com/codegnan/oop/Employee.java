package com.codegnan.oop;

public class Employee {
	String name;
	double BasicSalary;
	
	public void setDetails(String n, double salary) {
		name=n;
		BasicSalary=salary;
	}
	public double calculateHRA() {
		return 0.20*BasicSalary;
	}
	public double calculateDA() {
		return 0.10*BasicSalary;
	}

	public double groossSalary() {
		return BasicSalary+calculateHRA()+calculateDA();
	}
	
	

}
