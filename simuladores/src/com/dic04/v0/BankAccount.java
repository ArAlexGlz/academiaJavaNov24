package com.dic04.v0;

interface Account {
	//public
	default String getId() {
		return "0000";
	}
}

interface PremiumAccount extends Account {
	//public abstract
	@Override
	String getId();
}

public class BankAccount implements PremiumAccount{

	public static void main(String[] args) {
		Account acct = new BankAccount(); 
		System.out.println(acct.getId());
		
		Account acct1 = new Account(){};
		System.out.println(acct1.getId());
		
	}

	@Override
	public String getId() {
		return "Id BankAccount";
	}

}
