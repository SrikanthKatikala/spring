package com.zettamine.spring.core.bean.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class UserConfiguration {

	public UserConfiguration() {
		System.out.println("User Configuration: constructor");
	}
}
