package com.techCourse.java.packages.demo.service;

public class AccountService {
	InternalAccountService internalAccountService = new InternalAccountService();
	public void create() {
		System.out.println("Account  created - " + this.internalAccountService.generateId());
	}
}
