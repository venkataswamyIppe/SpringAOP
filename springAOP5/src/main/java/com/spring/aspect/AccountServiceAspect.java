package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
public class AccountServiceAspect {

	public void beforeAdvice(JoinPoint joinPoint)
	{
		System.out.println("beforeAdvice method executed.");
		System.out.println("before method :"+joinPoint.getSignature().getName()+", Class :"+joinPoint.getTarget().getClass().getSimpleName());
	}
	public void afterAdvice(JoinPoint joinPoint)
	{
		System.out.println("afterAdvice method executed.");
		System.out.println("after method :"+joinPoint.getSignature().getName()+", Class :"+joinPoint.getTarget().getClass().getSimpleName());
	}
}
