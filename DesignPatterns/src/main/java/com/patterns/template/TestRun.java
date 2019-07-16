package com.patterns.template;

public class TestRun {

	public static void main(String[] args) {
		Person police1 = new Police("Jhon",25);
		Person police2 = new Police("Bob",47);
		Person doctor1 = new Doctor("Lisa", 29);
		Person doctor2 = new Doctor("Maggie", 32);
		police1.presentation();
		doctor1.presentation();
		police2.presentation();
		doctor2.presentation();
	}

}
