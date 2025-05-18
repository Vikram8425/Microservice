package com.Bank.Account.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.Account.Entity.Customber;

public interface CustomberRepository extends JpaRepository<Customber, Long> {

}
