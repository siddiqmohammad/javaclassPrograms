package com.codegnan.fundamentals;

public class Practice {

	public static void main(String[] args) {
	String[]a= {"banana","apple","pomegranate"};
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("using enhanced for loop");
	for(String fru:a) {
		System.out.println(fru);
	}

	}

}
