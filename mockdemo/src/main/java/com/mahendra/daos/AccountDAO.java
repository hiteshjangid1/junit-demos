package com.mahendra.daos;

import com.mahendra.models.Account;

public interface AccountDAO {
	
	public boolean save(Account acc);
	
	public Account find(int accId);
	
	
}
