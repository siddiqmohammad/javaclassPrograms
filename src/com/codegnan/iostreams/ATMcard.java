package com.codegnan.iostreams;

import java.io.Serializable;

public class ATMcard implements Serializable{
	private long cardnumber;
	private int pin;
	private String expirydate;
	private int cvv;
	private String cardholdername;
	public ATMcard(long cardnumber, int pin, String expirydate, int cvv, String cardholdername) {
		super();
		this.cardnumber = cardnumber;
		this.pin = pin;
		this.expirydate = expirydate;
		this.cvv = cvv;
		this.cardholdername = cardholdername;
	}
	
	
	

}
