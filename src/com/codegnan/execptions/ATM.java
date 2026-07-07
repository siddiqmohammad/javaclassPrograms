package com.codegnan.execptions;

public class ATM {
	private double balance;
	private final int pin=1234;
	private int pinAttempts=0;
	public boolean verifyPin(int enteredPin) throws InvalidPinException {
		if(enteredPin==pin) {
			System.out.println("access granted");
			return true;
		}else {
			pinAttempts++;
			if(pinAttempts>=3) {
				throw new InvalidPinException("Too Many Incorrect Attempts. Access Blocked.");
			}else {
				System.out.println("Invalid Pin . Attempts left :" + (3-pinAttempts));
				return false;
			}
		}
	}
	public void deposit(double amount) throws InvalidAmountException {
		if(amount<=0 || amount%100 != 0) {
			throw new InvalidAmountException("Amount must be positive and multiples of 100");
		}
		balance += amount;
		System.out.println("Deposited Successfully. New Balance is : " + balance);
	}
	
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		if(amount<=0 || amount%100 != 0) {
			throw new InvalidAmountException("Amount must be positive and multiples of 100");
		}
		if(amount>balance) {
			throw new InsufficientFundsException("You can't withdraw more than your account balance.");
		}
		balance -= amount;
		System.out.println("Withdraw successful. New balance is : " + balance);
	}
	
	public void checkBalance() {
		System.out.println("Current Balance : " + balance);
	}
	
	
}