package com.codegnan.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String names[]= {"rhinosaur",null,"dog",null,"cat",null,"tiger",null,"lion",null,"hyna",null,"liger",null};
		for(String name:names) {
			Optional<String>optional=Optional.ofNullable(name);
			Optional.ifPresentOrElse(v->)
		}
		
	}

}
