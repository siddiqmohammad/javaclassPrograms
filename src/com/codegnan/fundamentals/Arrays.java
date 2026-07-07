package com.codegnan.fundamentals;
import java.util.Scanner;


public class Arrays {
		public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	                System.out.println("enter the array size");
	        int size=sc.nextInt();
	        int[] numbers=new int[size];
	      System.out.println("enter the elements");
	        for(int i=0;i<numbers.length;i++){
	            System.out.println("enter the element at index: " +i );
	            numbers[i]=sc.nextInt();
	        }
	       int sum=0;
	        for(int i=0;i<numbers.length;i++){
	            sum+=numbers[i];
	        }
	        System.out.println("The sum of the elements in array is " +sum);
	                System.out.println("The even elements are:");
	        for(int i=0;i<numbers.length;i++){
	            if(numbers[i]%2==0){
	                System.out.println(numbers[i] + " ");
	            }
	        }
	          System.out.println();
	    System.out.println("The odd elements are:");
	        for(int i=0;i<numbers.length;i++){
	            if(numbers[i]%2!=0){
	                System.out.println(numbers[i] + " ");
	            }

	            }
	            
	    }
	}

