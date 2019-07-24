package com.patterns.singleton;

public class Singleton {

	private volatile static Singleton uniqueInstance;
	
	private int contador;
	
	private Singleton() {
		contador = 1;
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
}
