package com.project.cloud.as.service;

import com.project.cloud.as.model.Account;

import java.util.List;

public interface AccountService {
    Account getAccountById(String id);
    Account createAccount(Account account);
    Account updateAccount(Account account);
    List<Account> getAllAccounts();
}
