package com.patterns.visitor;

public class IVA implements Visitor {
	
	private final double normalTAX = 1.23;
	private final double reducedTAX = 1.08;

	@Override
	public double visit(NormalProduct normal) {
		return normal.getPrice() * normalTAX; 
	}

	@Override
	public double visit(ReducedProduct reduced) {
		return reduced.getPrice() * reducedTAX;
	}

}
