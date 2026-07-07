package com.codegnan.fundamentals;

import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int originalnum=num;
		int reversednum=0;
		while(num>0) {
			int lastdigit=num%10;
			reversednum=reversednum*10+lastdigit;
			num/=10;
		}
		System.out.println("the reversed num is " +reversednum);
		if (reversednum==originalnum) {
			System.out.println(" number" +originalnum+ " is palindrome" );
		}else {
			System.out.println("adi palindrome kaaduu....pora puvva ");
		}
		

	}

}
