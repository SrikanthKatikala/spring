package com.zettamine.spring.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "customer")
@Lazy(value = true)
public class User {

	@Value(value = "${firstName}")
	private String firstName;
	
	@Value(value= "${lastName}")
	private String lastName;
	
	public User() {
		System.out.println("No-arg constructor");
	}

	public User(String firstName, String lastName) {
		System.out.println("2 - ags constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
