package com.spring.service;

import com.spring.model.Account;

public class AccountService {

	public void updateAccountBalance(Account account,int amount){
		System.out.println("updateAccountBalance method executed");
		System.out.println(account.getAccountDescription()+" "+" to acNo "+account.getAccountNo()+" and Amount "+amount+" updated.");
	}
}
