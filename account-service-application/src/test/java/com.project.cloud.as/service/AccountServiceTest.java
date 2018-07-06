package com.project.cloud.as.service;

import com.project.cloud.as.model.Account;
import com.project.cloud.as.repository.AccountRepository;
import com.project.cloud.as.service.impl.AccountServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

public class AccountServiceTest {
    @InjectMocks
    private AccountServiceImpl accountService;

    @Mock
    private AccountRepository repository;

    @Before
    public void setup() {
        initMocks(this);
    }

    @Test
    public void createAccount() {

        final Account account = new Account();
        account.setId("id");

        Account account1 = accountService.createAccount(account);

        Assert.assertEquals("Account not equals",account,account1);
    }

    @Test
    public void updateAccount() {

        final Account account = new Account();
        account.setId("id");

        Account account1 = accountService.createAccount(account);

        Assert.assertEquals("Account not equals",account,account1);
    }
}
