package com.patterns.memento;

public class Person {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Memento saveToMemento() {
		System.out.println("Originator: Saving Memento...");
		return new Memento(name);
	}
	
	public void restoreFromMemento(Memento m) {
		name = m.getSavedState();
	}
	
}
