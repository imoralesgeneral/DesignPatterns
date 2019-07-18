package com.patterns.builder;

public abstract class CarBuilder {

	protected Car car;
	
	public void newCar() {
		car = new Car();
	}
	
	public Car getCar() {
		return car;
	}
	
	public abstract void setBrand();
	public abstract void buildPotency();
	public abstract void buildDisplacement();
	
}
