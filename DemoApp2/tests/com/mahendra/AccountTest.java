package com.mahendra;

import org.junit.*;

// Written as "import static" but READ AS "static import"
import static org.junit.Assert.*;

public class AccountTest {
	
	Account acc = null;
	//Fixture : perfom certain operation (REPEATED for test cases)
	@Before
	public void setUp()throws Exception {
		acc = new Account("Mahendra", 12000.0);
	}
	@After //After even
	public void tearDown()throws Exception{
		acc = null;
	}
	
	@Test
	//1. Test method MUST have @Test Annotation
	//2. Method MUST BE `public void`
	//3. Method SHOULD NOT accept any parameters
	public void testAccountCreation() {
	//	Account acc = new Account("Mahendra", 12000.0);
		assertEquals("Username didnt match!","Mahendra", acc.getUsername());
	}
	
	@Test
	public void testAccountCreation2() {
	//	Account acc = new Account("Mahendra", 12000.0);
		assertEquals(12000.0,acc.getBalance(),0.1);
	}
	
	@Test
	public void testAccountCreation3() {
	//	Account acc = new Account("Mahendra", 12000.0);
		assertTrue(acc.isActive());
	}
}
