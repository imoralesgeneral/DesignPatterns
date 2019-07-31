package com.patterns.memento;

import java.util.ArrayList;

public class Caretaker {

	private ArrayList<Memento> states = new ArrayList<Memento>();
	
	public void addMemento(Memento m) {
		states.add(m);
	}
	
	public Memento getMemento(int index) {
		return states.get(index);
	}
	
}
