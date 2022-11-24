package com.nc.model;

public class ClosedAccount implements Account {
	
	@Override
	public String createAccount() {
		return "Account has been closed";
	}
	
	@Override
	public String closedAccount() {
		return "Account has been closed successfully";
	}

	@Override
	public Card getCard() {
		// TODO Auto-generated method stub
		return null;
	}
}
