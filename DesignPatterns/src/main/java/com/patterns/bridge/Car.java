package com.patterns.bridge;

public abstract class Car {

	private Drive drive;
	
	public Car(Drive d) {
		this.drive = d;
	}
	
	public abstract void driving();
	
	public void speedUp() {
		drive.speedUp();
	}
	
	public void brake(int velocity) {
		drive.brake(velocity);
	}
	
}
