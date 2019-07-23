package com.patterns.state;

public class TestRun {

	public static void main(String[] args) {
		Person person1 = new Person("John", 21);
		Person person2 = new Person("Liz", 67);
		Person person3 = new Person("Martin", 84);
		Person person4 = new Person("Jj", 44);		
		Bank bank = new Bank("BBVA", "Isabel Colbrand", new Window());
		bank.serve(person1);
		bank.suspendWindow();
		bank.serve(person2);
		bank.serve(person3);
		bank.serve(person4);
		bank.closeWindow();
		bank.serve(person4);
	}

}
