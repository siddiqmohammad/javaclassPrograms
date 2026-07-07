package com.codegnan.execptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ATM atm= new ATM();
		boolean authenticated=false;
		while(!authenticated) {
			System.out.print("Enter your pin");//1234
			int enteredPin=sc.nextInt();
			try {
				authenticated=atm.verifyPin(enteredPin);
			} catch (InvalidPinException e) {
				e.printStackTrace();
			}
		}
		while(true) {
			System.out.println("1.Deposit");
			System.out.println("2.withdraw");
			System.out.println("3.checkbalance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			try {
				switch(choice) {
				case 1:
					System.out.println("enter amount to deposit");
					double depositAmount=sc.nextDouble();
					atm.deposit(depositAmount);
					break;
				case 2:
					System.out.println("enter amount to deposit");
					double WithAmount=sc.nextDouble();
					atm.withdraw(WithAmount);
					break;
				case 3:
					atm.checkBalance();
				case 4:
					System.out.println("thank you for using the ATM Machine");
					return;
					default:
						System.out.println("Invalid choice please enter an option 1-4");
					
				}
				
			}catch(InvalidAmountException | InsufficientFundsException e) {
				e.printStackTrace();
			}finally {
				System.out.println("inkosari ATM ki raaku");
			}
			  
			sc.close();
			

		}
		
		
	}

}
