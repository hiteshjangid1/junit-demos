package com.mahendra.services;

import com.mahendra.daos.AccountDAO;
import com.mahendra.models.Account;

public class AccountService {
	
	private AccountDAO dao;
	
	public AccountService() {
	}
	
	
	
	
	public void setDao(AccountDAO dao) {
		this.dao = dao;
	}




	public void create(Account ac) {
		dao.save(ac);
	}
	
	
	public Account findByAccNo(int accNo) {
		return null;
	}
}	
