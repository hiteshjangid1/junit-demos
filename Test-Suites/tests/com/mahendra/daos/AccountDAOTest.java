package com.mahendra.daos;

import org.junit.*;

import com.mahendra.Account;
import com.mahendra.AccountNotFoundException;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

public class AccountDAOTest {

	AccountDAO dao = null;
	private static List<Account> accounts =null;
	
	@BeforeClass
	public static void setUpClass()throws Exception {
		System.out.println("Settingup the Test Class");
		accounts = new LinkedList<>();
		accounts.add(new Account(102, "Sonali", 23000));
		accounts.add(new Account(103, "Dakshata",2000));
		accounts.add(new Account(104,"Divyashree",12000));
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Setting up the accounts");
		
		dao = new AccountDAOImpl(new LinkedList<>(accounts));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear down the DAO Object");
		dao = null;
	}

	@Test
	public void testSave() {
		dao.save(new Account(101, "Mahendra", 12000));
		Account ac = dao.find(101);
		assertNotNull(ac);
	}

	@Test
	public void testFind() {
		Account ac = dao.find(102);
		assertNotNull(ac);
	}
	@Test(expected=AccountNotFoundException.class)
	public void testNonExitsFind() {
		Account ac = dao.find(101);
	}

	@Test(expected=AccountNotFoundException.class)
	public void testDelete() {
		dao.delete(accounts.get(0));
		dao.find(102);
	}

}
