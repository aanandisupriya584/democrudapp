package com.democrud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.democrud.entity.Account;
import com.democrud.service.AccountService;


@RestController
public class AccountController {
	@Autowired
	private AccountService Service;

	@RequestMapping("/Account")
	public List<Account> getAllAccount()
	{
		return Service.getAllAccount();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/Account")
	public void addAccount(@RequestBody Account account)
	{
		Service.addAccount(account);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/Account/{id}")
	public void updateAccount(@PathVariable String id, @RequestBody Account account)
	{
		Service.updateAccount(id, account);
	}
	@RequestMapping(method= RequestMethod.DELETE, value="/Account/{id}")
	public void DeleteAccount(@PathVariable String id)
	{
		Service.deleteAccount(id);
	}
}
	
	
	
	
	