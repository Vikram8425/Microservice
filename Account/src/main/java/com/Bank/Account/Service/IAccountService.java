package com.Bank.Account.Service;

import org.springframework.http.ResponseEntity;

import com.Bank.Account.Dto.CustomerDto;

public interface IAccountService {
	public CustomerDto createAcoount(CustomerDto customerDto);
}
