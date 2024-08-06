package com.tcs.bank;

import java.util.Scanner;

public class BankSystem {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Account type( SBAccount/ CurrentAccount):");
		String accountType= scanner.next();
		
		System.out.println("Enter Account Number:");
		String accountNumber= scanner.next();
		
		System.out.println("Enter Account holder name :");
		String name = scanner.next();
		
		System.out.println("Enter initial amount: ");
		double amount= scanner.nextDouble();
	
		Account account=null;
		if(accountType.equalsIgnoreCase("SBAccount")) {
			account= new SBAccount(accountNumber,  name , amount);}
		else if (accountType.equalsIgnoreCase("CurrentAccount")) {
			account= new SBAccount(accountNumber, name, amount);}
		else {
		System.out.println("Invalid Account Type");	
		System.exit(0);
		
	}
		account.displayAccountDetails();
		scanner.close();
	}
}
