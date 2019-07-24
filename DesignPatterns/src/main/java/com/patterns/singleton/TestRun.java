package com.patterns.singleton;

public class TestRun {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getContador());
		singleton.setContador(3);
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton.getContador());
		System.out.println(singleton2.getContador());
		Singleton singleton3 = Singleton.getInstance();
		singleton3.setContador(0);
		System.out.println(singleton.getContador());
		System.out.println(singleton2.getContador());
		System.out.println(singleton3.getContador());
	}

}
