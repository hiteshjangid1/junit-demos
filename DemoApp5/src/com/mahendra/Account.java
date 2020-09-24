///Java Base Package Should be REVERSE of your COMPANY DOMAIN 
package com.mahendra;

public class Account {
	private int accNumber;
	private String userName;
	private double balance;
	//default should be TRUE
	private boolean active;
	
	public Account(int accNumber,String userName, double balance) {
		this.accNumber = accNumber;
		this.userName = userName;
		this.balance = balance;
		this.active = true;
	}

	
	public int getAccNumber() {
		return accNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setActive(boolean active) {
		this.active = active;
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
