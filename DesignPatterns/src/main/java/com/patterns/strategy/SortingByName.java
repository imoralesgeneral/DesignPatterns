package com.patterns.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByName implements SortingEmployees {

	@Override
	public void sorting(Employee[] employees) {
		Comparator<Employee> byName = (a,b) -> a.getName().compareTo(b.getName());
		Employee[] sortedEmployees = employees;
		Arrays.sort(sortedEmployees, byName);
		for(Employee employee : sortedEmployees) {
			System.out.println(employee);
		}		
	}

}
