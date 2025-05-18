package com.Bank.Account.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.Account.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
