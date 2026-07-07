package com.codegnan.oop;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(10/2);
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("Hai");
		}finally {
			System.out.println("Welcome");
		}

	}
	

}
