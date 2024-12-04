package com.dic04.v1;

interface Account {
	//public
	default String getId() {
		return "0000";
	}
}

interface PremiumAccount extends Account {
//  public abstract
//	@Override
//	default String getId() { 
//		super.getId(); //No se puede usar super en las Interfaces
//	}
}

public class BankAccount implements PremiumAccount{

	public static void main(String[] args) {
		
		Account acct = new BankAccount(); 
		System.out.println(acct.getId());

	}

}
