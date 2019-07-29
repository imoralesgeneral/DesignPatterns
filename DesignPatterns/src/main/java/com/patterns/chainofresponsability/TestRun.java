package com.patterns.chainofresponsability;

public class TestRun {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.applyForLoan(56000);
	}

}
