package com.patterns.observer;

public class Traveller implements Observer {
	
	private String name;
	private Flight flight;
	
	public Traveller(String name, Flight flight) {
		super();
		this.name = name;
		this.flight = flight;
	}

	@Override
	public void update(Flight flight) {
		System.out.println(name+" - Message received: "+flight.toString());
		if(flight.getDestiny().equals(this.flight.getDestiny())) {
			if(flight.getLastInfo().contains("5 min")) {
				System.out.println(name+" - Running...");
			}
			if(flight.getLastInfo().contains("15 min")) {
				System.out.println(name+" - Walking...");
			} else {
				System.out.println(name+" - Sleeping...");
			}
		} else {
			System.out.println(name+" - That's not mine...");
		}
	}

}
