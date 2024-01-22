package com.zettamine.spring.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zettamine.spring.core.bean.User;

public class Lancher {

	public static void main(String[] args) {
		//BeanFactory factory = new ClassPathXmlApplicationContext("user-bean.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean.xml");
		int count = context.getBeanDefinitionCount();
		
		String[] names = context.getBeanDefinitionNames();
		
		User bean = context.getBean("user1", User.class);
		
		System.out.println("User 1: "+bean.toString());
		System.out.println("Beans names: "+Arrays.toString(names));
		
		System.out.println("count: "+count);
		
		Map<String, User> map = context.getBeansOfType(User.class);
		map.forEach((t, u) -> System.out.println(u + t));
		
	}
}
