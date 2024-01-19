package com.techCourse.java.solid;

/*
 * Principles: 
* S - Single Responsibility principle - A class should have one and only one reason to change	
*/

class AccountService {
	AccountRepository accountRepository = new AccountRepository();
	NotificationService notificationService = new NotificationService();
	public void openAccount() {
		System.out.println("Fill account internal details.");
		this.accountRepository.create();
		this.notificationService.sendMessage();
	}
}

class AccountRepository {
	public void create() {
		System.out.println("Store account object in database.");
	}
}

class NotificationService {
	public void sendMessage() {
		System.out.println("Send Welcome message.");
	}
}

public class SingleResponsability {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		accountService.openAccount();
	}

}
