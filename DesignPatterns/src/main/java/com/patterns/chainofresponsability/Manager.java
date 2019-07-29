package com.patterns.chainofresponsability;

public class Manager implements IApprover {

private IApprover next;
	
	@Override
	public void setNext(IApprover approver) {
		this.next = approver;
	}

	@Override
	public IApprover getNext() {
		return next;
	}

	@Override
	public void applyForLoan(int quantity) {
		if(quantity > 50000 && quantity < 100000) {
			System.out.println("I will manage it myself, the manager");
		} else {
			next.applyForLoan(quantity);
		}
	}

}
