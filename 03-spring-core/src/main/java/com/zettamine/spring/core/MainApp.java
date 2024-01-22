package com.zettamine.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zettamine.spring.core.bean.User;
import com.zettamine.spring.core.configs.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		User userBean = context.getBean("customer",User.class);
		
		System.out.println(userBean);
	
	}
}
