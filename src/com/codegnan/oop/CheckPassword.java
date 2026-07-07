package com.codegnan.oop;

import java.util.Scanner;

public class CheckPassword {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Passwordchecker c=new SimplePasswordChecker();
	System.out.println("Enter password");
	String password=sc.nextLine();
	System.out.println(c.checkLength(password));
	System.out.println(c.checkComplexity(password));
	sc.close();
}

}
