package com.patterns.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if(type.equals("barbacue")) {
			return new ChicagoStyleBarbacuePizza();
		}
		return null;
	}

}
