package com.codegnan.oop;

import java.util.Scanner;

public class Practicesessionmonday {
	public static void main(String[] args) {
		//reversing a number
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int lastdigit;
		int reversednum=0;
		int original=num;
		while(num>0){
			lastdigit=num%10;
			reversednum=reversednum*10+lastdigit;
			num=num/10;
		}
		System.out.println(reversednum);
		if(reversednum==original) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome!!!!!!!!");
		}
		
		
		sc.close();
		
		
	}
	

}
