package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

	@Autowired
	Repository repo;
	
	@Override
	public Account createAccount(Account acc) {
		// TODO Auto-generated method stub
		return repo.save(acc);
	}

	@Override
	public Account updateAccount(Account acc) {
		// TODO Auto-generated method stub
		Optional<Account> acc2 = repo.findById(acc.getId());
		if(acc2.isPresent()) {
			repo.deleteById(acc.getId());
			return repo.save(acc);
		}
		else {
			throw new CustomException("The account does not exist so please create account using create api");
		}
	}

	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Account getAccount(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).isPresent()?repo.findById(id).get():new Account();
	}

	@Override
	public int accountTotalCount() {
		// TODO Auto-generated method stub
		return repo.accountTotalCount();
	}

}
