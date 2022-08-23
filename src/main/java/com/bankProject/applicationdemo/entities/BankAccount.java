package com.bankProject.applicationdemo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="account")
public class BankAccount {
	@Id
	private long accountNumber;
	private long customerId;
	private double currentBalance;
	
	public BankAccount(long accountNum, long customerId, double currentBalance  ) {
		this.accountNumber = accountNum;
		this.customerId = customerId;
		this.currentBalance = currentBalance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	
}
