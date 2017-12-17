package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AccountServiceAspect {

	/*@Pointcut("execution (* com.spring.service.AccountService.*(..))")
	public void selectAll(){
		
	}*/
	
	@Before(value="com.spring.aop.PointcutDefination.serviceLayer()")
	public void beforeAdvice(JoinPoint joinPoint)
	{
		System.out.println("before method :"+joinPoint.getSignature().getName()+", Class :"+joinPoint.getTarget().getClass().getSimpleName());
	}
	@After(value="com.spring.aop.PointcutDefination.serviceLayer()")
	public void afterAdvice(JoinPoint joinPoint)
	{
		System.out.println("after method :"+joinPoint.getSignature().getName()+", Class :"+joinPoint.getTarget().getClass().getSimpleName());
	}
}
