package com.patterns.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByAge implements SortingEmployees {

	@Override
	public void sorting(Employee[] employees) {
		Comparator<Employee> byAge = (a,b) -> a.getAge() - b.getAge();
		Employee[] sortedEmployees = employees;
		Arrays.sort(sortedEmployees, byAge);
		for(Employee employee : sortedEmployees) {
			System.out.println(employee);
		}
		
	}

}
