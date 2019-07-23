package com.pattern.nullObject;

public class NullAnimal implements Animal {
	
	private String name;

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void makeSound() {

	}

	@Override
	public String getName() {
		return name;
	}

}
