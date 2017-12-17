package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Account;
import com.spring.service.AccountService;
import com.spring.service.AccountServiceImpl;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		AccountService	as=(AccountService) ac.getBean("accountService");
		Account account=as.getAccountDetails(null);
		if(account!=null){
			System.out.println("account no:"+account.getAccountNo()+" and status :"+account.getAccountDescription());
		}
	}

}
