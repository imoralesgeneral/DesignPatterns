package com.patterns.abstractfactory;
import com.patterns.abstractfactory.Ingredient;
import com.patterns.abstractfactory.PizzaIngredientFactory;
import com.patterns.abstractfactory.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	String type;
	
	public ChicagoPizzaIngredientFactory(String type) {
		super();
		this.type = type;
	}
	
	@Override
	public Sauce createSauce() {
		if(type.equalsIgnoreCase("cheese")) {
			return new PlumTomatoSauce();
		} else if(type.equalsIgnoreCase("barbacue")) {
			return new HoneyBarbacueSauce();
		}
		return null;
	}

	@Override
	public Ingredient createIngredient() {
		if(type.equalsIgnoreCase("cheese")) {
			return new MozzarellaCheese();
		} else if(type.equalsIgnoreCase("barbacue")) {
			return new Beef();
		}
		return null;
	}

}
