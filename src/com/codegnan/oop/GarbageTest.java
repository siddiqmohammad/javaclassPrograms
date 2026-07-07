package com.codegnan.oop;

public class GarbageTest {

	
	protected finalize(){
		System.out.println("garbage collector called finalize()");
		
	}
	public static void main(String[] args) {
			GarbageTest obj=new GarbageTest();
			obj=null;
			System.out.println("requesting garbage collection");
			System.gc();
			System.out.println("end of the main method");

	}

}
