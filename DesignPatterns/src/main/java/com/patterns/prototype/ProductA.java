package com.patterns.prototype;

public class ProductA implements Product {

	private int attributeA;

	public ProductA(int attributeA) {
		super();
		this.attributeA = attributeA;
	}
	
	public Object clone() {
		return new ProductA(this.attributeA);
	}

	public int getAttributeA() {
		return attributeA;
	}

	public void setAttributeA(int attributeA) {
		this.attributeA = attributeA;
	}

	@Override
	public String toString() {
		return "ProductA [attributeA=" + attributeA + "]";
	}
	
}
