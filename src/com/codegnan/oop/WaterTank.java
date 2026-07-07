package com.codegnan.oop;

import java.util.Scanner;

public class WaterTank {
	private int currentLevel=0;
	private int maxLevel=0;
	public void setCurrentLevel(int currentLevel) {
		if(currentLevel>=0 && currentLevel<=500) {
			this.currentLevel=currentLevel;
			if (currentLevel>maxLevel) {
				maxLevel=currentLevel;
				
			}
		}
	}
	public int getCurrentLevel() {
		return currentLevel;
	}
	public int getmaxLevel() {
		return currentLevel;
	}
	public int getMaxLevel() {
		return maxLevel;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		WaterTank waterTank=new WaterTank();
		int level=sc.nextInt();
		while(true) {
			if(level==-999) {
				break;
			}
			waterTank.setCurrentLevel(level);
		}
		System.out.println(waterTank.getCurrentLevel());
		System.out.println(waterTank.getmaxLevel());
		sc.close();
		
	}

}
