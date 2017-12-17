package com.spring.model;

public class Account {
	private String accountNo;
	private String accountDescription;

	public Account(String accountNo, String accountDescription) {
		super();
		this.accountNo = accountNo;
		this.accountDescription = accountDescription;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountDescription() {
		return accountDescription;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

}
