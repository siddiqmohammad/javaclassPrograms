package com.codegnan.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		HashSet<Employee> hashSet = new HashSet<>();

		hashSet.add(new Employee (999, "malli", 17000, "hyd"));

		hashSet.add(new Employee (666, "arjun", 1000, "bng"));

		hashSet.add(new Employee (111, "neha", 22000, "vjy"));

		hashSet.add(new Employee (333, "sneha", 55000, "mumbai"));

		hashSet.add(new Employee (777, "raji", 17500, "kolkatta"));

		System.out.println(hashSet);

		for (Employee emp: hashSet) {
			System.out.println(emp);


		
		}



		System.out.println("Linked HashSet----");

		LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add(new Employee (999, "malli", 17000, "hyd"));

		linkedHashSet.add(new Employee (666, "arjun", 1000, "bng"));

		linkedHashSet.add(new Employee (111, "neha", 22000, "vjy"));

		linkedHashSet.add(new Employee (333, "sneha", 55000, "mumbai"));

		linkedHashSet.add(new Employee (777, "raji", 17500, "kolkatta"));
		System.out.println(linkedHashSet);
		for(Employee emp:linkedHashSet) {
			System.out.println(emp);
		}
		System.out.println("-------- TreeSet-------------");

				

TreeSet<Employee> treeSet = new TreeSet<>(new ComparatorExample());

				
				treeSet.add(new Employee (666, "arjun", 1000, "bng")); treeSet.add(new Employee (999, "malli", 17000, "hyd"));


				treeSet.add(new Employee (111, "neha", 22000, "vjy"));


				treeSet.add(new Employee (333, "sneha", 55000, "mumbai"));

				

				treeSet.add(new Employee (777, "raji", 17500, "kolkatta"));


				System.out.println(treeSet);

				for (Employee emp: treeSet) {

				System.out.println(emp);

				

				}
		

		
		

	}

}
