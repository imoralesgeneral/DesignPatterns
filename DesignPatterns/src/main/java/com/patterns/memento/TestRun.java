package com.patterns.memento;

import java.io.ObjectOutputStream.PutField;

public class TestRun {

	public static void main(String[] args) {
		
		Caretaker caretaker = new Caretaker();
		Person p = new Person("Max");
		p.setName("John");
		caretaker.addMemento(p.saveToMemento());
		p.setName("Lewis");
		caretaker.addMemento(p.saveToMemento());
		Memento m1 = caretaker.getMemento(0);
		Memento m2 = caretaker.getMemento(1);
		System.out.println(m1.getSavedState());
		System.out.println(m2.getSavedState());
		
	}

}
