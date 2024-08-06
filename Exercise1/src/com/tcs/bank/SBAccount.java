package com.tcs.bank;

public final class SBAccount extends Account {

	private static final double InterestRate= 0.04;
	public SBAccount(String accountNumber, String name, Double amount) {
		super(accountNumber, name, amount);
	}

	@Override
	public void deposit(double amount) {
		this.amount += amount;
        System.out.println("Deposited:" + amount);
		
	}

	@Override
	public void withdraw(double Amount) {
		if (this.amount >=amount) {
		this.amount -= amount;
		System.out.println("Withdrew:" + amount);}
		else {
			System.out.println("Insufficient Balance");
			}
	}

	public void addInterest() {
		this.amount += this.amount*InterestRate;
		System.out.println("Interest added");
	}
}
