package com.codegnan.oop;

public class LibraryFineCalculator {

	public static void main(String[] args) {
		public static int CalculateTotalFine(int daysOverdue) {
			if (daysOverdue<0) {
				return 0;
			}
		else {
			int fine=daysOverdue*5;
			if (fine>1000) {
				fine=1000;
			}
			return fine;
		}
		
	}
	public int CalculateBookFine(int days,String bookType) {
		if(days<0) {
			return 0;
		}else {
			int rate=0;
			if (bookType.equals("regular")) {
				rate=2;
			}else {
				if(bookType.equals("premium")) {
					rate=3;
				}
			}
			int fine =days*rate;
			if(fine>1000) {
				fine=1000;
				return fine;

			}
		}
		return days;
			
	}
	
}
