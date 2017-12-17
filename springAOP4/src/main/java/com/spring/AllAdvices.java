package com.spring;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.IntroductionInterceptor;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class AllAdvices implements MethodBeforeAdvice,AfterReturningAdvice,IntroductionInterceptor,ThrowsAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before method executed");
		
	}

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("afterReturning method executed");
	}

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("invoke method executed");
		System.out.println("start execution");
		Object o=invocation.proceed();
		System.out.println("end execution");
			return o;
	}

	public boolean implementsInterface(Class<?> intf) {
		
		return false;
	}
	
	public void afterThrowing(IllegalArgumentException iae){
		System.out.println("afterReturning method executed");
	}

}
