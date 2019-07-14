package com.patterns.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if(type.equals("barbacue")) {
			return new NYStyleBarbacuePizza();
		}
		return null;
	}

}
