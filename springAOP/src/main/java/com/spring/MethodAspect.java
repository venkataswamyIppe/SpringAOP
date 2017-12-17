package com.spring;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodAspect implements MethodBeforeAdvice{

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("before method executed");
		System.out.println(arg0.getName());
		System.out.println(Arrays.toString(arg1));
		System.out.println(arg2.getClass());
		
	}

}
