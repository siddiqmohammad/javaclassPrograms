package com.codegnan.oop;

public class BankAccount {
	String accountHolderName;
	long accountNumber;
	double balance;
	public void createAccount(String name,String accNumber,double intialbalance){
		accountHolderName=name;
		accountNumber=accNumber;
		balance=intialbalance;
		
		
	}

	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+"deposited succsessfully");
	}public void withdraw(double amount) {
		if (amount<=balance) {
			balance-=amount;
			System.out.println(balance+ "withdrawn successfully..");
		}else {
			System.out.println("insufficient funds");
		}
		public void displayinfo() {
			System.out.println("Account holder name:"+accountHolderName);
			System.out.println("Account number:"+accountNumber);
			System.out.println("Account balance:"+balance);
			
		}
	}
	
}
