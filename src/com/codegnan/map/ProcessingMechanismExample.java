package com.codegnan.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingMechanismExample {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(5,10,15,20,25,30,35,40,45,50);
		List<String> names=Arrays.asList("ravi","priya","Arjun","siddu","Deepa","Meera","Anil","Bhavana","Krishna","vijay");
		System.out.println( " 1. Collect() method exampple");
		List<Integer>evennums=numbers.stream().filter(n->n%2==0)
	.collect(Collectors.toList());
		
		System.out.println("Even nums:" +evennums);
		
		List<Integer>oddnums=numbers.stream().filter(n->n%2!=0)
				
				.collect(Collectors.toList());
					
					System.out.println("Odd nums:" +oddnums);
		
					List<Integer>greater25=numbers.stream().filter(n->n>25)
							.collect(Collectors.toList());
					System.out.println("Greater than 25:" +greater25);

					List<String>bignames=names.stream().filter(name->name.length()>4)
							.collect(Collectors.toList());
					System.out.println("Long names:" +bignames);
					
					List<String>nameswithA=(List<String>) names.stream().filter(name->name.toLowerCase().contains("a"))
							.collect(Collectors.toList());
					System.out.println(" names with A:" +nameswithA);
					System.out.println();

					
					System.out.println("2. count()--->count filtered ecamples");
					System.out.println();

					System.out.println("count of even numbers " +numbers.stream().filter(n->n%2==0).count());
					System.out.println();

					System.out.println("count of  numbers>30" +numbers.stream().filter(n->n>30));
					System.out.println();

					System.out.println("count of names starting with A: " +names.stream()
					.filter(name->name.startsWith("A")).count());
				
					System.out.println();

					System.out.println("count of long names>5" +names.stream()
					.filter(name->name.length()>5).count());
					
					System.out.println("Processing by sorted()" );
					
					System.out.println();

					System.out.println("numbers in asecending order" +numbers.stream().sorted().
							collect(Collectors.toList()));
					
					

					System.out.println("numbers in descending order" +numbers.stream().sorted(Comparator.reverseOrder()).
							collect(Collectors.toList()));
					
					
					
					System.out.println(" the names in ascending order(a-z)" +names.stream().sorted()
					.collect(Collectors.toList()));
					
					System.out.println(" names in descending order(a-z)" +names.stream().sorted(Comparator.reverseOrder())
							.collect(Collectors.toList()));
							

					System.out.println();
					//min()
					
     String min=names.stream().min((s1,s2)->s1.compareTo(s2)).get();										
					System.out.println("min element:" +min);
					
					
	     String max=names.stream().max((s1,s2)->s1.compareTo(s2)).get();										
									System.out.println("min element:" +max);

		Integer min1=numbers.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min number is :" +min1);
									
		Integer max1=numbers.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("max number is :" +max1);			
		System.out.println("ToArray() convert a stream to Array");
		Integer[] evenArr=numbers.stream().filter(n->n%2==0).toArray(Integer[]::new);
		System.out.println("Even numbers array : " +Arrays.toString(evenArr));
		String[] upperArr=names.stream().map(String::toUpperCase).toArray(String[]::new);		
		System.out.println("Upper names in Array:" +Arrays.toString(upperArr));
		//Stream.of();
		
		System.out.println("stream.of() direct stream creation");
		Stream.of(10,20,30,40,50).filter(n->n>25).forEach(System.out::println);
		
		System.out.println();
		
	Stream.of("mango","apple","banana").sorted().forEach(System.out::println);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
