package com.patterns.abstractfactory;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
		name = "Chicago Style Deep Dish Cheese Pizza";
	}
	
	@Override
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	void prepare() {
		System.out.println("Preparing "+name);
		sauce = ingredientFactory.createSauce();
		toppings.add(ingredientFactory.createIngredient());
	}
	
}
