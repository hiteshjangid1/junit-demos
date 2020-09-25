package com.mahendra.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;

import com.mahendra.daos.AccountDAO;
import com.mahendra.models.Account;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceTest {

	@InjectMocks
	private AccountService service = new AccountService();

	@Mock
	private AccountDAO dao;

	Account ac = null;

	@Before
	public void init() {
		ac = new Account(101, "Xyz", 2300);
		when(dao.save(ac)).thenReturn(true);
		when(dao.find(101)).thenReturn(ac);
	}

	@Test
	public void testCreate() {
		service.create(ac);
		Account ac2 = dao.find(101);
		assertEquals(ac, ac2);
	}

	@Test
	public void testFindByAccNo() {
		assertEquals(ac, service.findByAccNo(101));
	}

}
