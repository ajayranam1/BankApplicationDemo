package com.bank.demo.service.impl;

import java.util.List;

import com.bank.demo.dto.BeneficiaryRequest;
import com.bank.demo.entity.Account;
import com.bank.demo.entity.Beneficiary;
import com.bank.demo.exception.BeneficiaryAlreadyExistException;
import com.bank.demo.exception.BeneficiaryNotAddedException;

public interface AccountService {

	public Account getAccountSummary(String customerId) throws Exception;
	
	public Beneficiary addNewBeneficiary(BeneficiaryRequest beneRequest) throws BeneficiaryAlreadyExistException;
	
	public List<Beneficiary> viewAllBeneficiary(String customerId) throws BeneficiaryNotAddedException;
}
