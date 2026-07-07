package com.codegnan.oop;

import java.util.Scanner;

public class BookFinetest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
				int days1=sc.nextInt();//values for method1
				//values for method 2
				int  days2=sc.nextInt();
				String type1=sc.nextLine();	
				//values for method 3
				int days3=sc.nextInt();
				int fixedcost=sc.nextInt();
				int id1=sc.nextInt();
				int id2=sc.nextInt();
				String type2=sc.next();	
				Book book1=new Book(id1);
				Book book2=new Book(id2,type2);
				System.out.println(book1.calculatFile(days1));
				System.out.println(book1.calculateFine(days2,type1));
				System.out.println(book1.calculatorFine(days3,fixedcost));
				System.out.println(book1.getId());
				System.out.println(book2.getId());



				sc.close();
				
	}

}
