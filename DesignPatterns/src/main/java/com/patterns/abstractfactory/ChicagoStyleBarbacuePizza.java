package com.patterns.abstractfactory;

public class ChicagoStyleBarbacuePizza extends Pizza {

	public ChicagoStyleBarbacuePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
		name = "Chicago Style Barbacue Pizza";
	}

	@Override
	void prepare() {
		System.out.println("Preparing "+name);
		sauce = ingredientFactory.createSauce();
		toppings.add(ingredientFactory.createIngredient());
	}

	
	
}
