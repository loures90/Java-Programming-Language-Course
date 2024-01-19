package com.techCourse.java.packages.demo.service;

public class CarService {
	InternalAccountService internalAccountService = new InternalAccountService();
	public void create() {
		System.out.println("Car  created - " + this.internalAccountService.generateId());
	}
}
