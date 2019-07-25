package com.patterns.decorator;

public class DummyComputer extends Computer {
	
	private float costProcessorDummy = 56.00f;
	private float costHDDDummy = 28.00f;
	private float costGPUDummy = 73.99f;
	private float costRamDummy = 40.30f;

	@Override
	public String getDescription() {
		return "This is a dummy computer";
	}

	@Override
	public float getPrice() {
		float cost = costGPUDummy+costHDDDummy+costProcessorDummy+costRamDummy;
		return cost;
	}

}
