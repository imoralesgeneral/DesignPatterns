package com.patterns.bridge;

public class ClassicDrive extends Drive {

	@Override
	public void speedUp() {
		System.out.println("The car is speeding up...");
		int vel = 1;
		for(int i=0; i<10; i++) {
			System.out.println("The car velocity is "+vel*10);
			vel++;
		}
	}

	@Override
	public void brake(int velocity) {
		System.out.println("The car is breaking...");
		int vel = velocity;
		for(int i=0; i<velocity; i++) {
			if(vel < 0) {
				break;
			}
			System.out.println("The car velocity is "+vel);
			vel -= 10;
		}
		System.out.println("The car is stopped");
	}

}
