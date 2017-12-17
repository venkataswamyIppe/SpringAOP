package com.spring;

public class HelloImpl implements Hello
{

	public String sayHello(String name) {
		System.out.println("sayHello method excuted");
		return "Hello..! I am "+name;
	}

	
	
}
