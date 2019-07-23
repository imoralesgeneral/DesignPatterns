package com.pattern.nullObject;

public class TestRun {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal dogNull = new NullAnimal();
		
		dog.makeSound();
		dogNull.makeSound();
		
		Animal[] arrayAnimals = {dog, dogNull};
		
		for(Animal animal : arrayAnimals) {
			if(animal.isNull()) {
				System.out.println("I am null: "+animal.getClass());
			} else {
				System.out.println(animal.getName());
			}
		}
		
		try {
			System.out.println(dogNull.getName().substring(1));
		} catch (NullPointerException np) {
			System.out.println("Null Exception");
		}
	}

}
