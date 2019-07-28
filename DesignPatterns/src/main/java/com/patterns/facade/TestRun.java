package com.patterns.facade;

public class TestRun {

	public static void main(String[] args) {
	
		Client c = new Client();
		Interested i = new Interested();
		
		///Without facade
		RealState realState = new RealState();
		realState.attendingClient(c);
		realState.attendingInterested(i);
		ShowPropertySubSystem showProperty = new ShowPropertySubSystem();
		showProperty.showProperty(123);
		PropertySaleSubSystem sell = new PropertySaleSubSystem();
		sell.sell();
		ManagingRentingSubSystem renting = new ManagingRentingSubSystem();
		renting.charge(1200);
		AccountsToPaySubSystem accountsToPay = new AccountsToPaySubSystem();
		accountsToPay.ownerPay(1100);
		
		///With facade
		RealState realState2 = new RealState();
		realState2.attending(i);
		realState2.attending(c);
		realState2.showProperty(123);
		realState2.sell();
		realState2.charge(1200);
		realState.ownerPay(1100);
		
	}

}
