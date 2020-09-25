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

	@Test
	public void testCreate() {
		Account ac = new Account(101, "Xyz", 2300);
		when(dao.save(ac)).thenReturn(true);
		service.create(ac);
		when(dao.find(101)).thenReturn(ac);
		Account ac2 = dao.find(101);
		assertEquals(ac, ac2);
	}

	@Test
	public void testFindByAccNo() {
		Account ac = new Account(101, "Xyz", 2300);
		when(dao.find(101)).thenReturn(ac);
		assertEquals(ac, service.findByAccNo(101));
	}

}
