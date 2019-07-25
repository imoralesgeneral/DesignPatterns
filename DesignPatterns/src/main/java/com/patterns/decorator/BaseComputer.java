package com.patterns.decorator;

public class BaseComputer extends Computer {

	private float price = 1.0f;

	public BaseComputer() {
		super();
	}

	@Override
	public String getDescription() {
		return "Base PC";
	}

	@Override
	public float getPrice() {
		return price;
	}

}
