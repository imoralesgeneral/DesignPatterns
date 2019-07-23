package com.patterns.state;

public class Suspended implements WindowState {

	@Override
	public void serve(Person person) {
		if(person.getAge() > 65) {
			System.out.println("Serving to: "+person.getName());
		} else {
			System.out.println("Wait 5 minutes, please...");
		}
	}

}
