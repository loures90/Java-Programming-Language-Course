package com.techCourse.java.exception;

class DataException extends Exception {
	public DataException(String reason) {
		super(reason);
	}
}

class InsufficientFundsException extends Exception {}

class Account {
	private int accountNumber;
	private double balance;
	
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void withDraw(double value) throws DataException, InsufficientFundsException {
		if (value <= 0) {
			throw new DataException("Value not valid.");
		}
		double newBalance = this.balance - value;
		if (newBalance < 0) {
			throw new InsufficientFundsException();
		} 
		this.balance = newBalance;
	}
	public void getBankStatement() {
		System.out.println("Acount: " + this.accountNumber + " - Balance: " + this.balance);
	}
}

public class ExceptionEx {
	public static void main(String[] args) {
		Account account = new Account(122345, 1000.00);
		try {
			account.withDraw(200);
			account.getBankStatement();
		} catch (DataException e) {
			System.err.println("DataException e: " + e);
			e.printStackTrace();
		} catch (InsufficientFundsException e) {
			System.err.println("InsufficientFundsException e: " + e);
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception e: " + e);
			e.printStackTrace();
		} 
		
	}
	
}
