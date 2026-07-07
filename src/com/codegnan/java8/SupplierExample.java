package com.codegnan.java8;

//import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
	///	Supplier<LocalDate>message=()->LocalDate.now();
		////System.out.println(message.get());
		
		Supplier<LocalTime>message=()->LocalTime.now();
		System.out.println(message.get());
		
		Supplier<String>otp=()->{
			String code="";
			for(int i=0;i<6;i++) {
				code+=(int)(Math.random()*10);
			}
			return code;
		};
		System.out.println("generated otp: " +otp.get());
		
		
		
	}

}
