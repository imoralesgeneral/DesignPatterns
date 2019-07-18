package com.patterns.builder;

public class AudiCarBuilder extends CarBuilder {

	@Override
	public void setBrand() {
		car.setBrand("Audi");
	}

	@Override
	public void buildPotency() {
		car.setPotency(300);
	}

	@Override
	public void buildDisplacement() {
		car.setDisplacement(2500);
	}

}
