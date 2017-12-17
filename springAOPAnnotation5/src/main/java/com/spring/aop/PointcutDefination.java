package com.spring.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutDefination {

	@Pointcut("within(com.spring.web.**)")
	public void webLayer(){
		
	}
	@Pointcut("within(com.spring.service..*)")
	public void serviceLayer(){
		
	}
	@Pointcut("within(com.spring.dao..*)")
	public void daoLayer(){
		
	}
}
