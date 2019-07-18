package com.patterns.builder;

public class Distributor {

	private CarBuilder carBuilder;
	
	public void setCarBuilder(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public Car getCar() {
		return carBuilder.getCar();
	}
	
	public void buildCar() {
		carBuilder.newCar();
		carBuilder.setBrand();
		carBuilder.buildPotency();
		carBuilder.buildDisplacement();
	}
}
