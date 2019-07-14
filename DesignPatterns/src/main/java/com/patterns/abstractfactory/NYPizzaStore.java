package com.patterns.abstractfactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(type);
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza(ingredientFactory);
		} else if(type.equals("barbacue")) {
			return new NYStyleBarbacuePizza(ingredientFactory);
		}
		return null;
	}

}
