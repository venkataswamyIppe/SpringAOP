package com.spring.service;

import com.spring.model.Account;

public interface AccountService {
	public Account getAccountDetails(String custId)throws Exception;
}
