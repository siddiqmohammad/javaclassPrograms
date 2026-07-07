package com.codegnan.oop;

public class Motorcycle implements Vehicle1{
	private int currentSpeed;
	private boolean isEngineOn;
	

	public Motorcycle() {
		super();
		this.currentSpeed = 0;
		this.isEngineOn = false;
	}

	@Override
	public void start() {
		this.isEngineOn=true;
		System.out.println("bike engine started");		
	}

	@Override
	public void stop() {
		this.currentSpeed=0;
		this.isEngineOn=false;
		System.out.println("bike engine stopped");

		
	}

	@Override
	public void accelarate() {
		if(isEngineOn && currentSpeed<MAX_speed) {
			currentSpeed+=10;
			System.out.println("bike eaccelarating. current speed :"+ currentSpeed);	
		}		
	
		
	}

	@Override
	public void brake() {
		this.currentSpeed=0;
		this.isEngineOn=false;
		System.out.println("bike engine stopped");
	}
		

	@Override
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	

}
