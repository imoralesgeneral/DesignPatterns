package com.patterns.abstractfactory;

public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
		name = "NY Style Sauce and Cheese Pizza";
	}

	@Override
	void prepare() {
		System.out.println("Preparing "+name);
		sauce = ingredientFactory.createSauce();
		toppings.add(ingredientFactory.createIngredient());
	}
	
}
