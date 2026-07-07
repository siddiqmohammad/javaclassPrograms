package com.codegnan.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample{

	public static void main(String[] args) {
		//BiPredicate<Integer,Integer>IsEvenSum=(a,b)->(a+b)%2==0;
		//System.out.println(IsEvenSum.test(15,20));
		//System.out.println(IsEvenSum.test(20,30));
		
		
		BiFunction<Double,Double,Double>totalprice=(price1,price2)->price1+price2;
		System.out.println(totalprice.apply(20.9,30.5));
		
	}

}
