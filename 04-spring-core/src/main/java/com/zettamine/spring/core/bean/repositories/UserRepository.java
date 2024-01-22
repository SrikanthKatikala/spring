package com.zettamine.spring.core.bean.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	public UserRepository() {
		System.out.println("UserRepository: constructor");
	}

	
}
