package com.codegnan.iostreams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWriterExample {

	public static void main(String[] args) {
		List<Person>people=new ArrayList<>();
		people.add(new Person("siddu",22,"vsp"));
		people.add(new Person("mani",24,"vjy"));
		people.add(new Person("mahi",17,"bng"));
		try(PrintWriter out =new PrintWriter("people.csv")){
			out.print("name,age,city");
			out.println();
			for(Person person:people) {
				out.print(person.toCSV());
				out.println();
			}
			System.out.println("person object written succesfully ");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		

	}

}
