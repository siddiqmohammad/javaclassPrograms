package com.codegnan.execptions;

public class MarriageCheckEligibility {
	
	public void MarriageCheckEligibility(int age) throws TooYoungException, TooOldException{
		if (age<18) {
			throw new TooYoungException("Marriage cannot be approved. age is above 18 years");
		}else {
			if(age>60) {
				throw new TooOldException("marriage cannot be approved. age is 60 years above");
			}
			else {
				System.out.println("marriage approved. details will be processed soon.");
			}
		}
	}

	public static void main(String[] args) {
		MarriageCheckEligibility checker= new MarriageCheckEligibility();
		try {
			checker.MarriageCheckEligibility(67);
		}catch(TooYoungException | TooOldException e) {
			e.printStackTrace();
		}
	}

}
