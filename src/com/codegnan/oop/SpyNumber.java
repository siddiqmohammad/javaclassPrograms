package com.codegnan.oop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		//spyNumber:
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int originalnum=num;
		int product=1;
		while(num>0) {
			int digit=num%10;
			sum+=digit;
			product*=digit;
			num/=10;
		}
		if(sum==product) {
			System.out.println(originalnum+" is a spy number");
			
		}else {
			System.out.println(originalnum+" is not a spy number");
		}
		sc.close();

	}

}
