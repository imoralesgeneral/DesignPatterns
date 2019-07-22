package com.patterns.adapter;

public class TestRun {

	public static void main(String[] args) {
		
		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		
		System.out.println("Turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();		
		System.out.println("Duck says...");
		testDuck(mallardDuck);		
		System.out.println("TurkeyAdapter says...");
		testDuck(turkeyAdapter);		
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
