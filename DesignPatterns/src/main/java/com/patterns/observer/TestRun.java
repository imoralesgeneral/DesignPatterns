package com.patterns.observer;

public class TestRun {

	public static void main(String[] args) {
		
		Flight flight1 = new Flight("NYC");
		Flight flight2 = new Flight("MAD");
		Flight flight3 = new Flight("BCN");
		
		Traveller traveller1 = new Traveller("John", flight1);
		Traveller traveller2 = new Traveller("Lisa", flight2);
		
		flight1.registerObserver(traveller1);
		flight1.registerObserver(traveller2);
		flight2.registerObserver(traveller1);
		flight2.registerObserver(traveller2);
		flight3.registerObserver(traveller1);
		flight3.registerObserver(traveller2);
		
		flight1.updateInfo("Plane is on land");
		flight2.updateInfo("Plane is on land");
		flight2.updateInfo("15 min to arrive");
		flight1.updateInfo("5 min to arrive");
		flight3.updateInfo("Plane is on land");
		flight3.deleteObserver(traveller1);
		flight3.updateInfo("5 min to arrive");
		
	}

}
