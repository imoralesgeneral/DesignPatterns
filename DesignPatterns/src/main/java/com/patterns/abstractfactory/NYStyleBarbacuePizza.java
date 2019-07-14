package com.patterns.abstractfactory;

public class NYStyleBarbacuePizza extends Pizza {

	public NYStyleBarbacuePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
		name = "NY Style Barbacue Pizza";
	}

	@Override
	void prepare() {
		System.out.println("Preparing "+name);
		sauce = ingredientFactory.createSauce();
		toppings.add(ingredientFactory.createIngredient());		
	}

	
	
}
