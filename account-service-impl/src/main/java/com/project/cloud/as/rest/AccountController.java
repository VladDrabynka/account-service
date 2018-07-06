package com.project.cloud.as.rest;

import com.project.cloud.as.model.Account;
import com.project.cloud.as.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable String id){
        return accountService.getAccountById(id);
    }

    @GetMapping("/")
    public List<Account> getAllAccount(){
        return accountService.getAllAccounts();
    }

    @PostMapping("/account")
    public void createAccount(@RequestBody Account account){
        accountService.createAccount(account);
    }

}
