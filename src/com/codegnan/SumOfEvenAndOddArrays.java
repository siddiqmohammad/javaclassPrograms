package com.codegnan;
import java.util.Scanner;


public class SumOfEvenAndOddArrays {
		    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	                System.out.println("enter the array size");
	        int size=sc.nextInt();
	        int[] numbers=new int[size];
	        int originalsum=0;
	        System.out.println("Enter the elements:");
	        for(int i=0;i<numbers.length;i++){
	          System.out.println("enter the element at index" +i);
	            numbers[i]=sc.nextInt();
	        }
	        int evensum=0;
	        int oddsum=0;
	           System.out.println("Even numbers are");

	        for(int i=0;i<numbers.length;i++){
	            if(numbers[i]%2==0){
	           System.out.print(numbers[i] + " ");

	                evensum+=numbers[i];
	            }

	        }
	                   System.out.println();
	         System.out.println("Sum of Even numbers is" +evensum);
	      System.out.println("odd numbers are");
	          for(int i=0;i<numbers.length;i++){
	            if(numbers[i]%2!=0){
	           System.out.print(numbers[i] + " ");
	                oddsum+=numbers[i];
	            }
	        }
	                            System.out.println();

	         System.out.println("Sum of Odd numbers is" +oddsum);
	         
	}
	}
	
	
	
	
	
	


