package com.Bank.Account.Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Account.Dto.CustomerDto;
import com.Bank.Account.Service.IAccountService;

import jakarta.validation.Valid;
@RestController
@RequestMapping(path = "api" ,produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {

	private IAccountService accountService;
	public <T> CustomerDto createAccount(@Valid @RequestBody CustomerDto customerDto ){
		
		return accountService.createAcoount(customerDto);
	}
}
