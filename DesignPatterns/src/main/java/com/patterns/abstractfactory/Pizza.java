package com.patterns.abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	PizzaIngredientFactory ingredientFactory;
	Sauce sauce;
	
	ArrayList<Ingredient> toppings = new ArrayList<Ingredient>();
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in a box");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
