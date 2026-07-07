package com.codegnan.oop;

public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		Human human = new Human("Siddu");
		Robot1 robot = new Robot1("RDD2");
		System.out.println("human Daily Routine");
		human.showStatus();
		human.work();
		human.work();
		human.takeBreak();
		human.eat();
		human.digest();
		human.work();
		human.sleep();
		human.wakeUp();
		human.showStatus();
		System.out.println("Rbot Operations");
		robot.work();
		robot.work();		
		robot.work();		
		robot.work();		
		robot.work();		
		robot.takeBreak();
		robot.charge();
		robot.work();		


		

	}

}
