package com.example.demo;

public interface Service {

	Account createAccount(Account acc);

	Account updateAccount(Account acc);

	void deleteAccount(int id);

	Account getAccount(int id);

	int accountTotalCount();

}
