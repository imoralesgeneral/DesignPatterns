package com.patterns.state;

public class Window {

	private String teller;
	private WindowState state;
	
	public Window() {
		state = new Opened();
	}
	
	public String getTeller() {
		return teller;
	}

	public void setTeller(String teller) {
		this.teller = teller;
	}

	public WindowState getState() {
		return state;
	}

	public void setState(WindowState state) {
		this.state = state;
	}

	public void suspend() {
		state = new Suspended();
	}
	
	public void close() {
		state = new Closed();
	}
	
	public void open() {
		state = new Opened();
	}
	
	public void serve(Person person) {
		state.serve(person);
	}

	@Override
	public String toString() {
		return "Window [teller=" + teller + "]";
	}
	
}
