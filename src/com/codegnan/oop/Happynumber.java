package com.codegnan.oop;

import java.util.Scanner;

public class Happynumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int original=num;
		int sum=0;
		while(num!=0 && num!=4) {
			while(num>0) {
				int lastdigit=num%10;
				sum+=lastdigit;
				num=num/10;
				
			}
			
			
			
			
		}
	}
	}