package com.codegnan.oop;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int square=num*num;
		int originalnum=num;
		int sum=0;
		while(square>0) {
			int digit =square%10;
			sum+=digit;
			square=square/10;
		}
		if (num==sum) {
			System.out.println(originalnum + " is neon number");
		}else {
			System.out.println(originalnum + " is not a  neon number");

		}
		

	}

}
