package com.patterns.builder;

public class TestRun {

	public static void main(String[] args) {
		Distributor distributor = new Distributor();
		distributor.setCarBuilder(new AudiCarBuilder());
		distributor.buildCar();
		System.out.println("Coche Audi construido: "+distributor.getCar().toString());
		distributor.setCarBuilder(new OpelCarBuilder());
		distributor.buildCar();
		System.out.println("Coche Opel construido: "+distributor.getCar().toString());
	}

}
