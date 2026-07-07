package com.codegnan.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveDuplicatesUsingArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		ArrayList <Integer>list=new ArrayList<>();
		System.out.println("enter the elements");
		while(sc.hasNextInt()) {
			int n=sc.nextInt();
			list.add(n);

		}
		for(int m:list){
		System.out.print(m+" ");
		}
		
		System.out.println();
		ArrayList<Integer>UniqueList=new ArrayList<>();
		for(int m:list) {
		if(!UniqueList.contains(m)) {
			UniqueList.add(m);
		}
		
		}
		
		
		
		for(int newUnique:UniqueList) {
			System.out.print(newUnique+" ");
		}
		
		System.out.println();
		Collections.sort(UniqueList);


		for(int newUnique:UniqueList) {
			System.out.println(newUnique);
		}
		
		
		
		

	}

}
