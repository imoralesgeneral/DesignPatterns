package com.patterns.template;

public class Police extends Person {

	public Police(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void sayOccupation() {
		System.out.println("I am police officer");
	}

	@Override
	public void tellJoke() {
		System.out.println("How do cops greet people?");
		System.out.println("Policed to meet you!");
	}

}
