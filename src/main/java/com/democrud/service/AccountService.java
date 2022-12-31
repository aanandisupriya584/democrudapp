package com.democrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.democrud.entity.Account;
import com.democrud.repository.AccountRepository;
@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepo;

	public List<Account> getAllAccount() {
		List<Account> account = new ArrayList<>();
		accountRepo.findAll().forEach(account::add);
		return account;
	}

	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		accountRepo.save(account);
		
	}

	public void updateAccount(String id, Account account) {
		// TODO Auto-generated method stub
		accountRepo.save(account);
		
	}

	public void deleteAccount(String id) {
		// TODO Auto-generated method stub
		accountRepo.deleteById(id);
		
	}

	
}
