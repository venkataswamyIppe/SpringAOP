package com.spring;

public class HelloImpl implements Hello
{

	public String sayHello(String name) {
		System.out.println("sayHello method excuted");
		String str=null;
		System.out.println("string length :"+str.length());
		return "Hello..! I am "+name;
	}

	
	
}
