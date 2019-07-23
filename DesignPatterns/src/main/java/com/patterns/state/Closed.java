package com.patterns.state;

public class Closed implements WindowState {

	@Override
	public void serve(Person person) {
		System.out.println("Window is closed!");
	}

}
