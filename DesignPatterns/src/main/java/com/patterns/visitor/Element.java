package com.patterns.visitor;

public interface Element {

	public double accept(Visitor visitor);
	
}
