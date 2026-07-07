package com.codegnan.oop;

public class FitnessCalculator {
int id;
String type;
	public FitnessCalculator(int id){
		super();
		this.id=idd
	
}
	public FitnessCalculator(int id, String type) {
	super();
	this.id = id;
	this.type = type;
}
public int calculatecalories(int hours) {
	int calories=hours*100;
	return Math.min(calories, 1000);
	
}
public int calculatecalories(int hours ,String type) {
	int calories=0;
	if(type.equalsIgnoreCase("cardio")) {
		calories=hours*120;
	}else {
		if(type.equalsIgnoreCase("strength")) {
			calories=hours*80;
		}
	}
	return calories;
}
	public int calculatecalories(int hours, int fixedcalories) {
		int calories =hours*100+fixedcalories;
		return calories;
	}
}