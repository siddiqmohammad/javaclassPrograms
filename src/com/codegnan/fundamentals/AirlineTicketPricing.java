package com.codegnan.fundamentals;
import java.util.Scanner;
public class AirlineTicketPricing {
				public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				double basePrice = 5000;
				System.out.println("Enter passenger type (child/adult/senior) : ");
				String passengerType = scanner.nextLine().toLowerCase();
				System.out.println("Enter booking time (early/normal/last-minute) :");
				String bookingTime = scanner.nextLine().toLowerCase();
				System.out.println("Are you a member?(true/false)");
				boolean isMember = scanner.nextBoolean();

				if (passengerType.equals("child")) {
					basePrice *= 0.5;
				} else {
					if (passengerType.equals("senior")) {
						basePrice *= 0.8;
					} else {
						if (passengerType.equals("adult")) {

						} else {
							System.out.println("Invalid Passenger Type");
							scanner.close();
							return;
						}
					}
				}
				if (bookingTime.equals("early")) {
					basePrice *= 0.9;
				} else {
					if (bookingTime.equals("normal")) {

					} else {
						if (bookingTime.equals("last-minute")) {
							basePrice *= 1.2;
						} else {
							System.out.println("Invalid Booking Time");
						}
					}
				}

				if (isMember) {
					basePrice *= 0.95;
				}

				System.out.println("Passenger Details");
				System.out.println("-----------------------------------------");
				System.out.println("Ticket Base Price : " + 5000);
				System.out.println("Passenger Type : " + passengerType);
				System.out.println("Booking Time : " + bookingTime);
				System.out.println("Is a Member? " + isMember);
				System.out.println("Ticket Final Price : " + basePrice);
				
			


				scanner.close();

	}

}
