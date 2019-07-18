package com.patterns.command;

///RECEIVER
public class Light {

	public Light() {
		super();
	}
	
	public void on() {
		System.out.println("Light is ON");
	}
	
	public void off() {
		System.out.println("Light is OFF");
	}
	
}
