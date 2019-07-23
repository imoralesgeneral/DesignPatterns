package com.patterns.state;

public class Opened implements WindowState {

	@Override
	public void serve(Person person) {
		System.out.println("Serving to: "+person.getName());
	}

}
