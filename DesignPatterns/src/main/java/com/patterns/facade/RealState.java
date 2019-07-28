package com.patterns.facade;

public class RealState {

	private ShowPropertySubSystem showProperty;
	private PropertySaleSubSystem propertySale;
	private AccountsToPaySubSystem accountsToPay;
	private ManagingRentingSubSystem managingRenting;
	
	public RealState() {
		showProperty = new ShowPropertySubSystem();
		propertySale = new PropertySaleSubSystem();
		accountsToPay = new AccountsToPaySubSystem();
		managingRenting = new ManagingRentingSubSystem();
	}
	
	public void attendingClient(Client c) {
		System.out.println("Attending a client");
	}
	
	public void attendingOwner(Owner o) {
		System.out.println("Attending an owner");
	}
	
	public void attendingInterested(Interested i) {
		System.out.println("Attending an interested");
	}
	
	public void attending(Person p) {
		if(p instanceof Client) {
			attendingClient((Client)p);
		} else if(p instanceof Owner) {
			attendingOwner((Owner)p);
		} else {
			attendingInterested((Interested)p);
		}
	}
	
	public void sell() {
		propertySale.sell();
	}
	
	public void charge(double quantity) {
		managingRenting.charge(quantity);
	}
	
	public void showProperty(int numberProperty) {
		showProperty.showProperty(numberProperty);
	}
	
	public void ownerPay(double quantity) {
		accountsToPay.ownerPay(quantity);
	}
	
}
