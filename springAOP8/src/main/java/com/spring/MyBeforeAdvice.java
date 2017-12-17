package com.spring;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Am from BeforeAdvice to " + arg0.getName());

	}

}
