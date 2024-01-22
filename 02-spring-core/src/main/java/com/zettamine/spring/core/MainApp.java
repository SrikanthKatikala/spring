package com.zettamine.spring.core;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zettamine.spring.core.bean.User;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean.xml");
		
		User bean = (User) context.getBean("customer");
		System.out.println(bean.toString());
		
		Map<String, User> map = context.getBeansOfType(User.class);
		map.forEach((t, u) -> System.out.println(t+" "+u));
		
	}
}