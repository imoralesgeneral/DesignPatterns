package com.patterns.abstractfactory;

public class TestRun {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName());

		pizza = chicagoStore.orderPizza("barbacue");
		System.out.println("Math ordered a "+pizza.getName());
	}

}
