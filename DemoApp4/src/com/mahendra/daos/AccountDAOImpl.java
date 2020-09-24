package com.mahendra.daos;

import java.util.List;
import java.util.Optional;
import com.mahendra.Account;

public class AccountDAOImpl implements AccountDAO{

	private List<Account> accounts = null;
	
	public AccountDAOImpl(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	@Override
	public void delete(Account account) {
		System.out.println("Deleting a record ");
		accounts.remove(account);
	}
	
	@Override
	public Account find(int accNumber) {
		Optional<Account> acc =
			accounts.stream().filter(t -> t.getAccNumber()==accNumber).findFirst();
		if(acc.isPresent())
			return acc.get();
		return null;
	}
	public void save(Account account) {
		accounts.add(account);
	}
}
