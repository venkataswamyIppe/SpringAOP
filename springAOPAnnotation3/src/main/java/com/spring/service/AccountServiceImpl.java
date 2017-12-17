package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.model.Account;

@Service
public class AccountServiceImpl implements AccountService{

	public Account updateAccountBalance(Account account,int amount){
		System.out.println("updateAccountBalance method executed");
		System.out.println(account.getAccountDescription()+" "+" to acNo "+account.getAccountNo()+" and Amount "+amount+" updated.");
		return account;
	}
	
}
