package com.techCourse.java.packages;

import java.util.Date;

import com.techCourse.java.packages.demo.service.AccountService;
import com.techCourse.java.packages.demo.service.CarService;
//import com.techCourse.java.packages.demo.service.*;

import com.techCourse.java.packages.demo.utils.DateUtil;
import static java.lang.System.out;

public class PackagesEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountService accountService = new AccountService();
		accountService.create();
		
		CarService car = new CarService();
		car.create();
//		com.techCourse.java.packages.demo.service.InternalAccountService is not accessible, because it is not public class and it is from a package from outside 
		
		
		System.out.println(DateUtil.formatDate(new Date()));
		out.println(DateUtil.formatDate(new Date()));
	}

}



