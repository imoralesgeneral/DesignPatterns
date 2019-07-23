package com.patterns.nullObject;

public class Dog implements Animal {
	
	String name = "I am a dog!";

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public void makeSound() {
		System.out.println("woof!");
	}

	@Override
	public String getName() {
		return name;
	}

}
