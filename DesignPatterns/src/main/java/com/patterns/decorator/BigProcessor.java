package com.patterns.decorator;

public class BigProcessor extends ComponentDecorator {

	private float price = 310.50f;

	public BigProcessor(Computer computer) {
		super(computer);
	}

	@Override
	public String getDescription() {
		return getComputer().getDescription() + " + BigProcessor";
	}

	@Override
	public float getPrice() {
		return getComputer().getPrice() + price;
	}

}
