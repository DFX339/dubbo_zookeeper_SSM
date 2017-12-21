package com.dfx.dubbo.demo_provider.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 开启服务主类
 * 
 * */
public class Provider {
	static int count=0;
	public static void main(String[] args) throws IOException{
		count++;
		System.out.println("123开始，count="+count+"，执行了--"+count+"次");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContex_provider.xml"});
		context.start();
		System.in.read();
		
	}
}
