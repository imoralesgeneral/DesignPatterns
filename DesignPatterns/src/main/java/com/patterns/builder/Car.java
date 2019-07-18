package com.patterns.builder;

public class Car {

	private String brand = "";
	private int potency = 0;
	private int displacement = 0;
	
	public Car() {
		super();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPotency() {
		return potency;
	}

	public void setPotency(int potency) {
		this.potency = potency;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", potency=" + potency + ", displacement=" + displacement + "]";
	}
	
}
