package com.codegnan.oop;

public class Employee_01 {
	int id;
	String name;
	double salary;
	

public Employee_01(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
public void displayDetails() {
	System.out.println("employee id:"+ id);
	System.out.println("employee name " + name);
	System.out.println("employee salary"+ salary);
}
public static void main(String[] args) {
	Employee_01 emp = new Employee_01(111,"mahesh",1000);
	emp.id=101;
	emp.name="siddu";
	emp.salary=50000;
	emp.displayDetails();
}
public int getId() {
	return id;
}
public void setId(int id) {
	if(id<0) {
		System.out.println("invalid id");
		System.exit(0);
	}else {
		this.id = id;

	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	if (name=null || name="") {
		
	}
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}