package com.patterns.observer;

public interface Subject {

	public void registerObserver(Observer observer);
	public void deleteObserver(Observer observer);
	public void notifyObservers();
	
}
