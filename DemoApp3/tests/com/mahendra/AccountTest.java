package com.mahendra;

import org.junit.*;

import junit.framework.TestCase;

// Written as "import static" but READ AS "static import"
import static org.junit.Assert.*;

public class AccountTest extends TestCase{
	
	Account acc = null;
	//Fixture : perfom certain operation (REPEATED for test cases)
	public void setUp()throws Exception {
		acc = new Account("Mahendra", 12000.0);
	}
	
	public void tearDown()throws Exception{
		acc = null;
	}
	
	
	public void testAccountCreation() {
	//	Account acc = new Account("Mahendra", 12000.0);
		assertEquals("Username didnt match!","Mahendra", acc.getUsername());
	}
	
	public void testAccountCreation2() {
	//	Account acc = new Account("Mahendra", 12000.0);
		assertEquals(12000.0,acc.getBalance(),0.1);
	}
	
	public void testAccountCreation3() {
	//	Account acc = new Account("Mahendra", 12000.0);
		assertTrue(acc.isActive());
	}
}
