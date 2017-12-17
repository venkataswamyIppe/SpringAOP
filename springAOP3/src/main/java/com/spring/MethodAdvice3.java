package com.spring;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

public class MethodAdvice3 implements IntroductionInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
	System.out.println("start execution");
	Object o=invocation.proceed();
	System.out.println("end execution");
		return o;
	}

	public boolean implementsInterface(Class<?> intf) {
		return false;
	}

	
}
