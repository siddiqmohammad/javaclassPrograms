package com.codegnan.oop;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int originalnum=num;
		while(num>0) {
			int digit=num%10;
			int product=1;
			for(int i=1;i<=digit;i++) {
				product*=i;
			}
			sum+=product;
			num/=10;
		}
		if (originalnum==sum) {
			System.out.println("strong number");
		}else {
			System.out.println("not a strong number");

		}
		
		sc.close();
	}

}
