package com.techCourse.java.designPatterns;

import java.util.HashMap;

/*
 *  
 * Facade Pattern
 * 
 * */

class Service1 {
	public void execute() {
		System.out.println("Execute service 1");
	}
}

class Service2 {
	public void execute() {
		System.out.println("Execute service 2");
	}
}
class Service3 {
	public void execute() {
		System.out.println("Execute service 3");
	}
}


class FacadeServices {
	private Service1 service1 = new Service1();
	private Service2 service2 = new Service2();
	private Service3 service3 = new Service3();
	public void execute() {
		service1.execute();
		service2.execute();
		service3.execute();
	}
}

public class facadePattern {

	public static void main(String[] args) {
		Service1 service1 = new Service1();
		Service2 service2 = new Service2();
		service1.execute();
		service2.execute();
		
		// facade
		FacadeServices facadeServices = new FacadeServices();
		facadeServices.execute();
	}

}
