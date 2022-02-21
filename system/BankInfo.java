package org.system;

public class BankInfo {
	public void saving(int amount) {
		System.out.println("This is a savings account and the balance is " + amount);
	}

	public void fixed(String name) {
		System.out.println("This is a FD account and the account holder name is " + name);
	}

	public void deposit(int amount) {
		System.out.println("The amount to be deposited is " + amount);
	}
	
}
