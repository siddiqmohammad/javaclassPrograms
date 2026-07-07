package com.codegnan.oop;

public class Robot1 implements Workable{
	private String model;
	private int batteryLevel;
	private boolean isWorking;
	public Robot1(String model, int batterLevel, boolean isWorking) {
		super();
		this.model = model;
		this.batteryLevel = 100;
		this.isWorking = false;
	}
	@Override
	public void work() {
		if(batteryLevel>10) {
			isWorking=true;
			batteryLevel-=15;
			System.out.println("robot:" + model + "is working. Battery" + batteryLevel + "%");
		}else {
			System.out.println("Robot :" + model + "needs Charging ");
		}
		
	}
	@Override
	public void takeBreak() {
		isWorking=false;
		System.out.println("robot " + model + " is standby mode");
		
	}
	public void charge() {
		batteryLevel=100;
		System.out.println("Robot :" + model + " is Fully Charged");
	}

}
