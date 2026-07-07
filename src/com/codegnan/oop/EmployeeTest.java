package com.codegnan.oop;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setDetails("siddu", 50000);
		System.out.println("employee name"+ e.name);
		System.out.println("employee salary:"+ e.BasicSalary());
		System.out.println("HRA allownace:" +e.calculateHRA());
		System.out.println("da Allowance:" +e.calculateDA());
		System.out.println("gross salary"+ e.groossSalary());
		
		
		
	}

}
