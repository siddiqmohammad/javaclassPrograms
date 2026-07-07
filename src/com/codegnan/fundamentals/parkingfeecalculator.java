package com.codegnan.fundamentals;

import java.util.Scanner;

public class parkingfeecalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String vehicleType=sc.next().toLowerCase();
		int Arrtime=sc.nextInt();
		int depTime=sc.nextInt();
		int fare;
		if(vehicleType.equals("car")){
			fare=50;
		}else {
			if(vehicleType.equals("bike")) {
				fare=30;
			}else {
				fare=100;
			}
		}
		int duration;
		if(Arrtime>depTime){
			duration=(24-Arrtime)+depTime;
		}else {
			duration=depTime-Arrtime;
		}
		double Totalfee=duration*fare;
		double discount;
		if(duration>5) {
			discount=0.20*Totalfee;
		}else {
			discount=0;
		}
		double feeAfterdiscount=Totalfee-discount;
		double nightsurcharge;
		if(Arrtime>=18 || depTime<=8) {
			nightsurcharge=feeAfterdiscount*0.50;
		}else {
			nightsurcharge=0;
		}
		double finalfee=feeAfterdiscount+nightsurcharge;
		System.out.println("Total parking fee" + finalfee);
		System.out.println("explanation:");
		System.out.println("parking duration" + duration);
		System.out.println("base fee"+ Totalfee);
		System.out.println("fee afer discount"+feeAfterdiscount);
		System.out.println("Night surcharge= 50% of "+feeAfterdiscount +"=" +nightsurcharge);
		System.out.println("FINAL AMOUNT TO BE PAID" +finalfee);
		sc.close();
		

	}

}
