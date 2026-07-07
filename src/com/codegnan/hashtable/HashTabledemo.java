package com.codegnan.hashtable;

import java.util.Hashtable;
import java.util.Objects;

public class HashTabledemo {
	public static void main(String[] args) {
		Hashtable<Temp, String>h=new Hashtable<>();
		h.put(new Temp(5),"A");
		h.put(new Temp(2),"B");
		h.put(new Temp(6),"C");
		h.put(new Temp(15),"D");
		h.put(new Temp(23),"E");
		h.put(new Temp(16),"F");

		System.out.println(h);
		
		
	}

}
class Temp{
	int i;

	public Temp(int i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}


	@Override
	public String toString() {
		return "Temp [i=" + i + "]";
	}
	
}