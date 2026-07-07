package com.codegnan.multithreading;

public class ATMTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(11000);
		UserA a = new UserA(account);
		UserB b = new UserB(account);
		UserC c= new UserC(account);
		Thread t1= new Thread(a,"USER A");		
		Thread t2= new Thread(b,"USER B");		
		Thread t3= new Thread(c,"USER C");		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
