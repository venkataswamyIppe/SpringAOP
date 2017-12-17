package com.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AccountServiceAspect {

	@Around(value="execution (* com.spring.service.AccountService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp){
		System.out.println("before aroundAdvice method :"+pjp.getSignature().getName()+", Class :"+pjp.getTarget().getClass().getSimpleName());
		long sTime=System.currentTimeMillis();
		Object obj=null;
		try{
			obj=pjp.proceed();
		}catch(Throwable t){
			System.out.println(t.getMessage());
		}
		System.out.println("after aroundAdvice method :"+pjp.getSignature().getName()+", Class :"+pjp.getTarget().getClass().getSimpleName());
		long eTime=System.currentTimeMillis();
		System.out.println("Total execution time taken by method :"+pjp.getSignature().getName()+" is "+(eTime-sTime)+" ms");
		return obj;
	}
}
