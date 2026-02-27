package com.ecxeptionhandling;

public class InSufficientBalanceException extends Exception {
	private double balance;
	private double withdrawamount;
	public InSufficientBalanceException(double balance,double withdrawamount) {
		super("Insufficient balance available balance: "+balance+
				" but you have  Requested :" +withdrawamount);
		
		this.balance=balance;
		this.withdrawamount=withdrawamount;
	}


}
   