package com.spring.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.spring.model.Account;

@Service
public class AccountServiceImpl implements AccountService{


	public static Map<String,Account>map=null;
	static{
		map=new HashMap<String, Account>();
		map.put("AP10AP1010",new Account("SBHAP1010","Saving_Account"));
		map.put("AP10AP1011",new Account("SBHAP1011","Current_Account"));
	}
	public Account getAccountDetails(String custId)throws Exception{
		if(custId==null){
			throw new Exception("customer id invalid");
		}
		Account account=null;
		Set<Entry<String,Account>>entrySet=map.entrySet();
		for(Entry<String, Account>entry:entrySet){
			if(entry.getKey().equals(custId)){
				account=entry.getValue();
				
			}
		}
		return account;
	}
}
