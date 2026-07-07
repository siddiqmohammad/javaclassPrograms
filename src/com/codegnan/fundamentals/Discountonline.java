package com.codegnan.fundamentals;

import java.util.Scanner;

public class Discountonline {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double TotalCartValue=sc.nextDouble();
		boolean Isfestivalseason=sc.nextBoolean();
		boolean isMember=sc.nextBoolean();
		double discount=0;
		double finalamount;
		double festivediscount;
		double membershipdiscount;
		if(TotalCartValue>=10000) {
			discount=TotalCartValue*0.20;
		}else{
			if (TotalCartValue>=5000) {
			discount=TotalCartValue*0.10;
			}
			else {
				discount=0;
			}
		}
		if(Isfestivalseason) {
			festivediscount=TotalCartValue*0.05;
		}else {
			festivediscount=0;
		}
		if (isMember) {
			membershipdiscount=200;
			
		}else {
			membershipdiscount=0;
		}
		System.out.println(TotalCartValue);
		System.out.println(discount);
		System.out.println(festivediscount);
		System.out.println(membershipdiscount);
		finalamount=(TotalCartValue-discount-festivediscount-membershipdiscount);
		System.out.println(finalamount);


		
			
			
			
			
			
			
		
		
		
			
		

	}

}
