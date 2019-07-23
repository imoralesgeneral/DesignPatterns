package com.patterns.state;

public class Bank {

	private String name;
	private String address;
	private Window window;
	
	public Bank(String name, String address, Window window) {
		super();
		this.name = name;
		this.address = address;
		this.window = window;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Window getWindow() {
		return window;
	}
	
	public void setWindow(Window window) {
		this.window = window;
	}
	
	public void serve(Person person) {
		System.out.println(person.getName()+" is in the line");
		window.serve(person);
	}
	
	public void suspendWindow() {
		window.suspend();
	}
	
	public void closeWindow() {
		window.close();
	}
	
	public void openWindow() {
		window.open();
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", address=" + address + ", window=" + window + "]";
	}
	
}
