package com.ecxeptionhandling;

public class BankAccountMain {

	public static void main(String[] args)  {
		BankAccount account=new BankAccount("SBI",5000);
		try {
			account.deposit(0);
			System.out.println("Balance Rs. "+account.getBalance());
		}
		catch(InvalidAmountException a) {
			System.out.println("error: "+a.getMessage());
		}
		try {
			account.withdraw(2000);
			System.out.println("withdraw Rs. "+account.getBalance());
		}catch(InSufficientBalanceException a) {
			System.out.println("ERROR: "+a.getMessage());
		}catch(InvalidAmountException a) {
			System.out.println("error: "+a.getMessage());
		}
		
	
		
		

	}

}
