package com.patterns.visitor;

public interface Visitor {

	public double visit(NormalProduct normal);
	public double visit(ReducedProduct reduced);
	
}
