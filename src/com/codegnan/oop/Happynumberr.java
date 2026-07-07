package com.codegnan.oop;

import java.util.Scanner;

public class Happynumberr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int digit;
		int originalNum=num;


		while(num!=1 && num!=4) {
			int suam=0;

			while(num>0) {
				digit=num%10;
				sum+=digit*digit;
				num=num/10;
			}
			num=sum;

		}

		if (num==1) {
			System.out.println( "Happy Number");
		}else {
			System.out.println("not a Happy Number");
		}
		sc.close();	

	}

}
