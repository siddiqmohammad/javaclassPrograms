package com.codegnan.oop;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTimeExample {
	public static void main(String[] args) {
		LocalDate date =LocalDate.now();
		System.out.println("current Date: " + date);
		LocalTime time = LocalTime.now();
		System.out.println("current time: "+ time);
		
		
		int dd=date.getDayOfMonth();
		int mm = date.getDayOfMonth();
		int yy= date.getDayOfYear();
		System.out.println("day:" + dd);
		System.out.println("day:" + mm);
		System.out.println("day:" + yy);
		
		
		int h = time.getHour();
		int m=time.getMinute();
		int s= time.getSecond();
		System.out.println("hour:" + h);
		System.out.println("minute:" + m);
		System.out.println("second" + s);
		System.out.println("after 6 months"+ date.plusMonths(6));
		System.out.println("before 8 months" + date.minusMonths(8));
		// creating new date
		LocalDateTime dt= LocalDateTime.of(2000,Month.MAY,23,11,11,15);
		System.out.println("new date and time:" +dt);
		
		ZoneId zone= ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println("zone date time:" + zt);
		
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(2004, 1, 30);
		Period p=Period.between(birthday, date);
		System.out.println(p);
		System.out.printf("age is %d years ,%d months, and %d days.%n",p.getYears(),p.getMonths(),p.getDays());
		
		Date obj= new Date();
		System.out.println(obj.toString());
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String date1 = format.format(obj);
		System.out.println(date1);
		
		format = new SimpleDateFormat("dd MMM yyyy EEEE");
		date1 = format.format(obj);
		System.out.println(date1);
		
		
		
		
		
		
		
	}

}
