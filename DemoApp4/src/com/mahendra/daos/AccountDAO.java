package com.mahendra.daos;

import com.mahendra.Account;

public interface AccountDAO {
	
	public void save(Account account);
	
	public Account find(int accNumber);
	
	public void delete(Account account);
}
