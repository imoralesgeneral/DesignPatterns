package com.patterns.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		ChicagoPizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory(type);
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza(ingredientFactory);
		} else if(type.equals("barbacue")) {
			return new ChicagoStyleBarbacuePizza(ingredientFactory);
		}
		return null;
	}

}
