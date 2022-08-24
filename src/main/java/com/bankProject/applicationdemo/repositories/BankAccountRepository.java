package com.bankProject.applicationdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankProject.applicationdemo.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
