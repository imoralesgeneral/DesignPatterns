package com.patterns.chainofresponsability;

public class Bank implements IApprover {

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
		Executive executive = new Executive();
		this.setNext(executive);
		TeamLeader teamLeader = new TeamLeader();
		executive.setNext(teamLeader);
		Manager manager = new Manager();
		teamLeader.setNext(manager);
		Director director = new Director();
		manager.setNext(director);
		next.applyForLoan(quantity);
	}

}
