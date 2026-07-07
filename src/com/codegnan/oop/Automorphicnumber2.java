package com.codegnan.oop;

import java.util.Scanner;

public class Automorphicnumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	int originalnum=num;
	int square=num*num;
	int digit=0;
	while(num>0) {
		digit++;
		num/=10;
	}
	int product=1;
	for (int i=1;i<=digit;i++) {
		product*=10;
	}
	if(square%product==originalnum) {
		System.out.println("automorphic number");
	}else {
		System.out.println("not automorphic number");
	}
	sc.close();
}
}
