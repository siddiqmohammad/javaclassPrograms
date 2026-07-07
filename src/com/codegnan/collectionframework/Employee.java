package com.codegnan.collectionframework;

import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empAdress;
	// no args constructor, all-arg constructor,getters,setters
	//equals() and hashcode() and tostring()
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, double empSalary, String empAdress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAdress = empAdress;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAdress="
				+ empAdress + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empAdress, empId, empName, empSalary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empAdress, other.empAdress) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}
	

}
