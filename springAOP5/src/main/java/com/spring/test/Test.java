package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Account;
import com.spring.service.AccountService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		AccountService	accountService=(AccountService) ac.getBean("accountService");
		accountService.updateAccountBalance(new Account("sbh1001","MoneyTransfer"),1500);
	}

}
