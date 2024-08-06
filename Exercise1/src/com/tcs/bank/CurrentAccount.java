package com.tcs.bank;

public final class CurrentAccount extends Account{


	private static final double MinBalance = 1000;
	
	public CurrentAccount(String accountNumber, String name, Double amount) {
		super(accountNumber, name, amount);
	}

	@Override
	public void deposit(double amount) {
		this.amount += amount;
        System.out.println("Deposited:" + amount);
		
	}

	@Override
	public void withdraw(double amount) {
		if (this.amount - amount >= MinBalance) {
			this.amount -= amount;
			System.out.println("Withdrew:" + amount);}
			else {
				System.out.println("Cannot withdrew minimum bal must be maintained ");
				}
	}

}
