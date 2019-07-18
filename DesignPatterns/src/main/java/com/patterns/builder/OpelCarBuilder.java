package com.patterns.builder;

public class OpelCarBuilder extends CarBuilder {

	@Override
	public void setBrand() {
		car.setBrand("Opel");
	}

	@Override
	public void buildPotency() {
		car.setPotency(150);
	}

	@Override
	public void buildDisplacement() {
		car.setDisplacement(1700);
	}

}
