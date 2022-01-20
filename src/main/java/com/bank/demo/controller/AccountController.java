package com.bank.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.demo.dto.BeneficiaryRequest;
import com.bank.demo.dto.BeneficiaryResponse;
import com.bank.demo.entity.Account;
import com.bank.demo.entity.Beneficiary;
import com.bank.demo.service.impl.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("/accountsummary/{customerId}")
	public Account getAccount(@PathVariable String customerId) throws Exception{
		return accountService.getAccountSummary(customerId);
	}

	@PostMapping("/addbeneficiary")
	public BeneficiaryResponse addNewBeneficiary(@RequestBody @Validated BeneficiaryRequest beneficiaryRequest) throws Exception {
		Beneficiary bene=accountService.addNewBeneficiary(beneficiaryRequest);
		
		return new BeneficiaryResponse("Beneficiary Added Successfully", bene.getBeneId());
	}
	
	@GetMapping("/viewbeneficiary/{customerId}")
	public List<Beneficiary> viewBeneficiary(@PathVariable String customerId) throws Exception{
		return accountService.viewAllBeneficiary(customerId);
	}
}
