package com.patterns.template;

public abstract class Person {
	
	protected String name;
	protected int age;
	
	public void presentation() {
		greeting();
		sayName();
		sayAge();
		sayOccupation();
		tellJoke();
		goodbye();
	}
	
	public void greeting() {
		System.out.println("Hello");
	}
	
	public void sayName() {
		System.out.println("My name is "+name);
	}
	
	public void sayAge() {
		System.out.println("I am "+age+" years old");
	}
	
	public void goodbye() {
		System.out.println("Thanks. Bye.");
	}
	
	public abstract void sayOccupation();
	public abstract void tellJoke();

}
