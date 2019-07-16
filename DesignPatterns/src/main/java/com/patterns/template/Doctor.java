package com.patterns.template;

public class Doctor extends Person {
	
	public Doctor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void sayOccupation() {
		System.out.println("I am doctor");
	}

	@Override
	public void tellJoke() {
		System.out.println("Doctor, doctor! I've swallowed a spoon");
		System.out.println("Sit down and don't stir");
	}

}
