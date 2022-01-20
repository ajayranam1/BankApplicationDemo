package com.bank.demo.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.bank.demo.dto.BeneficiaryRequest;
import com.bank.demo.entity.Account;
import com.bank.demo.entity.Beneficiary;
import com.bank.demo.exception.BeneficiaryAlreadyExistException;
import com.bank.demo.exception.BeneficiaryNotAddedException;
import com.bank.demo.repository.AccountRepository;
import com.bank.demo.repository.BeneficiaryRepository;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accountRepo;
	
	@Autowired
	BeneficiaryRepository beneRepo;
	
	@Override
	public Account getAccountSummary(String customerId) throws Exception{
		Account acc= accountRepo.findByCustomerId(customerId);
		System.out.println("account---"+acc);
		if(Objects.isNull(acc)) {
			throw new Exception("No Account Details Available");
		}
		return acc;
	}
	
	@Override
	public Beneficiary addNewBeneficiary(BeneficiaryRequest beneRequest) throws BeneficiaryAlreadyExistException{
		if(Objects.isNull(beneRepo.findAllByBeneAccount(beneRequest.getBeneAccount()))){
			Beneficiary bene= new Beneficiary(beneRequest.getBeneAccount(),beneRequest.getIfscCode(),beneRequest.getBeneName(),
					beneRequest.getBankName(),accountRepo.findAccountIdByAccountNumber(accountRepo.findAccountNumberByCustomerId(
							beneRequest.getCustomerId()).getAccountNumber()).getAccountId());
			return beneRepo.save(bene);
		}
		else{
			throw new BeneficiaryAlreadyExistException("Beneficiary Already exist with beneficiary Id:"+beneRepo.findAllByBeneAccount(beneRequest.getBeneAccount()).getBeneId());
		}
				
	}
	
	@Override
	public List<Beneficiary> viewAllBeneficiary(String customerId) {
		List<Beneficiary> beneList=beneRepo.findByAccountId(accountRepo.findAccountIdByAccountNumber(
				accountRepo.findAccountNumberByCustomerId(customerId).getAccountNumber()).getAccountId());
		if(StringUtils.isEmpty(beneList)) {
			throw new BeneficiaryNotAddedException("No beneficiary added yet");
		}
		return beneList;
	}
}
