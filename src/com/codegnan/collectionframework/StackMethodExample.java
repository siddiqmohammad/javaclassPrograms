package com.codegnan.collectionframework;

import java.util.Stack;

public class StackMethodExample {
	
	public static void main(String[] args) {
		Stack<String> names = new Stack();
		names.push("Sunny");
		names.push("Bunny");
		names.push("Vinny");
		names.push("Chinny");
		names.push("Junny");
		System.out.println(names);
		System.out.println(names.pop());
		System.out.println(names);
		System.out.println(names.peek());
		System.out.println(names);
		System.out.println(names.search("Sunny"));
	}

}
