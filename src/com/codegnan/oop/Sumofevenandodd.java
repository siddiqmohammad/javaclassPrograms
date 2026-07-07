package com.codegnan.oop;

import java.util.Scanner;

public class Sumofevenandodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		for (int i=0; i<size;i++) {
			a[i]=sc.nextInt();
		}
		int Evensum=0;
		int OddSum=0;
		for (int i=0;i<size;i++) {
			if(a[i]%2==0) {
				Evensum+=a[i];
			
			}else {
				OddSum+=a[i];
			}	
		}
		
		System.out.println("sum of even nums:"+ Evensum);
		System.out.println("sum of odd nums:"+ OddSum);

		sc.close();

		
	}

}
