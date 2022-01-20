package com.bank.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.demo.entity.Beneficiary;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Integer>{

	public List<Beneficiary> findByAccountId(int accountId);
	
	public Beneficiary findAllByBeneAccount(long beneAccount);
}
