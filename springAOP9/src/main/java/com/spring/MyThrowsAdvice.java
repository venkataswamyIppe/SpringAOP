package com.spring;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	// first preference
	public void afterThrowing(ArithmeticException ae) {
		System.out.println("This is from ArithmeticException method");
	}

	// second preference
	public void afterThrowing(Method m, Object args[], Object target, Exception e) {
		System.out.println("Am from 4 parameters method called from " + m.getName());
	}

	// Third preference
	public void afterThrowing(Exception e) {
		System.out.println("Fom single parameter method");
	}
}