package com.bank;

public class Bank {

	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount(123, "HBTU", "9876543210", "Ameer Khan");
		myAccount.checkBalance();
		myAccount.deposit(1000);
		myAccount.checkBalance();
		myAccount.withdraw(5000);
		myAccount.withdraw(500);
		myAccount.checkBalance();
		
	}

}
