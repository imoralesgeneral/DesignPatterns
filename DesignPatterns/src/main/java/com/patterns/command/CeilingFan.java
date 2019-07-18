package com.patterns.command;

public class CeilingFan {
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	public CeilingFan(String location) {
		super();
		this.location = location;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println("CEILING FAN is High");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println("CEILING FAN is Medium");
	}
	
	public void low() {
		speed = LOW;
		System.out.println("CEILING FAN is Low");
	}
	
	public void off() {
		speed = OFF;
		System.out.println("CEILING FAN is Off");
	}
	
	public int getSpeed() {
		return speed;
	}
	
}
