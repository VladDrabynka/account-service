package com.project.cloud.as.service;

import com.project.cloud.as.model.Account;

public interface AccountService {
    Account getAccountById(String id);
    Account createAccount(Account account);
}
