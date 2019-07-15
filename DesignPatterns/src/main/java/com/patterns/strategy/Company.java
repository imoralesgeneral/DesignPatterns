package com.patterns.strategy;

import java.util.Arrays;

public class Company {

	String name;
	int numberOfEmployees;
	Employee[] employees;
	
	public Company(String name, Employee[] employees) {
		super();
		this.name = name;
		this.employees = employees;
		this.numberOfEmployees = employees.length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return employees.length;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	public void sortingEmployees(SortingEmployees wayToSorting) {
		wayToSorting.sorting(employees);
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", numberOfEmployees=" + numberOfEmployees + ", employees="
				+ Arrays.toString(employees) + "]";
	}
	
}
