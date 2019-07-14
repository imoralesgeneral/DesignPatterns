package com.patterns.factory;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		super();
		name = "Chicago Style Deep Dish Cheese Pizza";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
