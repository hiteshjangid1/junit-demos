///Java Base Package Should be REVERSE of your COMPANY DOMAIN 
package com.mahendra;

public class Account {
	private String userName;
	private double balance;
	//default should be TRUE
	private boolean active;
	
	public Account(String userName, double balance) {
		this.userName = userName;
		this.balance = balance;
		this.active = true;
	}
	
	public String getUsername() {
		return this.userName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean isActive() {
		return active;
	}
}
