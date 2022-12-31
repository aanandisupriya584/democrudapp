package com.democrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.democrud.entity.Account;

public interface AccountRepository extends CrudRepository<Account, String> {

	

}
