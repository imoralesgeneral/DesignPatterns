package com.patterns.decorator;

public class FastSSD extends ComponentDecorator {
	
	private float price = 49.25f;
	
	public FastSSD(Computer computer) {
		super(computer);
	}

	@Override
	public String getDescription() {
		return getComputer().getDescription() + " + FastSSD";
	}

	@Override
	public float getPrice() {
		return getComputer().getPrice() + price;
	}

}
