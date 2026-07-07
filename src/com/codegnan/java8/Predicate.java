package com.codegnan.java8;
interface interf2{
	boolean greater10(int a);
}

class test implements interf2{

	@Override
	public boolean greater10(int a) {
			if(a>10) {
				return true;
			}
				return false;
	}
	
}

public class Predicate {
	public static void main(String[] args) {
		interf2 i=a->{
			if(a>10) {
				return true;
			}return false;
		};
		
		
	}

}
