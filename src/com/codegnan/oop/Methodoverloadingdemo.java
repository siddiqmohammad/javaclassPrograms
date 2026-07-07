package com.codegnan.oop;

public class Methodoverloadingdemo {
	void test() {
		System.out.println("no parameters");
	}
	void test(int a, int b) {
		System.out.println("A and B is" +a + " " + b);
	}
	void test (double a) {
		System.out.println("inside test (double) a" +a);
		
	}
	public static void main(String[] args) {
		Methodoverloadingdemo od= new Methodoverloadingdemo();
		od.test();
		od.test('a', 20);
		od.test(10.5f);
		//automatic promotion in overloading.
		
	}
}


