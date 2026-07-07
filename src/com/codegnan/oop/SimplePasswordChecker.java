package com.codegnan.oop;

public class SimplePasswordChecker implements Passwordchecker {

	@Override
	public String checkLength(String password) {
			return ("length:" +password.length());
		
	}

	@Override
	public String checkComplexity(String password) {
		if(password.length()<8) {
			return "Weak";
		}else {
			if(password.length()==8) {
				return "Medium";
			}else {
				return "Strong";
			}
		}
	}



}
