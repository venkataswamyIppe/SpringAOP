package com.spring;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {
	public void afterReturning(Object returnValue, Method m,Object args[],Object target)throws Exception
	{
		System.out.println("Am from AfterAdvice to "+m.getName());
	}
}
