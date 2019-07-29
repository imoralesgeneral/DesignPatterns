package com.patterns.bridge;

public class Fiat extends Car {

	int velocityToBrake;
	
	public Fiat(Drive d, int velocityToBrake) {
		super(d);
		this.velocityToBrake = velocityToBrake;
	}

	@Override
	public void driving() {
		speedUp();
		brake(velocityToBrake);
	}

}
