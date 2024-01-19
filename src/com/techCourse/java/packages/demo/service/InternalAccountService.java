package com.techCourse.java.packages.demo.service;

import java.util.UUID;

class InternalAccountService {
	public String generateId() { // public or protected or default can be accessed inside the package
		return UUID.randomUUID().toString();
	}
}
