package com.project.cloud.as.service.impl;

import com.project.cloud.as.model.Account;
import com.project.cloud.as.repository.AccountRepository;
import com.project.cloud.as.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account getAccountById(String id) {
        return accountRepository.findAccountById(id);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}
