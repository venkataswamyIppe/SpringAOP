package com.spring;

import org.springframework.aop.ThrowsAdvice;

public class MethodAdvice4 implements ThrowsAdvice{

	public void afterThrowing(NullPointerException npe){
		System.out.println("NPE occured");
	}
}
