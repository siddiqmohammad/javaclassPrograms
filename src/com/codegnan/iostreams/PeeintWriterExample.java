package com.codegnan.iostreams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PeeintWriterExample {
	
	public static void main(String[] args) {
		PrintWriter out;
		try {
			out = new PrintWriter("abc.txt");
			out.print("HI");
			out.println(2);
			out.write("hello siddu");
			out.print(100);
			out.write(20);
			out.println("codegnan");
			out.flush();
			System.out.println("data written to a file succesfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}


}
