package com.codegnan.map;

public class Emp {

	private int id;
	private String name;
	private String department;
	private String city;
	private int salary;
	public Emp(int id, String name, String department, String city, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.city = city;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", department=" + department + ", city=" + city + ", salary="
				+ salary + "]";
	}
	
	
	
	

}
