package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.spring.model.Account;
public class AccountServiceAspect {

	public void afterReturningAdvice(JoinPoint joinPoint,Account account)
	{
		System.out.println("afterReturningAdvice method executed.");
		System.out.println("afterReturningAdvice method :"+joinPoint.getSignature().getName()+", Class :"+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println(account);
	}
	public void afterThrowingAdvice(JoinPoint joinPoint,Exception ex)
	{
		System.out.println("afterThrowingAdvice method executed.");
		System.out.println("afterThrowingAdvice method :"+joinPoint.getSignature().getName()+", Class :"+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("exception occured :"+ex.getMessage());
	}
}
