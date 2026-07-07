package com.codegnan.iostreams;

public class Test {

	public static void main(String[] args) {
		Popcorn p=new Popcorn() {
			public void taste() {
				System.out.println("salty");
			}
			
		};
		p.taste();
		Popcorn p2= new Popcorn() {
		public void taste() {
			System.out.println("Sweet");
		}
	};
	System.out.println(p.getClass().getName());
	
	

	}
}
