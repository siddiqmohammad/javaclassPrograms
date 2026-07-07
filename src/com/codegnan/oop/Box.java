package com.codegnan.oop;

public class Box {
	double width;
	double height;
	double depth;
	
	public void volume(){
		System.out.println("box height:" +height);
		System.out.println("box width:" +width);
		System.out.println("box hight:" +depth);
		double volume=height*width*depth;
		System.out.println("volume:"+volume);
			}
	
	public static void main(String[] args) {
		Box mybox1= new Box();
		mybox1.volume();
		Box mybox2 = new Box();
		mybox2.height=10.0;
		mybox2.width=12.0;
		mybox2.depth=2.0;
		mybox2.volume();

	}

}
