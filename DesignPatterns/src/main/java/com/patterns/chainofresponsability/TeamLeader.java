package com.patterns.chainofresponsability;

public class TeamLeader implements IApprover {

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
		if(quantity > 10000 && quantity < 50000) {
			System.out.println("I will manage it myself, the team leader");
		} else {
			next.applyForLoan(quantity);
		}
	}

}
