package com.patterns.memento;

public class Memento {

	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}
	
	public String getSavedState() {
		return state;
	}
	
}
