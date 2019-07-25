package com.patterns.visitor;

public class NormalProduct implements Element {

	private double price;
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
