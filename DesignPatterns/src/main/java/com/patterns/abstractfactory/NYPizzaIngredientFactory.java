package com.patterns.abstractfactory;
import com.patterns.abstractfactory.Ingredient;
import com.patterns.abstractfactory.MarinaraSauce;
import com.patterns.abstractfactory.PizzaIngredientFactory;
import com.patterns.abstractfactory.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	
	String type;

	public NYPizzaIngredientFactory(String type) {
		super();
		this.type = type;
	}

	@Override
	public Sauce createSauce() {
		if(type.equalsIgnoreCase("cheese")) {
			return new MarinaraSauce();
		} else if(type.equalsIgnoreCase("barbacue")) {
			return new Barbacue();
		}
		return null;
	}

	@Override
	public Ingredient createIngredient() {
		if(type.equalsIgnoreCase("cheese")) {
			return new ReggianoCheese();
		} else if(type.equalsIgnoreCase("barbacue")) {
			return new Beef();
		}
		return null;
	}

}
