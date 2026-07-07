package com.codegnan.collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		while(scanner.hasNextInt()) {
			numbers.add(scanner.nextInt());
		}
		for(Integer a : numbers) {
			System.out.print(a + " ");
		}
		System.out.println();
		ArrayList<Integer> uniqueList = new ArrayList<>();
		for(Integer i : numbers) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		for(Integer j : uniqueList) {
			System.out.print(j + " ");
		}
		scanner.close();
	}
}