package com.codegnan.oop;

public class BankAcc {
double balance;
	
	public BankAcc(double balance) {
		super();
		this.balance=balance;
	}
	// deposit amount by cash
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("deposited cash:" + amount);
	}
	public void deposit(double amount,String chequenumber) {
		balance+=amount;
		System.out.println("deposited" +balance+ "Via cheque" +chequenumber);
	}
	public void deposit(double amount,String transactionId, String bankName) {
		balance+=amount;
		System.out.println("deposoted"+ amount+"via online transfer");
		System.out.println("transaction id:" +transactionId+"bank name:" +bankName);
	}
	public void showBalnce() {
		System.out.println("current balance is :" +balance);
	}


public static void main(String[] args) {
	BankAcc acc=new BankAcc(5000.0);
	acc.deposit(2000);
	acc.deposit(12000,"chq1234");
	acc.deposit(3000, "TXN234567", "ICICI");
	acc.showBalnce();
}
	
}
