package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	MyInterFace mi=(MyInterFace) ac.getBean("id3");
    	mi.m1();
    	
    }
}
