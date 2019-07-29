package com.patterns.chainofresponsability;

public interface IApprover {
	
	public void setNext(IApprover approver);
	public IApprover getNext();
	public void applyForLoan(int quantity);

}
