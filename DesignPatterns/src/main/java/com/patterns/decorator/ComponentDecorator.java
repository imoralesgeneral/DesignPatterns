package com.patterns.decorator;

public abstract class ComponentDecorator extends Computer {
	
	private Computer computer;
	
	public ComponentDecorator(Computer computer) {
		setComputer(computer);
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
}
