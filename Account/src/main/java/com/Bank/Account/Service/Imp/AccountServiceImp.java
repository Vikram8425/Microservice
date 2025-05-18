package com.Bank.Account.Service.Imp;

import org.springframework.stereotype.Service;

import com.Bank.Account.Dto.CustomerDto;
import com.Bank.Account.Service.IAccountService;

@Service
public class AccountServiceImp implements IAccountService {

	public CustomerDto createAcoount(CustomerDto customerDto) {
	System.out.println("Accoutn has been create");
	
		return null;
	}

}
