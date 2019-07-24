package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flight implements Subject {
	
	private String destiny;
	private List<Observer> travellers;
	private String lastInfo;

	public Flight(String destiny) {
		super();
		this.destiny = destiny;
		travellers = new ArrayList<Observer>();
		lastInfo = "";
	}

	public String getDestiny() {
		return destiny;
	}

	public String getLastInfo() {
		return lastInfo;
	}
	
	public void updateInfo(String msg) {
		lastInfo = msg;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		travellers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		travellers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer traveller : travellers) {
			traveller.update(this);
		}
	}

	@Override
	public String toString() {
		return "Flight [destiny=" + destiny + ", lastInfo=" + lastInfo + "]";
	}
	
}
