package com.nc.model;

public class CurrentAccount implements Account{
	
	private Card card;
	
	public Card getCard() {
		return card; 
	}
	
	public void setCard(Card card) {
		this.card = card;
	}
	@Override 
	public String createAccount() {
		return "Account has been created successfully...from currrent account";
	}

	@Override
	public String closedAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
