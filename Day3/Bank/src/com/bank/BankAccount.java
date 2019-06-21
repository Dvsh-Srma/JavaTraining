package com.bank;

public class BankAccount {
	int accountNo;
	String branch;
	String mobile;
	float amount;
	String name;
	
	public BankAccount(int accountNo, String branch, String mobile, String name) {
		super();
		this.accountNo = accountNo;
		this.branch = branch;
		this.mobile = mobile;
		this.name = name;
		this.amount = 0;
	}
	
	void deposit(float newAmount){
		this.amount = this.amount + newAmount;
	}
	
	void withdraw(float newAmount) { 
		if(newAmount<this.amount) {
			this.amount = this.amount - newAmount;
		} else {
			System.out.println("Insufficient balance");
		}
	}
	
	void checkBalance() {
		System.out.println("Amount is " + this.amount);
	}
}
