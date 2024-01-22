package com.zettamine.spring.core;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zettamine.spring.core.bean.configs.UserConfiguration;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(UserConfiguration.class);

		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("No of Beans: "+noOfBeans);
		String[] names = context.getBeanDefinitionNames();
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}