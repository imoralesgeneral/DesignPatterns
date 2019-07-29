package com.patterns.chainofresponsability;

public class Executive implements IApprover {

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
		if(quantity < 10000) {
			System.out.println("I will manage it myself, the executive");
		} else {
			next.applyForLoan(quantity);
		}
	}

}
