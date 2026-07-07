package com.codegnan.oop;

public class Car2 implements Vehicle1 {
	private int currentSpeed;
	private boolean isEngineOn;
	
	

	public Car2() {
		super();
		this.currentSpeed = 0;
		this.isEngineOn = false;
	}

	@Override
	public void start() {
		this.isEngineOn=true;
		System.out.println("car engine started");
	}

	@Override
	public void stop() {
		this.currentSpeed=0;
		this.isEngineOn=false;
		System.out.println("car engine stopped");

	}

	@Override
	public void accelarate() {
		if(isEngineOn && currentSpeed<MAX_speed) {
			currentSpeed+=10;
			System.out.println("car eaccelarating. current speed :"+ currentSpeed);	
		}
		
		
	}

	@Override
	public void brake() {
		if (currentSpeed>0) {
			currentSpeed-=15;
			if(currentSpeed<0) {
				System.out.println("car braking: current speed :" +currentSpeed);
			}
		}
		
	}

	@Override
	public int getCurrentSpeed() {
		// TODO Auto-generated method stub
		return currentSpeed;
	}

	
}
