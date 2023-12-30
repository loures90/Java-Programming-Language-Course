package com.techCourse.java.classes;

class Account {
	private double balance;
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if ((balance - amount) > 0 && amount > 0) {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
}

public class ClassesEx3 {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.deposit(2000);
		acc1.withdraw(1500);
		acc1.deposit(-9000);
		acc1.withdraw(-500);
		
		System.out.println(acc1.getBalance());
	}

}
