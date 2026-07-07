package com.codegnan.iostreams;

import java.io.ObjectOutputStream;

public class TransienrtDemo {

	public static void main(String[] args) {
		
		ATMcard originalcard=new ATMcard(1234567654,123,"12/31",645,"siddu");
		try(ObjectOutputStream)oos=new ObjectOutputStream(new FileOutputStream("atm.ser"))) {
			oos.writeObject(originaCard);
			System.out.println("serialized :" +originalcard);
			
		}catch(FileOutputStream)foos
		
		
	}
}
