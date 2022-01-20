package com.bank.demo.service.impl;

import java.util.List;

import com.bank.demo.dto.BeneficiaryRequest;
import com.bank.demo.entity.Account;
import com.bank.demo.entity.Beneficiary;

public interface AccountService {

	public Account getAccountSummary(String customerId) throws Exception;
	
	public Beneficiary addNewBeneficiary(BeneficiaryRequest beneRequest) throws Exception;
	
	public List<Beneficiary> viewAllBeneficiary(String customerId) throws Exception;
}
