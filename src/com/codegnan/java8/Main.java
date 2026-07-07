package com.codegnan.java8;

interface Interf1{
	int square(int a);
}

class Test implements Interf1{

	@Override
	public int square(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Interf1 i=new Test();
		System.out.println("square is : " +i.square(5));
		

	}

}
