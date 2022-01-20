package com.bank.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bank.demo.exception.BeneficiaryAlreadyExistException;
import com.bank.demo.exception.BeneficiaryNotAddedException;

@ControllerAdvice
public class BankControllerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<String> emtyHandler(UsernameNotFoundException usernameNotFoundException){
		return new ResponseEntity<String>(usernameNotFoundException.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BeneficiaryAlreadyExistException.class)
	public ResponseEntity<String> beneficiaryAlreadyExist(BeneficiaryAlreadyExistException beneficiaryAlreadyExistException){
		return new ResponseEntity<String>(beneficiaryAlreadyExistException.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BeneficiaryNotAddedException.class)
	public ResponseEntity<String> beneficiaryNotAdded(BeneficiaryNotAddedException beneficiaryNotAddedException){
		return new ResponseEntity<String>(beneficiaryNotAddedException.getMessage(), HttpStatus.NOT_FOUND);
	}
}
