package com.bank.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.bank.demo.Model.AccountType;

@Entity
public class Account {
	
	@Id
	private int accountId;
	private long accountNumber;
	private String holderName;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	private int balance;
	private String ifscCode;
	private LocalDate creationDate;
	
	private String customerId;

	public Account() {
		super();
	}
	
	public Account(int accountId, long accountNumber, String holderName, AccountType accountType, int balance,
			String ifscCode, LocalDate creationDate, String customer) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.accountType = accountType;
		this.balance = balance;
		this.ifscCode = ifscCode;
		this.creationDate = creationDate;
		this.customerId = customer;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public String getCustomer() {
		return customerId;
	}

	public void setCustomer(String customer) {
		this.customerId = customer;
	}
	
	
}
