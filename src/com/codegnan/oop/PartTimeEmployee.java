package com.codegnan.oop;

public class PartTimeEmployee extends Employee1{
	double hourlyrate;
	double hoursworked;
	public PartTimeEmployee(String name, double hoursworked, double hourlyrate) {
		super(name);
		this.hourlyrate=hourlyrate;
		this.hoursworked=hoursworked;
		
	}

	@Override
	public double calculateSalary() {
		return ;
	}
	
	
}



