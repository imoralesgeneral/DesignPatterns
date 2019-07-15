package com.patterns.strategy;

public class TestRun {

	public static void main(String[] args) {
		Employee employeeA = new Employee("Ann", 28);
		Employee employeeB = new Employee("Charles", 25);
		Employee employeeC = new Employee("Rose", 23);
		Employee employeeD = new Employee("Bob", 24);
		Employee[] arrayEmployees = {employeeA, employeeB, employeeC, employeeD};
		SortingEmployees sortingByAge = new SortingByAge();
		SortingEmployees sortingByName = new SortingByName();
		Company company = new Company("Company", arrayEmployees);
		System.out.println("Sorting By Age: ");
		company.sortingEmployees(sortingByAge);
		System.out.println("Sorting By Name: ");
		company.sortingEmployees(sortingByName);
	}

}
