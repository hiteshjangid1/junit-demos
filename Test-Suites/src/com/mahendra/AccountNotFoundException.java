package com.mahendra;

public class AccountNotFoundException extends RuntimeException {
 private int accNo;
 
 public AccountNotFoundException(int accNo) {
	super("Account number "+accNo+ " does not exists");
	this.accNo=accNo;
}
 
 	public int getAccNo() {
		return accNo;
	}
}
