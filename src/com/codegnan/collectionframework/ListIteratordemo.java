package com.codegnan.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratordemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("javascript");

		ListIterator<String>itr=list.listIterator();
		System.out.println("Original List" +list);
		System.out.println("==========Forward Traversal-=============");
		while(itr.hasNext()) {
			System.out.println("---------------------------------------");
			System.out.println("Next Index :" +itr.nextIndex());
			String value=itr.next();
			System.out.println("Element:" +value);
			if(value.equals("python")) {
				itr.set("python3");
				System.out.println("Python replaced with python3");
			}
			
			if(value.equals("c")) {
				itr.add("SQL");
				System.out.println("sql added");

			}
			
			
			if(value.equals("javascript")) {
				itr.remove();
				System.out.println("javascript removed");
			}
			
		}
		System.out.println("List After Forward Traversal");
		System.out.println(list);
		System.out.println("==================Backward traversal===============");
		
		while(itr.hasPrevious()) {
			System.out.println("------------------------");
			
			System.out.println("previous Index:" +itr.previousIndex());
			System.out.println("element:" +itr.previous());
			System.out.println("Final List");
			System.out.println(list);
			
			
			
		}
		
		
	}

	

}
