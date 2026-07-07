package com.codegnan.oop;

import java.util.Scanner;

public class Armstrongnumbeersss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int original =num;
		int reversednum=0;
		int lastdigit;
		int count=0;
		int armstrong=0;
		while(num!=0) {
			lastdigit=num%10;
			count++;
			num/=10;
			
		}
		System.out.println("number of digits:"+count);
		num=original;
		while(num!=0) {
			lastdigit=num%10;
			reversednum=(reversednum*10)+lastdigit;
		    armstrong+=Math.pow(lastdigit,count);
			num=num/10;

		}
		System.out.println("reversed number" +reversednum);
		if (armstrong==original) {
			System.out.println("armstrong");
		}else {
			System.out.println("not an armstrong");
		}
		if (reversednum==original) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		sc.close();
	} 

}
