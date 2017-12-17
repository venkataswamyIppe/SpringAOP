package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.spring.model.Account;
@Aspect
@Component
public class AccountServiceAspect {

	@AfterReturning(value="execution (* com.spring.service.AccountService.*(..))",returning="account")
	public void afterReturningAdvice(JoinPoint joinPoint,Account account)
	{
		System.out.println("afterReturningAdvice method :"+joinPoint.getSignature().getName()+", Class :"+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println(account);
	}
	@AfterThrowing(value="execution (* com.spring.service.AccountService.*(..))",throwing="ex")
	public void afterThrowingAdvice(JoinPoint joinPoint,Exception ex)
	{
		System.out.println("afterThrowingAdvice method :"+joinPoint.getSignature().getName()+", Class :"+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("exception occured :"+ex.getMessage());
	}
}
