package com.codegnan.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCustomObjectExample {

	public static void main(String[] args) {
		List<Emp>employees=Arrays.asList(
				new Emp(101,"ravi","hr", "hyderabad",20000),
				new Emp(102,"siddu","hr", "pune",80000),
				new Emp(103,"meera","hr", "vizag",90000),
				new Emp(104,"varun","hr", "hyderabad",95000)
				);
		
	System.out.println("1.collect");	
		
		List<Emp>highEarners=employees.stream().filter(e->e.getSalary()>70000)
					.collect(Collectors.toList());

			List<Emp>hydemployees=employees.stream().filter(e->e.getCity().equalsIgnoreCase("Hyderabad"))
			.collect(Collectors.toList());
			System.out.println("Employees from hyderab: " +hydemployees);

			System.out.println("2.count()");
		System.out.println("employees earning >50000" 
				+employees.stream().filter(e->e.getSalary()>50000).count());

		
		System.out.println("sorted");
			System.out.println("employee salary (asc)" +employees.stream().sorted
		(Comparator.comparing(Emp::getSalary)).collect(Collectors.toList()));


		

	}

}
