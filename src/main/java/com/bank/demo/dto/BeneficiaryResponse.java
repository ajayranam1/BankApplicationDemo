package com.bank.demo.dto;

public class BeneficiaryResponse {
	
	private String message;
	private int beneId;
	public BeneficiaryResponse(String message, int beneId) {
		super();
		this.message = message;
		this.beneId = beneId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getBeneId() {
		return beneId;
	}
	public void setBeneId(int beneId) {
		this.beneId = beneId;
	}
	
	
}
