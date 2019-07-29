package com.patterns.bridge;

public class Mercedes extends Car {

	int velocityToBrake;
	
	public Mercedes(Drive d, int velocityToBrake) {
		super(d);
		this.velocityToBrake = velocityToBrake;
	}

	@Override
	public void driving() {
		speedUp();
		brake(velocityToBrake);
	}

}
