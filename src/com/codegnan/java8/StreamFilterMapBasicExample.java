package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMapBasicExample {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(10,25,30,45,50,75,100);
		List<String> names=Arrays.asList("Arjun","deepa","siddu","meera","bhuvana");
		System.out.println("Q1 even Numbers ");
		numbers.stream().filter(i->i%2==0).forEach(System.out::println);;
		System.out.println("Q2 even Numbers ");
		numbers.stream().filter(i->i>40).forEach(System.out::println);
		
		// filter name star==ting with A
		System.out.println("Q3 name starting with A ");

		names.stream().filter(str-> str.startsWith("A")).forEach(System.out::println);
		System.out.println("");
		
		System.out.println(" Q5 numners divisible by 5");
		numbers.stream().filter(i->i%5==0).forEach(System.out::println);
		System.out.println("Q4 names having length>5 ");
		
		names.stream().filter(n-> n.length()<5).forEach(System.out::println);
		
		System.out.println(" Q6 numbers divisible by 5");
		
		
		

		
		
		


		


		
		
		
		
		
	}

}
