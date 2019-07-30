package com.patterns.flyweight;

public class Tree implements ILightTree {
	
	private String type;

	public Tree(String type) {
		super();
		this.type = type;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void draw(long x, long y, long z) {
		System.out.println("Tree ["+this.getType()+"] drawn on ("+x+", "+y+", "+z+")");
	}

}
