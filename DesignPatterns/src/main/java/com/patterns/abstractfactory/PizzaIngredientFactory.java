package com.patterns.abstractfactory;

public interface PizzaIngredientFactory {

	public Sauce createSauce();
	public Ingredient createIngredient();
}
