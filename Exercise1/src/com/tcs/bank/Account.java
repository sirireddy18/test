package com.tcs.bank;

public abstract class Account {
    
	
	private String name;
	protected double amount;
	private String accountNumber;
	
	public Account(String accountNumber, String name, Double amount) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.amount = amount;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}
	public double getAmount() {
		return amount;
	}
	public void displayAccountDetails() {
		System.out.println("Account Number:" + accountNumber );
		System.out.println("Account Holder:" + name);
		System.out.println("Balance:" + amount);
	}
}
