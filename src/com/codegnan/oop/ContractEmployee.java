package com.codegnan.oop;

public class ContractEmployee extends Employee1{
	double contractAmount;

	public ContractEmployee(String name, double contractAmount) {
		super(name);
		this.contractAmount = contractAmount;
	}
	public double calculateSalary() {
		return contractAmount;
	}
	

}
