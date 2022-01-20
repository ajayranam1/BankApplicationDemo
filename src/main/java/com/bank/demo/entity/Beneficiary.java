package com.bank.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Beneficiary {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int beneId;
	private long beneAccount;
	private String ifscCode;
	private String beneName;
	private String bankName;
	private int accountId;
	
	public Beneficiary() {}

	public Beneficiary(long beneAccount, String ifscCode, String beneName, String bankName, int accountId) {
		super();
		this.beneAccount = beneAccount;
		this.ifscCode = ifscCode;
		this.beneName = beneName;
		this.bankName = bankName;
		this.accountId = accountId;
	}
	
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getBeneId() {
		return beneId;
	}

	public void setBeneId(int beneId) {
		this.beneId = beneId;
	}

	public long getBeneAccount() {
		return beneAccount;
	}

	public void setBeneAccount(long beneAccount) {
		this.beneAccount = beneAccount;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBeneName() {
		return beneName;
	}

	public void setBeneName(String beneName) {
		this.beneName = beneName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	
	
	
}
