package com.codegnan.java8;

import java.util.function.Function;

public class FunctionExample {
	 public static void main(String[] args) {
		 
		 /*squairng
		 Function<Integer,Integer>f=n->n* n;
		 System.out.println(f.apply(12));
		System.out.println(f.apply(5));
	}*/

// find the length of a string 
// covert uppercase characters
// celsius to farenheiet
//student grade calculation 
		 
		/* Function<String,String>f=n->n.toUpperCase();
		 System.out.println(f.apply("siddu"));
			System.out.println(f.apply("meera"));*/
		 
		// celsius to farenheiet
		 */Function<Integer,Double>f=c->(c*9/5)+32.0;
		 System.out.println(f.apply(30));
			System.out.println(f.apply(20));

		 
	 
	 }
	 }