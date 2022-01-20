package com.bank.demo.dto;

import javax.validation.constraints.NotEmpty;

public class BeneficiaryRequest {

	private long beneAccount;
	
	@NotEmpty(message="Ifsc Code cannot be empty")
	private String ifscCode;
	
	@NotEmpty(message="Name cannot be blank")
	private String beneName;
	private String bankName;
	
	@NotEmpty(message="user should be provided")
	private String customerId;
	
	public BeneficiaryRequest() {}
	
	public BeneficiaryRequest(long beneAccount, String ifscCode, String beneName, String bankName) {
		super();
		this.beneAccount = beneAccount;
		this.ifscCode = ifscCode;
		this.beneName = beneName;
		this.bankName = bankName;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
