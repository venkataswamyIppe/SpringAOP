package com.spring;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;


public class MethodAdvice implements AfterReturningAdvice{

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("afterReturning method executed");
		System.out.println(arg0);
		System.out.println(arg1.getName());
		System.out.println(Arrays.toString(arg2));
		System.out.println(arg3.getClass());
	}

}
